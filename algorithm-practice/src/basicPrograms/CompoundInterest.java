package basicPrograms;

import java.util.Scanner;

public class CompoundInterest {
    //    A ="Final amount including interest"
    //    P ="Principle amount"
    //    R ="Interest rate"
    //    N ="Number of compounding a year"
    //    T ="Total Number of years"
    //    A = P*(1 + r/n)^(n*t)
    //    Compound Interest = A – P

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = 0.0;
        double P = 0.0;
        double R = 0.0;
        double N = 0.0;
        double T = 0.0;

        System.out.println("Enter principal amount:: ");
        P = sc.nextDouble();

        System.out.println("Enter the annual compound interest rate:: ");
        R = sc.nextDouble();
        R = R/100; //convert rate into percentage

        System.out.println("Enter time (in years):: ");
        T = sc.nextDouble();

        System.out.print("Enter the number of times that interest is compounded per year:: ");
        N = sc.nextInt();

        // calculate total amount
        A = P * Math.pow( 1+(R/N), N*T);
        System.out.println("Compound Interest: " + (A-P));
        System.out.println("Total amount: " + A);

        sc.close();
    }
}
