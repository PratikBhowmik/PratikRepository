package pattern;

import java.util.Scanner;

public class GreaterOfTwoNumber {

    public static int greaterOfTwoNumber(int a, int b) {

        if (a > b) {
            return a;

        } else {
            return b;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterOfTwoNumber(a,b);

    }

}
