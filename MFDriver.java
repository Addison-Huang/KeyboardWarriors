public class MFDriver{

    public static int[][] ArrayMaker(int n) {
	int[][] ret = new int [n][n];
	int value = (int) (Math.random() *10);
	for (int row = 0; row < n; row ++) {
	    for (int col = 0; col < n; col ++) {
		ret[row][col] = value;
		value += (int)(Math.random()*10);
	    }
	}
	return ret;
    }	

    public static void main(String[] args) {
	System.out.println("n, Run Time(ms)");
	    for (int length = 100; length <= 10000; length+=100) {
		int[][] test = ArrayMaker(length);
		int x = 0;
		long p = System.currentTimeMillis();
		while (x < 10000) {
		    MatrixFinder.matrixSearch(test,test[0][length-1]);
		    x++;
		}
		long q = System.currentTimeMillis();
		System.out.print(length + ",");
		System.out.println(q-p);
	    }
	    
	
    }
}

