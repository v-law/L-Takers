//Kristin Lin
//APCS2 pd01
//HW#06 -- Step 1: Split, Step 2: ?, Step 3: Sorted!
//2017-02-13

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 
  Continuously split deck in half until each deck consists of one card. Cards
  are then merged back together with their other half by continuously comparing 
  the first cards of each deck and placing the lesser one into a new deck. 
  Comparing and merging continues until the deck is whole again. This whole 
  process features a binary tree being created then collapsing.
  ======================================*/

public class MergeSort {

    /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	//new array to hold merged arrays, as well as counter for indexes
	int[] output = new int[a.length + b.length];
	int first = 0;
	int second = 0;
	for (int x = 0; x < output.length; x++) {
	    //if one array is already finished, then you've got no choice
	    if (first == a.length) {
		output[x] = b[second++];
	    }
	    else if (second == b.length) {
		output[x] = a[first++];
	    } 
	    //otherwise, compare the values and take the lesser
	    else if (a[first] < b[second]) {
		output[x] = a[first++]; 
	    } else {
		output[x] = b[second++];
	    }
	}
	return output;
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    { 
	//if your input is one card, then you it's already sorted silly!
	if (arr.length == 1) {
	    return arr;
	}
	//Splitting the deck in half now...
	int[] arr1 = new int[arr.length/2];
	int[] arr2 = new int[(arr.length+1)/2];
	for (int x = 0; x < arr.length; x++) {
	    if (x < arr.length/2) {
		arr1[x] = arr[x];
	    }
	    else {
		arr2[x-(arr.length/2)] = arr[x];
	    }
	}
	//These two halves should be sorted actually
	arr1 = sort(arr1);
	arr2 = sort(arr2);
	//now that we've sorted them, it's time to merge them
	return merge(arr1, arr2);

    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


	  int[] arr0 = {0};
	  int[] arr1 = {1};
	  int[] arr2 = {1,2};
	  int[] arr3 = {3,4};
	  int[] arr4 = {1,2,3,4};
	  int[] arr5 = {4,3,2,1};
	  int[] arr6 = {9,42,17,63,0,512,23};
	  int[] arr7 = {9,42,17,63,0,9,512,23,9};

	  System.out.println("\nTesting mess-with-array method...");
	  printArray( arr3 );
	  mess(arr3);
	  printArray( arr3 );

	  System.out.println("\nMerging arr1 and arr0: ");
	  printArray( merge(arr1,arr0) );

	  System.out.println("\nMerging arr4 and arr6: ");
	  printArray( merge(arr4,arr6) );

	  System.out.println("\nSorting arr4-7...");
	  printArray( sort( arr4 ) );
	  printArray( sort( arr5 ) );
	  printArray( sort( arr6 ) );
	  printArray( sort( arr7 ) );


    }//end main()

}//end class MergeSort

