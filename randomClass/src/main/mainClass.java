package main;
import java.util.Arrays;

public class mainClass {
	public static void main(String[] args) {

		/*
		 * random : 난수, 무작위 <-> pattern 1 ~ 5
		 */
		int rnum[] = new int[10];
		for (int i = 0; i <= 9; i++) {
			rnum[i] = (int) (Math.random() * 45 + 1);
			System.out.println("랜덤숫자는: " + rnum[i]);
		}
		// rnum[5] = (int)(Math.random() * 5); // 5: 0 ~ 4
		// System.out.println("rnum = " + rnum);

		// 0 ~ 9
		// rnum[5] = (int)(Math.random() * 10);
        //			System.out.println("rnum = " + rnum);
		// 10 20 30 40 50
		// rnum[5] = ((int)(Math.random() * 5) + 1) * 10;

		// -1 0 1
		// rnum[5] = (int)(Math.random() * 3) - 1;

		// int x = (int)(Math.random() * 3) - 1; // -1 0 1
		// int y = (int)(Math.random() * 3) - 1; // -1 0 1
	
		int[] arr1 = new int[20];
		int[] arr2 = new int[20];
		
		System.out.println(arr1.equals(arr2));
		System.out.println(Arrays.equals(arr1,arr2));
		
		
	}

}
