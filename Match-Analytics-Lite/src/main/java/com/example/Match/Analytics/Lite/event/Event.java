package com.example.Match.Analytics.Lite.event;

import com.example.Match.Analytics.Lite.player.Player;
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
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
    @Embedded
    private Meta meta;

}
