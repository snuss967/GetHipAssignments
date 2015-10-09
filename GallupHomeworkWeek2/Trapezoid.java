
public class Trapezoid extends Shape implements IPrintable {
	private int baseA;
	private int baseB;
	private int height;
	/* We use variables for the shapeName and type for code resuablity
	 * If we were to write this in an IDE the intellisense would automatically fill in names
	*/
	private static String shapeType = "Quadrilateral";
	private static String shapeName = "Trapezoid";
	public Trapezoid(int baseA, int baseB, int height)
	{
		//a constructor that sets baseA, baseB, and height
		// sets the shape name and type by default
		super(shapeType, shapeName);
		this.baseA = baseA;
		this.baseB = baseB;
		this.height = height;
	}
	
	@Override
	public double getArea()
	{
		return ((.5 * (baseA + baseB)) * height);
	}
	@Override
	public void printDescription() {
		System.out.println("Type is " + shapeType + ".");
		System.out.println("Base A is " + baseA);
		System.out.println("Base B is " + baseB);
		System.out.println("Height is " + height);
		System.out.println("");
	}

}
