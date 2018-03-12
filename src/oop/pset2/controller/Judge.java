package polymorphsem.pset2.controller;

import polymorphsem.pset2.modal.Moves;

import java.util.HashMap;

public class Judge {
    public String judging(Moves move1, Moves move2) {
        HashMap<String, String> oppositemove = new HashMap<>();

        oppositemove.put("Rock", "Scissors");
        oppositemove.put("Scissors", "Paper");
        oppositemove.put("Paper", "Rock");


        String opposite = oppositemove.get(move1.getName());


        if (move1.getName().equalsIgnoreCase(move2.getName())) {
            return "it is a tie";
        } else if (move2.getName().equals(opposite)) {
            return "Player2 is the winner";
        } else {
            return "Player1 is the winner";
        }
    }
}
