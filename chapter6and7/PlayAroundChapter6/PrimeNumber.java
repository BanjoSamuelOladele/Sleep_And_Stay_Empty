package chapter6and7.PlayAroundChapter6;

public class PrimeNumber {
    public boolean getPrimeNumber(int number) {
        int zeroCounter = 0;
        boolean checker;
        for (int index = 1; index <= number; index++) {
            if (number%index == 0) zeroCounter++;
        }
        checker = zeroCounter == 2;
        return checker;
    }
}
