package com.example.Match.Analytics.Lite.event;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class Meta {
    Long assisId;
    boolean onTarget;
}
