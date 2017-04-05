package myproject;

import java.util.Arrays;

public class minmaxfinder {

	public static void main(String[] args) {
		int[] my={41,32,23,44,56,46,77,68,79,15};
		System.out.println("min element in"+Arrays.toString(my)+"is"+getmin(my));
		System.out.println("max element in"+Arrays.toString(my)+"is"+getmax(my));
	}
	private static int getmin(int[] my){
		int min=999;
		for(int i=0;i<my.length;i++){
			if(my[i]<min){
				min=my[i];
			}
		}
		return min;
	}
	private static int getmax(int[] my){
		int max=0;
		for(int i=0;i<my.length;i++){
			if(my[i]>max){
				max=my[i];
			}
		}
		return max;
	}

}
