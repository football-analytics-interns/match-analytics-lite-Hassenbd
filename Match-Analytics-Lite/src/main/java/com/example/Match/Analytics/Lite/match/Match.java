package com.example.Match.Analytics.Lite.match;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

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
}
