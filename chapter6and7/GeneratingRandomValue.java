package chapter6and7;
import java.security.SecureRandom;
import java.util.Random;

import static java.lang.System.out;

public class GeneratingRandomValue {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        Random random = new Random();
        out.println("Print for the security class");
        for (int index = 1; index <= 20; index++) {
            int update = secureRandom.nextInt(9);
            out.print(update + " ");
            if (index%5 == 0) out.println();
        }
        out.println("Printing for the random class");

        for (int index = 0; index <= 20; index++) {
            String update = String.valueOf(random.nextInt(9));
            out.print(update + " ");
            if (index%5 == 0) out.println();
        }
    }
}
