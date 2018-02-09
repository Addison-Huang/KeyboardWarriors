<b> Team KeyboardWarriors <Addison Huang, Xinyi Huang, Jude Grodesky> <br>
Lab00 -- But What Does the Data Say? <br> 
2018-02-09 </b> <br> 

# <b> Hypothesis </b> <br>
For an n*n matrix, worst case execution time of our search method is O(n)

#  <b> Background </b> <br>
For an n*n matrix of ints, wherein <br>
*nums increase across a row (L→ R) <br>
*nums increase down a column <br> <br>
We try to compose a O(n) search algo.

# <b> Experiment Methodology </b> <br>
1) Create a randomized matrix of size n*n <br>
2) Take current time <br> 
3) Search for the value at the top right corner (0, n-1) 10^4 times <br>
4) Take the time and find the difference in times <br>
5) Repeat steps 1-4 for n (100 through 10^4) incrementing by 100 <br>
6) Store the data into a csv file <br>
7) Import the csv file into Google Sheet <br>
8) Graph the data <br>
9) Determine the run time according to the graph <br>

# <b> Results </b>

# <b> Conclusions </b>
