package JB12062022;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        min += hours * 60;
        min += 15;
        hours = min / 60;
        min %= 60;
if(hours>=24){
    hours=0;
}
        System.out.printf("%d:%02d", hours, min);

    }
}
