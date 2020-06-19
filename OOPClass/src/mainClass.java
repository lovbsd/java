
public class mainClass {
	public static void main(String[] args) {

		// instance(클래스 변수) 클래스형
		// 동적할당선언 전 null; 값으로 선언해도 가능하다는거~~
		MyClass cls = new MyClass();
		// MyClass cls = null;

		cls.number = 1;
		cls.name = "홍길동";
		cls.age = 24;
		cls.address = "서울시";

		cls.func();
		cls.method();

		MyClass mcls = new MyClass();
		System.out.println(cls);
		System.out.println(mcls);
		// oop 에서 중시할것! 순서의 처리가 중요하다

		// 절차지향
		// 정렬
		//
		// 1. 입력
		// 2. 정렬 처리
		// 		swap
		// 3. 출력
		//
		// 객체지향
		// 처리들
		// 입력,정렬,교환,출력
		// 순서 호출

	}
}
