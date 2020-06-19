package mycls;

public class MyClass {
	
	// class member variable	99% -> private
	private int number;
	public String name;
	
	// class member method
	
	/*
	// setter 
	public void setNumber(int newNumber) {
		number = newNumber;
	}	
	// getter
	public int getNumber() {
		return number;
	}
	*/
	//	70% public
	public void func() {	// 처리	
		
		this.method();
	}
	
	public MyClass getThis() {
		return this;
	}
	
	public int getNumber() {	// 매개변수 0번째 존재하고 있는 자기 자신의 참조(주소)
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void method() {
		
	}
}


