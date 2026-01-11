![Gameplay Demo](gamePlay.gif)

# Car Race Game 🏎️

A classic Java-based 2D car racing game built with Swing GUI, where players navigate through traffic while avoiding collisions and competing for high scores.

## About The Project

This is an arcade-style car racing game developed in Java that challenges players to dodge oncoming traffic on a multi-lane highway. The game features animated racing tracks, dynamic obstacles, and a competitive scoring system that tracks your best performances.

The game provides an engaging experience with smooth animations, keyboard controls, and progressively increasing difficulty as you advance through the levels.

## Features

### Core Gameplay

- **Traffic Dodging Mechanics**: Navigate your car through lanes while avoiding oncoming vehicles
- **Keyboard Controls**: Use arrow keys to move left and right across lanes
- **Animated Race Track**: Dynamic road animations with lane dividers that create a realistic racing environment
- **Multiple Difficulty Levels**: Game speed and complexity increase as you progress

### Visual Elements

- **Color-Coded Road Elements**: Red and white lane dividers with smooth color transitions
- **Multiple Car Models**: Different colored vehicles (using obstacle cars)
- **Smooth Animations**: Thread-based animation system for fluid gameplay
- **Custom GUI Components**: Built entirely with Java Swing components

### Scoring System

- **Real-Time Score Tracking**: Points accumulate as you successfully dodge obstacles
- **High Score Persistence**: Your best scores are saved to a local file
- **Leaderboard**: View previous high scores with player names
- **Personal Best Recording**: Enter your name when you achieve a new high score

### Game Screens

- **Main Menu**: Start game and view high scores
- **Gameplay Screen**: Main racing interface with score display
- **Game Over Screen**: Shows your final score and high score comparison
- **High Score Entry**: Input form for recording new personal bests

### Technical Features

- **Multi-threaded Design**: Separate threads for animations and game logic
- **Cross-Platform Compatibility**: Works on Windows, macOS, and Linux
- **macOS Optimized**: Special color rendering fixes for proper display on macOS
- **Score Persistence**: File-based score storage system
- **NetBeans Project**: Complete NetBeans IDE project structure included

## Project Structure

```
carrace/
├── src/                    # Source code files
│   ├── carrace.java       # Main entry point
│   ├── game11.java        # Main menu screen
│   ├── game1.java         # Track animation/intro screen
│   ├── game2.java         # Main gameplay screen
│   └── game3.java         # Game over/score screen
├── build/                 # Compiled classes
├── nbproject/             # NetBeans project configuration
├── build.xml              # Ant build script
└── run.sh                 # Shell script to run the game
```

## How to Run

### Using the Shell Script (macOS/Linux)

```bash
cd carrace
./run.sh
```

### Using Ant Build Tool

```bash
cd carrace
ant clean
ant compile
ant run
```

### Manual Compilation

```bash
cd carrace/src
javac *.java
java carrace
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- Ant build tool (optional, for building with build.xml)

## Author

**Naveen Kumar**

---

_Enjoy the race and try to beat your high score!_ 🏁
