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
public class SoccerLeagueSystem {
    public static void main(String[] args) {

        // create schedule
        Schedule schedule = new Schedule(new ArrayList<Match>(), new ArrayList<Team>(), 1);

        // create teams
        Team teamA = new Team("Ahly", new ArrayList<Player>(), 0, 0, 0);
        Team teamB = new Team("Zamalek", new ArrayList<Player>(), 0, 0, 0);
        Team teamC = new Team("Pyramids", new ArrayList<Player>(), 0, 0, 0);
        Team teamD = new Team("Masry", new ArrayList<Player>(), 0, 0, 0);
        Team teamE = new Team("Ismaily", new ArrayList<Player>(), 0, 0, 0);
        Team teamF = new Team("Future", new ArrayList<Player>(), 0, 0, 0);

        schedule.addTeam(teamA);
        schedule.addTeam(teamB);
        schedule.addTeam(teamC);
        schedule.addTeam(teamD);
        schedule.addTeam(teamE);
        schedule.addTeam(teamF);

        // create players
        Player p1 = new Player("Mahmoud", 10, teamA);
        Player p2 = new Player("Mohamed", 7, teamA);
        Player p3 = new Player("Hashim", 9, teamB);
        Player p4 = new Player("ElSayed", 11, teamB);
        Player p5 = new Player("Nazeh", 9, teamC);
        Player p6 = new Player("Makwey", 10, teamD);
        Player p7 = new Player("Nader", 8, teamE);
        Player p8 = new Player("Ali", 9, teamF);

        teamA.addPlayer(p1);
        teamA.addPlayer(p2);
        teamB.addPlayer(p3);
        teamB.addPlayer(p4);
        teamC.addPlayer(p5);
        teamD.addPlayer(p6);
        teamE.addPlayer(p7);
        teamF.addPlayer(p8);

        // match 1: Ahly vs Zamalek
        Match match1 = schedule.createMatch(teamA, teamB);
        schedule.recordGoal(match1, p1, 15);
        schedule.recordGoal(match1, p2, 60);
        schedule.recordGoal(match1, p3, 78);
        schedule.updateTeamStatistics(match1);

        // match 2: Pyramids vs Masry
        Match match2 = schedule.createMatch(teamC, teamD);
        schedule.recordGoal(match2, p5, 22);
        schedule.recordGoal(match2, p6, 55);
        schedule.recordGoal(match2, p5, 80);
        schedule.updateTeamStatistics(match2);

        // match 3: Ismaily vs Future
        Match match3 = schedule.createMatch(teamE, teamF);
        schedule.recordGoal(match3, p7, 30);
        schedule.updateTeamStatistics(match3);

        // match 4: Ahly vs Pyramids
        Match match4 = schedule.createMatch(teamA, teamC);
        schedule.recordGoal(match4, p1, 10);
        schedule.recordGoal(match4, p2, 40);
        schedule.updateTeamStatistics(match4);

        // match 5: Zamalek vs Masry
        Match match5 = schedule.createMatch(teamB, teamD);
        schedule.recordGoal(match5, p3, 25);
        schedule.recordGoal(match5, p4, 70);
        schedule.recordGoal(match5, p6, 88);
        schedule.updateTeamStatistics(match5);

        // match 6: Future vs Ahly
        Match match6 = schedule.createMatch(teamF, teamA);
        schedule.recordGoal(match6, p1, 12);
        schedule.recordGoal(match6, p8, 55);
        schedule.recordGoal(match6, p2, 90);
        schedule.updateTeamStatistics(match6);

        // match 7: Ismaily vs Pyramids
        Match match7 = schedule.createMatch(teamE, teamC);
        schedule.recordGoal(match7, p5, 40);
        schedule.updateTeamStatistics(match7);

        // match 8: Zamalek vs Future
        Match match8 = schedule.createMatch(teamB, teamF);
        schedule.recordGoal(match8, p3, 5);
        schedule.recordGoal(match8, p4, 33);
        schedule.updateTeamStatistics(match8);
        
        
        // print match details
        System.out.println("\n===== Match Details =====");
        schedule.printMatchDetails(match1);

        System.out.println();
        schedule.printMatchDetails(match2);
        
        System.out.println();
        schedule.printMatchDetails(match3);
        
        System.out.println();
        schedule.printMatchDetails(match4);

        System.out.println();
        schedule.printMatchDetails(match5);
        
        
        System.out.println();
        schedule.printMatchDetails(match6);
        
        System.out.println();
        schedule.printMatchDetails(match7);
        
        System.out.println();
        schedule.printMatchDetails(match8);

        // print standings table
        System.out.println("===== Soccer League Standings =====");
        schedule.printStandingsTable();

        
    }

}
