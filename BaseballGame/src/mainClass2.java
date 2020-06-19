import java.util.Scanner;

public class mainClass2 {

	public static void main(String[] args) {
		/*
			Baseball
			random number -> 3개		r1 != r2 != r3
			user number -> 3개
	
			비교
			메시지 출력 ?Strike ?Ball
			
			play again
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int r_num[] = new int[3];
		int u_num[] = new int[3];	// 10개 (1 ~ 10) - 00000 00000 -> 01000 00000
		boolean clear;
		
		boolean swit[] = new boolean[10];
				
		for (int i = 0; i < swit.length; i++) {
			swit[i] = false;	// 00000 00000
		}
		clear = false;
		
		int r, w;		
		w = 0; 
				
		while(w < 3) {
			r = (int)(Math.random() * 10);	// 0 ~ 9
			if(swit[r] == false) {
				swit[r] = true;		// 00100 00000
				r_num[w] = r + 1;			// 1 ~ 10
				w++;
			}
		}
		
		for (int i = 0; i < r_num.length; i++) {
			System.out.println(i + " : " + r_num[i]);
		}
		
		// Debug != 에러   
		// 실시간
		// break pointer
		
		/*
		while(true) {
			
			//r_num[0] = (int)(Math.random() * 10) + 1; 
			//r_num[1] = (int)(Math.random() * 10) + 1; 
			//r_num[2] = (int)(Math.random() * 10) + 1; 
			
			for (int i = 0; i < r_num.length; i++) {
				r_num[i] = (int)(Math.random() * 10) + 1; 
			}
			
			if(r_num[0] != r_num[1] 
					&& r_num[0] != r_num[2]
							&& r_num[1] != r_num[2]) {
				break;
			}
		}
		*/		
				
		/////////////////// loop 10
		w = 0;
		int strike, ball;
		while(w < 10) {
			
			// user input  u1 != u2 != u3
			boolean check;
			int w1;
			while(true) {
				check = false;
				w1 = 0;
				while(w1 < 3) {
					System.out.print((w1 + 1) + "번째 수 = ");
					u_num[w1] = sc.nextInt();
					w1++;
				}
				
				// 같은 숫자가 있는지 첵크
				out:for (int i = 0; i < u_num.length; i++) {
					for (int j = 0; j < u_num.length; j++) {
						if(u_num[i] == u_num[j] && i != j) {
							check = true;	// 입력한 같은 숫자가 있음 
							break out; 
						}
					}
				}
				
				if(check == false) {
					break;
				}				
				System.out.println("입력한 숫자 중에 중복되는 숫자가 있습니다. 다시 입력해 주십시오");
			}			
			
			// process(비교)
			strike = ball = 0;
			// ball
			for (int i = 0; i < u_num.length; i++) {
				for (int j = 0; j < r_num.length; j++) {
					if(u_num[i] == r_num[j] && i != j) {
						ball++;
					}					
				}
			}
			// strike
			for (int i = 0; i < u_num.length; i++) {
				if(u_num[i] == r_num[i]) {
					strike++;
				}
			}
			// 탈출
			if(strike > 2) {
				clear = true;
				break;						
			}
			
			// 메시지 출력
			System.out.println(strike + "스트라이크, " + ball + "볼 입니다");
						
			w++;
		}	
		
		if(clear) {
			System.out.println("Game Clear!!");
		}else {
			System.out.println("Game Over~ ");
		}

	}

}