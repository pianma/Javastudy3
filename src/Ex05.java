import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		
		try {
		fos = new FileOutputStream("C:\\Users\\ITPS\\Desktop\\output.txt", true);
		
		//�ػ� ��Ʈ���� ����� ���Ͽ� a~z���� �����ϼ���.
		for(byte i = 'A'; i<='Z'; i++) {
			fos.write(i);
			
		}
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}
		finally {
		try {
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}//end try
	}//end try
	}
}
