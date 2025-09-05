package com.example.Match.Analytics.Lite.player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerStatsResponse {
    private Long playerId;
    private String playerName;
    private Long goals;
    private Long assists;

    public PlayerStatsResponse(Long playerId,String name, Long goals, Long assists) {
        this.playerId = playerId;
        this.playerName = name;
        this.goals = goals;
        this.assists = assists;
    }

    // getters
}