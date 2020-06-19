package homework;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;
class mainClass {
	public static void main(String args[]) {

//3-1///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	int x,y;
//	
//	x=y=3;
//	System.out.println("x="+x);
//	System.out.println("y="+y);	
//3-2/////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//	int i=5,j=0;
//	
//	j=i++;
//	System.out.println("j=i++;실행후,i="+i+",j="+j);
//	j=5;
//	j=0;
//	
//	j=++i;
//	System.out.println("j=++i;실행후,i="+i+",j="+j);
//3-3//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	int i =5,j=5;
//	System.out.println(i++); //출력을 먼저 실행한 다음 i값이 증감
//	System.out.println(++j);
//	System.out.println("i = "+i+",j="+j);
//3-4///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//	int i =-10;
//	i=+i;
//	System.out.println(i);
//	i= -10;
//	i=-i;
//	System.out.println(i);
//3-5///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//	double d=85.4;
//	int score = (int)d;
//	System.out.println("score="+score);
//	System.out.println("d="+d);
//3-6///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		int a = 10;
//		int b = 4;
//
//		System.out.printf("%d+%d = %d%n", a, b, a + b);
//		System.out.printf("%d-%d = %d%n", a, b, a + b);
//		System.out.printf("%d*%d = %d%n", a, b, a + b);
//		System.out.printf("%d/%d = %d%n", a, b, a + b);
//		System.out.printf("%d/%f = %f%n", a, (float) b, a / (float) b);
//3-7///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		System.out.println(5 / 2);
//		System.out.println(5 / (float)2);
//3-8///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		byte a =10;
//		byte b =30;
//		byte c =(byte)(a*b);
//		System.out.println(c);
//3-9///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		int a = 1_000_000;
//		int b = 2_000_000;
//
//		long c = a + b;
//		System.out.println(c);
//3-10///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		long a= 1_000_000*1_000_000;
//		long b= 1_000_000*1_000_000L;
//		
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//3-11///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		double pi= 3.141592;
//		double shortpi = Math.round(pi* 1000)/1000.0;
//		System.out.println(shortpi);
//3-12///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		int x = 10;
//		int y = 8;
//		
//		System.out.printf("%d을 %d로 나누면,%n",x,y);
//		System.out.printf("몫은 %d,나머지는 %d입니다.",x/y,x%y);
//3-13///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		System.out.println(-10%8);
//		System.out.println(10%-8);	
//		System.out.println(-10%-8);
//3-14///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		String str1 = "abc";
//		String str2 = new String("abc");
//		
//		System.out.printf("\"abc\"==\"abc\"? %b%n","abc"=="abc");
//		System.out.printf("str1==\"abc\"? %b%n",str1=="abc");
//		System.out.printf("str2==\"abc\"? %b%n",str2=="abc");
//		System.out.printf("str1.equals(\"abc\")? %b%n",str1.equals("abc"));
//		System.out.printf("str2.equals(\"abc\")? %b%n",str2.equals("abc"));
//		System.out.printf("str2.equals(\"ABC\")? %b%n",str2.equals("ABC"));
//		System.out.printf("str2.equalsIgnoreCase(\"ABC\")?%b%n",str2.equalsIgnoreCase("ABC"));
//3-15///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		char ch = ' ';
//		System.out.println("문자를 하나 입력 하세요>");
//
//		String input = scanner.nextLine();
//		ch = input.charAt(0);
//
//		if ('0' <= ch && ch <= '9') {
//			System.out.printf("입력하신 문자는 숫자입니다%n");
//		}
//		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
//			System.out.printf("입력하신 문자는 영문자입니다");
//		}
//3-16///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		boolean b = true;
//		char ch = 'C';
//		
//		System.out.printf("b=%b%n",b);
//		System.out.printf("!b=%b%n",!b);
//		System.out.printf("!!b=%b%n",!!b);
//		System.out.printf("!!!b=%b%n",!!!b);
//		System.out.println();
//		
//		System.out.printf("ch=%c%n",ch);
//		System.out.printf("ch<'a'||ch>'z'=%b%n",ch<'a'||ch>'z');
//		System.out.printf("!('a'<=ch'&&ch<='z')=%b%n",!('a'<= ch&&ch<='z'));
//		System.out.printf(" 'a'<=ch'&&ch<='z'=%b%n",'a'<= ch&&ch<='z');
//3-17///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		int x, y, z;
//		int absX, absY, absZ;
//		char signX, signY, signZ;
//
//		x = 10;
//		y = -5;
//		z = 0;
//
//		absX = x >= 0 ? x : -x;
//		absY = y >= 0 ? y : -y;
//		absZ = z >= 0 ? z : -z;
//		signX = x > 0 ? '+' : (x == 0 ? ' ' : '-');
//		signY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
//		signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');
//
//		System.out.printf("x=%c%d%n", signX, absX);
//		System.out.printf("y=%c%d%n", signY, absY);
//		System.out.printf("z=%c%d%n", signZ, absZ);
//if문 4-1///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int score = 80;
//		if (score > 60) {
//			System.out.println("합격입니다.");
//}
//if문 4-2///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int x= 0;
//		System.out.printf("x=%d 일 때, 참인 것은 %n",x);
//		if(x==0)System.out.println("x==0");
//		if(x!=0)System.out.println("x!=0");
//		if(!(x==0))System.out.println("!(x==0)");
//		if(!(x==0))System.out.println("!(x!==0)");
//		x=1;
//		System.out.printf("x=%d일 때,참인것은 %n",x);
//		if(x==0)System.out.println("x==0");
//		if(x!=0)System.out.println("x!=0");
//		if(!(x==0))System.out.println("!(x==0)");
//		if(!(x!=0))System.out.println("!(x!=0)");
//if-else 4-3///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		System.out.printf("숫자하나를 입력하세요.");
//		int input = scanner.nextInt();
//		if(input==0) {
//			System.out.println("입력하신 숫자는 0입니다");
//		}else {
//			System.out.println("입력하신 숫자는 0이아닙니다.");
//			
//		}
//if-else if 4-4///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int score = 0;
//		char grade = ' ';
//
//		System.out.print("점수를 입력하세요.");
//		score = scanner.nextInt();
//		if (score >= 90) {
//			grade = 'A';
//		} else if (score >= 80) {
//			grade = 'B';
//		} else if (score >= 70) {
//			grade = 'C';
//		} else {
//			grade = 'D';
//		}
//		System.out.println("당신의 학점은 " + grade + "입니다.");
//if 중첩 4-5///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int score = 0;
//		char grade = ' ',opt='0';
//		
//		System.out.print("점수를 입력해주세요>");
//		
//		score = scanner.nextInt();
//		
//		System.out.printf("당신의 점수는%d입니다.%n",score);
//		
//		if(score>=90) {
//			grade= 'A';
//			if(score>=98) {
//				opt ='+';
//			}else if(score<94) {
//				opt='-';
//			}
//		}else if(score>=80) {
//			grade='B';
//		if(score>=88) {
//		opt='+';
//		}else if(score<84) {
//			opt = '-';
//		}
//		}else {
//			grade = 'C';
//		}
//		System.out.printf("당신의 학점은 %c%c입니다.%n",grade,opt);
//switch문 제약조건 4-6///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int month = scanner.nextInt();
//		
//		switch(month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("현재의 계절은봄입니다.");
//			break;
//		case 6:case 7: case 8:
//			
//			System.out.println("현재의 계절은 여름입니다.");
//			break;
//			
//		case 9:case 10:case 11:
//			System.out.println("현재의 계절은 가을 입니다.");
//			break;
//			
//			default:
//			//case 12: case 1: case 2:
//		System.out.println("현재이 계절은 겨울입니다.");	
//		}
//랜덤 숫자///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		int num = 0;
//
//		for (int i = 1; i <= 5; i++) {
//			num = (int) (Math.random() * 6) + 1;
//			System.out.println(num);
//		}
//for문 4-8///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("Hello");
//		}
//for문 4-9///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		for (int i = 1; i <= 5; i++)
//			System.out.println(i);
//
//		for (int i = 1; i <= 5; i++)
//			System.out.print(i);
//		System.out.println();
//
//for문 4-10///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int num = 0;
//		for (int i= 1;i<=5;i++) {
//		num += i;
//		System.out.printf("1부터 %2d 까지의 합: %2d%n",i,num);
//		}
//중첩for문 4-11///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		for(int i=1;i<=5;i++) {
//		for(int j=1;j<=i;j++) {
//		System.out.print("*");
//		
//	}
//		System.out.println();
//		}
//while문 4-12///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int i= 5;
//		while(i--!=0) {
//		System.out.println(i+"-I can do it");
//		}
//while문 4-13///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int sum = 0;
//		int i = 0;
//		while (sum <= 100) {
//			System.out.printf("%d - %d%n", i, sum);
//			sum += ++i;
//		}
//while문 4-14///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		int num = 0, sum = 0;
//		System.out.print("숫자를 입력하세요.(예:12345)>");
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			sum+= num%10;
//			System.out.printf("sum=%3d num=%d%n",sum,num);
//			num/=10;
//		}
//		System.out.println("각 자리수의 합: "+sum);
//do-while 4-15///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//
//		int input = 0,answer = 0;
//
//		answer = (int)(Math.random()*100)+1;
//		do { System.out.print("1과100사이의 정수를 입력하세요.>");
//		input = scanner.nextInt();
//		if(input>answer){
//			System.out.println("더작은 수로 다시 시도해보세요.");
//		}else if(input<answer){
//			System.out.println("더큰수로 다시 시도해보세요.");
//		}
//		}while(input != answer);
//		System.out.println("정답입니다.");
//break문 4-16///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		int sum = 0;
//		int i =0;
//		while(true) {
//			if(sum>100)
//				break;
//			++i;
//			sum+=i;
//			
//		}
//			System.out.println("i= "+i);
//			System.out.println("sum= "+sum);
//continue 4-17///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		for(int i=0;i<=10 ;i++) {
//			if(i%3==0)
//				continue;
//			System.out.println(i);
//		}
//break문 4-18///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int menu = 0;
//		int num = 0;
//		
//		while(true) {
//			System.out.println("(1)square");
//			System.out.println("(2)square root");
//			System.out.println("(3)log");
//			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
//			String tmp = scanner.nextLine();
//			menu= Integer.parseInt(tmp);
//			
//			if(menu==0) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}else if(!(1<= menu&& menu<=3)) {
//				System.out.println("메뉴를 잘못선택하셧습니다.(종료는0)");
//				continue;
//			}
//			System.out.println("선택하신 메뉴는 "+menu+"번입니다.");
//			
//		}
//이름 붙은 반복 4-19///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		Loop1:for(int i=2;i <=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==5)
//					break Loop1;
//				
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}
//			System.out.println();
//		}
//이름 붙은 반복4-20///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//			int menu = 0, num = 0;
//			outer:
//				while(true) {
//					System.out.println("(1)square");
//					System.out.println("(2)square root");
//					System.out.println("(3)long");
//					System.out.println("원하는 메뉴 (1~3)을 고르세요(종료:0>)");
//					
//					String tmp =scanner.nextLine();
//					menu = Integer.parseInt(tmp);
//					
//					if(menu==0) {
//						System.out.println("프로그램을 종료합니다.");
//						break;
//					}else if (!(1<=menu &&menu <=3)) {
//						System.out.println("메뉴를 잘못선택하셧습니다.(종료는: 0)");
//						continue;
//					}
//					for(;;) {
//						System.out.print("계산할 값을 입력하세요(계산 종료: 0,전체종료:99)>");
//						tmp =scanner.nextLine();
//						num=Integer.parseInt(tmp);
//						
//						if(num ==0)
//							break;
//						if(num==99)
//							break outer;
//						switch(menu) {
//						case 1:
//							System.out.println("result="+ num*num);
//							break;
//						case 2:
//							System.out.println("result="+Math.sqrt(num));
//							break;
//						case 3:
//							System.out.println("result="+Math.log(num));
//							break;
//						}
//					}
//				}
//	
//배열 출력 5-1///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//			int[] iArr1 = new int[10];
//			int[] iArr2 = new int[10];
//			int[] iArr3 = {100,95,80,70,60};
//			char[] chArr = {'a','b','c','d'};
//			
//			for(int i = 0;i<iArr1.length;i++) {
//				iArr1[i]=i+1;
//			}
//			
//			for (int i = 0; i < iArr2.length; i++) {
//				iArr2[i]=  (int)(Math.random()*10)+1;
//			}
//			for(int i=0;i<iArr1.length;i++) {
//				System.out.print(iArr1[i]+",");
//			}
//			System.out.println();
//			
//			System.out.println(Arrays.toString(iArr2));
//			System.out.println(Arrays.toString(iArr3));
//			System.out.println(Arrays.toString(chArr));
//			System.out.println(iArr3);
//			System.out.println(chArr);
//총합 평균 5-2///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int sum = 0;
//		float average = 0f;
//
//		int[] score = { 100, 88, 100,100, 90 };
//
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		average = sum / (float)score.length;
//		
//		System.out.println("총합 :"+ sum);
//		System.out.println("평균 :"+ average);
//최대 최소 5-3///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int[]score= {79,88,91,33,100,55,95};
//		
//		int max =score[0];
//		int min =score[0];
//		
//		for(int i=1;i<score.length;i++) {
//			if(score[i]>max) {
//				max = score[i];
//			}else if(score[i]<min) {
//				min=score[i];
//			}
//		}
//		System.out.println("최댓값:"+max);
//		System.out.println("최솟값:"+min);
//섞기 5-4///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//			int[] numArr = {0,1,2,3,4,5,6,7,8,9};
//			System.out.println(Arrays.toString(numArr));
//			
//			for (int i = 0; i <100; i++) {
//				int n = (int)(Math.random()*10);
//				int tmp = numArr[0];
//				numArr[0]=numArr[n];
//				numArr[n]=tmp;
//				
//			}
//			System.out.println(Arrays.toString(numArr));
//나눔로또 5-5///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		int[] ball = new int[45];
//		for (int i = 0; i < ball.length; i++) 
//			ball[i] =i+1;
//			
//			int tmp =0;
//			int j =0;
//			
//		
//		for(int i=0; i<6;i++) {
//			j= (int)(Math.random()*45);
//			tmp  = ball[i];
//			ball[i] = ball[j];
//			ball[j] = tmp;
//			
//			
//		}
//		for (int i = 0; i < 6; i++) 
//			System.out.printf("ball[%d] =%d%n ",i,ball[i]);
//배열 초기화 5-6///////////////////////////////////////////////////////////////////////////////////////////////////////////////			
//		String[] names = {"kim","park","Yi"};
//		for(int i=0;i<names.length;i++)
//			System.out.println("names["+i+"]:"+names[i]);
//		
//		String tmp = names[2];
//		System.out.println("tmp:"+tmp);
//		names[0] = "Yu";
//		
//		for(int i=0;i<names.length;i++)
//			System.out.println(names[i]);
//		
//커맨드 입력 5-7///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		System.out.println("매개변수의 개수: "+args.length);
//		for(int i=0;i<args.length;i++) {
//		System.out.println("args["+i+"]=\""+args[i]+"\"");  
//배열의 요소합계 5-8///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//			int[][]score = {
//					{100,100,100},
//					{20,20,20},
//					{30,30,30},
//					{40,40,40}		
//			};
//			int sum=0;
//			for(int i=0;i<score.length;i++) {
//				for(int j =0;j<score[i].length;j++) {
//					System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
//					
//					sum+= score[i][j];
//				}
//			}
//			System.out.println("sum= "+sum);
//과목별 총점 평균 5-9///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//			int[][] score = {
//					{100,100,100},
//					{20,20,20},
//					{30,30,30},
//					{40,40,40}
//			};
//			int korTotal = 0, engTotal = 0,mathTotal = 0;
//			
//					System.out.println("번호 국어 영어 수학 총점 평균 ");
//					System.out.println("========================");
//					
//					for(int i=0;i<score.length;i++) {
//						int sum = 0;
//						float avg =0.0f;
//						
//						korTotal +=score[i][0];
//						engTotal +=score[i][0];
//						mathTotal +=score[i][0];
//						System.out.printf("%3d",i+1);
//						
//						for(int j=0;j<score[i].length;j++) {
//							sum+=score[i][j];
//							System.out.printf("%5d",score[i][j]);
//							
//						}
//						avg = sum/(float)score[i].length;
//						System.out.printf("%5d %5.1f%n",sum,avg);
//						
//					}
//					System.out.println("============================");
//					System.out.printf("총점: %3d %4d %4d%n",korTotal,engTotal,mathTotal);
//5-10배열 비교 equals ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//				String[][] words= {
//						{"chair","의자"},
//						{"computer","컴퓨터"},
//						{"intger","정수"}
//				};
//				for(int i=0;i<words.length;i++) {
//					System.out.printf("Q%d.%s의 뜻은?",i+1,words[i][0]);
//					String tmp = scanner.nextLine();
//					
//					if(tmp.equals(words[i][1])) {
//						System.out.printf("정답입니다.%n%n");
//					}else {
//						System.out.printf("틀렸습니다.정답은 %s입니다.%n%n",words[i][1]);
//						
//					}
//				}
//함수 6-1///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		class Tv{
//			String color;
//			boolean power;
//			int channel;
//			
//			void power() {power = !power;}
//			void channelup() {++channel;}
//			void channelDown() {--channel;}
//		}
//			Tv t;
//			t= new Tv();
//			t.channel =7;
//			t.channelDown();
//			System.out.println("현재 체널은 "+t.channel+"입니다");
//	
//	}
//		}
//함수 6-2///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		class Tv{
//			String color;
//			boolean power;
//			int channel;
//			
//			void power() {power = !power;}
//			void channelup() {++channel;}
//			void channelDown() {--channel;}
//		}
//	
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
//		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");		
//		
//		t1.channel =7;
//		System.out.println("t1의 channel값을 7로 변경하였습니다");
//		
//		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
//		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
//	}
//}
//함수 6-3///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		System.out.println("Card.width = "+ Card.width);
//		System.out.println("Card.heigth = "+Card.heigth);
//		
//		Card c1 = new Card();
//		c1.kind = "Heart";
//		c1.number = 7;
//		
//		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 4;
//		
//		System.out.println("c1은"+c1.kind+","+c1.number+"이며, 크기는("+c1.width+","+ c1.heigth+")");
//		System.out.println("c2는"+c2.kind+","+c2.number+"이며, 크기는("+c2.width+","+c2.heigth+")");
//		System.out.println("c1의 width와 heigth를 각각 50,80으로 변경 합니다.");
//		c1.width=50;
//		c1.heigth =80;
//		System.out.println("c1은"+c1.kind+","+c1.number+"이며, 크기는("+c1.width+","+ c1.heigth+")");
//		System.out.println("c2는"+c2.kind+","+c2.number+"이며, 크기는("+c2.width+","+c2.heigth+")");
//		
//	}
//}
//		class Card{
//			String kind;
//			int number;
//			static int width = 100;
//			static int heigth =250;
//}
//함수 6-6///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//				
//		Data d= new Data();
//				d.x=10;
//				System.out.println("main(): x ="+d.x);
//				change( d.x);
//				System.out.println("After change(d.x)");
//				System.out.println("main():x="+d.x);
//	}
//			static void change(int x) {
//					x =1000;
//					System.out.println("기본형 change(): x= "+x);
//				}
//				
//				}
//	
//	class Data{int x;}
//함수 6-6///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		
//			Data2 d= new Data2();
//			d.x = 10;
//			System.out.println("main(): x = "+d.x);
//			
//			change(d);
//			System.out.println("After  change(d)");
//			System.out.println("main()  x="+d.x);
//	}
//	static void change (Data2 d) {
//		d.x = 10000;
//		System.out.println("참변.맴변 new 타입() change() :X = "+d.x);
//		
//	}
//}
//class Data2{int x;}
//함수 6-7///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//			Data3 d = new Data3();
//			d.x = 10;
//			
//			Data3 d2 = copy(d);
//			System.out.println("d.x = "+d.x);
//			System.out.println("d2.x - "+d2.x);
//	}
//	static Data3 copy(Data3 d) {
//		Data3 tmp = new Data3();
//		tmp.x = d.x;
//		return tmp;
//			}
//}
//class Data3{int x;}
//함수 6-8///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	System.out.println(mymath2.add(200L,100L));//1
//	System.out.println(mymath2.subreact(200L,100L));
//	System.out.println(mymath2.multiply(200L,100L));
//	System.out.println(mymath2.divide(200.0,100.0));
//	System.out.println();
//	mymath2 mm = new mymath2();
//	mm.a =300L;
//	mm.b =200L;
//	
//	System.out.println(mm.add());  // 2
//	System.out.println(mm.subreact());
//	System.out.println(mm.multiply());
//	System.out.println(mm.divide());
//	//static int qe; << 오류!!
//	
//	}
//}
//class mymath2{
//	long a=3,b=3;
//	
//	static long add(long a, long b) {return a+b;}//1
//	static long subreact(long a,long b ) {return a+b;}
//	static long multiply(long a,long b) {return a+b;}
//	static double divide(double a,double b) {return a+b;}
//
//	long add()  {return a*b;}// 2
//	long subreact() {return a*b;}
//	long multiply() {return a*b;}
//	double divide() {return a*b;}
//	
//}
//함수 6-9///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//class Buyer2{
//	int money = 1000;
//	int bonusPoint =0;
//	Product2[] cart = new Product2[10];
//	int i = 0;
//		Buyer2 b = new Buyer2();//위 정보를 가져옴
//		
//	
//	b.buy(new Tv2());
//	b.buy(new Computer2());
//	b.buy(new Audio2());
//	b.summary();
//	
//	}	
//}
//class Product2{
//	int price;
//	int bonusPoint;
//	
//	Product2(int price){
//		this.price = price;
//		bonusPoint =(int)(price/10.0);
//		
//		
//	}
//	Product2(){}
//	
//}
//class Tv2 extends Product2{
//	Tv2(){super (100);}
//	public String toString() {return "Tv";}
//}
//class Computer2 extends Product2 {
//	Computer2() {super(200);}
//	public String toString() {return "Computer";}
//	
//}
//class Audio2 extends Product2{
//	 Audio2(){super(50);}
//	 public String toString() {return "Audio";}
//}
//
//class Buyer2{
//	int money = 1000;
//	int bonusPoint =0;
//	Product2[] cart = new Product2[10];
//	int i = 0;
//	
//
//void buy(Product2 p ) {
//	if(money < p.price) {
//		System.out.println("잔액이 부족하여 물건을살수 없습니다.");
//		return;
//		
//	}
//	money -=p.price;
//	bonusPoint +=p.bonusPoint;
//	cart[i++]=p;
//	System.out.println(p+"을 구매하셧습니다");
//	
//}
//void summary() {
//	int sum = 0;
//	String itemList = "";
//	for (int i = 0; i < cart.length; i++) {
//		if(cart[i]==null)break;
//		sum += cart[i].price;
//		itemList +=cart[i]+",";
//		
//	}
//	System.out.println("구입하신 물품의 총금액은 "+sum +"만원입니다.");
//	System.out.println("구입하신 제품은 "+itemList+"입니다.");
//	
//	}
//}
	}
}