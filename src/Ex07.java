import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		FileOutputStream  fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
		//기반 스트림
			
		fos = new FileOutputStream("C:\\Users\\ITPS\\Desktop\\bos.txt");
		
		//기반 스트림에 보조 스트림을 부착
		//버퍼의 기본 사이즈는 8KB
		//버퍼의 사이즈를 5바이트로 설정
		bos = new BufferedOutputStream(fos, 5);
		
		for(char i = '1'; i<='9'; i++) {
			bos.write(i);
		}
		bos.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try{
				//보조스트림을 닫으면
				//보조스트림과 연결된 기반 스트림도 자동으로 닫힌다.
			
				bos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
