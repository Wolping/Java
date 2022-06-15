public class rab {
    public static final int N = 3;
    public static void main(String[] args) {
        int[] array = { 4, 2, 6, 3, 8, 9, 0, 1 };
        int[] maxelements = new int [ N ];
        int minindex = 0;
        for ( int i = 1; i < array.length; ++i )
            if ( array[i] < array[minindex] )
                minindex = i;
        for ( int i = 0; i < N; ++i )
            maxelements[i] = array[minindex];
        for ( int i = 0; i < array.length; ++i ) {
            for ( int j = 0; j < N; ++j ) {
                if ( maxelements[j] < array[i] ) {
                    for ( int k = N - 1; k > j; --k ) {
                        maxelements[k] = maxelements[k - 1];
                    }
                    maxelements[j] = array[i];
                    break;
                }
            }
        }
        for ( int n : array )
            System.out.print(n + " ");
        System.out.print("\n" + N + " max. elements: ");
        for ( int n : maxelements )
            System.out.print(n + " ");
        System.out.println();
    }
}
