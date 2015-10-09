
public class Rhombus extends Shape implements IPrintable {
	private int diagonalA;
	private int diagonalB;
	/* We use variables for the shapeName and type for code resuablity
	 * If we were to write this in an IDE the intellisense would automatically fill in names
	*/
	private static String shapeType = "Quadrilateral";
	private static String shapeName = "Rhombus";
	//@param diagonalA the length of the first diagonal of the rhombus
	//@param diagonalB the length of the second diagonal of the rhombus
		public Rhombus(int diagonalA, int diagonalB)
	{
		//Co
		super(shapeType, shapeName);
		this.diagonalA = diagonalA;
		this.diagonalB = diagonalB;
	}
	
	@Override //returns the area of a Rhombus
	public double getArea()
	{
		return ((diagonalA * diagonalB)/2);
	}
	@Override //prints the description of a rhombus
	public void printDescription() {
		System.out.println("Type is " + shapeType + ".");
		System.out.println("Diagonal A is " + diagonalA + " units.");
		System.out.println("Diagonal B is " + diagonalB + " units.");
		System.out.println("");
		
	}
}
	
