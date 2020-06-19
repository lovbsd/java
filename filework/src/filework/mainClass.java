package filework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) throws Exception {

		File file = new File("/Users/simseongbo/Desktop/java1/fileClass1/src/temp1/test1.txt");
		/*
		 * write 함수 String arrAtr[] = { "Hello", "안녕하세요", "Hi" }; 파일명.txt 저장되는 함수
		 * 
		 * read 함수 String strArr[]; [0] <- "Hello" [1] <- "안녕하세요" [2] <- "Hi"
		 */

		// 문자열
		String arrStr[] = { "Hello World", "안녕하세요", "Happy day", "Nice Day", "나는 문제없어" };

		boolean b = dataSave(file, arrStr);
		if (b) {
			System.out.println("성공적으로 파일에 데이터가 저장되었습니다");
		} else {
			System.out.println("파일에 데이터가 저장되지 않았습니다");
		}

		String arrayStr[] = dataLoad(file);
		for (int i = 0; i < arrayStr.length; i++) {
			System.out.println(arrayStr[i]);
		}

	}

	static boolean dataSave(File f, String datas[]) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter( new FileWriter(f)));

			for (int i = 0; i < datas.length; i++) {
				pw.println(datas[i]);
			}
			pw.close();

		} catch (IOException e) {
			// System.out.println("파일에 데이터가 저장되지 않았습니다");
			return false;
		}

		// System.out.println("성공적으로 파일에 데이터가 저장되었습니다");
		return true;
	}

	static String[] dataLoad(File f) {
		String str[] = null;
		try {
			FileReader fr = new FileReader(f);

			// 데이터를 카운터 (몇개?)
			int count = 0;
			String s;
			BufferedReader br = new BufferedReader(fr);
			while ((s = br.readLine()) != null) {
				count++;
			}
			br.close();

			// 배열을 셋팅
			str = new String[count];

			// 읽고 데이터를 저장
			int i = 0;
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			while ((s = br.readLine()) != null) {
				str[i] = s;
				i++;
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

}
