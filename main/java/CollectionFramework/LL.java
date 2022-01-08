
package CollectionFramework;

import java.util.LinkedList;
import java.util.Scanner;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr);

        }
    }
}