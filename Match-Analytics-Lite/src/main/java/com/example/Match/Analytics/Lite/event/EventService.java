package com.example.Match.Analytics.Lite.event;

import com.example.Match.Analytics.Lite.player.PlayerStatsResponse;

import java.util.List;

public interface EventService {
    public Event getEventById(Long id);
    public Event addEvent(Event event);

}
