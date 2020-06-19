package dao;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;

// Data Access Object	= model == back end
public class MemberDao {
	
	Scanner sc = new Scanner(System.in);
	
	// 배열
	//private Pitcher pitcher[];
	//private Batter batter[];
	private Human human[];
	
	private int memberNumber;
	private int memberCount;
	
	public MemberDao() {
		human = new Human[20];	// 변수 20개 생성
		 
		human[0] = new Pitcher(1000, "홍길동", 24, 172.1, 10, 3, 0.12);
		human[1] = new Batter(2001, "일지매", 21, 182.4, 25, 12, 0.345);
		human[2] = new Batter(2002, "정수동", 26, 174.2, 18, 5, 0.253);
		
		// human = new Human();	// 객체 생성
		
		memberNumber = 1000;
		memberCount = 0;
	}	
	public void insert() {	
		// 투수/타자 ?
		System.out.print("투수(1)/타자(2) = ");
		int pos = sc.nextInt();
		
		// human
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		Human h = null;	
		// 투수	1000 ~ 
		if(pos == 1) {
			// win
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			// lose
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			// defense
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			h = new Pitcher(memberNumber, name, age, height, win, lose, defence);
			
		}		
		// 타자  2000 ~ 
		else if(pos == 2) {
			
			Batter bat = new Batter();
			
			// 선수 등록 번호
			bat.setNumber(memberNumber + 1000);
			bat.setName(name);
			bat.setAge(age);
			bat.setHeight(height);			
						
			// 타수
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			bat.setBatcount(batcount);
						
			// 안타수
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			bat.setHit(hit);
			
			// 타율
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			bat.setHitAvg(hitAvg);
			
			h = bat;
		}		
		
		human[memberCount] = h;
		
		memberNumber++;
		memberCount++;		
	}	
	
	public void delete() {
		
		System.out.print("삭제하고 싶은 선수명 입력 = ");
		String name = sc.next();
		
		if(name.equals("")) {
			System.out.println("이름을 정확히 입력해 주십시오.");
			return;		// continue
		}
		
		int findIndex = search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다. 삭제할 수 없습니다");
			return;
		}
		
		// 삭제
		if(human[findIndex] instanceof Pitcher) {
			Pitcher p = (Pitcher)human[findIndex];
			p.setNumber(0);
			p.setName("");
			p.setAge(0);
			p.setHeight(0.0);
			p.setWin(0);
			p.setLose(0);
			p.setDefence(0.0);
		}
		else if(human[findIndex] instanceof Batter) {
			Batter b = (Batter)human[findIndex];
			b.allClean();
		}		
	}	
		
	public void select() {		
		System.out.print("검색하고 싶은 선수명 = ");
		String name = sc.next();
		
		int findIndex = search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다.");
		}
		else {
			System.out.println("번호:" + human[findIndex].getNumber());
			System.out.println("이름:" + human[findIndex].getName());
			System.out.println("나이:" + human[findIndex].getAge());
			System.out.println("신장:" + human[findIndex].getHeight());
			
			if(human[findIndex] instanceof Pitcher) {
				System.out.println("승리:" + ((Pitcher)human[findIndex]).getWin() );
				System.out.println("패전:" + ((Pitcher)human[findIndex]).getLose() );
				System.out.println("방어율:" + ((Pitcher)human[findIndex]).getDefence() );
			}
			else if(human[findIndex] instanceof Batter) {
				System.out.println("타수:" + ((Batter)human[findIndex]).getBatcount() );
				System.out.println("안타수:" + ((Batter)human[findIndex]).getHit() );
				System.out.println("타율:" + ((Batter)human[findIndex]).getHitAvg() );
			}
		}		
	}	
	
	public void update() {		
		System.out.print("수정하고 싶은 선수명 = ");
		String name = sc.next();
		
		int findIndex = search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다.");
			return;
		}
		
		if(human[findIndex] instanceof Pitcher) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			Pitcher pit = (Pitcher)human[findIndex];
			pit.setWin(win);
			pit.setLose(lose);
			pit.setDefence(defence);			
		}
		else if(human[findIndex] instanceof Batter) {
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			Batter bat = (Batter)human[findIndex];
			bat.setBatcount(batcount);
			bat.setHit(hit);
			bat.setHitAvg(hitAvg);			
		}		
	}
	
	
	
	public void allprint() {	
		
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				System.out.println(human[i].toString());				
			}
		}		
	}	
	
	public int search(String name) {
		int index = -1;
		
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				if(name.equals(human[i].getName())) {
					index = i;
					break;
				}
			}
		}
		return index;
	}
	

}









