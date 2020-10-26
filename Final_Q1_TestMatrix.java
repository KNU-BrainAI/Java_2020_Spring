import java.util.Scanner;

public class Final_Q1_TestMatrix {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print
		("Enter the number of rows and columns of the array: ");

		int numberOfRows = input.nextInt();
		int numberOfColumns = input.nextInt();

		double[][] arr = new double[numberOfRows][numberOfColumns];

		System.out.println("Enter the array: ");
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = input.nextDouble();

		Location locationSmall = locateSmallest(arr);
		Location locationLarge = locateLargest(arr);

		System.out.println("The location of the smallest element is "
				+ locationSmall.minValue + " at ("
				+ locationSmall.row + ", " + locationSmall.column + ")");

		System.out.println("The location of the largest element is "
				+ locationLarge.maxValue + " at ("
				+ locationLarge.row + ", " + locationLarge.column + ")");
	}


	public static Location locateSmallest(double[][] arr) {
		Location location = new Location();

		location.minValue = arr[0][0];
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				if (location.minValue > arr[i][j]) {
					location.minValue = arr[i][j];
					location.row = i;
					location.column = j;
				}


			}

		return location;
	}

	public static Location locateLargest(double[][] arr) {
		Location location = new Location();

		location.maxValue = arr[0][0];
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				if (location.maxValue < arr[i][j]) {
					location.maxValue = arr[i][j];
					location.row = i;
					location.column = j;
				}


			}

		return location;
	}



}

class Location {
	public int row, column;
	public double minValue,maxValue;
}
