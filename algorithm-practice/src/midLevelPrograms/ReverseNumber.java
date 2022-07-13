package midLevelPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a Number:");
        number = sc.nextInt();
        reverseNumberPrint(number);
    }


    static void reverseNumberPrint(int number){
        int lastDigit = 0;
        int reverse = 0;
        while (number != 0){
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number/10;
        }
        System.out.println(reverse);
    }
}
