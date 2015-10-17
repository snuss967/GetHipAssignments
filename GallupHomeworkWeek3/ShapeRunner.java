import java.io.*; //imports the package we need for writing to a file (serialization) and bringing the file back in (deserialization)
public class ShapeRunner{
	/* 
	 * Spencer Nussrallah
	 * Gallup Homework Week 3 
	 * October 17 2015
	 * Sort Algorithim Used is the Shell Sort A Derivative of the insertion sort. As said in class last week extra credit for using a sort different
	 * then the three we were given. I have also included an insertion sort file
	 * The complexity of the shell algorithim is is in the worst case O(n^2) and in the best-case is O(nlogn) - StackOverflow
	 * The time complexity of the insertion sort is O(n^2)- StackOverflow
	 * */
	
	public static void main(String [] args){
		// create list of shapes exactly from the second week runner class
		Shape[] shapes = new Shape[5];
		Shape[] newArray = new Shape[shapes.length];
		shapes[0] = (new Circle(6));
		shapes[1] = (new Triangle(6, 4));
		shapes[2] = (new Rectangle(8, 3));
		shapes[3] = (new Rhombus(6, 5));
		shapes[4] = (new Trapezoid(4, 10, 5));
		
		//writing shapes to a file
		try
		{
			//Serializing the data
			FileOutputStream fileout = new FileOutputStream("myArray.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(shapes);
			out.flush(); //flushing clears out the contents of the file stream before we close it
			out.close(); //must close so that we dont waste system resources
			fileout.flush(); //flushing clears out the contents of the file stream before we close it
			fileout.close(); //must close so that we dont waste system resources
		}
		catch(Exception e)
		{}
		//pulling shapes from a file
		try{
			//Deserializing the Data
			FileInputStream fileIn = new FileInputStream("myArray.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			newArray = (Shape[])objectIn.readObject();
			objectIn.close(); //must close so that we dont waste system resources
			fileIn.close();
		}
		catch(Exception e)
		{}
		sort(newArray);
		// loop through each shape in our new Array from file newArray
		for (Shape shape : newArray)
		{
			shape.printDescription();
			System.out.print("The Area is ");
			System.out.println(shape.getArea());
			System.out.println();
		}
	}

	
	private static void sort(Shape[] shapes)
	{
		/* The benefit that an shell sort provides is that it pre-sorts the data for the insertion sort so that the insertion
		 * sort can run more effectively upon its implementation. This is a big deal as as we discussed last week in class when a number gets 
		 * inserted into the front of an array everything has to be shifted down. The shell sort minimizes the number of shifts. Helped with implementation from 
		 * RosettaCode, Wikipedia, and  New Think Tank*/
		int gap = (shapes.length) / 2;
		while( gap > 0)
		{
		for (int i = gap; i < shapes.length; i++)
		{
		   
			int j = i; // j serves as the number on which we do computations as using I would mess up the for loop
			Shape temp = shapes[i]; //stores the original value of the i index which will be overwritten
			//this is our modified insertion sort We will make sure that j is greatet then gap which is effectively our 0 and will run as long as
			//we need to move numbers down due to the nature of array shifts
			while(j >= gap && shapes[j - gap].getArea() > temp.getArea())
			{
				//if the later shape is less then the former shape they are switched
				shapes[j] = shapes[j - gap];
				j = j -gap;
			}
			//the original shape is put into index j
			shapes[j] = temp;
		}
		if(gap == 2)
		{
			//if we are on the last gap sets the gap to 1 so that we now run the insertion sort
			gap =1;
		}
		else
		{
			//if we are not on gap = to to then we decrement the gap we have the 5.0 to make it = to a double and so that we dont end up doing
			//integer division which would return 0 in this case
			gap *= (5.0 / 11);
		}
		}
	}
}
