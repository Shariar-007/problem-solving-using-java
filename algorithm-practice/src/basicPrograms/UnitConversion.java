package basicPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnitConversion {
    BufferedReader br;

    public static void main(String[] args) throws Exception {
        UnitConversion unitConversion = new UnitConversion();
        unitConversion.br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        boolean done = false;

        while (!done) {
            choice = unitConversion.runMenu();
            switch (choice) {
                case 1:
                    System.out.println("Convert Gallons To Liters");
                    unitConversion.convertGallonsToLeter();
                    break;
                case 2:
                    System.out.println("Convert meters To miles");
                    break;
                case 3:
                    System.out.println("Convert grams To carats");
                    break;
                case 4:
                    System.out.println("Convert Inches To meters");
                    break;
                case 5:
                    System.out.println("Convert liters To Gallons");
                    break;
                case 6:
                    System.out.println("Convert grams To kilograms");
                    break;
                case 7:
                    System.out.println("Convert Carats To Grams");
                    break;
                default:
                    System.out.println("Exited");
                    done = true;
                    break;
            }
        }


    }


    int runMenu() throws IOException {
        System.out.println("=========================");
        System.out.println("Conversion Table");
        System.out.println("1. Gallons To Liters");
        System.out.println("2. Meters To Miles");
        System.out.println("3. Grams To Carats");
        System.out.println("4. Inches To Meters");
        System.out.println("5. Liters To Gallons");
        System.out.println("6. Grams To kilograms");
        System.out.println("7. Carats To Grams");
        System.out.println("8. Quit");

        System.out.print("Enter choice: ");
        int choice = Integer.parseInt(br.readLine());
        while (choice < 1 || choice > 8) {
            System.out.print("Invalid choice, try again: ");
            choice = Integer.parseInt(br.readLine());
        }
        return choice;
    }

    void convertGallonsToLeter() throws IOException {
        System.out.print("Enter the Gallon: ");
        int gallon = Integer.parseInt(br.readLine());
        double liters = gallon * 3.7854118;
        System.out.println("Liters: " + liters);
    }
}
