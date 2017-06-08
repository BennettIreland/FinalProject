import java.util.Scanner;

//Created by: Bennett Ireland
//Created for: Mr. Kuzmochka
// Class: ICS C3
//Project Started:
//Project Ended:
//Asks for a password and then allows the user enter a time and amount of driveways

public class IB_U5A1 {
	
	public static int multiplyDriveway (int time, int driveAmount){
		
		time = time * driveAmount;
		
		
		return(time);
	};
	
	public static int divideDriveway (int time, int driveAmount){
		
		time = time / driveAmount;
		
		
		return(time);
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyedInput = new Scanner(System.in);
		
		String passWord;
		int shovelTime;
		int times = 0;
		int drivewayAmount;
		int choice = 0;
		
		System.out.println ("******SNOW SHOVEL PROGRAM*****");
		
		
		while(times < 3){
			System.out.println ("Enter a password that is between 6 and 12 characters long: ");
			passWord = keyedInput.nextLine();
		
			if(passWord.length() < 6 || passWord.length() > 12){
				
				System.out.println ("The password you entered is too short or too long");
				times = times + 1;
			
			}
			if(passWord.length() > 6 && passWord.length() < 12){
				
				System.out.println ("Welcome to the program");
				System.out.println ("");
				System.out.println ("Here are your options: ");
				System.out.println ("1. Find out how long it will take to shovel an amount of driveways");
				System.out.println ("2. Find out how fast you will have to shovel depending on how long you want to shovel for");
				System.out.println ("Please enter your choice");
				choice = keyedInput.nextInt();
				
				if (choice == 1){
					
					System.out.println ("Please enter how long it takes to shovel 1 driveway in minutes");
				shovelTime = keyedInput.nextInt();
				
				System.out.println ("");
				System.out.println ("Enter how many driveways you will shovel");
				drivewayAmount = keyedInput.nextInt();
				
				
				
				
				System.out.println ("It will take " + multiplyDriveway(shovelTime, drivewayAmount) + " minutes to complete");
				
				};
				
				if (choice == 2){
					
					System.out.println ("Please enter how long you want to shovel for");
				shovelTime = keyedInput.nextInt();
				
				System.out.println ("");
				System.out.println ("Enter how many driveways you will shovel");
				drivewayAmount = keyedInput.nextInt();
				
				if(drivewayAmount > shovelTime){
					System.out.println ("That is impossible");
					System.out.println ("******SNOW SHOVEL PROGRAM*****");
					break;
				};
			
				
				System.out.println ("You have to spend " + divideDriveway(shovelTime, drivewayAmount) + " minutes on each driveway");
				
				};
				
				
				System.out.println ("******SNOW SHOVEL PROGRAM*****");
				break;
			};
				
			if(times == 3){
				
				System.out.println ("You have failed 3 times and will now be locked out");
				System.out.println ("******SNOW SHOVEL PROGRAM*****");
				break;
			};
		
		
		
		
		
		
		
		}
		
		
	}

}
