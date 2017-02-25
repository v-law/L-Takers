//Team L-Takers
//Kristin Lin, Vernita Lawren, Dimitriy Leksanov
//APCS2 pd1
//HW07 -- What Does the Data Say?
//2017-02-14

/*======================================
  class MergeSortTester

  ALGORITHM:
  Continuously splits deck in half until each deck consists of one card. Cards
  are then merged back together with their other half by continuously comparing 
  the first cards of each deck and placing the lesser one into a new deck. 
  Comparing and merging continues until the deck is whole again. This whole 
  process features a binary tree being created then collapsing.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn)

  Mean execution times for dataset of size n:
  Batch size: 10000
  n=1          time: 481
  n=10         time: 2656
  n=100        time: 17163
  n=1000       time: 238480
  n=10000      time: 2071980
  n=100000     time: 23271027
  n=1000000    time: 229070781

  ANALYSIS:
  After running tests with data sets of size n = 1 to 1 000 000, the data was
  graphed and compared to O(n^2), O(nlogn), O(n), and O(logn) so that they 
  passed through the point (10 000, 2.072*10^6). While the graph clearly did
  not have an exponential curve or a logarithmic curve, the shape was very 
  similar to a nlog(n) or a n function. However, as the data sets increased, 
  it was clear that the data was O(nlogn) rather than O(n), for our values were
  greater than the values in the n function (see graphs linked in readme). This
  corresponds with our original hypothesis that MergeSort would be O(nlogn)
  because while splitting the deck into half is log(n) and merging is 2n, the
  two processes combined has runtime classification of O(nlogn).
  
  ======================================*/

import java.util.ArrayList;

public class MergeSortTester {

    public static int[] crtDeck(int numCards){
	int[] deck = new int[numCards];
	for (int x = 0; x < numCards; x++){
	    deck[x] = (int)(Math.random()*100);
	}
	return deck;
    }

    //finds mean of execution times
    public static long avgTime(ArrayList<Long> data) {
	long total = 0;
	data.remove(0); //system needs to "warm up" 
	for (long x : data) {
	    System.out.println(x);
	    total += x;
	}
	return total / data.size();
    }

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) {

	//testing arrays with 1 integer
	ArrayList<Long> timeData1 = new ArrayList<Long>();
	for (int x = 0; x < 10000; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(1));
	    execTime = (System.nanoTime()) - execTime;
	    timeData1.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 1: " + avgTime(timeData1));


	//testing arrays with 10 integers
	ArrayList<Long> timeData10 = new ArrayList<Long>();
	for (int x = 0; x < 10000; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(10));
	    execTime = (System.nanoTime()) - execTime;
	    timeData10.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 10: " + avgTime(timeData10));

	//testing arrays with 100 integers
	ArrayList<Long> timeData100 = new ArrayList<Long>();
	for (int x = 0; x < 10000; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(100));
	    execTime = (System.nanoTime()) - execTime;
	    timeData100.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 100: " + avgTime(timeData100));

	//testing arrays with 1000 integers
	ArrayList<Long> timeData1000 = new ArrayList<Long>();
	for (int x = 0; x < 10000; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(1000));
	    execTime = (System.nanoTime()) - execTime;
	    timeData1000.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 1000: " + avgTime(timeData1000));
	
	//testing arrays with 10000 integers
	ArrayList<Long> timeData10000 = new ArrayList<Long>();
	for (int x = 0; x < 10000; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(10000));
	    execTime = (System.nanoTime()) - execTime;
	    timeData10000.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 10000: " + avgTime(timeData10000));
	    
    	//testing arrays with 100000 integers
	ArrayList<Long> timeData100000 = new ArrayList<Long>();
	for (int x = 0; x < 10000; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(100000));
	    execTime = (System.nanoTime()) - execTime;
	    timeData100000.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 100000: " + avgTime(timeData100000));
	    
    	//testing arrays with 1000000 integers
	ArrayList<Long> timeData1000000 = new ArrayList<Long>();
	for (int x = 0; x < 10000; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(1000000));
	    execTime = (System.nanoTime()) - execTime;
	    timeData1000000.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 1000000: " + avgTime(timeData1000000));

    }//end Main
}//end class
