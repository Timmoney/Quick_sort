class QuickSort{
	

	// this going to find the pivot position, the init pivot we choose to use the last element
	int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = (low-1); //index of the smaller element

		//iterating the loop
		for(int j = low; j<high; j++){
			if(arr[j] <= pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		//swap arr[i+1] and arr[high]
		int temp = arr[i+1];
		//becareful here
		arr[i+1] = arr[high];
		//you need to update the last element
		arr[high] = temp;

		return i+1;
	}

	//recursive call
	void sort(int arr[], int low, int high){
		if(low < high){
			int pi = partition(arr, low, high);

			sort(arr, low, pi-1);
			sort(arr, pi+1, high);

		}
	}

	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7, 88, 99,10}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        QuickSort ob = new QuickSort(); 
        //int x = ob.partition(arr, 0, arr.length-1); 
  
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array"); 
        printArray(arr); 
    }

}