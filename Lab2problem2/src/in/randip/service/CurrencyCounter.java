package in.randip.service;

public class CurrencyCounter {

	public void countDenominations(int currencyArr[], int amountToPay ) {

		int currencyCounter[] = new int[currencyArr.length];

		for(int i=0;i<currencyArr.length;i++) {

			if(amountToPay >= currencyArr[i] ) {
				currencyCounter[i] = amountToPay / currencyArr[i];
				amountToPay = amountToPay - currencyCounter[i] * currencyArr[i]; 

			}
		}

		//System.out.println("Amount ==>>" + amountToPay);

		if(amountToPay !=0) {

			//System.out.println("Balance amount to be paid :" + amountToPay);

			// ######## IMPORANT ############
			// Uncomment below line of java code if you want to make full payment by making extra payment using lowest currency denomination.
			// Don't forget to also comment the uncommented code just after the below code
			//currencyCounter[currencyArr.length-1]++;  // minimum currency denominations to be used to pay balance amount

			// If above code is uncommented (which makes extra payment) then comment below three lines of code including the return statement.
			System.out.println("No currency denominations avaiable to pay remaining amount of " + amountToPay);
			System.out.println("Sorry can't make exact payment with the provided denominations");
			return;
		}

		System.out.println("\nYour payment approach in order to give minimum no of notes will be:");
		System.out.println("Currency: No of notes");
		for(int i=0;i<currencyArr.length;i++) {
			if(currencyCounter[i] != 0) {
				System.out.println(currencyArr[i] + "\t: " + currencyCounter[i]);
			}
		}
	}


}
