package chapterSix;

import java.util.Scanner;

public class FutureInvestmentValue {

    public static double futureInvestment(double investmentAmount, double monthlyInterestRate, int years){


        double r = (1 + (monthlyInterestRate/12));
        double y = years * 12;
        double exp = Math.pow(r,y);

        return investmentAmount * exp;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Investment amount");
            double investmentAmount = scanner.nextDouble();
            System.out.println("Enter Monthly Interest Rate");
            double monthlyAmount = scanner.nextDouble();
                 System.out.printf("%5s%20s%n","Years", "Future Value");
             for(int years= 1; years <= 30; years++) {
                 System.out.printf("%5d%20.2f%n",years, futureInvestment(investmentAmount, monthlyAmount, years) );

        }


    }
}
