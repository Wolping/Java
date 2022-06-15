public class rab {
    public static void main(String[] args) {
        int n=10, j=0,m= 10;
        int a[] = new int[n];
        int b[] = new int[m];
        System.out.println("massiv do: ");
        for (int i=0; i<n; i++)
        {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
            for (int i=0; i<m; i++) 
            {
                if (a[i] !=0)
                {
                    b[j] = a[i] / 3;
                    j++;
                }
            }
            for (int i=0; i<j; i++)
            System.out.print(b[i] + " ");
    }
}
//дан массив a n переписать в массив b m только положительные элементы массива a n делен на 3
