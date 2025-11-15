import java.util.*;

public class driver {

	// ----- Print ----- 
	private static void printArray(int[] arr) {
		System.out.print("Arr size of " + arr.length + " [");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	// ----- Copy Array -----
	private static int[] copyArray(int[] arr) {
		return Arrays.copyOf(arr, arr.length);
		
	}

	//Insertion sort timed
	private static double timeInsertionSort(int[] arr) {
		long start = System.nanoTime();
		sorts.insertionSort(arr);
		long end = System.nanoTime();
		return (end - start) / 1e9;
	}

	//Shell sort 1 timed
	private static double timeShellSort1(int[] arr) {
		long start = System.nanoTime();
		sorts.shellSort1(arr);
		long end = System.nanoTime();
		return (end - start) / 1e9;
	}

	//Shell sort 2 timed
	private static double timeShellSort2(int[] arr) { 
   		long start = System.nanoTime();
		sorts.shellSort2(arr); 
    		long end = System.nanoTime();
    		return (end - start) / 1e9;
	}

	//Shell sort 3 timed
	private static double timeShellSort3(int[] arr) {
   		long start = System.nanoTime();
    		sorts.shellSort3(arr);
    		long end = System.nanoTime();
    		return (end - start) / 1e9;
	}
	
	//Shell sort 4 timed
	private static double timeShellSort4(int[] arr) { 
    		long start = System.nanoTime();
    		sorts.shellSort4(arr); 
    		long end = System.nanoTime();
    		return (end - start) / 1e9;

	}

	//Shell sort 5 timed 
	private static double timeShellSort5(int[] arr) { 
    		long start = System.nanoTime();
    		sorts.shellSort5(arr); 
    		long end = System.nanoTime();
    		return (end - start) / 1e9;
	}

	//Shell sort 6 timed
	private static double timeShellSort6(int[] arr) {
    		long start = System.nanoTime();
    		sorts.shellSort6(arr);
    		long end = System.nanoTime();
    		return (end - start) / 1e9;
	}

	public static void main(String[] args) {
		Random rand = new Random();

	/* ----------Demo w 20 random numbers----------*/

		int[] demoArr = new int[20];

		for(int i = 0; i < demoArr.length; i++) {
			demoArr[i] = rand.nextInt(100);
		}

	
		int[] arrInsertion = copyArray(demoArr);
		int[] arrShell1    = copyArray(demoArr);
		int[] arrShell2    = copyArray(demoArr);
		int[] arrShell3    = copyArray(demoArr);
		int[] arrShell4    = copyArray(demoArr);
		int[] arrShell5    = copyArray(demoArr);
		int[] arrShell6    = copyArray(demoArr);

		// Run the sorts
		sorts.insertionSort(arrInsertion);
		sorts.shellSort1(arrShell1);
		sorts.shellSort2(arrShell2);
		sorts.shellSort3(arrShell3);
		sorts.shellSort4(arrShell4);
		sorts.shellSort5(arrShell5);
		sorts.shellSort6(arrShell6);

		// Print results
		System.out.println("\nOriginal array:");
		printArray(demoArr);
		System.out.println("\n-----------------------------------------------------------------------------------------------------------");

		System.out.println("\nInsertionSort result:");
		printArray(arrInsertion);
		System.out.println("\n-----------------------------------------------------------------------------------------------------------");	

		System.out.println("\nShellSort1 result:");
		printArray(arrShell1);
		System.out.println("\n-----------------------------------------------------------------------------------------------------------");

		System.out.println("\nShellSort2 result:");
		printArray(arrShell2);
		System.out.println("\n-----------------------------------------------------------------------------------------------------------");	

		System.out.println("\nShellSort3 result:");
		printArray(arrShell3);
		System.out.println("\n-----------------------------------------------------------------------------------------------------------");

		System.out.println("\nShellSort4 result:");
		printArray(arrShell4);
		System.out.println("\n-----------------------------------------------------------------------------------------------------------");

		System.out.println("\nShellSort5 result:");
		printArray(arrShell5);
		System.out.println("\n-----------------------------------------------------------------------------------------------------------");		
		System.out.println("\nShellSort6 result:");
		printArray(arrShell6);
		System.out.println("\n-----------------------------------------------------------------------------------------------------------");
	/*---------- Timed on random arr  ----------*/
	
		int sizeForRand = 1000000;
		int[] arr = new int[sizeForRand];
		int k = 1;
	
		for(int i = 0; i < sizeForRand; i++) {
			arr[i] = rand.nextInt(1000000);
		}
		while (k <= 3) {
			System.out.println("Trial " + k + ": ");

			System.out.println("Timed sorts of array size " + sizeForRand + ": ");

			System.out.println("- - - - -");
			
			System.out.printf("Insertion Sort: %.3f seconds%n", timeInsertionSort(copyArray(arr)));

			System.out.println("- - - - -");

			System.out.printf("ShellSort1: %.3f seconds%n", timeShellSort1(copyArray(arr)));

			System.out.println("- - - - -");

			System.out.printf("ShellSort2: %.3f seconds%n", timeShellSort2(copyArray(arr)));

			System.out.println("- - - - -");

			System.out.printf("ShellSort3: %.3f seconds%n", timeShellSort3(copyArray(arr)));

			System.out.println("- - - - -");

			System.out.printf("ShellSort4: %.3f seconds%n", timeShellSort4(copyArray(arr)));

			System.out.println("- - - - -");

			System.out.printf("ShellSort5: %.3f seconds%n", timeShellSort5(copyArray(arr)));

			System.out.println("- - - - -");

			System.out.printf("ShellSort6: %.3f seconds%n", timeShellSort6(copyArray(arr)));

			System.out.println("- - - - -");
			System.out.println();

			k++;
		}
		

		/*---------- N, 2N, 4N, 8N Sorts ----------*/

		int startInsertion = 250000;
		int startShell1 = 22000000; 
		int startShell2 = 120000; 
		int startShell3 = 65000;  
		int startShell4 = 22000000;  
		int startShell5 = 5000000;
		int startShell6 = 22000000;
		
		int[] multipliers = {1, 2, 4, 8};

		int trial = 1;
		while(trial <= 3) { 
			System.out.println("Trial " + trial + ":");
			System.out.println("- - - -");
		
			// ----- Insertion Sort -----
			
			System.out.println("\nTiming Insertion Sort: ");
			System.out.println();
			for(int i = 0; i < multipliers.length; i++) {
				int size = startInsertion * multipliers[i];
				int[] nArr = new int[size];
				for(int j = 0; j < size; j++) {
					nArr[j] = rand.nextInt(1000000);
				}

				System.out.printf("Size %d: %.3f seconds%n", size, timeInsertionSort(copyArray(nArr)));
			}
			
			System.out.println("- - - - -");


			// ----- Shell Sort 1 -----

			System.out.println("\nTiming Shell Sort 1:");
			System.out.println();
			for (int i = 0; i < multipliers.length; i++) {
				int size = startShell1 * multipliers[i];
				int[] nArr = new int[size];
				for (int j = 0; j < size; j++) {
					nArr[j] = rand.nextInt(1000000);
				}
				
				System.out.printf("Size %d: %.3f seconds%n", size, timeShellSort1(copyArray(nArr)));
			}
			
			System.out.println("- - - - -");

			// ----- Shell Sort 2 -----
			System.out.println("\nTiming Shell Sort 2:");
			System.out.println();
			for (int i = 0; i < multipliers.length; i++) {
				int size = startShell2 * multipliers[i];
				int[] nArr = new int[size];
				for (int j = 0; j < size; j++) {
					nArr[j] = rand.nextInt(1000000);
				}
				
				System.out.printf("Size %d: %.3f seconds%n", size, timeShellSort2(copyArray(nArr)));
			}
				
			System.out.println("- - - - -");

			// ----- Shell Sort 3 -----

			System.out.println("\nTiming Shell Sort 3:");
			System.out.println();
			for (int i = 0; i < multipliers.length; i++) {
				int size = startShell3 * multipliers[i];
				int[] nArr = new int[size];
				for (int j = 0; j < size; j++) {
					nArr[j] = rand.nextInt(1000000);
				}
			
				System.out.printf("Size %d: %.3f seconds%n", size, timeShellSort3(copyArray(nArr)));
			}
			
			System.out.println("- - - - -");

			// ----- Shell Sort 4 -----
			
			System.out.println("\nTiming Shell Sort 4:");
			System.out.println();
			for (int i = 0; i < multipliers.length; i++) {
				int size = startShell4 * multipliers[i];
				int[] nArr = new int[size];
				for (int j = 0; j < size; j++) {
					nArr[j] = rand.nextInt(1000000);
				}
				
				System.out.printf("Size %d: %.3f seconds%n", size, timeShellSort4(copyArray(nArr)));
			}

			System.out.println("- - - - -");
		
			// ----- Shell Sort 5 -----
			
			System.out.println("\nTiming Shell Sort 5:");
			System.out.println();
			for (int i = 0; i < multipliers.length; i++) {
				int size = startShell5 * multipliers[i];
				int[] nArr = new int[size];
				for (int j = 0; j < size; j++) {
					nArr[j] = rand.nextInt(1000000);
				}
				
				System.out.printf("Size %d: %.3f seconds%n", size, timeShellSort5(copyArray(nArr)));
			}

			System.out.println("- - - - -");

			// ----- Shell Sort 6 -----
			System.out.println("\nTiming Shell Sort 6:");
			System.out.println();
			for (int i = 0; i < multipliers.length; i++) {
				int size = startShell6 * multipliers[i];
				int[] nArr = new int[size];
				for (int j = 0; j < size; j++) {
					nArr[j] = rand.nextInt(1000000);
				}
				
				System.out.printf("Size %d: %.3f seconds%n", size, timeShellSort6(copyArray(nArr)));
			}

			System.out.println("- - - - -");
			trial++;
			
		}
	

	}
}

