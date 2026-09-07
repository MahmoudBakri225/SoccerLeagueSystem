/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soccerleaguesystem;
import java.util.ArrayList;
/**
 *
 * @author KA
 */
public class Match {
    private int matchId;
    private Team homeTeam;
    private Team awayTeam;
    private ArrayList<Goal> Goals;
    private int homeScore;
    private int awayScore;
    
    // constactor
    public Match(int matchId, Team homeTeam, Team awayTeam, ArrayList<Goal> Goals, int homeScore, int awayScore) {
        this.matchId = matchId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.Goals = Goals;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    //getter
    public int getMatchId() {
        return matchId;
    }
    public Team getHomeTeam() {
        return homeTeam;
    }
    public Team getAwayTeam() {
        return awayTeam;
    }
    public ArrayList<Goal> getGoals() {
        return Goals;
    }
    public int getHomeScore() {
        return homeScore;
    }
    public int getAwayScore() {
        return awayScore;
    }
    
    //setter
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
    public void setGoals(ArrayList<Goal> Goals) {
        this.Goals = Goals;
    }
    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }
    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }
    
    public void addGoal(Goal g) {
        Goals.add(g);
        if (g.getscorer().getTeam() == homeTeam) {
            homeScore = homeScore + 1;
        } else {
            awayScore = awayScore + 1;
        }
    }
    
    @Override
    public String toString() {
        return "Match{" + "matchId=" + matchId + ", homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + ", Goals=" + Goals + ", homeScore=" + homeScore + ", awayScore=" + awayScore + '}';
    }
}