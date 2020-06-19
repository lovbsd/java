package mycls;

public class MyClass {
	/*
		constructor : 생성자 == method
					  class 명과 같은 method
					  return 값이 없다.
					  over load 가 가능.
					    자동호출된다.
					    별도의 호출이 불가능하다.   	
					    생략이 가능하다.
					   기본 값을 설정할 경우 많다.  	
					   초기화는 사용안 하는 편이 좋다.			
		destructor : 소멸자	X	
		
		structure (c언어)
		
		STRUCT mystruct{
			int num;
			String str;
		};
		
		mystruct my = { 123, "hello" };
		
	*/
	private int number;
	private String name;
	
	public MyClass(){	// 기본 생성자
		System.out.println("MyClass MyClass()");
	}

	public MyClass(int number, String name) {
		this();
		this.number = number;
		this.name = name;		
	}
	
	/*
	public MyClass(int number) {
		this.number = number;
		
		System.out.println("MyClass MyClass(int number)");
	}
	
	public MyClass(int number, String name) {
		this(34);
		
		this.number = number;
		this.name = name;
		
		System.out.println("MyClass MyClass(int number, String name)");
	}
	*/
	
	
	

}









