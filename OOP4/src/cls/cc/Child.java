package cls.cc;

public class Child extends Parant {
	public Child() {
		System.out.println("그다음 여기 호출 !자식!2");
		//super(2);
		System.out.println("자식자식(3)");
	}
	public Child (int num) {
		super();
		System.out.println("자식 자식(5)");
	}
	public void func() {
		String name = "홍길동";
	}
	
	// over Ride 실시한 method
	// ocer Ride 목적 > 관리
	public void method() {
		System.out.println("Child method()");
		super.method();// 부모클래스 메소드 호출
		
	}
	public void func1() {
		System.out.println("펑크");
	}
}
