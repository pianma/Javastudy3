import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args)  {
		//���ڸ� ���ڿ��� �������ָ� ���ڷ� ���޹��� ��ο� �ִ� ���ϰ� ��Ʈ���� ����
		//������ : �ֻ��� ��θ� ������ ������ ��ġ / �ֻ��� ��κ��� �ش� ��ġ���� ������ ã��
		//���� ��� :C:\Users\ITPS\eclipse-workspace\2021-04-05\src\Ex03.java
		//����� : �ֻ��� ��θ� ������ ������ ��ġ / ���� ���α׷��� ����Ǵ� ��ġ���� �ش� ��ġ���� ������ ã��
		
		
		FileInputStream fis = null;
		
		try {
			String path = "C:\\Users\\ITPS\\eclipse-workspace\\2021-04-05\\src\\Ex03.java";
			fis = new FileInputStream(path);
			
		 while(true) {
			 int data = fis.read();
			 if(data == -1) {
				 break;
			 }
			 
			 char c = (char) data;
			 System.out.println(c);
			 
		 }
		fis.close();
	   } catch(FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} catch(IOException e) {
			System.out.println("��Ʈ���� �ݴ� ���� ������ �߻��߽��ϴ�.");
		}
		
		System.out.println("���α׷� ��");
	}

}
