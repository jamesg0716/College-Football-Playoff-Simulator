package com.playoff;

import java.util.ArrayList;

public class Round {
    private int roundNumber;
    public ArrayList<Game> games;

    public Round(int roundNumber) {
        this.roundNumber = roundNumber;
        this.games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public ArrayList<Game> getGames() {
        return games;
    }
}
