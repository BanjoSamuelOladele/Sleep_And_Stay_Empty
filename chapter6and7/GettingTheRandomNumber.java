package chapter6and7;

import java.security.SecureRandom;

public class GettingTheRandomNumber {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int index = 1; index <= 10_00_0; index++) {
            int update = 1 + random.nextInt(6);
            if (update == 1) frequency1++;
            if (update == 2) frequency2++;
            if (update == 3) frequency3++;
            if (update == 4) frequency4++;
            if (update == 5) frequency5++;
            if (update == 6) frequency6++;
        }
        System.out.printf("%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n","1: ",frequency1,"2: ",frequency2,"3: ",frequency3,"4: ",frequency4,"5: ",frequency5,"6: ",frequency6);
        System.out.println(frequency1+frequency2+frequency3+frequency4+frequency5+frequency6);
    }
}
