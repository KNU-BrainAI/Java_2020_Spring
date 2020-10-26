// GeometricObject.java: The abstract GeometricObject class
public abstract class Final_Q4_GeometricObject {
	private String color = "white";
	private boolean filled;

	/**Default construct*/
	protected Final_Q4_GeometricObject() {
	}

	/**Construct a geometric object*/
	protected Final_Q4_GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/**Getter method for color*/
	public String getColor() {
		return color;
	}

	/**Setter method for color*/
	public void setColor(String color) {
		this.color = color;
	}

	/**Getter method for filled. Since filled is boolean,
     so, the get method name is isFilled*/
	public boolean isFilled() {
		return filled;
	}

	/**Setter method for filled*/
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	
	public String toString() {
		return "color: " + color + " and filled " + filled;
	}
	
	/**Abstract method getArea*/
	public abstract double getArea();

	/**Abstract method getPerimeter*/
	public abstract double getPerimeter();
}
