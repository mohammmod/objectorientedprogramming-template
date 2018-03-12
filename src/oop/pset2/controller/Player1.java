package polymorphsem.pset2.controller;

import polymorphsem.pset2.modal.Moves;

import java.util.Scanner;

public class Player1 implements Players {
    @Override
    public Moves pickUpOneMove(PossibleMove move){
        Scanner input = new Scanner(System.in);
        String userChoise = input.nextLine();
        return toMove(userChoise,move);
    }

    private Moves toMove(String userChoise, PossibleMove move) {
        return move.getMoves().stream()
                .filter(moves-> moves.getName().equalsIgnoreCase(userChoise))
                .findFirst().get();
    }
}
