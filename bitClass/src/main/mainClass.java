package main;

public class mainClass {

	public static void main(String[] args) {

		// bit Operator
		// 고급
		// 처리 속도가 빠르다.
		/*
			bit : 0, 1
			
			&	AND
			|	OR
			^	XOR			-> 보안
			<<	left shift
			>>	right shift 
			~	반전
			
			1010 1100
			A	 C
			
			1111 0000
			F	 0
			
			1010 0000
			A    0
		*/
				
		int result;
		
		// AND
		result = 0xAC & 0xF0;
		System.out.println("result = " + result);	
		System.out.printf("0x%x\n", result);
		
		// OR
		result = 0x48 | 0xB4;
		System.out.printf("0x%x\n", result);
		
		// XOR c4 78
		result = 0xC4 ^ 0x78;
		System.out.printf("0x%x\n", result);
		
		// 반전(~) 0 -> 1  1 -> 0	NOT
		byte by = ~0x55;	// 0101 0101 -> 1010 1010
								//			A    A	
		System.out.printf("0x%x \n", by);
		
		// left shift(*2)
		/*
		  			0000 0001	-> 1
		  			0000 0010	-> 2
		  			0000 0100   -> 4
		  			8421 8421
		 */
		
		byte by1;
		by1 = 0x1 << 1;
		System.out.println("by1 = " + by1);
		
		by1 <<= 1;
		System.out.println("by1 = " + by1);
		
		by1 <<= 1;
		System.out.println("by1 = " + by1);
		
		// right shift(/2)
		by1 >>= 1;
		System.out.println("by1 = " + by1);
		
		// num1 = 0x12
		// num2 = 0x34
		// number = ~(num1 & ~num2)
	}

}












	



