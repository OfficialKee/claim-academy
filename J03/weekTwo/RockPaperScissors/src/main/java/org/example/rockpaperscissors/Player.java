package org.example.rockpaperscissors;

public interface Player {
    String getName();
    RockPaperScissorsAction getAction();
    RockPaperScissorsAction getAction2(int num);
}
