import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
		fr = new FileReader("Ex10.java");
		br = new BufferedReader(fr);
		
		String line = "";
		for(int i = 1 ; line != null; i++) {
			line = br.readLine()	;
			
			System.out.println(i + " : " + line);
			
		}
	}catch(FileNotFoundException e ) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	}
}
