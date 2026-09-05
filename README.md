Soccer League System

A clean, object-oriented Java application that manages a soccer league: teams, players, matches, and goals. It records match results, updates team statistics (points, goals for/against), ranks teams by points and goal difference, and prints both match details and a full league standings table.



Features





Team & Player management – Add teams and assign players to them



Match scheduling – Create home/away matches with unique IDs



Goal recording – Track scorer, team, and minute of each goal



Automatic statistics – Update goals for/against and points after every match



League ranking – Sort teams by points (descending), then goal difference



Clear output – Print detailed match reports and a formatted standings table



Class Design

The system is built with exactly five core classes, following strong composition and encapsulation.







Class



Responsibility



Key Composition





Player



Represents a player



Belongs to one Team





Team



Holds team name, players, and season stats



Contains ArrayList<Player>





Goal



Records a single goal



References Player (scorer) + match ID





Match



Represents one fixture



Contains two Teams + ArrayList<Goal>





Schedule



Central manager for teams, matches, stats & ranking



Holds ArrayList<Team> and ArrayList<Match>

Composition Overview

Schedule
 ├── ArrayList<Team>
 │    └── ArrayList<Player>
 └── ArrayList<Match>
      ├── Team (home)
      ├── Team (away)
      └── ArrayList<Goal>
           └── Player (scorer)



Project Structure

SoccerLeagueSystem/
├── src/main/java/com/mycompany/soccerleaguesystem/
│   ├── Player.java
│   ├── Team.java
│   ├── Goal.java
│   ├── Match.java
│   ├── Schedule.java
│   └── SoccerLeagueSystem.java   ← main entry point
└── README.md



Requirements





Java 8+



Any IDE (NetBeans, IntelliJ, Eclipse, VS Code) or command-line tools



Optional: Maven (if using the provided pom.xml)



How to Run

Option 1 – IDE





Open the project in your IDE.



Run SoccerLeagueSystem.java (main method).

Option 2 – Command Line

# Compile
javac -d out src/main/java/com/mycompany/soccerleaguesystem/*.java

# Run
java -cp out com.mycompany.soccerleaguesystem.SoccerLeagueSystem

Option 3 – Maven

mvn clean compile exec:java -Dexec.mainClass="com.mycompany.soccerleaguesystem.SoccerLeagueSystem"



Sample Output

===== Match Details =====
Match #1: Ahly 2 - 1 Zamalek
  Mahmoud (Ahly) - 15'
  Mohamed (Ahly) - 60'
  Hashim (Zamalek) - 78'

Match #2: Pyramids 2 - 1 Masry
  Fiston (Pyramids) - 22'
  Ramadan (Masry) - 55'
  Fiston (Pyramids) - 80'

...

===== Soccer League Standings =====
Team          Points    Goals For    Goals Against    Goal Difference
Ahly          9         6            2                4
Zamalek       6         5            3                2
Pyramids      6         3            3                0
Ismaily       3         1            1                0
Masry         0         2            4               -2
Future        0         1            5               -4
-------------------------------------------------------------------



Class Details

1. Player

Attributes





String name



int number



Team team

Methods





Constructor, getters & setters



toString()

2. Team

Attributes





String nameTeam



ArrayList<Player> players



int goalsFor



int goalsAgainst



int points

Methods





Constructor, getters & setters



addPlayer(Player p)



toString()

3. Goal

Attributes





int matchId



Player scorer



int minute

Methods





Constructor, getters & setters



toString()

4. Match

Attributes





int matchId



Team homeTeam



Team awayTeam



ArrayList<Goal> Goals



int homeScore



int awayScore

Methods





Constructor, getters & setters



addGoal(Goal g) – automatically updates the correct score



toString()

5. Schedule

Attributes





ArrayList<Match> Matchs



ArrayList<Team> Teams



int nextMatchId

Methods





Constructor, getters & setters



addTeam(Team t)



createMatch(Team home, Team away)



recordGoal(Match m, Player scorer, int minute)



updateTeamStatistics(Match m)



rankTeams() – sorts by points, then goal difference



printStandingsTable()



printMatchDetails(Match m)



toString()



Design Rules Followed





A Team contains a list of its Players



A Match contains two Teams (home & away) and a list of Goals



A Goal stores the match ID, the scoring Player, and the minute



Schedule is the central coordinator: it holds all teams and matches, updates statistics, ranks teams, and displays results



Collections are implemented with ArrayList
