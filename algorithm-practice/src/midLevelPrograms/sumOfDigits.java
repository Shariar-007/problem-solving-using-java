package midLevelPrograms;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a Number:");
        number = sc.nextInt();
        sumOfAllDigits(number);
    }


    static void sumOfAllDigits(int number){
        int sum = 0;

        while (number != 0){
            sum = sum + number%10;
            number = number/10;
        }

        System.out.println(sum);
    }
}
