package chapter6and7;

import java.security.SecureRandom;

import static java.lang.System.out;

public class ClassCrapGame {
    private enum Status {WON, LOST,CONTINUE};
    private static final int TWO_EYES = 2;
    private static final int THREE = 3;
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int TWELVE = 12;

    private static int rollDice(){
        SecureRandom secureRandom = new SecureRandom();
        int die1 = 1 + secureRandom.nextInt(6);
        int die2 = 1 + secureRandom.nextInt(6);
        out.println("die1 is "+ die1);
        out.println("die2 is "+ die2);
        return die2 + die1;
    }
    public static void main(String[] args) {
        Status gameStatus;
        int myPoint = 0;
        int sumOfRolledDice = rollDice();
        switch (sumOfRolledDice){
            case SEVEN:
            case ELEVEN:
                gameStatus = Status.WON;
                break;
            case TWO_EYES:
            case THREE:
            case TWELVE:
                gameStatus = Status.LOST;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfRolledDice;
        }
        while (gameStatus == Status.CONTINUE){
            sumOfRolledDice = rollDice();
            if (sumOfRolledDice == myPoint) gameStatus = Status.WON;
            if (sumOfRolledDice == SEVEN) gameStatus = Status.LOST;
        }
        if (gameStatus == Status.WON) System.out.println("Player won");
        if (gameStatus == Status.LOST) System.out.println("Player lost");
    }
}
