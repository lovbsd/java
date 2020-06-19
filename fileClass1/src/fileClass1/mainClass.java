package fileClass1;

import java.io.File;
import java.io.IOException;

public class mainClass {
	public static void main(String[] args) {
		
		/*
			Code -> logic(구현)
					기능적: file, database
					
			저장매체 : 파일, DB
					 이름		나이		주소	
					홍길동	24		서울시	->  write, read      
			목적 : 데이터의 저장, 불러오기
			
			*.txt	
			.jpg, .dll, .lib, .jar, .png
			
			.dll(Dynamic Link Library)	- 동적
			.lib						- 정적(static)
				-> jar
		*/	
		
		
		/*
		// 파일 목록
		File fdir = new File("c:\\");
				
		String filelist[] = fdir.list();
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
		*/
		
		// 파일, 폴더, 그외의 것
		File fdir = new File("/Users/simseongbo/Desktop/java1/fileClass1/src/temp1/test1.txt");		
		File filelist[] = fdir.listFiles();
		for (int i = 0; i < filelist.length; i++) {			
			if(filelist[i].isFile()) {
				System.out.println("[파일]" + filelist[i].getName());				
			}
			else if(filelist[i].isDirectory()) {
				System.out.println("[폴더]" + filelist[i].getName());				
			}
			else {
				System.out.println("[?]" + filelist[i].getName());
			}			
		}
		
		// 파일 생성
		String fileStr = "d:\\tmp\\newfile.txt";		
		File newfile = new File(fileStr);
		
		try {
			if(newfile.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}else {
				System.out.println("파일 생성 실패!");
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일의 존재 여부
		if(newfile.exists()) {
			System.out.println("파일이 존재합니다");
		}else {
			System.out.println("파일이 존재하지 않습니다");
		}
		
		/*
		if(newfile.delete()) {
			System.out.println("파일을 삭제하였습니다");
		}else {
			System.out.println("파일을 삭제하지 못했습니다");
		}
		*/
		
		// 읽기 가능?
		if(newfile.canRead()) {
			System.out.println("파일을 읽을 수 있습니다");
		}else {
			System.out.println("파일을 읽을 수 없습니다");
		}
		
		// 읽기 전용
		newfile.setReadOnly();
		
		// 쓰기 가능?
		if(newfile.canWrite()) {
			System.out.println("파일 쓰기가 가능합니다 ");
		}else {
			System.out.println("파일 쓰기가 불가능합니다 ");
		}
		

	}

}
