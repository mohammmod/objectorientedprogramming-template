package pset2.controller;


public class PlayerFactory {
    public Players getPlayer1(){
        return new Player2();
    }
    public Players getPlayer2(){
        return new Player1();
    }

}
