package basicPrograms;

import java.util.Scanner;

public class LoanInterest {
//    Simple Interest = (principal amount × interest rate × time) / 100
    public static void main(String[] args) {
        double interestRate = 0.0;
        double time = 0.0;
        double principleAmount = 0.0;
        double interest = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount:");
        principleAmount = sc.nextDouble();

        System.out.println("Enter time (in months):");
        time = sc.nextDouble();

        System.out.println("Enter  the  interest rate (per year):");
        interestRate = sc.nextDouble();

        System.out.println("Total Interest:");
        interest = (principleAmount * interestRate * time)/100;
        System.out.println(interest);
        System.out.println("Total amount to pay = " + (principleAmount + interest));
        sc.close();
    }
}
