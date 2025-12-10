package com.playoff;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    Team teamA = new Team("Alabama", 3, 80, 90);
    Team teamB = new Team("Oklahoma", 2, 85, 95);

    //These test both getters and setters
    @org.junit.Test
    public void testSetTeamAScore() {
        Game game = new Game(teamA, teamB, 10, 15, teamB, teamA);
        int expected = 12;
        game.setTeamAScore(12);
        assertEquals(expected, game.getTeamAScore());
    }

    //These test both getters and setters
    @org.junit.Test
    public void testSetTeamBScore() {
        Game game = new Game(teamA, teamB, 10, 15, teamB, teamA);
        int expected = 12;
        game.setTeamBScore(12);
        assertEquals(expected, game.getTeamBScore());
    }
}
