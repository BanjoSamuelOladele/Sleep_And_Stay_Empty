package chapter6and7;

import java.util.Scanner;

public class GameBalance {
    Scanner user = new Scanner(System.in);
    private int balance = 1_000;
    public void withDrawWager(){
        System.out.println("Enter an Amount:: ");
        int amount = user.nextInt();
        for (int index = 0; index < 1;) {
            if (amount>0 && amount<=balance){index = validateAmount(amount, index);}
            else {amount = getValidateError();}
        }
    }
    private int getValidateError() {
        int amount;
        System.out.println("Enter the correct amount "+ "you have "+ balance+" left.");
        System.out.println("Enter correct wager:: ");
        amount = user.nextInt();
        return amount;
    }
    private int validateAmount(int amount, int index) {
        balance -= amount;
        System.out.println("System.out.println(\"Stake successful, you are now left with "+ balance);
        index++;
        return index;
    }
    public void setWager(int amount){
        balance += amount;
    }
}
