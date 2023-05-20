package chapter6and7.PlayAroundChapter6;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
            Scanner user = new Scanner(System.in);
            System.out.print("Enter a number:: ");
            asterisksSquare(user.nextInt());
            System.out.print("Enter a number:: ");
            int number = user.nextInt();
            System.out.print("Enter a shape:: ");
            String character = user.next();
            characterSquare(number,character);

    }
    public static void asterisksSquare(int number){
        for (int index = 1; index <= number; index++) {
            for (int jindex = 1; jindex <= number; jindex++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void characterSquare(int number, String character){
        for (int index = 1; index <= number; index++) {
            for (int jindex = 1; jindex <= number; jindex++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
