package com.example.Match.Analytics.Lite.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    @Query("""
    SELECT new com.example.Match.Analytics.Lite.player.PlayerStatsResponse(
        p.id,
        p.name,
        SUM(CASE WHEN e.type = com.example.Match.Analytics.Lite.event.EventType.GOAL AND e.player.id = p.id THEN 1 ELSE 0 END),
        SUM(CASE WHEN e.meta.assisId = p.id THEN 1 ELSE 0 END)
    )
    FROM Player p
    LEFT JOIN Event e ON e.player.id = p.id OR e.meta.assisId = p.id
    GROUP BY p.id, p.name
    """)

    List<PlayerStatsResponse> findPlayersWithGoalsAndAssists();
}
