package main;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * Array : 배열 변수의 확장 기능. 관리를 용이하기 위한 목적. 정의 : 같은 자료형의 변수의 묶음
		 * 
		 * 관리 : index 번호 0 ~ (n-1)
		 * 
		 * int num1, num2, num3,... num10;
		 * 
		 * 형식: 자료형 배열명(=변수명)[] = new 자료형[배열갯수];
		 * 
		 * int Array[] = new int[10]; 10개의 변수 선언 0 ~ 9 num1 = 1;
		 * 
		 * Array[0] = 1; Array[1] = 2; Array[2] = 3; : Array[9] = 10;
		 * 
		 * 동적으로 생성해서 정적으로 사용한다.
		 */

		int array[] = new int[3];
		// int []array = new int[3];
		// int[] array = new int[3];

		// int *array = new int[3];
		// int* array = new int[3];

		int num1, num2, num3;

		array[0] = 11;
		array[1] = 22;
		array[2] = 33;

		// 변수 초기화
		int tag = 1;

		int arr[] = { 1, 2, 3 };

		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		// System.out.println("arr[3] = " + arr[3]);

		char charArr[] = { 'H', 'e', 'l', 'l', 'o' };
		System.out.println(charArr);

		System.out.println(charArr[0]);
		System.out.println((int) charArr[0]); // ASCII code

		char charArr2[] = new char[5];
		charArr2[0] = 'H';
		charArr2[1] = 'e';
		charArr2[2] = 'l';
		charArr2[3] = 'l';
		charArr2[4] = 'o';

		System.out.println(charArr2);

		int[] anArray;

		anArray = new int[10];
		anArray[0] = 100; // 첫 번째 요소를 초기화
		anArray[1] = 200; // 두 번째 요소를 초기화
		anArray[2] = 300; // 기타 등등

		int[] AnArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		System.out.println(AnArray);
		// 배열의 주소는 막아놔서 주소값이 출력되지않는다!
		System.out.println(AnArray[0]);
		System.out.println("                                ");
		
		 System.out.println (anArray.length);
		 // array size of == length	배열의 크기지정
		 
		 
		 
		 
		 char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
				    'i', 'n', 'a', 't', 'e', 'd' };
	        char[] copyTo = new char[7];
	        												// 문자를 복사할 시작배열 index와  복사위치의 담을 첫번째 index,마지막index
	  
	        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	        System.out.println(new String(copyTo));
/////////////////////////////////////////////////////////////////각 배열의 요소에 문자를 넣고 새배열에 복사 하여 한문장 으로 변환한다.
	        char[] CopyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
	                'i', 'n', 'a', 't', 'e', 'd'};
	        char[] CopyTo = java.util.Arrays.copyOfRange(CopyFrom, 2, 9);
	                
	            
	            System.out.println(new String(CopyTo));
	        
	            //arraycopy는copyFrom의index를 사용자의 의미에따라서 가독성이 올라가지만 코드를 한줄더써야
	            //copyOfRange는사용자의 지정 인덱스를 포함하여 강제 복사되지만 코드의 효율성을 증가시킴
	    
	        
	        
	    }
	
	
	}
	

