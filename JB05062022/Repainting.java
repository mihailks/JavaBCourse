package JB05062022;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double prNaylon = (naylon + 2) * 1.5;
        double prPaint = paint * 1.1 * 14.50;
        double prThinner = thinner * 5;
        double sumMath = prNaylon + prPaint + prThinner + 0.4;
        double sumWork = sumMath * 0.3 * hours;

        System.out.println(sumWork + sumMath);

    }
}
