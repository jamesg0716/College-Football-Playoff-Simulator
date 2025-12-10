package com.playoff;

public class Game {

    private Team teamA;
    private Team teamB;
    private int teamAScore;
    private int teamBScore;
    private Team winner;
    private Team loser;

    public Game(Team teamA, Team teamB, int teamAScore, int teamBScore, Team winner, Team loser) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.teamAScore = teamAScore;
        this.teamBScore = teamBScore;
        this.winner = winner;
        this.loser = loser;
    }

    public void setTeamAScore(int teamAScore) {
        this.teamAScore = teamAScore;
    }

    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public void setLoser(Team loser) {
        this.loser = loser;
    }

    public int getTeamAScore() {
        return teamAScore;
    }

    public int getTeamBScore() {
        return teamBScore;
    }

    public Team getWinner() {
        return winner;
    }

    public Team getLoser() {
        return loser;
    }
}
