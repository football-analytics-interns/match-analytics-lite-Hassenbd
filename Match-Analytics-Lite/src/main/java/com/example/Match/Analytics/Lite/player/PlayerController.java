package com.example.Match.Analytics.Lite.player;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Getter
@Setter
@RestController
@RequestMapping(path="player")
@CrossOrigin(origins = "http://localhost:4200")
public class PlayerController {
    @Autowired
    private  PlayerService playerService;

    @PostMapping
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @GetMapping(path="/{id}")
    public Player getPlayer(@PathVariable Long id) {
        return playerService.getPlayer(id);
    }

    @GetMapping(path="/stats")
    public List<PlayerStatsResponse> getPlayerStats() {return playerService.getPlayerStats();}
}
