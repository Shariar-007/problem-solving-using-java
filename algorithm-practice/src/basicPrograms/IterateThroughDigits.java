package basicPrograms;

import java.util.Scanner;

public class IterateThroughDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter Valid Year in Number:");
        number = sc.nextInt();
        printNumbersSeparately(number);
    }


    static void printNumbersSeparately(int number){
        while (number!=0){
            System.out.print(number%10);
            number = number/10;
        }
    }
}
