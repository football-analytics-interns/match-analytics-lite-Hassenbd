package com.example.Match.Analytics.Lite.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController
@RequestMapping(path="event")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @PostMapping
    public Event addEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }

    @GetMapping(path="/{id}")
    public Event getEvent(@PathVariable Long id) {
        return eventService.getEventById(id);
    }
}
