import java.io.*; //we only have to implement the serializable interface from the io package in shape because all of the other classes will inherit it
//from the shape base class
public abstract class Shape implements IPrintable, Serializable {
	/**
	 * Serializable Interface implementation
	 */
	private static final long serialVersionUID = -4849899290391969746L;
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
