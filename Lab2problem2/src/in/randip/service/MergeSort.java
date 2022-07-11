package in.randip.service;

public class MergeSort {
	//merges two sub arrays 
	// first subarray lowerBound, midArr
	// second subarray midArr+1, upperBound	
	//Ascending Order
	void mergeAsc(int arr[], int left, int mid, int right)
	{
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		int leftArray[] = new int [n1];
		int rightArray[] = new int [n2];

		/*Copy data to temporary arrays*/
		for (int i=0; i<n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j=0; j<n2; ++j)
			rightArray[j] = arr[mid + 1+ j];


		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2)
		{
			if (leftArray[i] <= rightArray[j])
			{
				arr[k] = leftArray[i];
				i++;
			}
			else
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2)
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// function that sorts array[left...right] using mergeAsc()
	public void sortAsc(int arr[], int left, int right)
	{
		if (left < right)
		{
			// Find the middle point
			int mid  = (left+right)/2;

			// Sort first and second halves
			sortAsc(arr, left, mid);
			sortAsc(arr , mid+1, right);

			// Merge the sorted halves
			mergeAsc(arr, left, mid, right);
		}
	}

	//Descending order
	void mergeDsc(int arr[], int left, int mid, int right)
	{
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		int leftArray[] = new int [n1];
		int rightArray[] = new int [n2];

		/*Copy data to temporary arrays*/
		for (int i=0; i<n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j=0; j<n2; ++j)
			rightArray[j] = arr[mid + 1+ j];


		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2)
		{
			if (leftArray[i] >= rightArray[j])
			{
				arr[k] = leftArray[i];
				i++;
			}
			else
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2)
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// function that sorts using mergeDsc()
	public void sortDsc(int arr[], int left, int right)
	{
		if (left < right)
		{
			// Find the middle point
			int mid  = (left+right)/2;

			// Sort first and second halves
			sortDsc(arr, left, mid);
			sortDsc(arr , mid+1, right);

			// Merge the sorted halves
			mergeDsc(arr, left, mid, right);
		}
	}

	public void printArray(int arr[]) {
		for(int index=0; index<arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println();
	}
}
