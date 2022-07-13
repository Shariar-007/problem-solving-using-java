package basicPrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle {
    static DecimalFormat df = new DecimalFormat("0.00");

    static double getAreaOfCircle(double radius){
        return (Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = 0.0;
        System.out.println("Enter the value of radius:");
        radius = sc.nextDouble();
        System.out.println(String.format("%.2f",getAreaOfCircle(radius)));
        System.out.format("%.3f", getAreaOfCircle(radius));
        System.out.println(df.format(getAreaOfCircle(radius)));
    }
}
