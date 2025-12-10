package com.playoff;

import java.util.Random;

public class GameEngine {

    private static final Random rand = new Random();

    public int [] simulateScore(Team team1, Team team2) {
        double team1Overall = team1.calculateOverallRating(team1.getOffenseRating(), team1.getDefenseRating());
        double team2Overall = team2.calculateOverallRating(team2.getOffenseRating(), team2.getDefenseRating());

        double scale1 = team1Overall / 100;
        double scale2 =team2Overall / 100;

        int baseScore1 = (int) (10 + scale1 * 18);
        int baseScore2 = (int) (10 + scale2 * 18);

        int variation1 = rand.nextInt(30) - 10;
        int variation2 = rand.nextInt(30) - 10;

        int team1Score = baseScore1 + variation1;
        int team2Score = baseScore2 + variation2;

        if (team1Score < 3) {
            team1Score = 3;
        }

        if (team2Score < 3) {
            team2Score = 3;
        }

        return new int [] {team1Score, team2Score};
    }

    public void simulateGame(Game game, Team team1, Team team2) {
         int [] scoreArray = simulateScore(team1, team2);

         game.setTeamAScore(scoreArray[0]);
         game.setTeamBScore(scoreArray[1]);

         if (scoreArray[0] > scoreArray[1]) {
             game.setWinner(team1);
             game.setLoser(team2);
         }
         else if (scoreArray[1] > scoreArray[0]) {
             game.setWinner(team2);
             game.setLoser(team1);
         }

         //Tie goes to team1
         else {
             game.setWinner(team1);
             game.setLoser(team2);
         }
    }
}
