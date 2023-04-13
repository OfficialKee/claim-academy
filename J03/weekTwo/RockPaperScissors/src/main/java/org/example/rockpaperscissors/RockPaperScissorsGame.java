package org.example.rockpaperscissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissorsGame {
    private ConsoleIO io;
    private List<String> playerSelectionMenu;
    private static final int CHOICE_PLAYER = 1;
    private static final int CHOICE_COMPUTER = 2;
    int tie = 0;
    int playerWinner = 0;
    int cpuWinner = 0;

    public RockPaperScissorsGame(ConsoleIO io) {
        this.io = io;
        playerSelectionMenu = new ArrayList<>();
        playerSelectionMenu.add("Human");
        playerSelectionMenu.add("Computer");
    }

    public void run() {
        Player playerA;
        Player playerB;
        int play = 1;

        playerA = choosePlayer();
        playerB = choosePlayer();

        RockPaperScissorsAction a = playerA.getAction();
        io.displayMessage(playerA.getName() + " chose " + a);

        RockPaperScissorsAction b = playerB.getAction2(play);
        io.displayMessage(playerB.getName() + " chose " + b);

         displayAndReturnResults(playerA, a, playerB, b);

        boolean playAgain = true;
        while(playAgain){
            play++;
            System.out.println("Player Score: "+ playerWinner);
            System.out.println("Cpu Score: "+cpuWinner);
            System.out.println("Ties: "+ tie);
           
            System.out.println("Do you want to play again? ");
            System.out.println("\n If yes: enter [1] \n If no: enter [2] ");
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            if(value == 1){
                repeat(playerA, playerB, play);
            }
            if(value == 2 || play == 6){
                if(value==2){
                    System.out.println("You have chosen to exit game...");
                }
                if(play==6){
                    System.out.println("You have reached play limit...");
                }
                playAgain = false;
                
            }
                
            
            
        }
        System.out.println(" FInal Player Score: "+ playerWinner);
        System.out.println(" Final Cpu Score: "+cpuWinner);
        System.out.println("Ties: "+ tie);
       
        
    }
    public void repeat(Player playerA, Player playerB, int num) {
      
       
        RockPaperScissorsAction a = playerA.getAction();
        io.displayMessage(playerA.getName() + " chose " + a);

        RockPaperScissorsAction b = playerB.getAction2(num);
        io.displayMessage(playerB.getName() + " chose " + b);

        displayAndReturnResults(playerA, a, playerB, b);
    }

    private Player choosePlayer() {
        Player player = null;

        while (player == null) {
            int choice = io.displayMenuAndGetChoice(playerSelectionMenu);

            switch (choice) {
                case CHOICE_PLAYER:
                    String name = io.getString("Player name");
                    player = new HumanPlayer(name, io);
                    break;
                case CHOICE_COMPUTER:
                    player = new ComputerPlayer();
                    break;
                default:
                    io.displayError("Invalid selection");
            }
        }

        return player;
    }


     private void displayAndReturnResults(Player playerA, RockPaperScissorsAction a, Player playerB, RockPaperScissorsAction b) {
       
        if (a == b) {
            io.displayTitle("It's a tie!");
             tie++;
        }

        // paper beats rock
        if ((a == RockPaperScissorsAction.PAPER && b == RockPaperScissorsAction.ROCK)
            || (b == RockPaperScissorsAction.PAPER && a == RockPaperScissorsAction.ROCK)
        ) {
            if (a == RockPaperScissorsAction.PAPER) {
                io.displayTitle(playerA.getName() + " Wins!!");
                 playerWinner++;
            } else {
                io.displayTitle(playerB.getName() + " Wins!");
                cpuWinner++;
            }

        }

        // rock beats scissors
        if ((a == RockPaperScissorsAction.SCISSORS && b == RockPaperScissorsAction.ROCK)
                || (b == RockPaperScissorsAction.SCISSORS && a == RockPaperScissorsAction.ROCK)
        ) {
            if (a == RockPaperScissorsAction.ROCK) {
                io.displayTitle(playerA.getName() + " Wins!!");
                playerWinner++;
            } else {
                io.displayTitle(playerB.getName() + " Wins!");
                cpuWinner++;
            }
           
        }

        // scissors beat paper
        if ((a == RockPaperScissorsAction.SCISSORS && b == RockPaperScissorsAction.PAPER)
                || (b == RockPaperScissorsAction.SCISSORS && a == RockPaperScissorsAction.PAPER)
        ) {
            if (a == RockPaperScissorsAction.SCISSORS) {
                io.displayTitle(playerA.getName() + " Wins!!");
                playerWinner++;
            } else {
                io.displayTitle(playerB.getName() + " Wins!");
                cpuWinner++;
            }
             
        }
    
    }
}
