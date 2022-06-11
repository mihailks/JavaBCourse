package JB11062022;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        if (n>m){
            System.out.println(n);
        }else {
            System.out.println(m);
        }
    }
}
