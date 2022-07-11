package in.randip.service;

public class PayMoneyService {

	public void displayIfTargetAchieved(int transactionAmounts[], int amount) {
		int total = 0;
		boolean targetAchieved = false;
		
		// Check if target amount for the day is achieved by adding transaction values.
		for(int travel=0;travel < transactionAmounts.length;travel++) {
			total += transactionAmounts[travel];
			if(total >= amount) {  		// Display if target amount is achieved  and exit the loop. 
				System.out.println("Target achieved after " + (travel+1) + " transaction(s)\n");
				targetAchieved = true;
				break;
			}
		}
		if(!targetAchieved) 			// Display message if target amount is not achieved 
			System.out.println("Given target is not achieved\n");
	}

}
