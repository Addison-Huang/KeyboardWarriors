## Team KeyboardWarriors <Addison Huang, Xinyi Huang, Jude Grodesky>
## Lab00 -- But What Does the Data Say?
## 2018-02-09

# Hypothesis
## For an n*n matrix, worst case execution time of our search method is O(n)

# Background 
## For an nxn matrix of ints, wherein
## *nums increase across a row (L→ R)
## *nums increase down a column
## Compose a O(n) search algo.

# Experiment Methodology
## 1) Create a randomized matrix of size n*n
## 2) Take current time
## 3) Search for the value at the top right corner (0, n-1) 10^10 times
## 4) Take the time and find the difference in times
## 5) Repeat steps 1-4 for n (0 through 10^6) incrementing by 1 
