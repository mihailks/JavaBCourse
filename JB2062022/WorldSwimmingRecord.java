package JB12062022;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double timeSec = Double.parseDouble(scanner.nextLine());

        double delay = meters / 15;
        double deleySec = Math.floor(delay);
        double ivanTime = deleySec*12.5+meters*timeSec;
        double nope = Math.abs(record-ivanTime);

        if(ivanTime<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",ivanTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",nope);
        }


    }

}
