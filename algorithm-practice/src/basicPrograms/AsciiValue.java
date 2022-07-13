package basicPrograms;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int value;
        System.out.println("Enter a character:");
        ch = sc.next().charAt(0);
        value = (int)ch;
        System.out.println(value);

//        ch = sc.next().charAt(0);
//        value = (int)ch;
//        System.out.println(value);
    }
}
