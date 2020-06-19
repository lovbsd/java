package exception1;

public class mainClass {
	public static void main(String[] args) {
		/*
		Exception : 예외		!= 에러
		
		baseball -> 1 2 3 ~ 10 -> 'A' -> 65
		
		number -> format 1 ~ 3 -> 'A'
		array -> index number [3] -> array[3]
		class -> Scanner 못찾는 경우
		file -> 없을 경우
		
		try{
		
			 예외1가 나올 수 있는 소스
			 예외2가 나올 수 있는 소스
		
		}catch(예외클래스1 e){
			메세지
		}catch(예외클래스2 e){
			메세지
		}catch(예외클래스3 e){
			메세지
		}finally{	// 생략이 가능
			// 무조건 실행
			// 뒤처리
			파일 close
			Database 원상복구 	rollback -> undo
		}			
	*/
	
	/*
	int array[] = { 1, 2, 3 };
	
	System.out.println("프로그램 시작");
	
	try {
	
		for (int i = 0; i < 4; i++) {
			System.out.println(array[i]);
		}
		
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("배열 범위 초과");
	//	e.printStackTrace();
	//	System.out.println(e.getMessage());
	//	return;
	}catch (NumberFormatException e) {
		e.printStackTrace();
	}finally {
		System.out.println("finally 무조건 실행");			
	}
			
	System.out.println("프로그램 끝");
	*/
	
	func();
	func1();

}

static void func(){		
	int array[] = { 1, 2, 3 };
	try {				
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}		
}

static void func1() throws ArrayIndexOutOfBoundsException{		
	int array[] = { 1, 2, 3 };				
	for (int i = 0; i < 3; i++) {
		System.out.println(array[i]);
		}			
	}
}