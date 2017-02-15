# L-Takers

###ALGORITHM:
#####  Continuously splits deck in half until each deck consists of one card. Cards
#####  are then merged back together with their other half by continuously comparing 
#####  the first cards of each deck and placing the lesser one into a new deck. 
#####  Comparing and merging continues until the deck is whole again. This whole 
#####  process features a binary tree being created then collapsing.

###DATA COLLECTION:
#####  Our data collection procedure consists of simple print statements.
#####  Currently, our tester is capable of mergeSorting arrays of lengths 1, 10, 100, 1000, and 2500.
#####  For each of these arrays, the sort() method of MergeSort is run 25 times, and the runtime of each run is printed. Runtimes are calculated through getting the difference in nanoTime between the beginning and end of each run.
#####  As well, each runtime is recorded in an ArrayList, specified for each array length.
#####  That is later used to calculate the average runtime of all the runs.
######  NOTE: the first run is removed from the ArrayList, as it is always outlandishly high for 1-integer arrays, and skews the data.

[Our Graphs](https://docs.google.com/document/d/14MuSRdndcZ1oe-_SM822p6mXctroy68qXvAVdcwHIlI/pub)
