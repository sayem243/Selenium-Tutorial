package arrayPractice;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {

		int a[]= {11,6,23,44,556,100,01,2,22};
		System.out.println(" Before sorting....");
		
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("After sorting.......");
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
