import java.io.File;

public class Ex14 {

	public static void main(String[] args) {
		File file = new File("src\\test\\");
		
		if(!file.exists() || !file.isDirectory()) {
			System.out.println("�������� �ʰų� ���͸��� �ƴմϴ�.");
			
			System.out.println("�ִ� ��ο� ���͸��� �����մϴ�.");
			
			//mkdir -> make directory
			//�츮�� ������ ������ ���丮�� �����ϴ� �޼���
			file.mkdir();
			//������ ��� �� �������� �ʴ� ���丮���� �� ������ ���ִ� �޼���
			file.mkdirs();
		}else {
			System.out.println("�����մϴ�.");
		}

	}

}
