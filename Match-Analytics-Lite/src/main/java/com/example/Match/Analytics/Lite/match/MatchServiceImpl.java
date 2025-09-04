package com.example.Match.Analytics.Lite.match;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Getter
@Setter
@Service
@AllArgsConstructor
public class MatchServiceImpl implements MatchService {
    private final  MatchRepository matchRepository;


    @Override
    public Match addMatch(Match match) {
        return matchRepository.save(match);
    }

    @Override
    public Match getMatch(Long id) {
       Optional<Match> match= matchRepository.findById(id);
        return match.orElse(null);
    }
}
