package main;

import myclass.TV;
import student.Student;

public class mainClass {

	public static void main(String[] args) {
		/*
		  Object Oriented Programming
		  
		    처리 중심 -> 설계 중심
		  
		  
		 */
		
		/*
		// TV -> 2대
		String name[] = new String[9];	// 삼성, LG
		int channel[] = new int[9];		// 채널
		boolean power[] = new boolean[9];	// on/off
		int movie[] = new int[9];
		// String title[] = new STring[10];
		
		name[0] = "삼성";
		name[1] = "LG";
		
		channel[0] = 11;
		channel[1] = 23;
		
		power[0] = true;
		power[1] = false;
				
		power[1] = true;
		
		power[0] = false;
		power[1] = false;
		*/
		
		/*
			class MyClass{	class 설계
				변수(member) - 접근지정(외부, 내부)
				
				함수(메소드) - 처리			
			
			}
			
			클래스명 변수(instance) = new 클래스명();
			MyClass cls = new MyClass();
				    stack	  heap			
				    
			MyClass cls = null; -> (0)	    		    	
		*/		
		
		/*
		TV tv1 = new TV();		// tv1 -> instance(주체): 메모리상에 존재하는 요소 
		tv1.getInput("LG", 11, true);
		tv1.method();
		
		TV tv2 = new TV();		// tv2 -> object라고도 한다.
		tv2.getInput("삼성", 23, false);
		tv2.method();
		
		// 배열만을 동적할당
		TV arrTv[] = new TV[3];	// TV arrTv1, arrTv2, arrTv3;		
		
		// 객체를 동적할당
		for (int i = 0; i < arrTv.length; i++) {
			arrTv[i] = new TV();
		}		
		
		arrTv[0].getInput("aaa", 1, true);
		arrTv[1].getInput("bbb", 2, true);
		arrTv[2].getInput("ccc", 3, true);
		
		arrTv[1].setPower(false);
		arrTv[2].setPower(false);
		
		for (int i = 0; i < arrTv.length; i++) {
			arrTv[i].method();
		}
		*/
		
		String student1[][] = {
				{ "홍길동", "24", "98", "100" },	// 0
				{ "일지매", "21", "80", "90" },	// 1
				{ "임꺽정", "27", "70", "100" },	// 2
		};		// 0        1     2     3	
		
		Student student2 = new Student();
		student2.setName("홍길동");
		student2.setAge(24);
		student2.setEng(90);
		student2.setMath(100);
		
		Student student3 = new Student();
		student3.setName("홍길동");
		student3.setAge(24);
		student3.setEng(90);
		student3.setMath(100);
		
		
		
	}

}








