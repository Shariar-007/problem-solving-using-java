package basicPrograms;

public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;
//        int temp = 0;
//
//        temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println("Num1: " + num1);
//        System.out.println("Num2: " + num2);

//        another way with + -
//        num1 = num1 + num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;
//        System.out.println("Num1: " + num1);
//        System.out.println("Num2: " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
