package chapter6and7.PlayAroundChapter6;

import java.util.Scanner;

public class IsMultiple {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter  first number: ");
        int firstNumber = userInput.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = userInput.nextInt();

        boolean isTrue = isMultiple(firstNumber, secondNumber);
        System.out.println(isTrue);
        System.out.println(isDivisible(firstNumber));
    }
    public static boolean isMultiple(int firstNumber, int secondNumber){
        boolean isTrue = firstNumber%secondNumber == 0;
        return isTrue;
    }
    public static boolean isDivisible(int number){
        boolean isTrue = number%5==0;
        return isTrue;
    }
}
