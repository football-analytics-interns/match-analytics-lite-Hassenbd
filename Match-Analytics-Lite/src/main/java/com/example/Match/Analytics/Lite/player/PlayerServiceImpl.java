package com.example.Match.Analytics.Lite.player;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {


    private final PlayerRepository playerRepository;

    @Override
    public Player getPlayer(Long id) {
        Optional<Player> player = playerRepository.findById(id);
        return player.orElse(null);
    }

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public List<PlayerStatsResponse> getPlayerStats() {
        return playerRepository.findPlayersWithGoalsAndAssists();
    }
}
