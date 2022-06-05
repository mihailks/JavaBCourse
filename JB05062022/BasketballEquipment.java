package JB05062022;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());
        double snickers = tax * 0.6;
        double clothes = snickers * 0.8;
        double ball = clothes / 4;
        double accessories = ball / 5;

        System.out.println(tax + snickers + clothes + ball + accessories);

    }
}
