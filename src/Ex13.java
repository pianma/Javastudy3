import java.io.File;
import java.io.IOException;

public class Ex13 {
	public static void main(String[] args) {
		File file = new File("src\\test1 .java");
		
		//exist->���� ���翩�� Ȯ�� /���� - true, ����x - false
		//isFile -> �ش� ��ü�� ���� �ִ� ������ ������ ������� true, ���丮�� ������� false
 		if(file.exists() == false || file.isFile() == false) {
			System.out.println("���������ʰų� ������ �ƴմϴ�.");
			
			System.out.println("�ش� ��ο� ������ �����մϴ�.");
			
			try {
				boolean result = file.createNewFile();
				if(result) {
					System.out.println("������ �����߽��ϴ�.");
				}else {
					System.out.println("������ �������� ���߽��ϴ�.");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}else {
			System.out.println("�����մϴ�.");
		}
	}
}
