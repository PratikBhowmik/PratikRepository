package pattern;

public class NumberPyramidInverted {


    public static void main(String[] args) {
        int n = 6;

        for(int i = n ; i<=n ; i--)
        {
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
