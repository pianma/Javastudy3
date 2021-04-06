import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		FileOutputStream  fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
		//��� ��Ʈ��
			
		fos = new FileOutputStream("C:\\Users\\ITPS\\Desktop\\bos.txt");
		
		//��� ��Ʈ���� ���� ��Ʈ���� ����
		//������ �⺻ ������� 8KB
		//������ ����� 5����Ʈ�� ����
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
				//������Ʈ���� ������
				//������Ʈ���� ����� ��� ��Ʈ���� �ڵ����� ������.
			
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
