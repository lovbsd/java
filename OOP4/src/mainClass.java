import cls.cc.Child;
import cls.cc.Parant;

public class mainClass {
	public static void main(String[] args) {
		
		/*
		  은닉성: 접근 지정자를 통하여 외부로 부터 접근을 차단,허용 해 주는것을 의미 
		  private(무조건차단),	 public(허용)
		  variable을 사용할때,	 method사용할때 ^ㅎ^
		  
		  상속성:부모클래스에서 기능을 상속한다.
		  		variable	 method
		  	    추가로기능을 확장하는 경우
		  	    
		  다형성: 상속 후에 여러 형태로 자식 클래스가 구현되는 것을 의미
		  		같은 속성을 가진것이아닌 전혀다른 것을 생성
		  		
		  super
		  !************별 수만개Over Ride(받은 재산을 수정해서 확장) - 관리 목적!************별 수만개
		  
		  
		  
		  
		 */
//		Child c =new Child();
//		
//		c.parant_method();
//		
//		Child cls= new Child(123);
//		
//		cls.parant_method();
//		c.method();
//		
		Child p= new Child();
			p.method();
			
	}
}
