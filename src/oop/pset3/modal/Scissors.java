package pset2Polopho.pset3.modal;

public class Scissors implements Moves {
    @Override
    public String getName(){
        return "Scissors";
    }

    @Override
    public boolean getWinner(Moves move) {
        Paper paper = new Paper();
        Lizard lizard = new Lizard();
        String paperName = paper.getName();
        String lizardName = lizard.getName();
        if (move.getName().equalsIgnoreCase(paperName)||move.getName().equalsIgnoreCase(lizardName)){
            return true;
        }
        return false;
    }
}
