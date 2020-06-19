package fileReadClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class mainClass {
public static void main(String[] args)throws Exception {
	// file read
	
	File file = new File("/Users/simseongbo/Desktop/java1/fileClass1/src/temp1/test1.txt");	
	
//	try {
		
		FileReader fr = new FileReader(file);
		
		/*
		String str = "";
		// 한문자씩 읽어 들인다			
		int c = fr.read();
		while(c != -1) {	// -1 == 파일의 끝
			System.out.println((char)c);
			str = str + (char)c;
			c = fr.read();
		}
		
		System.out.println(str);
		*/
		
		// 문장으로 읽어 들인다	buffer == 저장공간
		BufferedReader br = new BufferedReader(fr);
		
	//	String str = br.readLine();
		String str;
		while((str = br.readLine()) != null) {
			System.out.println( str );
	//		str = br.readLine();
		}
		
		br.close();
		
/*		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/

}

}


