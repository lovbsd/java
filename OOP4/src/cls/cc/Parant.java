package cls.cc;

public class Parant {
	private int number;
	
	public Parant(){
		System.out.println("여기서 먼저 호출 !부모!1");
	}
	
	public Parant(int num) {
		this.number = number;
		System.out.println();
	}
	public void parant_method() {
		System.out.println(" zz4");
	}
	/*
	 Over Ride
	 상속 받은 후에 상속 받은 클래스 (자식 클래스)에서 고쳐 기입함을 의미한다.
	 
	 
	 */
	public void method() {
		System.out.println("parant method()");
		
	}
}
