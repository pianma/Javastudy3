import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//��������
		String srcPath = "C:\\Users\\ITPS\\eclipse-workspace\\2021-04-05\\src\\Ex04.java";
		
		//��������
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
		System.out.println("������ ã�� ���߽��ϴ�.");
	} catch(IOException e) {
		System.out.println("������ �߻��߽��ϴ�.");
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
