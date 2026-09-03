# ⚽ Soccer League System — Java OOP Assignment

![Java](https://img.shields.io/badge/Java-JDK%208%2B-orange?style=flat-square&logo=openjdk)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=flat-square)
![License](https://img.shields.io/badge/License-Academic-blue?style=flat-square)

A Java object-oriented design that models a soccer league: teams, players, matches, goals, and a schedule that tracks standings and match details — similar to a real "Soccer League Games" results table (matches played, goals for/against, points, and a detailed breakdown of scorers per match).

---

## 📋 Overview

This project demonstrates core Object-Oriented Programming principles in Java — **composition**, **encapsulation**, and **collections (ArrayList)** — through five cooperating classes:

| Class | Responsibility |
|---|---|
| `Player` | Represents a single player belonging to a team |
| `Team` | Represents a team and its roster of players |
| `Goal` | Represents a single goal scored in a match |
| `Match` | Represents a single game between two teams |
| `Schedule` | Manages all teams and matches, computes standings, and displays results |

---

## 🧩 Class Design

### 1️⃣ `Player`
**Attributes**
- `int playerId`
- `String name`
- `String position`
- `int jerseyNumber`

**Methods**
- `Player(int playerId, String name, String position, int jerseyNumber)` — constructor
- `int getPlayerId()` / `void setPlayerId(int playerId)`
- `String getName()` / `void setName(String name)`
- `String getPosition()` / `void setPosition(String position)`
- `int getJerseyNumber()` / `void setJerseyNumber(int jerseyNumber)`
- `String toString()`

---

### 2️⃣ `Team`
**Attributes**
- `int teamId`
- `String teamName`
- `ArrayList<Player> players` — 🔗 **composition**: a `Team` owns a list of `Player`
- `int totalGoals`
- `int totalPoints`
- `int matchesPlayed`
- `int wins`, `int draws`, `int losses`

**Methods**
- `Team(int teamId, String teamName)` — constructor
- `void addPlayer(Player player)`
- `ArrayList<Player> getPlayers()`
- `int getTeamId()` / `String getTeamName()` / `void setTeamName(String teamName)`
- `int getTotalGoals()` / `void addGoals(int goals)`
- `int getTotalPoints()` / `void addPoints(int points)`
- `void incrementMatchesPlayed()`
- `void recordWin()` / `void recordDraw()` / `void recordLoss()`
- `String toString()` — used when printing a standings row

---

### 3️⃣ `Goal`
**Attributes**
- `int matchId` — identifies which match the goal belongs to
- `Player scorer` — 🔗 **composition**: a `Goal` references the `Player` who scored
- `int minute` — minute the goal was scored

**Methods**
- `Goal(int matchId, Player scorer, int minute)` — constructor
- `int getMatchId()` / `void setMatchId(int matchId)`
- `Player getScorer()` / `void setScorer(Player scorer)`
- `int getMinute()` / `void setMinute(int minute)`
- `String toString()` — e.g. `"Ahmed Ali - 34'"`

---

### 4️⃣ `Match`
**Attributes**
- `int matchId`
- `Team homeTeam` — 🔗 **composition**: a `Match` contains two `Team` objects
- `Team awayTeam`
- `int homeScore`
- `int awayScore`
- `ArrayList<Goal> goals` — 🔗 **composition**: a `Match` owns a list of `Goal`

**Methods**
- `Match(int matchId, Team homeTeam, Team awayTeam)` — constructor
- `void addGoal(Goal goal)` — adds a goal and updates the relevant score
- `int getMatchId()`
- `Team getHomeTeam()` / `Team getAwayTeam()`
- `int getHomeScore()` / `int getAwayScore()`
- `ArrayList<Goal> getGoals()`
- `String getResult()` — e.g. `"Team A 2 - 1 Team B"`
- `String toString()` — prints match summary with scorers and minutes

---

### 5️⃣ `Schedule`
**Attributes**
- `ArrayList<Team> teams` — 🔗 **composition**: holds all `Team` objects in the league
- `ArrayList<Match> matches` — 🔗 **composition**: holds all `Match` objects played

**Methods**
- `Schedule()` — constructor
- `void addTeam(Team team)`
- `void addMatch(Match match)`
- `void playMatch(Match match)` — records a match and updates both teams' stats (goals, wins/draws/losses, points: 3 for a win, 1 for a draw, 0 for a loss)
- `void updateStandings()` — recalculates goals and points for every team
- `ArrayList<Team> rankTeams()` — sorts teams by points (then goal difference) descending
- `void displayStandingsTable()` — prints the results table: team, played, goals, points (mirrors the reference image)
- `void displayMatchDetails(int matchId)` — prints scorers and minutes for a specific match
- `Match findMatchById(int matchId)`
- `Team findTeamById(int teamId)`

---

## 🔗 Composition Relationships (UML-style summary)
