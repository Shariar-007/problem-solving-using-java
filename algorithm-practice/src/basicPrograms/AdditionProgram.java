package basicPrograms;

import java.util.Scanner;

public class AdditionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        float num3, num4;
        byte num5, num6;
        double num7, num8;
        long num9, num10;

        System.out.println("Enter Integer Number:\n");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(num1 + num2);

        System.out.println("Enter Float Number:\n");
        num3 = sc.nextFloat();
        num4 = sc.nextFloat();
        System.out.println(num3 + num4);

        System.out.println("Enter Byte Number:\n");
        num5 = sc.nextByte();
        num6 = sc.nextByte();
        System.out.println(num5 + num6);

        System.out.println("Enter Double Number:\n");
        num7 = sc.nextDouble();
        num8 = sc.nextDouble();
        System.out.println(num7 + num8);

        System.out.println("Enter Long Number:\n");
        num9 = sc.nextLong();
        num10 = sc.nextLong();
        System.out.println(num9 + num10);
    }
}
