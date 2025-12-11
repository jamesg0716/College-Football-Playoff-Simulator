package com.playoff;

import java.util.ArrayList;

public class Bracket {
    private ArrayList<Team> teams;
    GameEngine gameEngine = new GameEngine();

    public Bracket() {
        this.teams = new ArrayList<>();
    }

    public void addTeams(Team team) {
        teams.add(team);
    }
    Round round1 = new Round(1);
    public void round1Results() {
        Game game1 = new Game(teams.get(4), teams.get(11), 0, 0, teams.get(4), teams.get(11));
        gameEngine.simulateGame(game1, teams.get(4), teams.get(11));
        System.out.println("*****\nRound 1 results:\n*****\nGame 1 Score: " + teams.get(4).getTeamName() + " - " + game1.getTeamAScore() +
                 "  vs  " + teams.get(11).getTeamName() + " - " + game1.getTeamBScore() + "\nWinner: " + game1.getWinner().getTeamName());

        Game game2 = new Game(teams.get(7), teams.get(8), 0, 0, teams.get(7), teams.get(8));
        gameEngine.simulateGame(game2, teams.get(7), teams.get(8));
        System.out.println("\nGame 2 Score: " + teams.get(7).getTeamName() + " - " + game2.getTeamAScore() +
                "  vs  " + teams.get(8).getTeamName() + " - " + game2.getTeamBScore() + "\nWinner: " + game2.getWinner().getTeamName());

        Game game3 = new Game(teams.get(5), teams.get(10), 0, 0, teams.get(5), teams.get(10));
        gameEngine.simulateGame(game3, teams.get(5), teams.get(10));
        System.out.println("\nGame 3 Score: " + teams.get(5).getTeamName() + " - " + game3.getTeamAScore() +
                "  vs  " + teams.get(10).getTeamName() + " - " + game3.getTeamBScore() + "\nWinner: " + game3.getWinner().getTeamName());

        Game game4 = new Game(teams.get(6), teams.get(9), 0, 0, teams.get(6), teams.get(9));
        gameEngine.simulateGame(game4, teams.get(6), teams.get(9));
        System.out.println("\nGame 4 Score: " + teams.get(6).getTeamName() + " - " + game4.getTeamAScore() +
                "  vs  " + teams.get(9).getTeamName() + " - " + game4.getTeamBScore() + "\nWinner: " + game4.getWinner().getTeamName());

        teams.remove(game1.getLoser());
        teams.remove(game2.getLoser());
        teams.remove(game3.getLoser());
        teams.remove(game4.getLoser());
    }

    public void round2Results() {
        Game game1 = new Game(teams.get(0), teams.get(7), 0, 0, teams.get(0), teams.get(7));
        gameEngine.simulateGame(game1, teams.get(0), teams.get(7));
        System.out.println("*****\nRound 2 results:\n*****\nGame 1 Score: " + teams.get(0).getTeamName() + " - " + game1.getTeamAScore() +
                "  vs  " + teams.get(7).getTeamName() + " - " + game1.getTeamBScore() + "\nWinner: " + game1.getWinner().getTeamName());

        Game game2 = new Game(teams.get(1), teams.get(6), 0, 0, teams.get(1), teams.get(6));
        gameEngine.simulateGame(game2, teams.get(1), teams.get(6));
        System.out.println("\nGame 2 Score: " + teams.get(1).getTeamName() + " - " + game2.getTeamAScore() +
                "  vs  " + teams.get(6).getTeamName() + " - " + game2.getTeamBScore() + "\nWinner: " + game2.getWinner().getTeamName());

        Game game3 = new Game(teams.get(2), teams.get(5), 0, 0, teams.get(2), teams.get(5));
        gameEngine.simulateGame(game3, teams.get(2), teams.get(5));
        System.out.println("\nGame 3 Score: " + teams.get(2).getTeamName() + " - " + game3.getTeamAScore() +
                "  vs  " + teams.get(5).getTeamName() + " - " + game3.getTeamBScore() + "\nWinner: " + game3.getWinner().getTeamName());

        Game game4 = new Game(teams.get(3), teams.get(4), 0, 0, teams.get(3), teams.get(4));
        gameEngine.simulateGame(game4, teams.get(3), teams.get(4));
        System.out.println("\nGame 4 Score: " + teams.get(3).getTeamName() + " - " + game4.getTeamAScore() +
                "  vs  " + teams.get(4).getTeamName() + " - " + game4.getTeamBScore() + "\nWinner: " + game4.getWinner().getTeamName());

        teams.remove(game1.getLoser());
        teams.remove(game2.getLoser());
        teams.remove(game3.getLoser());
        teams.remove(game4.getLoser());
    }

    public void round3Results() {
        Game game1 = new Game(teams.get(0), teams.get(3), 0, 0, teams.get(0), teams.get(3));
        gameEngine.simulateGame(game1, teams.get(0), teams.get(3));
        System.out.println("*****\nRound 3 results:\n*****\nGame 1 Score: " + teams.get(0).getTeamName() + " - " + game1.getTeamAScore() +
                "  vs  " + teams.get(3).getTeamName() + " - " + game1.getTeamBScore() + "\nWinner: " + game1.getWinner().getTeamName());

        Game game2 = new Game(teams.get(1), teams.get(2), 0, 0, teams.get(1), teams.get(2));
        gameEngine.simulateGame(game2, teams.get(1), teams.get(2));
        System.out.println("\nGame 2 Score: " + teams.get(1).getTeamName() + " - " + game2.getTeamAScore() +
                "  vs  " + teams.get(2).getTeamName() + " - " + game2.getTeamBScore() + "\nWinner: " + game2.getWinner().getTeamName());

        teams.remove(game1.getLoser());
        teams.remove(game2.getLoser());
    }

    public void finalRoundResults() {
        Game game1 = new Game(teams.get(0), teams.get(1), 0, 0, teams.get(0), teams.get(1));
        gameEngine.simulateGame(game1, teams.get(0), teams.get(1));
        System.out.println("*****\nFinal results:\n*****\nGame Score: " + teams.get(0).getTeamName() + " - " + game1.getTeamAScore() +
                "  vs  " + teams.get(1).getTeamName() + " - " + game1.getTeamBScore() + "\nYour National Champion! " + game1.getWinner().getTeamName());
    }
}
