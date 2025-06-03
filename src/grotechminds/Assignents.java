package grotechminds;

import java.util.Arrays;

public class Assignents {
	
	public static void main(String args[]) {
			int arr1[] = { 6,4,1,7};
			int arr2[] = {2,3,5};
			
				int mergedarr[] = new int[arr1.length+arr2.length];
				for (int i =0;i<arr1.length;i++) {
					mergedarr[i]=arr1[i];
				}
				for (int j=0 ; j<arr2.length;j++)
				{
					mergedarr[arr1.length+j]=arr2[j];
				}
				System.out.println(Arrays.toString(mergedarr));
			
			}
	}

