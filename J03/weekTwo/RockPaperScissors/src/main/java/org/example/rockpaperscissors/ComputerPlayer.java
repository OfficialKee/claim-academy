package org.example.rockpaperscissors;

import java.util.Random;

public class ComputerPlayer implements Player {

    @Override
    public String getName() {
        return "Marvin";
    }

    @Override
    public RockPaperScissorsAction getAction() {
        Random rng = new Random();
        int choice = rng.nextInt(3) + 1;

        switch (choice) {
            case 1:
                return RockPaperScissorsAction.ROCK;
            case 2:
                return RockPaperScissorsAction.PAPER;
            case 3:
                return RockPaperScissorsAction.SCISSORS;
        }

        System.err.println("SOMETHING VERY WRONG JUST HAPPENED HERE");
        return RockPaperScissorsAction.ROCK;
    }
    public RockPaperScissorsAction getAction2(int num) {
        // Random rng = new Random();
        // int choice = rng.nextInt(3) + 1;
            if(num==1||num == 6){
                return RockPaperScissorsAction.ROCK;
            }
            else if(num==2||num==5){
                return RockPaperScissorsAction.PAPER;
            }   
            else if(num==3||num ==4){
                return RockPaperScissorsAction.SCISSORS;
            }
                
        

        System.err.println("SOMETHING VERY WRONG JUST HAPPENED HERE");
        return RockPaperScissorsAction.ROCK;
    }

    
}
