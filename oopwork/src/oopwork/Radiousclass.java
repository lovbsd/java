package oopwork;

public class Radiousclass {
	double radius;
	double area;
	double pi =(Math.PI);
	
	float wid;
	float hei;
	
	public void func() {
		 
         area = radius * radius * pi;
         System.out.println("원의 지름은: "+area);
         
	}
	public void func1() {
	
	        System.out.printf("사각형의 넓이는 %1.1f", wid * hei);
	        System.out.printf("\n사각형의 넓이는 %1.1f", (wid + hei) * 2);
	}
}
