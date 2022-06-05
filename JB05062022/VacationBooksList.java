package JB05062022;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int countPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int hours = 0;


        hours = (countPages/pages)/days;


        System.out.println(hours);
    }
}
