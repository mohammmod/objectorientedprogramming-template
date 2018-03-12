package pset2Polopho.pset3.controller;

import pset2Polopho.pset3.modal.*;

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
                new Paper(),
                new Spock(),
                new Lizard()
        ).collect(Collectors.toList());

    }
    public List<Moves> getMoves(){
        return new ArrayList<>(moves);
    }
}
