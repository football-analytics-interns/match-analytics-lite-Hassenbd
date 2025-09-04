package com.example.Match.Analytics.Lite.player;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

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
}
