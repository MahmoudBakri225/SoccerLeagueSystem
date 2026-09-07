package com.mycompany.soccerleaguesystem;

public class Player {
    private String name;
    private int number ;
    private Team team;
    
    
    // constactor
    public Player(String name, int number, Team team) {
        this.name = name;
        this.number = number;
        this.team = team;
    }
    
    // getter
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public Team getTeam() {
        return team;
    }
    
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setTeam(Team Team) {
        this.team = Team;
    }
    
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", number=" + number + ", Team=" + team + '}';
    }
}