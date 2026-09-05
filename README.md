# ⚽ Soccer League System

A Java-based Object-Oriented Programming project that simulates a simple soccer league system.

The system manages teams, players, matches, and goals while calculating team statistics, points, goal difference, and league standings.

## 📌 Project Overview

The **Soccer League System** demonstrates the main concepts of **Object-Oriented Programming (OOP)** in Java.

The system represents a soccer league consisting of multiple teams and matches. It records match results, tracks goal scorers and scoring minutes, updates team statistics, and generates a ranked league standings table.

The project uses exactly five main classes:

* `Player`
* `Team`
* `Goal`
* `Match`
* `Schedule`

## 🎯 Project Objectives

The main objectives of this project are:

* Apply Object-Oriented Programming principles in Java.
* Model a soccer league using classes and objects.
* Demonstrate composition between related classes.
* Manage collections using `ArrayList`.
* Store teams and their players.
* Store matches and their goals.
* Calculate team points.
* Calculate goals for and goals against.
* Calculate goal difference.
* Rank teams based on their performance.
* Display detailed match information.
* Display the final league standings.

## 🏗️ System Design

```text
                    ┌───────────────┐
                    │    Schedule   │
                    └───────┬───────┘
                            │
                ┌───────────┴───────────┐
                │                       │
                ▼                       ▼
        ┌───────────────┐       ┌───────────────┐
        │     Team      │       │     Match     │
        └───────┬───────┘       └───────┬───────┘
                │                       │
                ▼                       ▼
        ┌───────────────┐       ┌───────────────┐
        │    Player     │       │      Goal      │
        └───────────────┘       └───────┬───────┘
                                        │
                                        ▼
                                   ┌──────────┐
                                   │  Player  │
                                   └──────────┘
```

## 📦 Classes

### 1. Player

Represents a soccer player who belongs to a team.

**Responsibilities:**

* Store player information.
* Represent a player inside a team.
* Identify the player who scored a goal.

### 2. Team

Represents a soccer team participating in the league.

**Main Attributes:**

```java
private String nameTeam;
private ArrayList<Player> players;
private int goalsFor;
private int goalsAgainst;
private int points;
```

The `Team` class contains an `ArrayList<Player>` representing the players belonging to the team.

It also stores:

* Goals For
* Goals Against
* Points

**Main Methods:**

```java
Team(...)
getNameTeam()
getPlayers()
getGoalsFor()
getGoalsAgainst()
getPoints()

setNameTeam(...)
setPlayers(...)
setGoalsFor(...)
setGoalsAgainst(...)
setPoints(...)

addPlayer(...)
```

**Composition:**

```text
Team
 └── ArrayList<Player>
```

A team contains multiple players.

### 3. Goal

Represents a goal scored during a match.

**Main Attributes:**

```java
private int matchId;
private Player scorer;
private int minute;
```

**Responsibilities:**

* Store the match identifier.
* Store the player who scored.
* Store the minute of the goal.

**Composition:**

```text
Goal
 └── Player
```

### 4. Match

Represents a soccer match between two teams.

**Main Attributes:**

```java
private int matchId;
private Team homeTeam;
private Team awayTeam;
private ArrayList<Goal> goals;
```

**Responsibilities:**

* Store the match identifier.
* Store the home team.
* Store the away team.
* Store all goals scored during the match.
* Display match information.

**Composition:**

```text
Match
 ├── Team homeTeam
 ├── Team awayTeam
 └── ArrayList<Goal>
```

### 5. Schedule

The `Schedule` class manages the complete soccer league.

**Main Attributes:**

```java
private ArrayList<Team> teams;
private ArrayList<Match> matches;
```

**Responsibilities:**

* Store all league teams.
* Store all league matches.
* Process match results.
* Update team statistics.
* Calculate points.
* Calculate goals for and against.
* Calculate goal difference.
* Rank teams.
* Display the standings table.
* Display detailed match information.

**Composition:**

```text
Schedule
 ├── ArrayList<Team>
 └── ArrayList<Match>
```

## ⚽ Points System

The system uses the standard soccer points system:

| Result | Points |
| ------ | ------ |
| Win    | 3      |
| Draw   | 1      |
| Loss   | 0      |

## 📊 Team Statistics

The system tracks:

* **Goals For:** Total goals scored by the team.
* **Goals Against:** Total goals conceded by the team.
* **Goal Difference:** Goals For - Goals Against.
* **Points:** Points earned from match results.

```text
Goal Difference = Goals For - Goals Against
```

## 🏆 League Standings

After processing the matches, the system generates a ranked standings table.

Example:

```text
===== Soccer League Standings =====

Team          Points    Goals For    Goals Against    Goal Difference
Ahly          9         6            2                4
Zamalek       6         5            3                2
Pyramids      6         3            3                0
Ismaily       3         1            1                0
Masry         0         2            4                -2
Future        0         1            5                -4
```

## 📝 Match Details

The system displays detailed information about each match, including the teams, score, goal scorers, and the minute of every goal.

Example:

```text
===== Match Details =====

Match #1: Ahly 2 - 1 Zamalek

Mahmoud (Ahly) - 15'
Mohamed (Ahly) - 60'
Hashim (Zamalek) - 78'
```

## ⚽ Example Matches

```text
Match #1: Ahly 2 - 1 Zamalek
Match #2: Pyramids 2 - 1 Masry
Match #3: Ismaily 1 - 0 Future
Match #4: Ahly 2 - 0 Pyramids
Match #5: Zamalek 2 - 1 Masry
Match #6: Future 1 - 2 Ahly
Match #7: Ismaily 0 - 1 Pyramids
Match #8: Zamalek 2 - 0 Future
```

## 💻 Technologies Used

* **Java**
* **Object-Oriented Programming**
* **ArrayList**
* **Maven**
* **Apache NetBeans**

## 🧠 OOP Concepts Demonstrated

### Encapsulation

Class attributes are declared as `private` and accessed through getters and setters.

Example:

```java
private String nameTeam;

public String getNameTeam() {
    return nameTeam;
}

public void setNameTeam(String nameTeam) {
    this.nameTeam = nameTeam;
}
```

### Composition

Objects are used as attributes inside other classes.

```text
Team
 └── ArrayList<Player>

Match
 ├── Team
 └── ArrayList<Goal>

Goal
 └── Player

Schedule
 ├── ArrayList<Team>
 └── ArrayList<Match>
```

## 📁 Project Structure

```text
SoccerLeagueSystem/
│
├── pom.xml
│
└── src/
    └── main/
        └── java/
            └── com/
                └── mycompany/
                    └── soccerleaguesystem/
                        │
                        ├── Player.java
                        ├── Team.java
                        ├── Goal.java
                        ├── Match.java
                        ├── Schedule.java
                        └── SoccerLeagueSystem.java
```

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone <YOUR-REPOSITORY-URL>
```

### 2. Open the Project

Open the project using:

* Apache NetBeans
* IntelliJ IDEA
* Eclipse

### 3. Build the Project

Using Maven:

```bash
mvn clean compile
```

### 4. Run the Application

```bash
mvn exec:java
```

Or run the main class directly:

```text
SoccerLeagueSystem.java
```

## ✅ Sample Execution

The application successfully processes the matches and produces the final standings.

```text
===== Soccer League Standings =====

Team          Points    Goals For    Goals Against    Goal Difference
Ahly          9         6            2                4
Zamalek       6         5            3                2
Pyramids      6         3            3                0
Ismaily       3         1            1                0
Masry         0         2            4                -2
Future        0         1            5                -4
```

## 📚 Assignment Requirements

The project satisfies the required five-class design:

| Class      | Purpose                                                 |
| ---------- | ------------------------------------------------------- |
| `Player`   | Represents a soccer player                              |
| `Team`     | Stores team information, players, and statistics        |
| `Goal`     | Stores scorer, match ID, and goal minute                |
| `Match`    | Stores two teams and match goals                        |
| `Schedule` | Manages teams, matches, statistics, ranking, and output |

Collections are implemented using `ArrayList` as required.

## 🚀 Future Improvements

Possible future enhancements include:

* Add more teams and matches.
* Add player statistics.
* Add top goal scorer ranking.
* Add yellow and red cards.
* Add match dates and stadiums.
* Add league search functionality.
* Add a graphical user interface.
* Store league data in a database.
* Export standings to CSV or PDF.
* Add automated unit tests.

## 👨‍💻 Author

**Mahmoud Bakri**

Java | OOP | Software Testing & Quality Assurance

## 📄 License

This project was created for educational purposes as part of a Java Object-Oriented Programming assignment.
