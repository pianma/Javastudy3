import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		//fis, fr - 입력 스트림
		//fis - 바이트 기반 입력 스트림
		//fr - 문자 기반 입력 스트림
		
		FileInputStream fis = null;
		FileReader fr = null;
		
		String fileName = "C:\\Users\\ITPS\\Desktop\\test.txt";
		
		try {
		fis = new FileInputStream(fileName);
		fr = new FileReader(fileName);
		
		
		
		while(true) {
			int data = fis.read();
			if(data == -1) {
				break;
			}
			
			System.out.print((char) data );
		}
		
		while(true) {
			int data = fr.read();
			if(data == -1) {
				break;
			}
			System.out.print((char) data);
		}
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			try {
			fis.close();
		}catch(IOException e ) {
			e.printStackTrace();
			
		}
		
		
		}   
	}

}
