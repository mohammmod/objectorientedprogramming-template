package pset2Polopho.pset3.controller;

import pset2Polopho.pset3.modal.Moves;

public interface Players {
    Moves pickUpOneMove(PossibleMove oneMove);
    boolean wannaPlayAgain();
}
