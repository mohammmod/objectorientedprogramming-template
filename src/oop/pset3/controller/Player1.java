package pset2Polopho.pset3.controller;

import pset2Polopho.pset3.modal.Moves;

import java.util.Scanner;

public class Player1 implements Players {
    @Override
    public Moves pickUpOneMove(PossibleMove move){
        Scanner input = new Scanner(System.in);
        String userChoise = input.nextLine();
        return toMove(userChoise,move);
    }

    @Override
    public boolean wannaPlayAgain() {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play again? (y/n):");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("yes")){
            return true;
        }
        System.out.println("\nHost - Goodbye!");
        return false;
    }

    private Moves toMove(String userChoise, PossibleMove move) {
        return move.getMoves().stream()
                .filter(moves-> moves.getName().equalsIgnoreCase(userChoise))
                .findFirst().get();
    }
}
