package main;

public class mainClass {

	public static void main(String[] args) {
		
		/*
			(자료형)변환
			boolean		1
			
			byte		1
			short		2
			int			4
			long		8
			
			float		4
			double		8	 
			
			(자동 형 변환, 강제 형(cast) 변환) 
		*/
		
		// 자동형 변환
		short sh = 10;
		int num;
		
		num = sh;	// 자동형 변환
		System.out.println("num = " + num);
		
		num = 20;		
		sh = (short)num; // 강제(cast) 형변환
		System.out.println("sh = " + sh);
		
		num = 128;		
		byte by = (byte)num;
		System.out.println("by = " + by);
		
		float f1;
		
		f1 = (float)3 / 2;
		System.out.println("f1 = " + f1);
		
		// 우선순위
		long lo = 12121231311L;
		float fl;		
		fl = lo;
		
		double d;
		d = lo;
		
		System.out.println("fl = " + fl);
		System.out.println("d = " + d);
		
		// 1.21212314E10
		//			 * 10 의 10승	  * 10000000000
		//	E3 * 10 * 10 * 10
		//  E-2 * (1/10)  * (1/10) 
		
		double value = 123.4567;
		int n;
		n = (int)value;
		System.out.println("n = " + n);

	}

}





