package midLevelPrograms;

import java.util.Scanner;

public class PrintStringReverseUsingRecurtion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        reverseString(str);
    }

    static void reverseString(String str) {
        if (str.length() != 0) {
            System.out.print(str.substring(str.length() - 1));
            reverseString(str.substring(0, str.length() - 1));
        }
    }
}
