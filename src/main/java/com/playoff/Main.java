package com.playoff;

public class Main {
    public static void main(String[] args) {

        Team team1 = new Team("Indiana", 1, 85, 85);
        Team team2 = new Team("Ohio State", 2, 70, 90);
        Team team3 = new Team("Georgia", 3, 85, 85);
        Team team4 = new Team("Texas Tech", 4, 85, 70);
        Team team5 = new Team("Oregon", 5, 80, 78);
        Team team6 = new Team("Ole Miss", 6, 88, 82);
        Team team7 = new Team("Texas A&M", 7, 82, 90);
        Team team8 = new Team("Oklahoma", 8, 78, 88);
        Team team9 = new Team("Alabama", 9, 72, 90);
        Team team10 = new Team("Miami", 10, 74, 75);
        Team team11 = new Team("Tulane", 11, 70, 70);
        Team team12 = new Team("James Madison", 12, 70, 70);

        Bracket bracket = new Bracket();
        bracket.addTeams(team1);
        bracket.addTeams(team2);
        bracket.addTeams(team3);
        bracket.addTeams(team4);
        bracket.addTeams(team5);
        bracket.addTeams(team6);
        bracket.addTeams(team7);
        bracket.addTeams(team8);
        bracket.addTeams(team9);
        bracket.addTeams(team10);
        bracket.addTeams(team11);
        bracket.addTeams(team12);

        bracket.round1Results();
        bracket.round2Results();
        bracket.round3Results();
        bracket.finalRoundResults();

    }
}