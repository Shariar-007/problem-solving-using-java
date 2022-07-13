package basicPrograms;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter a Number:");
        num = sc.nextInt();
        System.out.println("Sum of all natural numbers upto " + num + " is " + sumOfNumbersUsingRecursion(num));
    }

    static int sumOfNumbers(int number){
        int sum = 0;
        while (number != 0){
            sum = sum + number;
            number--;
        }
        return sum;
    }

    static int sumOfNumbersUsingRecursion(int number){
        if (number == 1) return 1;
        return number + sumOfNumbersUsingRecursion(number - 1);
    }
}
