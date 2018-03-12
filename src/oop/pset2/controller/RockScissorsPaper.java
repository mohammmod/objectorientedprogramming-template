package polymorphsem.pset2.controller;

import polymorphsem.pset2.modal.Moves;
import polymorphsem.pset2.view.Displayer;

public class RockScissorsPaper {
    PlayerFactory players = new PlayerFactory();
    Displayer displayer = new Displayer();
    public void play() {
        displayer.displayWelcomeMassage();
        WannaPlayAgain yesOrNo = new WannaPlayAgain();
        do {
            PossibleMove move = new PossibleMove();

            displayer.displayThechoices(move);

            Players player1 = players.getPlayer1();

            Players player2 = players.getPlayer2();

            Moves move1 = player1.pickUpOneMove(move);

            Moves move2 = player2.pickUpOneMove(move);

            displayer.displayMovements(move1, move2);

            Judge judge = new Judge();

            String theWinner = judge.judging(move1, move2);

            displayer.displayTheWiner(theWinner);


        }while (yesOrNo.wannaPlayAgain());
    }
}
