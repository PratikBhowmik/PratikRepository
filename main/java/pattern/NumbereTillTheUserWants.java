package pattern;

import java.util.Scanner;

public class NumbereTillTheUserWants {

    public static void enternumber(int n) {

    }

    public static void main(String[] args) {

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        // Input
        System.out.println("Press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input == 1) {
            System.out.println("Enter your number ");
            int number = sc.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;

            } else {
                zeros++;
            }

            System.out.println("Press 1 to continue and zero to stop ");
            input = sc.nextInt();
        }

        System.out.println("Positives " + positive);
        System.out.println("Negatives " + negative);
        System.out.println("Zeros " + zeros);

    }

}
