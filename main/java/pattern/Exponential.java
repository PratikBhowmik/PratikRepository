package pattern;

import java.util.Scanner;

public class Exponential {

    public static void main(String[] args) {

        System.out.println("Enter x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Enter n");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i < n; i++) {

            result = result * x;

        }
        System.out.println("X to power n is " + result);
    }

}
