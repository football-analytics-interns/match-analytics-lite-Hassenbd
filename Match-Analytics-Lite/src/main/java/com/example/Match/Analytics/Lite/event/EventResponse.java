package com.example.Match.Analytics.Lite.event;

public record EventResponse(
        Long id,
        Integer minute,
        String type,     // on expose EventType comme String
        MetaResponse meta
) {}