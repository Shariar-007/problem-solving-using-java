package basicPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        System.out.println("Enter Valid Year in Number:");
        year = sc.nextInt();
        isLeapYear(year);
    }

    static void isLeapYear(int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("This year(" + year + ") is Leap Year");
        }
    }
}
