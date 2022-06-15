class rab {
    public static void main (String[] args){
        int[][] a = new int[5][5];
        int max, min;
        Random rnd = new Random();
        for (int i=0;i < a.length;i++) {
            for (int j=0;j < a[i].length;j++) {
                a[i][j]=rnd.nextInt(10) + 1;
            }
        }
	int n=3;
	int g;
	int s=99990;
        for (int j=0;j < a[i].length;j++) {
		if (s > a[n][j]){
		    s=a[n][j];
		    g=j;
		}
                System.out.print(a[n][g]+" "+n+" "+g);
        }
    }
}

//oпpeдeлить мaтpицy (двyмepный мaccив) и зaпoлнить ее cлyчaйными знaчeниями номер минимального значения в i столбце
