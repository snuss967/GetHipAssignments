
public class Insertion {
	int[] numArray;
	private void createArray()
	{
		numArray = new int[10];
		numArray[0] = 55;
		numArray[1] = 768735;
		numArray[2] = 545434;
		numArray[3] = 2425;
		numArray[4] = 77573;
		numArray[5] = 2424;
		numArray[6] = 545;
		numArray[7] = 552;
		numArray[8] = 555;
		numArray[9] = 42;
	}
	
	public void sort()
	{
		createArray();
		int temp; // creates a temporary value to hold the first integer
		for(int i = 1; i < (numArray.length); i++)
		{
			temp = numArray[i];
			int j = i - 1;
			while (j >= 0 && numArray[j] > temp)
			{
				numArray[j+1] = numArray[j];
				j = j-1;
			}
			numArray[j + 1] = temp;
		}
		
		printArray();
	}
		
	private void printArray()
	{
		for(int number : numArray)
		{
			System.out.println(number);
		}
	}
}
