package main;

import dao.MemberDao;

public class MainClass {

	public static void main(String[] args) {		 
		
		MemberDao dao = new MemberDao();
		
		// menu 구성	== front end -> View
				
		// 1. 선수 추가
				
		dao.allprint();
		
		// dao.delete();
		
		// dao.allprint();
		
		// dao.select();
		
		dao.update();
		
		dao.allprint();
		
	}

}











