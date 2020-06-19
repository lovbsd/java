package main;

public class mainClass {
	public static void main(String[] args) {
		/*
		Robot[] arr = { 
					new DanceRobot(), 
					new SingRobot(), 
					new DrawRobot()
		};
		for(int i=0; i< arr.length;i++)
			action(arr[i]);
			
		*/
		
		Object[] arr = {
			new DanceRobot(),
			new SingRobot(),
			new DrawRobot()
		};	
		
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
		
	}
	public static void action(Object obj) {
		if(obj instanceof DanceRobot) {
			((DanceRobot)obj).dance();
		}
		else if(obj instanceof SingRobot) {
			SingRobot s = (SingRobot)obj;
			s.sing();
		}
		else if(obj instanceof DrawRobot) {
			DrawRobot d = (DrawRobot)obj;
			d.draw();
		}
	}
	

}


//class Robot {}

class DanceRobot  {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot  {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot  {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

