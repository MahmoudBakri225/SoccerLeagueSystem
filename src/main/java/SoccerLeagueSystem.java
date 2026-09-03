
import com.mycompany.soccerleaguesystem.Match;
import com.mycompany.soccerleaguesystem.Player;
import com.mycompany.soccerleaguesystem.Schedule;
import com.mycompany.soccerleaguesystem.Team;

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
    Player p5 = new Player("Fiston", 9, teamC);
    Player p6 = new Player("Ramadan", 10, teamD);
    
    teamA.addPlayer(p1);
    teamA.addPlayer(p2);
    teamB.addPlayer(p3);
    teamB.addPlayer(p4);
    teamC.addPlayer(p5);
    teamD.addPlayer(p6);
    
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
    schedule.updateTeamStatistics(match3);
    
    // match 4: Ahly vs Pyramids
    Match match4 = schedule.createMatch(teamA, teamC);
    schedule.recordGoal(match4, p1, 10);
    schedule.recordGoal(match4, p2, 40);
    schedule.updateTeamStatistics(match4);
    
    // print standings table
    System.out.println("===== Soccer League Standings =====");
    schedule.printStandingsTable();
    
    // print match details
    System.out.println("\n===== Match Details =====");
    schedule.printMatchDetails(match1);
    
    System.out.println();
    schedule.printMatchDetails(match2);
}