package JB04062022;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        int timeNeed = n*3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, timeNeed, n);
    }
}
