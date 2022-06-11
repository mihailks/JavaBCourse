package JB11062022;

import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fig = scanner.nextLine();
        if (fig.equals("square")) {
            double n = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",n * n);
        } else if (fig.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",a * b);
        } else if (fig.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",r * r * Math.PI);
        } else if (fig.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", a * b / 2);
        }
    }
}