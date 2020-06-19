package mainClass;

class Parant {
	
	public void method() {
		System.out.println("parant method()");
	}

}
class ChildOne extends Parant{
	public void method() {
		System.out.println("Childone over ride method()");
	}
	public void Onemethod() {
		System.out.println("ChildOne oneMethod()");
	}
}
class ChildTwo extends Parant{
	
public void method() {
	System.out.println("Childone over ride method()");
}
public void Onemethod() {
	
}
}

public class mainclass {
	public static void main(String[] args) {
	
		
		/*
		 	instanceOf
		 	상속받은 Object를 부모 클래스의 instance로 생성
		 	ChildOne -> Parant 
		 	ChildTwo -> Parant 
		 
		 	생성된 instance에 어떤 자식 클래스가 생성되었는지 판별할 수 있는 제어자
		 */
		Parant arrPar[] = new Parant[3];
		arrPar[0]= new ChildOne();
		arrPar[1]= new ChildTwo();
		arrPar[2]= new ChildOne();
	
		
		for(int i=0;i<arrPar.length;i++) {
		arrPar[i].method();	//over ride 
		
		if(arrPar[0] instanceof ChildOne) {
			ChildOne one = (ChildOne)arrPar[0];
			one.Onemethod();
		}
		}
	}
}
