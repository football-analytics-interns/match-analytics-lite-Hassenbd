package com.example.Match.Analytics.Lite.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Event")
public class Event {
    @Id
    @GeneratedValue
    private Long id;
    private Integer minute;
    @Enumerated(EnumType.STRING)
    private EventType type;
    private String playerId;
    @Embedded
    private Meta meta;

}
