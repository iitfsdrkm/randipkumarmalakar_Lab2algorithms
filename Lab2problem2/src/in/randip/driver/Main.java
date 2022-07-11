package in.randip.driver;

import java.util.Scanner;
import in.randip.service.CurrencyCounter;
import in.randip.service.MergeSort;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Get the total number/count of denominations from user
		System.out.println("Enter the size of currency denominations:");
		int size = scan.nextInt();

		int currencyArr[] = new int[size];

		int input;

		// Get the different denominations from user
		System.out.println("Enter the currency denominations value:");

		for(int i=0;i<size;i++) {
			input = scan.nextInt();
			if(input>0) {
				if(i==0) {
					currencyArr[i] = input;		
					//System.out.println("ARR=>" + currencyArr[i]);
				}
				else if (i>0) { 

					boolean found = false;
					// Search if same currency denomination is already inserted by user
					for(int x : currencyArr) {
						if(x == input) {
							found=true;
							break;
						}

					}

					// Display if same currency denomination is already inserted by user and ask to re-enter.
					if(found) {
						System.out.println("---Input ERROR--> Same currency value already inserted. Please re-enter denominations. " + (size-(i)) + " values remaining");
						i--;
					}
					else {
						currencyArr[i] = input;	
						//System.out.println("ARR=>" + currencyArr[i]);
					}

				}
			}
			else {
				// Display if 0 (Zero) is entered as currency denomination and ask to re-enter.
				System.out.println("---Input ERROR--> Not a valid currency value - 0 (Zero) or negative value entered. Please re-enter denominations. " + (size-(i)) + " values remaining");
				i--;
			}

		}
		/* Below commented code for debug purpose
		System.out.println("Print original array content");
		for(int i=0;i<currencyArr.length;i++) {
			System.out.print(currencyArr[i] + " ");
		}

		System.out.println("\n---------------------");
		 */

		// Sort the currency denominations in descending order
		MergeSort mergeSort = new MergeSort();
		mergeSort.sortDsc(currencyArr, 0, currencyArr.length -1);

		//  Below commented code for debug purpose
		/*
		System.out.println("Currency denominations in sorted order");
		for(int i=0;i<size;i++) {
			System.out.print(currencyArr[i] + " ");
		}
		System.out.println();
		 */

		// Get the amount to pay
		System.out.println("Enter the amount you want to pay:");
		int amountToPay = scan.nextInt();

		CurrencyCounter currencyCounter = new CurrencyCounter();

		currencyCounter.countDenominations(currencyArr,amountToPay);

		//System.out.println("\nProgram end");
		scan.close();

	}

}

