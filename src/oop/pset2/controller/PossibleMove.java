package polymorphsem.pset2.controller;

import polymorphsem.pset2.modal.Moves;
import polymorphsem.pset2.modal.Paper;
import polymorphsem.pset2.modal.Rock;
import polymorphsem.pset2.modal.Scissors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PossibleMove {
    private List<Moves> moves;
    public PossibleMove(){
        moves = Stream.of(
                new Rock(),
                new Scissors(),
                new Paper()
        ).collect(Collectors.toList());

    }
    public List<Moves> getMoves(){
        return new ArrayList<>(moves);
    }
}
