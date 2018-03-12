package pset2Polopho.pset3.modal;

public class Lizard implements Moves {
    @Override
    public String getName() {
        return "Lizerd";
    }

    @Override
    public boolean getWinner(Moves move) {
        Paper paper = new Paper();
        Spock spock = new Spock();
        String spockName = spock.getName();
        String paperName = paper.getName();

        if (move.getName().equalsIgnoreCase(paperName)||move.getName().equalsIgnoreCase(spockName)){
            return true;
        }
        return false;
    }
}
