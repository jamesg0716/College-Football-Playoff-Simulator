package com.playoff;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundTest {
    Round round = new Round(1);
    Team teamA = new Team("Alabama", 3, 80, 90);
    Team teamB = new Team("Oklahoma", 2, 85, 95);

    @org.junit.Test
    public void testAddGame() {
        Game game1 = new Game(teamA, teamB, 10, 15, teamA, teamB);
        round.addGame(game1);
        assertEquals(Arrays.asList(game1), round.getGames());
        assertEquals(1, round.getGames().size());
    }
}
