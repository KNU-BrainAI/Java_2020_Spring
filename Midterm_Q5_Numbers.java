public class Midterm_Q5_Numbers {
	public static void main(String[] args) {

		int nDiag=0;
		
		int[][] board = {
				{2, 1, 1, 6, 1, 0, 0},
				{2, 1, 1, 7, 6, 0, 1},
				{1, 1, 7, 1, 6, 1, 1},
				{9, 7, 6, 0, 1, 1, 6},
				{7, 9, 1, 1, 6, 9, 0},
				{7, 5, 9, 2, 2, 2, 0},
				{7, 5, 9, 9, 9, 9, 0},
				{7, 1, 1, 1, 1, 0, 0}   };
				

		
		for (int i=0; i < board.length; i++) {
			System.out.print('\n');
			for (int j=0; j<board[0].length; j++)
				System.out.print(board[i][j] + " ");

		}

		System.out.print('\n');
		System.out.println("\n# of horizontal lines : " + countConsecutiveFourRow(board));
		System.out.println("# of vertical lines : " + countConsecutiveFourCol(board));
		
		nDiag= countConsecutiveFourMD(board) + countConsecutiveFourUP(board)+ 
				countConsecutiveFourSL(board) + countConsecutiveFourSR(board); 
		
		System.out.println("# of diagonal lines: " + nDiag); 


	}


	public static int countConsecutiveFourRow(int[][] values) {

		int numberOfRows = values.length;
		int count=0;

		// Check rows
		for (int i = 0; i < numberOfRows; i++) {
			count += checkConsecutiveFour(values[i]);
		}

		return count;
	}

	public static int countConsecutiveFourCol(int[][] values) {

		int numberOfRows = values.length;
		int numberOfColumns = values[0].length;
		int count=0;

		// Check columns
		for (int j = 0; j < numberOfColumns; j++) {
			int[] column = new int[numberOfRows];
			// Get a column into an array
			for (int i = 0; i < numberOfRows; i++)
				column[i] = values[i][j];
		
			count += checkConsecutiveFour(column);
	
		}

		return count;
	}


	// Check major diagonal (lower part)   
	public static int countConsecutiveFourMD(int[][] values) {

		int numberOfRows = values.length;
		int numberOfColumns = values[0].length;
		int count=0;

		for (int i = 0; i < numberOfRows - 3; i++) {
			int numberOfElementsInDiagonal = Math.min(numberOfRows - i, numberOfColumns);     
			int[] diagonal = new int[numberOfElementsInDiagonal];
			for (int k = 0; k < numberOfElementsInDiagonal; k++)
				diagonal[k] = values[k + i][k];

			count += checkConsecutiveFour(diagonal);
		}    

		return count;

	}


	// Check major diagonal (upper part)
	public static int countConsecutiveFourUP(int[][] values) {

		int numberOfRows = values.length;
		int numberOfColumns = values[0].length;
		int count=0;

		for (int j = 1; j < numberOfColumns - 3; j++) {
			int numberOfElementsInDiagonal = Math.min(numberOfColumns - j, numberOfRows);     
			int[] diagonal = new int[numberOfElementsInDiagonal];

			for (int k = 0; k < numberOfElementsInDiagonal; k++)
				diagonal[k] = values[k][k + j];

			count += checkConsecutiveFour(diagonal);
		}

		return count;
	}


	// Check sub-diagonal (left part)
	public static int countConsecutiveFourSL(int[][] values) {

		int numberOfRows = values.length;
		int numberOfColumns = values[0].length;
		int count=0;

		for (int j = 3; j < numberOfColumns; j++) {
			int numberOfElementsInDiagonal = Math.min(j + 1, numberOfRows);     
			int[] diagonal = new int[numberOfElementsInDiagonal];

			for (int k = 0; k < numberOfElementsInDiagonal; k++)
				diagonal[k] = values[k][j - k];

			count += checkConsecutiveFour(diagonal);

		}
		return count;
	}

	// Check sub-diagonal (right part)
	public static int countConsecutiveFourSR(int[][] values) {

		int numberOfRows = values.length;
		int numberOfColumns = values[0].length;
		int count=0;

		for (int i = 1; i < numberOfRows - 3; i++) {
			int numberOfElementsInDiagonal 
			= Math.min(numberOfRows - i, numberOfColumns);     
			int[] diagonal = new int[numberOfElementsInDiagonal];

			for (int k = 0; k < numberOfElementsInDiagonal; k++)
				diagonal[k] = values[k + i][numberOfColumns - k - 1];

			count += checkConsecutiveFour(diagonal);

		}

		return count;
	}


	public static int checkConsecutiveFour(int[] values) {    

		int comp = 0;
		int count = 0;
		int equal = 3;

		for (int i = 0; i < values.length - 3; i++) {
        
			for (int j = i; j < i + 3; j++) {
				if (values[j] == values[j + 1]) {
					comp++;
				}
				if (comp==equal)
					count++;
			}
			comp=0;

		}

		return count;
	} 

}
