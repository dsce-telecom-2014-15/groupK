package myproject;

import java.util.Arrays;

public class arraymerger {

	public static void main(String[] args) {
		int[] Array1={41,32,23,44,56,46,77,68,79,15};
		int[] Array2={1,2,3,4,5,6,7,8,9,10};
		int[] mergedArray=new int[Array1.length+Array2.length];
		for(int i=0;i<Array1.length;i++){
			mergedArray[i]=Array1[i];
		}
		for(int j=0;j<Array2.length;j++){
			mergedArray[Array1.length+j]=Array2[j];
		}
		System.out.println("array1 is"+Arrays.toString(Array1));
		System.out.println("array2 is"+Arrays.toString(Array2));
		System.out.println("merged array is"+Arrays.toString(mergedArray));
	}

}
