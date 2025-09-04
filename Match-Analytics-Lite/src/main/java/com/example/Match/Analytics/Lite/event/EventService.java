package com.example.Match.Analytics.Lite.event;

public interface EventService {
    public Event getEventById(Long id);
    public Event addEvent(Event event);
}
