import java.util.Scanner;
//import the scanner class for input
public class AccountActions {
	Scanner scan = new Scanner(System.in);
	private int balance = 0; // the default balance of the account
	private int pin = 12345; // the default pin of the account
	private boolean accountUnlocked = false; //makes sure that we have entered the pin before using methods
	//although the application quits if the user cannot enter the pin this is an added layer of security
	public AccountActions(int balance, int pin)
	{
		// constructor for the account
		this.balance = balance;
		this.pin = pin;
	}
	// @param pin used to make sure that the user has permission to change the pin
	//@param newPin the pin that the pin will be changed to
	public void SetPin(int pin, int newPin)
	{
		//allows the user to a
		if(accountUnlocked)
		{
			// makes sure that the pin is unlocked
			
			boolean access = false;
				while(!access)
				{
					if(this.pin == pin)
					{
						this.pin = newPin;
			
					}
		
		else 
		{
			System.out.println("Invalid Pin!");
			return;
		}	
				}
		}
	}
	
	
	public void Withdrawl(int amount)
	{
		//@param amount the amount that will be withdrawn from the account
		if(accountUnlocked)
		{
			//the control on the account to make sure that the pin has been entered
		if(amount <= balance)
		{
			//makes sure that their is enough in the account to withdraw
			balance -= amount;
			//the withdrawl
		}
		else
			System.out.println("You do not have enough money to make this transaction");
		}
		}
	
	public void Deposit(int amount)
	{
		//puts money in the account
		//@param amount the amount to be deposited
		if(accountUnlocked)
		{
		balance += amount;
		//adds the amount to the balance
		}
		}
	public void accessAllowed(int pin)
	{
	//@param pin the user entered pin in attempt to gain access	
		int count = 0;
		boolean stopAccess = false;
		while(!stopAccess)
		{
			//handles the lockout of the account
			if(this.pin == pin)
			{
				stopAccess = true; 
				accountUnlocked = true;
				//unlocks the account, enables the user to be able to access all other functions
			}
			
			else 
				{
				// can only try the pin 5 times before you are locked out
				count++;
				System.out.println("Invalid Pin!");
				System.out.println("Please Enter Your Pin Again");
				pin = scan.nextInt();
					if(count == 5)
					{
						stopAccess = true;
						System.out.println("Invalid");
						//kills the program
						System.exit(1);
						//stop Access is the way we make sure that you are not able to try again
						
					}
						
				}
		
		}
	}
	
	public int getBalance()
	{
		//returns the balance of the account
		if(accountUnlocked)
		{
		return balance;
		//@return returns the current balance of the account
		}
		return 0;
	}
}
