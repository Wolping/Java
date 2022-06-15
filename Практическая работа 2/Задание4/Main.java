public class pr {
    public static void main(String[] args) {
    	int u = 0;
        int n = 5;        
        int mat[][] = new int[n][n];
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                mat[i][j] = (int)((Math.random() * 20)-10);
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        
        for (int i=0; i<n; i++)
        {
             u = u + mat[i][i];
        }
        u=u/n;
        System.out.println(u);
    }
}

//дан двухмерный массив n n найти среднее арифметическое положительных элементов главной диагонали
