package JB05062022;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pen = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int clean = Integer.parseInt(scanner.nextLine());
        int percents = Integer.parseInt(scanner.nextLine());

        double price = (pen*5.8 + markers*7.2 + clean*1.2);
        double discount = price - (price * percents/100);

        System.out.println(discount);
    }
}
