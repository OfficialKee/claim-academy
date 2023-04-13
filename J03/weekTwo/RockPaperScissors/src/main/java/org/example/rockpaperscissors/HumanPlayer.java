package org.example.rockpaperscissors;

import java.util.ArrayList;
import java.util.List;

public class HumanPlayer implements Player {
    private String name;
    private ConsoleIO io;
    private List<String> actionMenu;
    private static final int CHOICE_PAPER = 1;
    private static final int CHOICE_ROCK = 2;
    private static final int CHOICE_SCISSORS = 3;

    public HumanPlayer(String name, ConsoleIO io) {
        this.name = name;
        this.io = io;

        actionMenu = new ArrayList<>();
        actionMenu.add("Paper");
        actionMenu.add("Rock");
        actionMenu.add("Scissors");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public RockPaperScissorsAction getAction() {
        RockPaperScissorsAction result = null;

        while (result == null) {
            io.displayMessage(getName() + ", select an action");
            int choice = io.displayMenuAndGetChoice(actionMenu);

            switch (choice) {
                case CHOICE_PAPER:
                    result = RockPaperScissorsAction.PAPER;
                    break;
                case CHOICE_ROCK:
                    result = RockPaperScissorsAction.ROCK;
                    break;
                case CHOICE_SCISSORS:
                    result = RockPaperScissorsAction.SCISSORS;
                    break;
                default:
                    io.displayError("Invalid input.");
            }
        }

        return result;
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
