package myproject;

import java.util.Arrays;

public class minelement {

	public static void main(String[] args) {
		int[] myIntArray={41,32,23,44,56,46,77,68,79,15};
		int minElement=999;
		for(int i=0;i<myIntArray.length;i++){
			if(myIntArray[i]<minElement){
				minElement=myIntArray[i];
			}
		}
		System.out.println("minimum elementin"+Arrays.toString(myIntArray)+"is"+minElement);
	}

}
