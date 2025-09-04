package com.example.Match.Analytics.Lite.match;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController
@RequestMapping(path="match")
public class MatchController {
    @Autowired
    private MatchService matchService;

    @PostMapping
    public  Match addMatch(@RequestBody Match match) {
        Match savedMatch= matchService.addMatch(match);
        return savedMatch;
    }
    @GetMapping(path="/{id}")
    public Match getMatch(@PathVariable Long id) {
        return matchService.getMatch(id);
    }



}
