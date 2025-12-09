package com.playoff;

import static org.junit.jupiter.api.Assertions.*;

public class TeamTest {

    @org.junit.Test
    public void getTeamNameTest() {
        Team team = new Team("Alabama", 3, 80, 90);
        String name = team.getTeamName();
        assertEquals("Alabama", name);
    }

    @org.junit.Test
    public void getSeedTest() {
        Team team = new Team("Alabama", 3, 80, 90);
        int seed = team.getSeed();
        assertEquals(3, seed);
    }

    @org.junit.Test
    public void getOffRatingTest() {
        Team team = new Team("Alabama", 3, 80, 90);
        int rating = team.getOffenseRating();
        assertEquals(80, rating);
    }

    @org.junit.Test
    public void getDefRating() {
        Team team = new Team("Alabama", 3, 80, 90);
        int rating = team.getDefenseRating();
        assertEquals(90, rating);
    }
}