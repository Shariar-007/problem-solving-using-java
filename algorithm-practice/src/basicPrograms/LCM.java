package basicPrograms;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        System.out.print("Enter a Number 1:");
        number1 = sc.nextInt();
        System.out.print("Enter a Number 2:");
        number2 = sc.nextInt();
        System.out.println(findLCM(number1, number2));
    }

    static int findLCM(int num1, int num2){
        int lowest = num1 < num2 ? num1:num2;
        int highest = num1 > num2 ? num1:num2;
        int lcm = lowest;
        while (true){
            if(lcm % highest == 0){
                return lcm;
            }
            lcm = lcm + lowest;
        }
    }
}
