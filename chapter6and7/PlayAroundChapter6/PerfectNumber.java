package chapter6and7.PlayAroundChapter6;

public class PerfectNumber {

    public boolean isPerfect(int number) {
        int result = 0;
        for (int index = 1; index < number; index++) {
            if (number%index == 0) result+=index;
        }
        return result == number;
    }
}
