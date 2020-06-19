
public class mainClass {

	public static void main(String[] args) {
		/*
			1차원 배열
			Array : 같은 자료형의 묶음. 변수들의 묶음
					index number로 관리가 된다.
					0 ~ n-1 (n은 배열의 총수)

			다른 자료형의 묶음 : C언어 -> structure(구조체)
						   Java -> class
						   
			int array[] = new int[3];
			int array[] = { 1, 2, 3 };
			
			MyStruct my = { 'a', 24, "홍길동" }; 
			
			String member[] = { "홍길동", "24", "서울시" };
			
			int Array2[3][4] = {				
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 }				
			};
			
			int Array2[][] = new int[3][4];
			int []Array2[] = new int[3][4];
			
		*/
		
		int Array2[][] = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 }
		};
		
		for (int i = 0; i < Array2.length; i++) {	// Array2.length -> 3
			for (int j = 0; j < Array2[0].length; j++) { // Array2[0].length -> 4
				System.out.println("Array2[" + i + "][" + j + "] = " + Array2[i][j]);
			}
		}		
		//1차원 배열
		//정의: 같은 자료형 변수의 묶음
		//목적 변수를 관리
		//변수에 접근을 하기위해서 사용하는것은
		//index number (번지)	 0~n-1
		//동적할당(1~n개)-> 할당후 정적으로 사용(접근)
		
		
		int array[] =new int[5]; //new -> 동적할당
		// stack     heap        //delete array-> 가비지콜렉터
		int array1,array2,array3,array4,array5;
		// stack
		int arrayTag[] = {11,22,33,44,55};
		//				   0           4   :총 5개
		
		//배열 참조(포인터) :속도 ,주소만 접근하면 모든 데이터를 접근가능
		int pArray[] = arrayTag;     // int *arrayTag = arrayTag
		System.out.println(arrayTag);
		
		pArray[1] = 222;
		System.out.println(arrayTag[1]);
		
		int arrayNumberPosition[]= {1,2,3};
		int arrNumPos[]=new int[3];
		int arrNumpos[]=arrayNumberPosition;
		
		//2차원 배열 큰묶음,큰묶음안에 요소수 
		int Array3[][]= {
				{1,2,3,4},
				{1,2,3,4},
				{2,3,4,5},
				{2,3,4,5},
				{2,3,4,5},
				{2,3,4,5},
				{2,3,4,5},
				{2,3,4,5},
				{2,3,4,5},
				
		};
		//memory 
		/* 
		 Array2[0][0]
		 Array2[0][1]
		 Array2[0][2]
		 Array2[0][3]
		 Array2[1][0]
		 Array2[1][1]
		 Array2[1][2]
		 Array2[1][3]
		 
		 */
		for (int i = 0; i < Array3.length; i++) {
			for (int j = 0; j < Array3[i].length; j++) {
				System.out.print(Array3[i][j]+" ");
				
			}
			System.out.println('\n');
			}

	}

}





