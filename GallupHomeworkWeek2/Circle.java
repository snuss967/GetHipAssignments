	
public class Circle extends Shape implements IPrintable
{
	/* We use variables for the shapeName and type for code resuablity
	 * If we were to write this in an IDE the intellisense would automatically fill in names
	*/
	private static String shapeType = "Circle";
	private static String shapeName = "circle";
	//@param radius the radius of the circle
	public Circle(int radius)
	{
		//Constructor since we have a circle sets Circle by default for both shape name and type
		super("Circle", "circle");
		this.radius = radius;
	}
	
	
	private int radius = 0;
	@Override //overrides the getArea method of the main class and returns the area of a circle
	public double getArea()
	{
		//returns area
		return (Math.PI * Math.pow(radius, 2));
	}
	@Override //overrides the printDescription method of the first class and returns the description
	public void printDescription() {
		System.out.println("Type is " + shapeType + ".");
		System.out.println("Radius is " + radius + " units.");
		System.out.println("");
	}
}
