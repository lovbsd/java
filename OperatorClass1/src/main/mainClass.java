package main;

public class mainClass {

	public static void main(String[] args) {
		/*
		  	Operator
			+, -, *, /, %
			/ : 몫
			% : 나눈 나머지
		*/
		
		int num1, num2;
		int result;		// 결과

		num1 = 25;
		num2 = 7;
		
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		
		result = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
		
		
		
		int number = 0;
		
		number = number + 1;	// 자기 자신의 값을 갱신
		number += 1;
		
		// increment(증가연산자) ++
		// decrement(감소연산자) --
		number++;	// number = number + 1;
		++number;
		
		number--;
		--number;
		
		System.out.println("number = " + number);
		
		int tag;		
		tag = ++number;	// number = 3 tag = 3		
		System.out.println("number = " + number);
		System.out.println("tag = " + tag);
//		
//		tag = number++; // number = 4 tag = 3
//		System.out.println("number = " + number);
//		System.out.println("tag = " + tag);
		
		tag = (number++); // number = 5 tag = 4
		System.out.println("number = " + number);
		System.out.println("tag = " + tag);
		
	}

}





