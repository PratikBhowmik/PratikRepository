package pattern;

import java.util.Scanner;

public class EligibleToVoteOrNot {

    public static boolean age(int n) {

        if (n > 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        age(n);

    }

}
