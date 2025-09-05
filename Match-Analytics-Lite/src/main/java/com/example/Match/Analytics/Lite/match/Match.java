package com.example.Match.Analytics.Lite.match;

import com.example.Match.Analytics.Lite.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Match")
public class Match {
    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private String homeTeam;
    private String awayTeam;
    private String homeScore;
    private String awayScore;
    @OneToMany
    private List<Event>events;
}
