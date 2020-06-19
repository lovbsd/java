package oopwork;

public class mainClass {
public static void main(String[] args) {

	
		/*
			원 넓이를 구할 수 있는 class
				입력 -> 출력
			
			직사각형의 넓이를 구할 수 있는 class	
						 	
			1. random -> 30 ~ 100			
			2. userInput -> 1 ~ 15				
			3. random number - user number			
			4. game over
		*/
		MyGame game = new MyGame();
		game.init();
		game.gamePlay();
		game.result();
		
		

	}
}



	
