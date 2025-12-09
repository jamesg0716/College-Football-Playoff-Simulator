package com.playoff;

public class Team {
    private String teamName;
    private int seed;
    private int offenseRating;
    private int defenseRating;

    public Team(String name, int seed, int offRating, int defRating) {
        this.teamName = name;
        this.seed = seed;
        this.offenseRating = offRating;
        this.defenseRating = defRating;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getSeed() {
        return seed;
    }

    public int getOffenseRating() {
        return offenseRating;
    }

    public int getDefenseRating() {
        return defenseRating;
    }
}
