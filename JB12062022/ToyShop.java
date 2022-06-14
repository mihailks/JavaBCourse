package JB12062022;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        int jigsaw = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());


        int count = jigsaw + dolls + bears + minions + trucks;
        double sell = jigsaw * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;
        if (count >= 50) {
            sell *= 0.75;
        }
        sell *= 0.9;
        double moneyLeft = sell-trip;
        if (sell>=trip){
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(moneyLeft));
        }

    }
}
