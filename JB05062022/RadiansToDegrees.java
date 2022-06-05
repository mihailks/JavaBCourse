package JB05062022;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rad = Double.parseDouble(scanner.nextLine());
        Double degrees = rad * 180 / Math.PI;
        System.out.println(degrees);
    }
}
