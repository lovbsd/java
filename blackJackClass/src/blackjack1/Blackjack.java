package blackjack1;

import java.util.Scanner;

//hit
//
//처음 두장의 상태에서 카드를 더뽑는 것 합산 21 점이 되지않는한 갯수에 상관없이 얼마든지 원하는 만큼
//A= 1,11 (J Q K 10)
//
//stand(stay) 
//
//카드를 더뽑지않고 차례를 마치는 것을 스텐드 언제든 멈출수있다.while?
//
//splitx
//
//처음 받은 2장의 카드가 같은 숫자일 경우 패를 두 개로 나누어 게임을 동시에 두번 할수있다.
//이후 또 똑같은 수가 나오면  계속해서 스플릿 가능 대부분 88,99,AA때 사용
//
// double downx
//
//돈을 두배로 건다 본래 합이 21이넘지않는 한 (무제한으로 뽑을수있는 카드를) 이후 단하나만 더받는 조건
//
//bust
//
//카드 총합이 21이 넘는경우 흐름에관계없이 패배 배당금 뺏김
//
//blackJack!
//
//Aec 한장과 10에 해당하는 패(10,J,Q,K)로 21을 이루는것 A,10 패를 스플릿해서 A+10나오면 일반21 
//
//딜러규칙 - 16이하면 모조건hit 17이상이면 모조건stay
//A=11 
public class Blackjack {
	private int real[] = new int[52];
	private boolean w;
	private boolean swit[] = new boolean[52];
	private int number[] = new int[52];
	private int userarray[] = new int[52];
	private int comarray[] = new int[52];
	private int ran;
	private int user;
	private int reset;
	private int cardPic;
	private int temp;
	private int cardNum;
	
	public void isRandom() {
		int w;
		w= 0;
		while(w<52) {
		ran = (int)(Math.random()* 52);
		if(swit[ran]==false) {
			swit[ran] = true;
			number[w] = ran+1;
			w++;
			}
		}for (int i = 0; i < number.length; i++) {
			System.out.println(i+"번째  난수"+number[i]);
			
		}
	}
	public void userplayer() {
	boolean w; 
	w = false; 
		for (int i = 0; i < 2; i++) {
			userarray[i]=number[i];
				number[i]=0;
				System.out.println(i+"번째"+userarray[i]);
				System.out.println(i+"번째"+number[i]);
				System.out.println();
				}
		if(number[0]==0)
		{for (int j = 0; j < number.length-2; j++) {
			number[j]=number[j+2];
			System.out.println(j+" "+number[j]+" "+number[j+1]);}
					
				}
		
			}
	public void complayer() {
		boolean w; 
		w = false; 
			for (int i = 0; i < 2; i++) {
				comarray[i]=number[i];
					number[i]=0;
					System.out.println(i+"번째"+comarray[i]);
					System.out.println(i+"번째"+number[i]);
					System.out.println();
					}
			if(number[1]==0)
			{for (int j = 0; j < number.length-2; j++) {
				number[j]=number[j+2];
				System.out.println(j+" "+number[j]+" "+number[j+1]);}
						
					}
			
				}
	public void start() {
		for (int i = 0; i < number.length; i++) {
			cardNum=number[i] % 13+1;
		
			number[i]=cardNum;
			if(cardNum == 1) {		// A
				System.out.print("card number:" + number[i] + ", " + "A");
			}else if(cardNum == 11) {	// J
				sic();
				System.out.print("card number:" + number[i] + ", " + "J");
			}else if(cardNum == 12) {
				number[i]-=2;    // Q
				System.out.print("card number:" + number[i] + ", " + "Q");
			}else if(cardNum == 13) {
				number[i]-=3;	// K
				System.out.print("card number:" + number[i] + ", " + "K");
			}else {	// 그 외의 수
				System.out.print("card number:" + number[i] + ", " + cardNum);
				}	
		
			System.out.println(i+"번 "+real[i]);
				
				cardPic=number[i] / 13;
			
			switch(cardPic) {
				case 0:
					System.out.println(",♠︎");
					break;
				case 1:
					System.out.println(",♦︎");
					break;
				case 2:
					System.out.println(",♥︎");
					break;
				case 3:
					System.out.println(",♣︎");
					break;			
					}	
				}
			}
		
	private void sic() {
		int w=0,r;
		while (w < 51) {
			if (swit[cardNum] == false) {
				swit[cardNum] = true; // 00100 00000
				real[w]	=(number[w]-1); 
				
				System.out.println("랜덤값:" + w);
				System.out.println("중복값인지확인:" + swit[w]);
				w++;
			}
		
	}
	}

	
	 private  void hit() {
		 
	 }

	private void stay() {

	}

	private void split() {

	}

	private void doubledown() {

	}

	private void bust() {

	}

	private void blackJack() {

	}
	
}