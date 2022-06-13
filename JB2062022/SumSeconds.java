package JB12062022;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sec1 = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());
        int sec = sec1+sec2+sec3;
        int min = sec/60;
        sec%=60;

        System.out.printf("%d:%02d",min, sec);
    }
}
