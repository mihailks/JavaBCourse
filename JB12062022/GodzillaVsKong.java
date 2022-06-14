package JB12062022.GodzillaVs;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int workForce = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double money = budget*0.1;
        if (workForce>150){
            clothes*=0.9;
        }
        money +=clothes*workForce;
        if (budget<money){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget-money));
        } else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget-money);
        }


    }
}
