
package chapter6and7;

import java.util.Scanner;

import static java.lang.System.out;

public class MainGame {
    static Scanner user = new Scanner(System.in);
    static GameBalance balance = new GameBalance();
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int SEVEn = 7;
    private static final int ELEVEN = 11;
    private static final int TWELVE = 12;
    public static void main(String[] args) {
       balance.withDrawWager();
        int sumOfRolledDice = Dice.rolledDice();
        Games games;
        int playerPoint = 0;
        switch (sumOfRolledDice){
            case SEVEn:
            case ELEVEN:
                games = Games.WON;
                break;
            case THREE:
            case TWO:
            case TWELVE:
                games = Games.LOST;
            default:
                games = Games.CONTINUE;
                playerPoint = sumOfRolledDice;
        }
        while (games == Games.CONTINUE){
            sumOfRolledDice = Dice.rolledDice();
            if (sumOfRolledDice == playerPoint) games = Games.WON;
            if (sumOfRolledDice == SEVEn) games = Games.LOST;
        }
        if (games == Games.WON) out.println("Player Won!");
        else out.println("Payer Lost!");
    }
}
