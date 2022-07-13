package basicPrograms;

public class CalculateRuntime {
    public static void main(String[] args) {
        CalculateRuntime calculateRuntime = new CalculateRuntime();
        long start = System.nanoTime();
        calculateRuntime.display();
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    public void display() {
        System.out.println("Main.display()");
    }
}
