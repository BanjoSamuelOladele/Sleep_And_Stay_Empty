package chapter6and7.PlayAroundChapter6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter a year::  ");
        System.out.println(isLeapYear(user.next()));
    }
    public static boolean isLeapYear(String year){
        if (year.length() != 4) throw new RuntimeException("year is 4 digit character");
        boolean isLeapyear = Integer.parseInt(year)%4 == 0;
        return isLeapyear;
    }
}
