package com.mycompany.soccerleaguesystem;
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



