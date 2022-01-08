package pattern;

import java.util.Scanner;

public class InfiniteLoopUsingDoWhile {

    public static void infiniteLoopUsingDoWhile(int n) {

        do {

            n++;
            System.out.println(n);
        } while (n > 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        infiniteLoopUsingDoWhile(n);

    }

}
