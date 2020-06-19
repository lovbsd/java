package filewritClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mainClass {
public static void main(String[] args) throws IOException {
	// file write
	File file = new File("/Users/simseongbo/Desktop/java1/fileClass1/src/temp1/test1.txt");
	
	//한문자씩 쓰기
	/*
	FileWriter fw = new FileWriter(file);// (file,  ); false 가생략됨
	fw.write("안녕하세요"+"\n");
	fw.close();
	*/
	//추가 쓰기
	/*
	FileWriter fw = new FileWriter(file,true);
	fw.write("건강하세요"+"\n");
	fw.close();
	*/
	
	FileWriter fWriter = new FileWriter(file);// 파일 포인터 설정
	BufferedWriter bw = new BufferedWriter(fWriter);// 문장으로
	PrintWriter pw = new PrintWriter(bw);
	
	pw.print("안녕"+"\n");
	pw.println("hi  hi");
	pw.println("건강하세요");
	
	pw.close();// 꼭 마무리를 해주어야한다.!!!
	}
}
