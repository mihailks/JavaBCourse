package JB12062022;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double bonus=0;
        if (n < 100) {
            bonus = 5;
        } else if (n > 1000) {
            bonus = n * 0.1;
        } else {
            bonus = n * 0.2;
        }

        if (n % 2 == 0) {
            bonus += 1;
        } else if (n % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(n + bonus);

    }


}
