
public abstract class Shape implements IPrintable {
	// we create an abstract class for different shapes to be based on
	//@param shapeType the type of shape the object is (ex: Quadrilateral) 
	//@param shapeName the name of the specific shape (ex: Square)
	public Shape(String shapeType, String shapeName)
	{
		//Constructor assigns shapeName and shapeType 
		this.shapeName = shapeName;
		this.shapeType = shapeType;
	}
	private String shapeType;
	private String shapeName;
	public String getShapeType()
	{
		//returns the shape type as a String
		return shapeType;
	}
	//@param shapeType the type of shape the object is (ex: Quadrilateral)
	public void setShapeType(String shapeType)
	{
		//sets the shape shape type
		this.shapeType = shapeType;
	}
	public String getShapeName()
	{
		//returns the name of 
		return shapeName;
	}
	//@param shapeName the name of the specific shape (ex: Square)
	public void setShapeName(String shapeName)
	{
		// sets the name of the shape
		this.shapeName = shapeName;
	}
	public double getArea()
	{
		//calcualtes the area
		return 0.0d;
	}
	
	public void printDescription() {
		//so that we can call the printDescription method in polymorphism
	}
	
}
