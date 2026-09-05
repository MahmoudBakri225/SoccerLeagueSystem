# ⚽ Soccer League System

A Java-based **Object-Oriented Programming (OOP)** project that models a soccer league, manages teams and players, records match goals, and generates league standings based on match results.

---

## 📌 Overview

The **Soccer League System** is designed to represent the core structure of a simple soccer league using Java classes and object relationships.

The system manages:

* Teams and their players
* Soccer matches
* Goals and goal scorers
* Match results
* Team statistics
* League points
* Goal difference
* League standings
* Detailed match information

The project was developed as an **Object-Oriented Programming assignment** using exactly five main classes:

```text
Player
Team
Goal
Match
Schedule
```

---

## ✨ Features

* ⚽ Manage soccer teams
* 👤 Manage players belonging to each team
* 🏟️ Manage matches between two teams
* 🥅 Record goals scored during matches
* ⏱️ Store the minute of each goal
* 👤 Identify the player who scored each goal
* 📊 Track Goals For and Goals Against
* 🏆 Calculate team points
* 📈 Calculate Goal Difference
* 🥇 Rank teams in the league
* 📋 Display league standings
* 📝 Display detailed match results

---

## 🏗️ Architecture Diagram

```text
                         ⚽ SOCCER LEAGUE SYSTEM
                                  |
                                  v
                         +-----------------+
                         |    Schedule     |
                         |-----------------|
                         | Teams           |
                         | Matches         |
                         | Statistics      |
                         | Ranking         |
                         | Display Results |
                         +--------+--------+
                                  |
                    +-------------+-------------+
                    |                           |
                    v                           v
             +-------------+             +-------------+
             |    Team     |             |    Match    |
             |-------------|             |-------------|
             | nameTeam    |             | matchId     |
             | players     |             | homeTeam    |
             | goalsFor    |             | awayTeam    |
             | goalsAgainst|             | goals       |
             | points      |             +------+------+
             +------+------+                    |
                    |                           |
                    v                           v
             +-------------+             +-------------+
             |   Player    |             |    Goal     |
             |-------------|             |-------------|
             | Player Data |<------------| matchId     |
             +-------------+    scorer   | scorer      |
                                         | minute      |
                                         +-------------+
```

---

## 🔗 Class Relationships

```text
Schedule
|
+-- ArrayList<Team>
|       |
|       +-- ArrayList<Player>
|
+-- ArrayList<Match>
        |
        +-- Team homeTeam
        +-- Team awayTeam
        |
        +-- ArrayList<Goal>
                |
                +-- Player scorer
```

### Relationship Summary

| Class      | Contains                                 |
| ---------- | ---------------------------------------- |
| `Schedule` | `ArrayList<Team>` and `ArrayList<Match>` |
| `Team`     | `ArrayList<Player>`                      |
| `Match`    | Two `Team` objects and `ArrayList<Goal>` |
| `Goal`     | A `Player` object as the scorer          |
| `Player`   | Player information                       |

---

# 📦 Class Design

## 👤 Player

The `Player` class represents a soccer player participating in the league.

### Responsibilities

* Store player information.
* Represent players belonging to a team.
* Identify the player responsible for scoring a goal.

---

## 🏟️ Team

The `Team` class represents a soccer team participating in the league.

### Attributes

```java
private String nameTeam;
private ArrayList<Player> players;
private int goalsFor;
private int goalsAgainst;
private int points;
```

### Responsibilities

* Store the team name.
* Store the team's players.
* Track goals scored.
* Track goals conceded.
* Track league points.
* Add players to the team.

### Main Methods

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

### Composition

```text
Team
 |
 +-- ArrayList<Player>
```

A team contains multiple players.

---

## 🥅 Goal

The `Goal` class represents a goal scored during a match.

### Attributes

```java
private int matchId;
private Player scorer;
private int minute;
```

### Responsibilities

* Store the match identifier.
* Store the player who scored.
* Store the minute at which the goal was scored.

### Composition

```text
Goal
 |
 +-- Player scorer
```

---

## 🏟️ Match

The `Match` class represents a soccer match between two teams.

### Attributes

```java
private int matchId;
private Team homeTeam;
private Team awayTeam;
private ArrayList<Goal> goals;
```

### Responsibilities

* Store the match identifier.
* Store the home team.
* Store the away team.
* Store the goals scored during the match.

### Composition

```text
Match
 |
 +-- Team homeTeam
 +-- Team awayTeam
 +-- ArrayList<Goal>
```

---

## 📅 Schedule

The `Schedule` class manages the complete soccer league.

### Attributes

```java
private ArrayList<Team> teams;
private ArrayList<Match> matches;
```

### Responsibilities

* Store all league teams.
* Store all league matches.
* Process match results.
* Update team statistics.
* Update team points.
* Calculate goal difference.
* Rank teams.
* Display the standings table.
* Display detailed match information.

### Composition

```text
Schedule
 |
 +-- ArrayList<Team>
 +-- ArrayList<Match>
```

---

# 🧠 Object-Oriented Programming Concepts

## Encapsulation

The project uses `private` attributes and public getters and setters to control access to object data.

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

This keeps the internal state of the object protected while allowing controlled access.

---

## Composition

The project uses composition to represent relationships between objects.

```text
Team
 |
 +-- ArrayList<Player>

Match
 |
 +-- Team homeTeam
 +-- Team awayTeam
 +-- ArrayList<Goal>

Goal
 |
 +-- Player scorer

Schedule
 |
 +-- ArrayList<Team>
 +-- ArrayList<Match>
```

---

# ⚽ Points System

The league follows the standard soccer points system:

| Match Result | Points |
| ------------ | -----: |
| Win          |      3 |
| Draw         |      1 |
| Loss         |      0 |

---

# 📊 League Statistics

The system tracks the following statistics for each team:

| Statistic       | Description                      |
| --------------- | -------------------------------- |
| Goals For       | Total goals scored by the team   |
| Goals Against   | Total goals conceded by the team |
| Goal Difference | Goals For - Goals Against        |
| Points          | Points earned from match results |

### Goal Difference

```text
Goal Difference = Goals For - Goals Against
```

---

# ⚽ Teams

The implemented example contains six teams:

```text
Ahly
Zamalek
Pyramids
Ismaily
Masry
Future
```

---

# 📝 Match Results

The system processes eight matches:

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

---

# 📝 Match Details

The system displays detailed information about goals scored in each match.

Example:

```text
===== Match Details =====

Match #1: Ahly 2 - 1 Zamalek
  Mahmoud (Ahly) - 15'
  Mohamed (Ahly) - 60'
  Hashim (Zamalek) - 78'
```

The output identifies the **goal scorer** and the **minute of the goal**.

---

# 🏆 Final League Standings

After processing the matches, the system generates the following standings:

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

### 🥇 Current Leader

```text
Team: Ahly
Points: 9
Goals For: 6
Goals Against: 2
Goal Difference: +4
```

---

# 📁 Project Structure

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

---

# 💻 Technologies Used

| Technology                  | Purpose                      |
| --------------------------- | ---------------------------- |
| Java                        | Application development      |
| Object-Oriented Programming | System design                |
| ArrayList                   | Collection management        |
| Maven                       | Project build and management |
| Apache NetBeans             | Development environment      |

---

# ▶️ How to Run

## Prerequisites

Make sure you have:

* Java JDK installed
* Apache Maven installed
* Apache NetBeans, IntelliJ IDEA, or Eclipse

## Using Maven

Navigate to the project directory:

```bash
cd SoccerLeagueSystem
```

Compile the project:

```bash
mvn clean compile
```

Run the application:

```bash
mvn exec:java
```

You can also run the main class directly from your IDE:

```text
SoccerLeagueSystem.java
```

---

# ✅ Build & Execution

The project was successfully compiled and executed using Maven.

```text
BUILD SUCCESS
Total time: 0.920 s
```

The application successfully generated:

* Detailed match results
* Goal scorer information
* Goal minutes
* Team statistics
* Final league standings

---

# 📚 Assignment Requirements

The project follows the required five-class design:

| Requirement                      | Status |
| -------------------------------- | ------ |
| `Player` class                   | ✅      |
| `Team` class                     | ✅      |
| `Goal` class                     | ✅      |
| `Match` class                    | ✅      |
| `Schedule` class                 | ✅      |
| Team contains players            | ✅      |
| Match contains two teams         | ✅      |
| Match contains goals             | ✅      |
| Goal contains match ID           | ✅      |
| Goal contains scorer             | ✅      |
| Goal contains scoring minute     | ✅      |
| `ArrayList` used for collections | ✅      |
| Team statistics                  | ✅      |
| League ranking                   | ✅      |
| Results table                    | ✅      |
| Match details                    | ✅      |

---

# 🎓 Learning Outcomes

This project demonstrates practical experience with:

* Java class design
* Object creation and relationships
* Encapsulation
* Composition
* `ArrayList` collections
* Constructors
* Getters and setters
* Object-oriented modeling
* Processing match results
* Updating team statistics
* Ranking and displaying data
* Building a structured Java application with Maven

---

# 🚀 Future Improvements

Possible future enhancements include:

* Add more teams and matches.
* Add player statistics.
* Add top-scorer functionality.
* Add match dates and stadium information.
* Add additional match events.
* Add a graphical user interface.
* Store league data in a database.
* Export standings and match reports.
* Add automated unit testing.

---

# 👨‍💻 Author

**Mahmoud Bakri**

Java | Object-Oriented Programming | Software Testing & Quality Assurance

---

## 📄 License

This project was created for educational purposes as part of a Java Object-Oriented Programming assignment.
