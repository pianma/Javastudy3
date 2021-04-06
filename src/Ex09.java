import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		String src = "C:\\Users\\ITPS\\Desktop\\test.txt";
		String copy = "C:\\Users\\ITPS\\Desktop\\copy.txt";
		
		try {
			
			fr = new FileReader(src);
			fw = new FileWriter(copy);
			
			while(true) {
				int data = fr.read();
				if(data == -1) {
					break;
				}
				char c = (char)data;
				if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
					fw.write(data);
				}
				fw.write(data);
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			try {
				fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		 
	}

}
