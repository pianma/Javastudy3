import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//원본파일
		String srcPath = "C:\\Users\\ITPS\\eclipse-workspace\\2021-04-05\\src\\Ex04.java";
		
		//복사파일
		String copyPath= "C:\\Users\\ITPS\\eclipse-workspace\\2021-04-05\\src\\Ex04.bak";
		try {
		
		fis = new FileInputStream(srcPath);
		fos = new FileOutputStream(copyPath);
		
		while(true) {
			int data = fis.read();
			if(data == -1) {
				break;
			}
			
			fos.write(data);
		}
	} catch(FileNotFoundException e)
	{
		System.out.println("파일을 찾지 못했습니다.");
	} catch(IOException e) {
		System.out.println("문제가 발생했습니다.");
	}
		finally {
		try {
			fis.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	}
}
