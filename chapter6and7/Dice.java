package chapter6and7;

import java.security.SecureRandom;

public class Dice {
    public static int rolledDice(){
        SecureRandom secureRandom = new SecureRandom();
        int die1 = 1 + secureRandom.nextInt(6);
        int die2 = 1 + secureRandom.nextInt(6);
        System.out.println("die1 is :: " + die1);
        System.out.println("die2 is :: " + die2);
        return die2 + die1;
    }
}
