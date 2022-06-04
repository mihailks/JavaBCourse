package JB04062022;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double size = Double.parseDouble(scanner.nextLine());
        double pricePerM = 7.61;
        double finalP = size*pricePerM;
        double price = finalP*0.82;
        double dis = finalP * 0.18;

        System.out.printf("The final price is: %.2f lv.", price);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.", dis);
    }
}
