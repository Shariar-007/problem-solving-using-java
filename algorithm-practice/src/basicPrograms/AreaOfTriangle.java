package basicPrograms;

import java.util.Scanner;

public class AreaOfTriangle {

    static double getAreaOfTriangle(double base, double height){
        return (base * height)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = 0.0, height = 0.0;
        System.out.println("Enter the value of Height:");
        height = sc.nextDouble();

        System.out.println("Enter the value of Base:");
        base = sc.nextDouble();

        System.out.println(String.format("%.2f", getAreaOfTriangle(base, height)));
    }
}
