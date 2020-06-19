package main;

public class mainClass {

	public static void main(String[] args) {
		/*
			loop문, 순환문
			지정한 회수만큼 반복을 하는 제어문
			
			for, while, do while
			
			for( 초기화 ; 조건 ; 연산식 ){				
				// 처리				
			} 
			
			// for + if
			
			int num = 0;
			num = num + 10;
			num++;
			num++;
			num++;
			num++;
			num++;
			num++;

			for( 초기화(1) ; 조건문(4)(7)(10) ; 연산식(3)(6)(9) ){
			
				처리(2)(5)(8)
			}
			
			(11)
		*/
		
		/*
		int i;
		
		for(i = 0;i < 10; i++) {
			System.out.println("i = " + i);			
		}
		
		System.out.println("loop out i = " + i);	
		
		int number = 0;
		number = number + 1;
		number = number + 2;
		number = number + 3;
		number = number + 4;
		number = number + 5;
		number = number + 6;
		number = number + 7;
		number = number + 8;
		number = number + 9;
		number = number + 10;
		
		System.out.println("number = " + number);
				
		int j;
		int num = 0;
		
		for(j = 1;j <= 100; j++) {
			num = num + j;
		}
		
		System.out.println("num = " + num);
		
		*/
		
				
		for(int i = 0;i < 10; i++) {
			System.out.println( i );
		}
		
		int n;
		for(n = 0;n < 10; n++) {
			System.out.println( n );
		}
		/*
		for(int i = 10;i > 0; i--) {
			System.out.println("i = " + i);
		}
		*/		
		for(int i = 0;i < 10; i = i + 2) {
			System.out.println("i = " + i);
		}
		
		int count = 0;
		for(  ; count < 10 ;  ) {
			System.out.println("count = " + count);
			count++;
		}
		
		for(int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println("i = " + i);
			System.out.println("j = " + j);
		}
		
		// for안에 for
		
		// 구구단 2단의 모든 합을 구하라. 	
		int sum = 0;
		for(int i = 2;i <= 20; i = i + 2) {
		//	System.out.println("i = " + i);
			sum = sum + i;
		}
		System.out.println("합:" + sum);
		
		sum = 0;
		int num2 = 2;
		for(int i = 0;i < 10; i++) {
			sum = sum + num2;
			num2 = num2 + 2;
		}		
		System.out.println("합:" + sum);
		
		
		for(int i = 0;i < 10; i++) {	// loop 10	
			
			System.out.println("i = " + i);		
			
			for(int j = 0;j < 5; j++) { // loop 5	
				
				System.out.println("\t j = " + j);
				
			}			
		}
		
		
	}

}





