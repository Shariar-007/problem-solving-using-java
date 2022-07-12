package basicPrograms;

public class Print1to100WithoutLoop {
    public static void main(String[] args) {
        int n = 1;
        printNumbers(n);
//        System.out.println(printNumbers(n));
    }

    static int printNumbers(int number){
        System.out.println(number);
        if(number == 100){
            return number;
        }
        return printNumbers(number+1);
    }

    static void printNumbersAnotherWay(int number){
        if(number < 100)
            printNumbersAnotherWay(number+1);
        System.out.println(number);
    }
}
