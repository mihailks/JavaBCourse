package JB04062022;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());
        double sum = dog*2.5 + cat*4;
        System.out.printf("%.2f lv.", sum);

    }
}
