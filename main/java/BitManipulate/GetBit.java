package BitManipulate;

public class GetBit {

    public static void main(String[] args) {

        // Bit Mask - i<<3
        // Operation - AND

        int n = 5;
        int pos = 3;

        int bitmask = 1 << pos;
        if ((bitmask & n) == 0) {

            System.out.println("bit was zero");

        } else {
            System.out.println("bit was non-zero");
        }

    }

}
