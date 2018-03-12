package pset2Polopho.pset3.modal;

public class Paper implements Moves {
    @Override
    public String getName(){
        return "Paper";
    }

    @Override
    public boolean getWinner(Moves move) {
        Rock rock = new Rock();
        String rockName = rock.getName();
        Spock spock = new Spock();
        String spockName = spock.getName();
        if (move.getName().equalsIgnoreCase(rockName)||move.getName().equalsIgnoreCase(spockName)){
            return true;
        }
        return false;
    }
}
