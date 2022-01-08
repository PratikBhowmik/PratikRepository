package recursion;

import java.util.ArrayList;

public class RecursionAdvanced2 {

    public static void printSubset(ArrayList<Integer> subset) {

        for (int i = 1; i < subset.size(); i++) {
            System.out.println(subset.get(i) + " ");
        }
        System.out.println();

    }

    public static void findSubSet(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            printSubset(subset);
        }

        subset.add(n);
        findSubSet(n - 1, subset);

        subset.remove(subset.size() - 1);
        findSubSet(n - 1, subset);

    }

    public static void main(String[] args) {

        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubSet(n, subset);

    }

}
