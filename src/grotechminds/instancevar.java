package grotechminds;

import java.util.Arrays;
import java.util.Scanner;

public class instancevar {
	
	public static void main(String args[]) {
		 int arr[] = {2, 3, 5, 1, 6,3,1,1};
	    Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));
	    int count=1;
	    for(int i=0;i<arr.length-1;i++) {
	    	if(arr[i]==arr[i+1]) {
	    		count++;
	    	}
	    	else {
	    		System.out.println("The no of count for "+ arr[i] + " is "+ count);
	    		count=1;
	    	}
	    	
	    }
	    System.out.println("The no of count for "+ arr[arr.length-1] + " is "+ count);
	    }      
	    }
	