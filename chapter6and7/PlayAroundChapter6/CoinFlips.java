package chapter6and7.PlayAroundChapter6;

import java.security.SecureRandom;

public class CoinFlips {
    public static int flips(){
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(2);
    }
}
