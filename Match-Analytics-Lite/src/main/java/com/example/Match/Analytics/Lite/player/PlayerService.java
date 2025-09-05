package com.example.Match.Analytics.Lite.player;


import java.util.List;

public interface PlayerService {
    public Player getPlayer(Long id);
    public Player addPlayer(Player player);
    public List<PlayerStatsResponse> getPlayerStats();
    public PlayerResponse getPlayerWithEvents(Long id);

}
