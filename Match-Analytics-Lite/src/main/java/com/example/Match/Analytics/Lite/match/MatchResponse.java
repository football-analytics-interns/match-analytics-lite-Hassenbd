package com.example.Match.Analytics.Lite.match;

import com.example.Match.Analytics.Lite.event.EventResponse;
import com.example.Match.Analytics.Lite.player.PlayerResponse;

import java.util.Date;

public record MatchResponse(
        Long id,
        Date date,
        String homeTeam,
        String awayTeam,
        String homeScore,
        String awayScore,
        EventResponse eventResponse,
        PlayerResponse playerResponse
        ) {

}
