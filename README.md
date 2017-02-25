# L-Takers 
Kristin Lin, Vernita Lawren, Dimitriy Leksanov

###ALGORITHM:
Continuously splits deck in half until each deck consists of one card. Cards 
are then merged back together with their other half by continuously comparing 
the first cards of each deck and placing the lesser one into a new deck. 
Comparing and merging continues until the deck is whole again. This whole 
process features a binary tree being created then collapsing.

###METHODOLOGY:
Our data collection procedure consists of simple print statements. 
Currently, our tester is capable of mergeSorting arrays of lengths 1, 10, 
100, 1 000, 10 000, 100 000, 1 000 000. For each of these arrays, the sort() method 
of MergeSort is run 10 000 times, and the runtime of each run is printed. Runtimes are 
calculated through getting the difference in nanoTime between the beginning and end
of each run. As well, each runtime is recorded in an ArrayList, specified for each 
array length. That is later used to calculate the average runtime of all the runs.
######  NOTE: the first run is removed from the ArrayList because it takes time to "warm up".

###FINDINGS: 
After running tests with data sets of size n = 1 to 1 000 000, the data was
graphed and compared to O(n^2), O(nlogn), O(n), and O(logn) so that they 
passed through the point (10 000, 2 072 000). While the graph clearly did
not have an exponential curve or a logarithmic curve, the shape was very 
similar to a nlog(n) or a n function. However, as the data sets increased, 
it was clear that the data was O(nlogn) rather than O(n), for our values were
greater than the values in the n function (see graphs linked in readme). This
corresponds with our original hypothesis that MergeSort would be O(nlogn)
because while splitting the deck into half is log(n) and merging is 2n, the
two processes combined has runtime classification of O(nlogn).
###### MergeSort is O(nlogn).

[Graphs](https://docs.google.com/document/d/14MuSRdndcZ1oe-_SM822p6mXctroy68qXvAVdcwHIlI/pub)
