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
  Batch size: 25
  n=1          time: 918
  n=10         time: 16443
  n=100        time: 43077
  n=1000       time: 360367
  n=10000      time: 
  n=100000     time: 
  n=1000000    time:

  ANALYSIS:
  According to the data, the big-Oh classification of MergeSort should be O(n)
  or O(nlogn), but definitely not O(n^2) or O(logn). When the runtimes were
  graphed and compared to F(n)=c*n^2, G(n)=c*n, H(n)=c*nlogn, and M(n)=c*logn, 
  the graph showed that MergeSort is the Big Oh of n. However, because our data
  could be faulty and our understanding of MergeSort, we are inclined to 
  conclude that MergeSort is actually the Big Oh of nlogn, which is not too much
  of a stretch, for the graph of H(n)=c*nlogn is still close to the graph of 
  MergeSort.
  
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
	data.remove(0); //for some reason, the first element is outlandishly big
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
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(1));
	    execTime = (System.nanoTime()) - execTime;
	    timeData1.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 1: " + avgTime(timeData1));


	//testing arrays with 10 integers
	ArrayList<Long> timeData10 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(10));
	    execTime = (System.nanoTime()) - execTime;
	    timeData10.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 10: " + avgTime(timeData10));

	//testing arrays with 100 integers
	ArrayList<Long> timeData100 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(100));
	    execTime = (System.nanoTime()) - execTime;
	    timeData100.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 100: " + avgTime(timeData100));

	//testing arrays with 1000 integers
	ArrayList<Long> timeData1000 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(1000));
	    execTime = (System.nanoTime()) - execTime;
	    timeData1000.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 1000: " + avgTime(timeData1000));
	
	//testing arrays with 10000 integers
	ArrayList<Long> timeData10000 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(10000));
	    execTime = (System.nanoTime()) - execTime;
	    timeData10000.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 10000: " + avgTime(timeData10000));
	    
    	//testing arrays with 100000 integers
	ArrayList<Long> timeData100000 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(100000));
	    execTime = (System.nanoTime()) - execTime;
	    timeData100000.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 100000: " + avgTime(timeData100000));
	    
    	//testing arrays with 1000000 integers
	ArrayList<Long> timeData1000000 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(1000000));
	    execTime = (System.nanoTime()) - execTime;
	    timeData1000000.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 1000000: " + avgTime(timeData1000000));

    }//end Main
}//end class
