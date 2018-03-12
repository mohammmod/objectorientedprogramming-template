package pset2Polopho.pset3.view;

import pset2Polopho.pset3.controller.PossibleMove;
import pset2Polopho.pset3.modal.Moves;

import java.util.stream.Collectors;

public class Displayer {
    public void displayTheWiner(String winner){
        System.out.println(winner);
    }
    public void displayWelcomeMassage(){
        System.out.println("Host - Welcome to the Rock, Scissors, Paper tournament!");
    }
    public void displayThechoices(PossibleMove moves){
        String cards = moves.getMoves().stream()
                .map(move -> move.getName())
                .collect(Collectors.joining(", "));
        System.out.print("\nWrite your move ("+cards + "):");
    }

    public void displayMovements(Moves move1, Moves move2) {
        System.out.println("Player 1 move:" + move2.getName());
        System.out.println("Player 2 move:" + move1.getName());

    }


}
