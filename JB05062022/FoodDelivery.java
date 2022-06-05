package JB05062022;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegMenu = Integer.parseInt(scanner.nextLine());

        System.out.println((chickenMenu*10.35+fishMenu*12.40+vegMenu*8.15) * 1.2 + 2.5);
    }
}
