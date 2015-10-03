import java.util.Scanner;
	// we import the scanner which handles our Input
public class AccountUI {
	//Handles the front end of the bank account
	AccountActions ac;
	// account control
	AccountActions sa = new AccountActions(500, 12345);
	//if they already have an account, in this scenario just loads the default account thus sa standard account
	Scanner scan = new Scanner(System.in);
	// creates our scanner which will handle input
	public void ConstructAccount()
	{
		//Constructs the bank account for the current user if they dont already have one
		int balance = 0;
		int pin;
		System.out.println("Please Enter a Pin For Your Account");
		pin = scan.nextInt();
		System.out.println("Welcome Your Balance is Starting at 0 make a deposit to put money into your account");
		ac = new AccountActions(balance, pin);
		//constructor for the account
	}
	
	public void Welcome()
	{
		System.out.println("Welcome to Huge Bank ATM");
		System.out.println("Do You Have An Account With Us?");
		String userInput;
		do
		{
			// the do while loop checks to ensure that you enter Yes or No
		System.out.println("Enter Yes for Yes and No for No");
		userInput = scan.next();
		
			if(userInput.equals("Yes"))
			{
				ac = sa;
			}	
			else if(userInput.equals("No") )
			{
				ConstructAccount();
			
			}
		}while(!(userInput.equals("Yes") || userInput.equals("No")));
	
			
	}
	public void UnlockAccount()
	{
		//unlocks the user acccount
		System.out.println("Please Enter Your Pin");
		int userEnteredPin = 0;
		userEnteredPin = scan.nextInt();
		ac.accessAllowed(userEnteredPin);
		
	}
	public void printMenu()
	{
		//prints the menu for the ATM
		System.out.println("--------------------------------");
		System.out.println("|     Welcome To Huge Bank     |");
		System.out.println("|  \t   MAIN MENU   \t       |");
		System.out.println("-------------------------------");
		System.out.println("| Enter 1 To Get Balance       |");
		System.out.println("| Enter 2 To Deposit Money     |");
		System.out.println("| Enter 3 To Make A Withdrawl  |");
		System.out.println("| Enter 4 To Exit              |");
		System.out.println("| Enter 5 To Change Pin        |");
		System.out.println("--------------------------------");
		
	}
	public void UserDialog()
	{
		UnlockAccount();
		int UserSelection;
		boolean run = true;
		// is our control statement to keep the ATM going for the user to quit they just enter 4 run goes to false and the while loop dies
		while(run)
		{
		printMenu();
		do{// do while loop makes sure that we enter a number between 1 and 5 and remprompts if we don't
			
		UserSelection = scan.nextInt();
		if(!(UserSelection == 1 || UserSelection == 5 || UserSelection == 2 || UserSelection == 3 || UserSelection == 4))
		{
			//checks to see if we have entered an invalid input
			System.out.println("You have entered an invalid input. Please enter a valid input");
		}
		}while( !(UserSelection == 1 || UserSelection == 5 || UserSelection == 2 || UserSelection == 3 || UserSelection == 4));
		
		switch(UserSelection)
		{
		//determines what action happens 
		case 1:
			System.out.println(ac.getBalance());
			break;
		case 2:
			System.out.println("Please Enter the Value of Your Deposit");
			int depositAmount = scan.nextInt();
			ac.Deposit(depositAmount);
			break;
		case 3:
			System.out.println("Please Enter the Value of Your Withdrawl");
			int withdrawlAmount = scan.nextInt();
			ac.Withdrawl(withdrawlAmount);
			break;
		case 4:
			run = false;
			break;
		case 5:
			System.out.println("Please Enter Your Correct Pin");
			System.out.println("For Security Reasons If Your Pin Is Not Correct You Will Not Be Prompted Again");
			int currentPin = scan.nextInt();
			System.out.println("Please Enter Your New Pin");
			int newPin = scan.nextInt();
			ac.SetPin(currentPin, newPin);
			break;
		}
		}
		}
	}
