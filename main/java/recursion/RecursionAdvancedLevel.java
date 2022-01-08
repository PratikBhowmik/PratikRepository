package recursion;

public class RecursionAdvancedLevel {

    public static int tiles(int n, int m) {

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;

        }

        int horPlacement = tiles(n - m, m);

        int verPlacement = tiles(n - 1, m);

        return horPlacement + verPlacement;

    }

    public static void main(String[] args) {

        int n = 3;
        int m = 3;

        System.out.println(tiles(n, m));

    }

}
