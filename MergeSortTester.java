
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
  O(nlog(n))

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
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

    /*
public static void runSort(int[] deck){
MergeSort.sort(deck);
}
    */

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
	ArrayList<Long> timeData1 = new ArrayList();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(1));
	    execTime = (System.nanoTime()) - execTime;
	    timeData1.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 1: " + avgTime(timeData1));


	//testing arrays with 10 integers
	ArrayList<Long> timeData10 = new ArrayList();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(10));
	    execTime = (System.nanoTime()) - execTime;
	    timeData10.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 10: " + avgTime(timeData10));

	//testing arrays with 100 integers
	ArrayList<Long> timeData100 = new ArrayList();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(100));
	    execTime = (System.nanoTime()) - execTime;
	    timeData100.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 100: " + avgTime(timeData100));

	//testing arrays with 1000 integers
	ArrayList<Long> timeData1000 = new ArrayList();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(1000));
	    execTime = (System.nanoTime()) - execTime;
	    timeData1000.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 1000: " + avgTime(timeData1000));

	//testing arrays with 2500 integers
	ArrayList<Long> timeData2500 = new ArrayList();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    MergeSort.sort(crtDeck(2500));
	    execTime = (System.nanoTime()) - execTime;
	    timeData2500.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 2500: " + avgTime(timeData2500));

    }//end Main
}//end class
