public class Final_Q2_TestRectangle {
	public static void main(String[] args) {
		
		
		Rectangle aRectangle = new Rectangle();
		System.out.println("The area of a rectangle with width " +
				aRectangle.width + " and height " +
				aRectangle.height + " is " +
				aRectangle.getArea());
		System.out.println("The perimeter of a rectangle is " +
				aRectangle.getPerimeter());
		
		
		Rectangle myRectangle = new Rectangle(11, 44);
		System.out.println("The area of a rectangle with width " +
				myRectangle.width + " and height " +
				myRectangle.height + " is " +
				myRectangle.getArea());
		System.out.println("The perimeter of a rectangle is " +
				myRectangle.getPerimeter());

		Rectangle yourRectangle = new Rectangle(4.5, 45.9);
		System.out.println("The area of a rectangle with width " +
				yourRectangle.width + " and height " +
				yourRectangle.height + " is " +
				yourRectangle.getArea());
		System.out.println("The perimeter of a rectangle is " +
				yourRectangle.getPerimeter());

		

	}
}

class Rectangle {

	// Data members
	double width = 1;
	double height = 1;


	// Constructor
	public Rectangle() {
	}

	// Constructor
	public Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}
}