package com.example.Match.Analytics.Lite.player;

import com.example.Match.Analytics.Lite.event.Event;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="Player")
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String team;
    private String position;
    @OneToMany(mappedBy = "player")
    private List<Event> events = new ArrayList<>();
}
