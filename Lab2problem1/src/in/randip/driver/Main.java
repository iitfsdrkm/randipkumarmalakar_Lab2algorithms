package in.randip.driver;

import java.util.Scanner;

import in.randip.service.PayMoneyService;

// This is Driver class to take inputs from end user and call service class
// Separate Service class 'PayMoneyService' defined for business logic to check if target is achieved or not.

public class Main {

	public static void main(String[] args) {
		int noOfTransactions = 0;
		Scanner scan = new Scanner(System.in);

		// Get number of transactions done for the day
		System.out.println("Enter the size of the transaction array");
		noOfTransactions = scan.nextInt();

		int transactionAmounts[] = new int[noOfTransactions];

		// Get the transaction values for each transactions for the day
		System.out.println("Enter the values of array");
		for(int i = 0;i<noOfTransactions;i++) {
			transactionAmounts[i] = scan.nextInt();
		}

		// Get the total number of targets to be achieved for the day
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets = scan.nextInt();
		int targetAmount[] = new int[noOfTargets];
		
		PayMoneyService payMoney = new PayMoneyService();
		
		// Loop through total number of targets entered by user 
		for(int index=0;index<targetAmount.length;index++) {
			System.out.println("Enter the value of target");
			int amount = scan.nextInt();
			
			// Call method to check if target is achieved and display suitable message
			payMoney.displayIfTargetAchieved(transactionAmounts, amount);

		}

		scan.close();
	}

}
