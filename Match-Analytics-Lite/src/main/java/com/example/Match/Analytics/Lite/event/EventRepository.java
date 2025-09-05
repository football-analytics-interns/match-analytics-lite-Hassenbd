package com.example.Match.Analytics.Lite.event;

import com.example.Match.Analytics.Lite.player.PlayerStatsResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {


}
