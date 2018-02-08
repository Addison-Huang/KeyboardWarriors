public class SearchTime{
    
     public static String matrixSearch(int[][] array, int target) {
	int row = array.length -1 ; //bottom
	int column = 0; //left
	while ((column < array[0].length) && (row >= 0)) { //check if the value is inside the boundary
	    if ( array[row][column]  == target) //value == target
		return "(" + row + "," + column + ")"; //return coordinates
	    else if (array[row][column] > target) //value > target
		row --; // move up
	    else //value < target
		column ++; //move right up
	}
	return "(-1,-1)"; //value not found in matrix
    }

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
	for (int length = 1; length < 1000000; length++) {
	    int[][] test = ArrayMaker(length);
	    int x = 0;
	    long p = System.currentTimeMillis();
	    while (x < 10000) {
		matrixSearch(test,test[0][length-1]);
		x++;
	    }
	    long q = System.currentTimeMillis();
	    System.out.print(length + ",");
	    System.out.println(q-p + ",");
	}
	
    }
}

