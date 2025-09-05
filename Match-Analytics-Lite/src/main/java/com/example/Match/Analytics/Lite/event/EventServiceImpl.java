package com.example.Match.Analytics.Lite.event;

import com.example.Match.Analytics.Lite.player.PlayerStatsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class EventServiceImpl implements  EventService {

    private final EventRepository eventRepository;
    @Override
    public Event getEventById(Long id) {
        Optional<Event> event = eventRepository.findById(id);
        return event.orElse(null);
    }

    @Override
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }


}
