import exceptions.InvalidParameters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first parameter: ");
        int firstParameter = sc.nextInt();
        System.out.print("Input the second parameter: ");
        int secondParameter = sc.nextInt();

        try {
            count(firstParameter, secondParameter);
        }catch (InvalidParameters e) {
            System.out.println(e.getMessage());
        }

    }
    static void count(int firstParameter, int secondParameter ) throws InvalidParameters {
        int count = secondParameter - firstParameter;
        if (count <= 0) { throw new InvalidParameters("The second parameter must be grater than the first."); }
        for (int num = 1; num <= count; num++) { System.out.println("printing number " + num); }
    }
}