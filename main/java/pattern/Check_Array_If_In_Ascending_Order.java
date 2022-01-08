package pattern;

import java.util.Scanner;

public class Check_Array_If_In_Ascending_Order {

    public static void main(String[] args) {

        // Common process for taking input from user
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // taking input from user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The series is in ascending order");
        } else {
            System.out.println("The series is in descending order");
        }

    }

}
