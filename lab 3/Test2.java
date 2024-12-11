package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("please choose option:");
            System.out.println("1.create Game Tester");
            System.out.println("2.exit");
            Scanner scan = new Scanner( System.in );
            int read = scan.nextInt();
            if (read == 2) {

                break;
            } else if (read == 1) {
                System.out.println("please select work Type:");
                System.out.println("1.FullTime");
                System.out.println("2.PartTime");
                int type = scan.nextInt();

                GameTester gameTester;
                if (type == 1) {
                    gameTester =  new FullTimeGameTester();
                } else if (type == 2) {
                    System.out.println("please enter part time work hours:");
                    double hours = scan.nextDouble();
                    PartTimeGameTester partTimeGameTester = new PartTimeGameTester();
                    partTimeGameTester.setWorkHours(hours);
                    gameTester = partTimeGameTester;
                } else {
                    System.out.println("wrong  type!");
                    continue;
                }

                System.out.println("create  success. game tester salary :" + gameTester.getSalary());


            }else {
                System.out.println("wrong option selected, please try again!");

            }
        }
    }
}
