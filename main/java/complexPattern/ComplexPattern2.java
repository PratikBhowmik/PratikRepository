package complexPattern;

import java.util.Scanner;

public class ComplexPattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows you want :");
        int n = sc.nextInt();

        System.out.println("Enter no. of column you want :");
        int m = sc.nextInt();

        System.out.println("Here you go ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
