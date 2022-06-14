package JB12062022;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double screenTime = Double.parseDouble(scanner.nextLine());
        double pauseTime = Double.parseDouble(scanner.nextLine());

        pauseTime = pauseTime - pauseTime/8 - pauseTime/4;

        if(pauseTime>=screenTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(pauseTime-screenTime));
        } else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(screenTime-pauseTime));
        }



    }
}
