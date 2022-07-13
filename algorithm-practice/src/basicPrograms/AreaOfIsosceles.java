package basicPrograms;

import java.util.Scanner;

public class AreaOfIsosceles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double equalSidedLength = 0.0, base = 0.0, answer = 0.0;
        System.out.println("Enter equal sized length:");
        equalSidedLength = sc.nextDouble();
        System.out.println("Enter base length:");
        base = sc.nextDouble();
        answer = (base/4) * Math.sqrt((4*equalSidedLength*equalSidedLength)-(base*base));
        System.out.println(answer);
    }
}
