import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
			입력: input  -> 콘솔
			출력: output	-> 콘솔 text
				 System.out.println()	
				 
			입력 -> 저장해 놓을 공간(변수)	 		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		// boolean(true/false)
		boolean b;
		System.out.print("b = ");
		b = scan.nextBoolean();	// true/false		
		System.out.println("b:" + b);
						
		// int(정수)
		int number;
		System.out.print("number = ");
		number = scan.nextInt();		
		System.out.println("number:" + number);
		
		// double(실수)
		double d;		
		System.out.print("d = ");
		d = scan.nextDouble();
		System.out.println("d:" + d);
		
	//	scan.nextLine();
		
		// String(문자열)
		// next, nextln		
		String _str;
		System.out.print("_str = ");
		_str = scan.next();
		System.out.println("_str = " + _str);
		
		String str;
		System.out.print("str = ");
		str = scan.next();
		System.out.println("str = " + str);
		// ' ' == nul 문자(빈문자)
				
		
	}

}





