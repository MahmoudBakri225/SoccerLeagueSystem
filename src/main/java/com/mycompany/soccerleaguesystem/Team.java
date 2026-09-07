package com.mycompany.soccerleaguesystem;
import java.util.ArrayList;

public class Team {
    private String nameTeam;
    private ArrayList<Player> players;
    private int goalsFor;
    private int goalsAgainst;
    private int points;
    
    // constactor
    public Team(String nameTeam, ArrayList<Player> players, int goalsFor, int goalsAgainst, int points) {
        this.nameTeam = nameTeam;
        this.players = players;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.points = points;
    }
    
    //getter
    public String getNameTeam() {
        return nameTeam;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public int getGoalsFor() {
        return goalsFor;
    }
    public int getGoalsAgainst() {
        return goalsAgainst;
    }
    public int getPoints() {
        return points;
    }
    
    //setter
    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }
    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    
    
    public void addPlayer(Player p) {
        players.add(p);
    }
    
    @Override
    public String toString() {
        return "Team{" + "nameTeam=" + nameTeam + ", players=" + players + ", goalsFor=" + goalsFor + ", goalsAgainst=" + goalsAgainst + ", points=" + points + '}';
    }
}