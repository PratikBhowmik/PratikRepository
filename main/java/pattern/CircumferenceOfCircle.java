package pattern;

import java.util.Scanner;

public class CircumferenceOfCircle {

    public static double circumference(double r) {

        return 2 * 3.14 * r;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        circumference(r);

    }

}
