package com.example.Match.Analytics.Lite.player;

import com.example.Match.Analytics.Lite.event.EventResponse;
import com.example.Match.Analytics.Lite.event.Meta;
import com.example.Match.Analytics.Lite.event.MetaResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {


    private final PlayerRepository playerRepository;

    @Override
    public Player getPlayer(Long id) {
        Optional<Player> player = playerRepository.findPlayerWithEvents(id);
        return player.orElse(null);
    }

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public List<PlayerStatsResponse> getPlayerStats() {
        return playerRepository.findPlayersWithGoalsAndAssists();
    }

    public PlayerResponse getPlayerWithEvents(Long id) {
        Player player = playerRepository.findPlayerWithEvents(id)
                .orElseThrow(() -> new RuntimeException("Player not found"));

        List<EventResponse> events = player.getEvents().stream()
                .map(e -> new EventResponse(
                        e.getId(),
                        e.getMinute(),
                        e.getType().name(),
                                Optional.ofNullable(e.getMeta())
                                        .map(m -> new MetaResponse(m.getAssisId(), m.isOnTarget()))
                                        .orElse(null)

                ))
                .toList();

        return new PlayerResponse(
                player.getId(),
                player.getName(),
                player.getTeam(),
                player.getPosition(),
                events
        );
    }

}
