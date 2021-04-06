import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
		fr = new FileReader("Ex11. java");
		br = new BufferedReader(fr);
		
		fw = new FileWriter("Ex11.bak");
		bw = new BufferedWriter(fw);
		
		String line = "";
		for(int i=1; line != null; i++) {
			//line -> 입력 스트림에서 읽어온 한 줄의 문자열이 있음
			line = br.readLine();
			
			//line 변수 내 import 문자열이 포함되어있는지 체크
			//indexOf 메서드 -> 매개변수로 전달한 문자열이 해당 객체 내 어느 위쳉 존재하는지 알려주는 메서드
			//매개변수로 전달한 문자열이 존재한다 -> 0이상의 값을 바환/ 매개변수로 전달한 문자열의 인덱스 번호
			//매개변수로 전달한 문자열이 존재하지않는다 -> -1 반환
			
			bw.write(i + " : " + line);
		}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}try {
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	}
}
