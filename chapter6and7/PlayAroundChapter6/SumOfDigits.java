package chapter6and7.PlayAroundChapter6;

public class SumOfDigits {
    public int getSumOfDigit(String number) {
        int digit = Integer.parseInt(number);
        int total =0;
        total = totalOfSUm(number, digit, total);
        return total;
    }

    private static int totalOfSUm(String number, int digit, int total) {
        for (int index = 0; index < number.length(); index++) {
            int remainder = digit %10;
            total += remainder;
            digit /=10;
        }
        return total;
    }
}
