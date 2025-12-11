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

    public boolean isComplete() {
        for (Game game : games) {
            if (game.getWinner() == null) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Team> getRoundWinners() {
        ArrayList<Team> listOfWinners = new ArrayList<Team>();
        for (Game game : games) {
            listOfWinners.add(game.getWinner());
        }
        return listOfWinners;
    }
}
