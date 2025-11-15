import java.util.*;

public class sorts {

	// INSERTION SORT
	public static void insertionSort(int[] arr) {
        	int n = arr.length;
        	for (int i = 1; i < n; i++) {
			int k = arr[i];
			int j = i - 1;

			while(j >= 0 && arr[j] > k){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = k;
		}	
	}

	//SHELL SORT 1
   	// h = 1, 4, 13, 40, 121, ... (3*h+1 sequence)
	public static void shellSort1(int[] arr) {
        	int n = arr.length;
        	int h = 1;
        	while (h < n / 3) {
		       	h = 3 * h + 1; // largest h
		}

        	while (h >= 1) {
            		for (int i = h; i < n; i++) {
                		int temp = arr[i];
        	        	int j = i;
                		while (j >= h && arr[j - h] > temp) {
                    			arr[j] = arr[j - h];
                    			j -= h;
                		}
                		arr[j] = temp;
			}
            		
			h /= 3;
        	}
    	}

	//SHELL SORT 2 
	// h = odd numbers starting at ~n/2 down to 1
	public static void shellSort2(int[] arr) {
		int n = arr.length;
		int h;

		if((n/2) % 2 == 0) {
			h = n / 2 - 1;
		} else {
			h = n / 2;
		}
		
		while (h >= 1) {
			for (int i = h; i < n; i++) {
				int temp = arr[i];
				int j = i;
		
				while (j >= h && arr[j - h] > temp) {
		    			arr[j] = arr[j - h];
		   			j -= h;
				}
				
				arr[j] = temp;
	    		}
	    		
			h -= 2;
		}
	}

	//SHELL SORT 3
	// h = every number from n/2 down to 1
	public static void shellSort3(int[] arr) {
		int n = arr.length;
	
		for (int h = n / 2; h >= 1; h--) {
			for (int i = h; i < n; i++) {
				int temp = arr[i];
				int j = i;
			
				while (j >= h && arr[j - h] > temp) {
				    	arr[j] = arr[j - h];
		    			j -= h;
				}
				arr[j] = temp;
			}
		}
	}

	// ---------- SHELL SORT 4 ----------
	// h = n/2, n/4, n/8, ... , 1
	public static void shellSort4(int[] arr) {
		int n = arr.length;
			
		for (int h = n / 2; h >= 1; h /= 2) {
	    		for (int i = h; i < n; i++) {
				int temp = arr[i];
				int j = i;
				
				while (j >= h && arr[j - h] > temp) {
					arr[j] = arr[j - h];
		    			j -= h;
				}
				arr[j] = temp;
	    		}
		}
	}

	// SHELL SORT 5 
	// h = start at n/2, next h = sqrt(h), until h < 1
	public static void shellSort5(int[] arr) {
		int n = arr.length;
		int h = n / 2;
		
		while (h >= 1) {
			for (int i = h; i < n; i++) {
				int temp = arr[i];
				int j = i;
			
				while (j >= h && arr[j - h] > temp) {
					arr[j] = arr[j - h];
					j -= h;
				}
				
				arr[j] = temp;
	    		}
			if(h == 1)
				break;
			h = (int) Math.sqrt(h); // reduce by sqrt
		}
	}

	// SHELL SORT 6 
	// h = 2^k – 1 sequence (descending)
	public static void shellSort6(int[] arr) {		
		int n = arr.length;
		int h = 1;

		while (h < n){
			h = h * 2 + 1; 
		}
		
		h = (h - 1) / 2; // largest 2^k-1 < n

		while (h >= 1) {
			for (int i = h; i < n; i++) {			
				int temp = arr[i];
				int j = i;
			
				while (j >= h && arr[j - h] > temp) {	
				    	arr[j] = arr[j - h];
		 	   		j -= h;
				}
				
				arr[j] = temp;
	    		}	
		 	h = (h - 1) / 2; // next smaller 2^k-1
		}
	}


	

}	
