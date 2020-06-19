package cls.cc;

public class abc {
	public static void main(String[] args) {
		Car mycar = new Car();
		System.out.println(mycar.getSpeed());
		
		mycar.setSpeed(100);
		System.out.println(mycar.getSpeed());
		
		mycar.getSpeed();
		
		mycar.abc(true);
		System.out.println(mycar.abc(false));
		
		int ab = a();
		System.out.println(ab);
		System.out.println();
	}
	public static int a() {
		return 1231230;
	}
}


class Car{
	private int speed;
	
	public int getSpeed() {
		
		return this.speed;
	}
	public	int setSpeed(int s) {
		this.speed = s;
		return s;
	}
	public boolean abc(boolean bc) {
		boolean b = bc;
		return b;
	}
}