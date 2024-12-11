package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessMortgage {

    public static void main(String[] args) {

        List<Mortgage> list = new ArrayList<>(3);
        while (true) {
            System.out.println("please choose option:");
            System.out.println("1.create mortgage");
            System.out.println("2.exit");
            Scanner scan = new Scanner( System.in );
            int read = scan.nextInt();
            if (read == 2) {
                break;
            } else if (read == 1) {
                try {
                    System.out.println("please select mortgage Type:");
                    System.out.println("1.Business");
                    System.out.println("2.Personal");
                    int type = scan.nextInt();
                    Mortgage mortgage;
                    if (type == 1) {
                        mortgage = new BusinessMortgage();
                    } else if (type == 2) {
                        mortgage = new PersonalMortgage();
                    } else {
                        System.out.println("wrong option selected, please try again!");
                        continue;
                    }
                    System.out.println("please enter mortgage number:");
                    long number = scan.nextLong();
                    System.out.println("please enter customer name:");
                    String name = scan.next();
                    System.out.println("please enter mortgage amount:");
                    BigDecimal amount = scan.nextBigDecimal();
                    System.out.println("please enter mortgage term:");
                    int term = scan.nextInt();

                    mortgage.setMortgageNumber(number);
                    mortgage.setCustomerName(name);
                    mortgage.setMortgageAmount(amount);
                    mortgage.setMortgageTerm(term);

                    System.out.println("create mortgage success. details below:");
                    System.out.println(mortgage.getMortgageInfo());

                    list.add(mortgage);
                    if (list.size() >= 3) {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }
            }else {
                System.out.println("wrong option selected, please try again!");

            }
        }

        System.out.println("all mortgage details below:");
        for (Mortgage mortgage : list) {
            System.out.println(mortgage.getMortgageInfo());
        }
    }
}
