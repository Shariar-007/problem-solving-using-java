package basicPrograms;

import java.util.Scanner;
//also known as GCM, GCD
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        System.out.print("Enter a Number 1:");
        number1 = sc.nextInt();
        System.out.print("Enter a Number 2:");
        number2 = sc.nextInt();
        System.out.println(findHCF(number1, number2));
    }

    static int findHCF(int num1, int num2) {
        int i = 1;
        int hcf = 0;
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
            i++;
        }
        return hcf;
    }
}
