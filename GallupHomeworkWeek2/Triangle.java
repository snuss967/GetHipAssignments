
public class Triangle extends Shape implements IPrintable {
	// a class for triangles that derives itself from the Shape base class and implemnts the IPrintable interface
	private int base;
	private int height;
	/* We use variables for the shapeName and type for code resuablity
	 * If we were to write this in an IDE the intellisense would automatically fill in names
	*/
	private static String shapeType = "Triangle";
	private static String shapeName = "triangle";
	//@param height the length of the height of the triangle
	//@param base the length of the base of the triangle
	public Triangle(int base, int height)
	{
		//constructor that sets the base class to its default for a triangle that will not change
		// also sets the private variables base and height
		super(shapeType, shapeName);
		this.base = base;
		this.height = height;
	}
	@Override // returns the area of a triangle
	public double getArea()
	{
		return((base * height)/2);
	}
	@Override //prints the description of the 
	public void printDescription() {
		System.out.println("Type is " + shapeType + ".");
		System.out.println("Base is " + base + " units." );
		System.out.println("Height is " + height + " units.");
		System.out.println("");
	}
	

}
