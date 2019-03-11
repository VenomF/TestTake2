package zadatak5;

import java.util.Arrays;

public class MyArray {
	
	private int [] array;
	
	public MyArray(int[] array) {
		this.array=array.clone();
	}
	
	public int getSmallestElement() {
		Arrays.sort(array);
		return array[0];
	}
	
	public int getLargestElement() {
		Arrays.sort(array);
		return array[array.length-1];
	}
	
	public int sumAllElements() {
		int sum=0;
		
		for (int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		
		return sum;
	}
	
	public void printAllElements() {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
