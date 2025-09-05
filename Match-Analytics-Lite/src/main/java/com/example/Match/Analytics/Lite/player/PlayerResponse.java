package com.example.Match.Analytics.Lite.player;

import com.example.Match.Analytics.Lite.event.EventResponse;

import java.util.List;

public record PlayerResponse(
        Long id,
        String name,
        String team,
        String position,
        List<EventResponse> events
) {}
