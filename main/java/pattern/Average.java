package pattern;

import java.util.Scanner;

public class Average {

    public static void average(int n, int m, int o) {

        int sum = n + m + o;
        int av = sum / 3;
        System.out.println(av);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        average(n, m, o);
    }

}
