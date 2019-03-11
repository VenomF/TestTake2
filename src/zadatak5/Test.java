package zadatak5;

public class Test {

	public static void main(String[] args) {
		int[] arr= {1, 345, 145, 3245, 124,355, 12, 6,678, 456, 4, 5, 54, 58};
		MyArray array=new MyArray(arr);
		
		System.out.println("Najveci element niza je " + array.getLargestElement());
		System.out.println("Najmanji element niza je " + array.getSmallestElement());
		System.out.println("Suma svih elemenata niza je " + array.sumAllElements());
		System.out.println("Elementi niza:");
		array.printAllElements();

	}

}
