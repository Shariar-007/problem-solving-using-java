package midLevelPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a Number:");
        number = sc.nextInt();
//        fibonacciSeries(number);
        fibonacciSeriesUsingRecursion(0 ,1, number);
    }

    static void fibonacciSeries(int number){
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        while (number >= 1){
            System.out.print(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            number--;
        }
    }

    static int fibonacciSeriesUsingRecursion(int start, int end, int number){
        if(number == 0) return number;
        System.out.print(start + " ");
        int temp = start + end;
        return fibonacciSeriesUsingRecursion(end, temp, number - 1);
    }
}
