/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soccerleaguesystem;
/**
 *
 * @author KA
 */
public class Goal {
    private int matchId;
    private Player scorer;
    private int minute;

    // constactor
    public Goal(int matchId, Player scorer, int minute) {
        this.matchId = matchId;
        this.scorer = scorer;
        this.minute = minute;
    }
    
    //getter
    public int getMatchId() {
        return matchId;
    }
    public Player getscorer() {
        return scorer;
    }
    public int getMinute() {
        return minute;
    }
    
    //setter
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }
    public void setScorer(Player scorer) {
        this.scorer = scorer;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    
    @Override
    public String toString() {
        return "Goal{" + "matchId=" + matchId + ", scorer=" + scorer + ", minute=" + minute + '}';
    }
}



