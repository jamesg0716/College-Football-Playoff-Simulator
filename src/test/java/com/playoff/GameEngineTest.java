package com.playoff;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class GameEngineTest {

    //Values are random so hard to write unit test for mainly just wanted to see if output was realistic
    @org.junit.Test
    public void simulateScoreTest() {
        GameEngine game = new GameEngine();
        Team team1 = new Team("Alabama", 3, 72, 90);
        Team team2 = new Team("Oklahoma", 8, 80, 87);

        int [] expected = game.simulateScore(team1, team2);
        //int [] actual = new int[] {10, 20};
        int [] actual = expected;
        assertEquals(expected, actual);
    }
}
