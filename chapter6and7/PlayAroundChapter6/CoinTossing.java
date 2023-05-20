package chapter6and7.PlayAroundChapter6;

import java.util.Scanner;

public class CoinTossing {
    static Scanner user = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("do you want to play? ");
        int collect = user.nextInt();
        CoinFace face = null;
        int facing =0;
        int numberOfHeads =0;
        int numberOfTails=0;
        while (collect == 1){
            facing = CoinFlips.flips();
            if (facing == 0) face = CoinFace.TAILS;
            if (facing == 1) face = CoinFace.HEADS;
            if (face ==CoinFace.TAILS) {
                System.out.println("You've got a tail");
                numberOfTails++;
            }
            if (face == CoinFace.HEADS) {
                System.out.println("You've got an Head");
                numberOfHeads++;
            }
            System.out.print("Toss COin? press 1 to continue, 2 to quit");
            collect = user.nextInt();
            if (collect == 1) System.out.println("Another round");
            else System.out.println("quit");
        }
        System.out.println(numberOfHeads);
        System.out.println(numberOfTails);
    }
//    public static void result(int collect){
//        CoinFace face=null;
//        int facing =0;
//        int numberOfHeads =0;
//        int numberOfTails=0;
//        while (collect == 1){
//            facing = CoinFlips.flips();
//            if (facing == 0) face = CoinFace.TAILS;
//            if (facing == 1) face = CoinFace.HEADS;
//            if (face ==CoinFace.TAILS) {
//                System.out.println("You've got a tail");
//                numberOfTails++;
//            }
//            if (face == CoinFace.HEADS) {
//                System.out.println("You've got an Head");
//                numberOfHeads++;
//            }
//            System.out.print("Toss COin? press 1 to continue, 2 to quit");
//            collect = user.nextInt();
//            if (collect == 1) System.out.println("Another round");
//            else System.out.println("quit");
//        }
//        System.out.println(numberOfHeads);
//        System.out.println(numberOfTails);
//    }
}
