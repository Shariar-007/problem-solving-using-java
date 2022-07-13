package basicPrograms;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter a Number:");
        num = sc.nextInt();
        System.out.println("Factorials of " + num + " is " + factorials(num));
    }

    static int recursiveFactorials(int number) {
        if (number == 1) return 1;
        return number * recursiveFactorials(number - 1);
    }

    static int factorials(int number){
        int factorials = 1;
        while (number != 0){
            factorials = factorials * number;
            number--;
        }
        return factorials;
    }
}
