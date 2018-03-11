package pset2.controller;

import java.util.Scanner;

public class WannaPlayAgain {
    public boolean wannaPlayAgain(){
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play again? (y/n):");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("yes")){
            return true;
        }
        System.out.println("\nHost - Goodbye!");
        return false;
    }
}
