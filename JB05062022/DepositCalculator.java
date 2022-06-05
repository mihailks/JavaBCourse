package JB05062022;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int mounts = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double sum = deposit + mounts*(deposit*percent/100)/12;
        System.out.println(sum);
    }
}
