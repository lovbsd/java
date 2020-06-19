package main;

import mycls.MyClass;

public class mainClass {
	public static void main(String[] args) {
		
		/*
			OOP 목적 : 관리(Code)
			
			절차지향
				-> Array
				-> function -> 분산처리
				
			1. 은닉성(==캡슐화)
			: 외부와의 차간으로 변수들을 관리할 수 있다.
			class의 내부에서 접근(처리)이 가능하도록 접근 지정자로 제어할 수 있다.
			
			private(개인적인)	-> member variable
			public(대중적인) -> member method
			protected(특정) -> 상속에 관련
			
			2. 상속성
			3. 다형성		
		*/
		
		MyClass cls = new MyClass();
		//      instance
		// cls.number = 123;	// 은닉성에 위배		
		cls.name = "hello";		// 은닉성에 위배	
		
		System.out.println(cls);
		
		System.out.println(cls.getThis());
		
		/*
		cls.setNumber(246);		// setter		
		int num = cls.getNumber();	// getter
		*/
		
	}
}




