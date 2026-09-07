package com.mycompany.soccerleaguesystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Schedule {

    private ArrayList<Match> Matchs;
    private ArrayList<Team> Teams;
    private int nextMatchId;

    // constructor
    public Schedule(ArrayList<Match> Matchs, ArrayList<Team> Teams, int nextMatchId) {
        this.Matchs = Matchs;
        this.Teams = Teams;
        this.nextMatchId = nextMatchId;
    }

    // getters
    public ArrayList<Match> getMatchs() {
        return Matchs;
    }

    public ArrayList<Team> getTeams() {
        return Teams;
    }

    public int getNextMatchId() {
        return nextMatchId;
    }

    // setters
    public void setMatchs(ArrayList<Match> Matchs) {
        this.Matchs = Matchs;
    }

    public void setTeams(ArrayList<Team> Teams) {
        this.Teams = Teams;
    }

    public void setNextMatchId(int nextMatchId) {
        this.nextMatchId = nextMatchId;
    }

    // add team
    public void addTeam(Team t) {
        Teams.add(t);
    }

    // create match
    public Match createMatch(Team home, Team away) {
        Match m = new Match(nextMatchId, home, away, new ArrayList<Goal>(), 0, 0);
        Matchs.add(m);
        nextMatchId = nextMatchId + 1;
        return m;
    }

    // record goal
    public void recordGoal(Match m, Player scorer, int minute) {
        Goal g = new Goal(m.getMatchId(), scorer, minute);
        m.addGoal(g);
    }

    // update statistics
    public void updateTeamStatistics(Match m) {
        Team home = m.getHomeTeam();
        Team away = m.getAwayTeam();

        home.setGoalsFor(home.getGoalsFor() + m.getHomeScore());
        home.setGoalsAgainst(home.getGoalsAgainst() + m.getAwayScore());

        away.setGoalsFor(away.getGoalsFor() + m.getAwayScore());
        away.setGoalsAgainst(away.getGoalsAgainst() + m.getHomeScore());

        if (m.getHomeScore() > m.getAwayScore()) {
            home.setPoints(home.getPoints() + 3);
        } else if (m.getAwayScore() > m.getHomeScore()) {
            away.setPoints(away.getPoints() + 3);
        } else {
            home.setPoints(home.getPoints() + 1);
            away.setPoints(away.getPoints() + 1);
        }
    }

    // rank teams
    public void rankTeams() {
        Collections.sort(Teams, new Comparator<Team>() {
            @Override
            public int compare(Team t1, Team t2) {
                if (t2.getPoints() != t1.getPoints()) {
                    return t2.getPoints() - t1.getPoints();
                }
                int gd1 = t1.getGoalsFor() - t1.getGoalsAgainst();
                int gd2 = t2.getGoalsFor() - t2.getGoalsAgainst();
                return gd2 - gd1;
            }
        });
    }

    // print table
    public void printStandingsTable() {
        rankTeams();

        System.out.println("Team          Points    Goals For    Goals Against    Goal Difference");

        for (Team t : Teams) {
            int goalDifference = t.getGoalsFor() - t.getGoalsAgainst();

            System.out.printf("%-13s %-8d %-12d %-16d %d%n", t.getNameTeam(), t.getPoints(), t.getGoalsFor(), t.getGoalsAgainst(), goalDifference);
        }

        System.out.println("-------------------------------------------------------------------");
    }

    // print match details
    public void printMatchDetails(Match m) {
        System.out.println("Match #" + m.getMatchId() + ": " + m.getHomeTeam().getNameTeam() + " " + m.getHomeScore() + " - " + m.getAwayScore() + " " + m.getAwayTeam().getNameTeam());
        for (Goal g : m.getGoals()) {
            System.out.println("  " + g.getscorer().getName() + " (" + g.getscorer().getTeam().getNameTeam() + ") - " + g.getMinute() + "'");
        }
    }

    @Override
    public String toString() {
        return "Schedule{" + "Matchs=" + Matchs + ", Teams=" + Teams + ", nextMatchId=" + nextMatchId + '}';
    }
}
