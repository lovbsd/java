package main;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
			continue : skip(생략)
					      그 다음 처리 생략
					   for, while
					   
			loop{
				처리1
				처리2
				if continue
				처리3	<- 처리하지 않고 생략
			}		
				
		*/
		
		for(int i = 0;i < 10; i++) {
			System.out.println("i = " + i);
			System.out.println("for start");
			if(i > 5) {
				continue;
			}
			System.out.println("for end");
		}
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int numArr[] = new int[3];
//		int n;
//		/*
//		for(int i = 0;i < numArr.length; i++) {
//			System.out.print((i + 1) + "번째 수 = ");
//			n = sc.nextInt();
//			if(n < 0) {
//				System.out.println("음수입니다");
//				continue;
//			}
//			numArr[i] = n;
//		}
//		for (int i = 0; i < numArr.length; i++) {
//			System.out.println("numArr[" + i + "] = " + numArr[i]);
//		}
//		*/
//		
//		int w = 0;
//		int arrNum[] = new int[3];
//		while(w < 3) {
//			System.out.print((w + 1) + "번째 수 = ");
//			n = sc.nextInt();
//			
//			if(n < 0) {
//				System.out.println("음수입니다");
//				continue;
//			}
//			arrNum[w] = n;			
//			w++;
//		}
//		
//		for (int i = 0; i < arrNum.length; i++) {
//			System.out.println("arrNum[" + i + "] = " + arrNum[i]);
//		}
//		
//		
	}

}








