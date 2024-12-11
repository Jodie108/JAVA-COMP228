package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        List<Insurance> list = new ArrayList<>();
        while (true) {
            System.out.println("please choose option:");
            System.out.println("1.create Insurance");
            System.out.println("2.exit");
            Scanner scan = new Scanner( System.in );
            int read = scan.nextInt();
            if (read == 2) {

                break;
            } else if (read == 1) {
                System.out.println("please select Insurance Type:");
                System.out.println("1.Health");
                System.out.println("2.Life");
                int type = scan.nextInt();
                System.out.println("please enter Insurance monthly cost:");

                double cost = scan.nextDouble();
                Insurance insurance;
                if (type == 1) {
                    insurance = new Health();
                } else if (type == 2) {
                    insurance = new Life();
                } else {
                    System.out.println("wrong insurance type!");
                    continue;
                }
                insurance.setInsuranceCost(cost);
                System.out.println("create insurance success. insurance details below:");
                insurance.displayInfo();
                list.add(insurance);

            }else {
                System.out.println("wrong option selected, please try again!");

            }
        }

        System.out.println("after double monthly cost:");
        for (Insurance insurance : list) {
            insurance.setInsuranceCost(insurance.getMonthlyCost() * 2);
            insurance.displayInfo();
        }
    }
}
