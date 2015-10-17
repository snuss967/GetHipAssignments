
public class Rectangle extends Shape implements IPrintable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -960530769239594289L;
	/* We use variables for the shapeName and type for code resuablity
	 * If we were to write this in an IDE the intellisense would automatically fill in names
	*/
	private static String shapeType = "Quadrilateral";
	private static String shapeName = "rectangle";
	//@param height the height of the rectangle
	//@param width the width of the rectangle
	public Rectangle(int height, int width)
	{
		// as we have a rectangle sets the quadrilateral and rectangle shape name and type by default
		super(shapeType, shapeName);
		this.height = height;
		this.width = width;
	}
	private int height;
	private int width;
	public double getArea()
	{
		//returns the area of area
		return(height * width);
	}
	@Override //prints the descripiton of a Square
	public void printDescription() {
		System.out.println("Type is " + shapeType + ".");
		System.out.println("Height is " + height + " units.");
		System.out.println("Width is " + width + " units.");
	}

}