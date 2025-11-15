# Sorting Algorithm Performance Comparison

This project implements and benchmarks multiple sorting algorithms—including Insertion Sort and six different Shell Sort variants—to compare their performance on arrays of various sizes.

The program:

- Demonstrates each sort on a small, human-readable dataset
- Times each algorithm on large random datasets
- Performs repeated trials for averaging
- Tests scaling behavior using input sizes: N, 2N, 4N, 8N
- Optionally correlates results with an included Excel spreadsheet of timing data

**Project Files:**

1) driver.java:
    - Main program
    - Generates datasets
    - Run sorts
    - Prints results
    - Performs timing experiments
2) sorts.java:
    - Contains all sorting algorithm implementations
3) SortingTimes.xlsx:
    - Contains recorded times for each sorting algorthm at different input sizes

**Implementations:**

1) Insertion Sort:
   - A simple θ(n^2) algorithm used as a basline for comparison

2) Shell Sort Variants:
   - All shell sort implementations perform gapped insertion sorts, but each one uses a different gap sequence, which affects performance
      1) Shell Sort 1: Knuth Sequence
          - h = 1, 4, 13, 40, 121, ... , (h = 3h + 1)
      
      3) Shell Sort 2: Odd-number Sequence
          - Starts at the largest odd number ≤ n/2, then decreases by 2
       
      3) Shell Sort 3: Descending n/2, n/2 - 1, ... , 1
          -  A brute-force gap sequence using every integer

      4) Shell Sort 4: Halving Sequence
          - n/2, n/4, n/8, ... , 1

      5) Shell Sort 5: Square-root Reduction
          - h = n/2, sqrt(h(, sqrt(h), ... until h < 1

      6) Shell Sort 6: 2^k - 1 Sequence
          - 1, 3, 7, 15, 31, ... (2^k – 1)

**Program Output Overview**

1) Demonstration (Small Example)

  The program first generates 20 random numbers and sorts them with all 7 algorithms, printing:

  - Original array
  - Sorted result for each algorithm

  This confirms correctness and allows visual comparison.

2) Timing on a 1,000,000-element array

  The program performs 3 trials, printing the execution time (in seconds) for:

  - Insertion Sort
  - Shell Sort 1–6

  Each algorithm is timed using a fresh copy of the same array.

3. Scaling Test: N, 2N, 4N, 8N

  Each algorithm also runs on four increasing input sizes.
  The starting values differ because slow algorithms (e.g., Insertion Sort) cannot handle        extremely large arrays.

  Algorithm	Starting Size (N)
  - Insertion Sort	250,000
  - Shell Sort 1:	22,000,000
  - Shell Sort 2:	120,000
  - Shell Sort 3:	65,000
  - Shell Sort 4:	22,000,000
  - Shell Sort 5:	5,000,000
  - Shell Sort 6:	22,000,000

Each size is multiplied by: 1x, 2x, 4x, 8x
Each experiment is repeated 3 times to reduce noise 

**SortingTimes.xlsx**

This spreadsheet includes:

- Execution time (in seconds) for each algorithm
- All three trials
- Timing data for:
    - Small demonstration arrays
    - 1 million–element tests
    - N, 2N, 4N, 8N scaling runs
 
**How To Run:**

1) Compile:
    - javac driver.java sorts.java

2) Run:
    - java driver

3) Ensure Sufficient Memory:
    - java -Xmx4g driver








