import java.io.File;

public class Ex12 {

	public static void main(String[] args) {
		//�����
//		String path ="src\\";
		File dir = new File("src\\");
		String fileName = "Ex12.java";
		
		File file = new File(dir, fileName);
		
		//position -> .�� ��ġ�� �˷��޶�
		int position = fileName.lastIndexOf(".");
		
		System.out.println("��θ� ������ �����̸� - " + fileName);
		//substring -> ���ڿ��� �߶��ִ� �޼���
		System.out.println("Ȯ���ڸ� ������ ���� �̸� - " + fileName.substring(0, position));
		System.out.println("Ȯ���� - " + fileName.substring(position+1));
		System.out.println();
		
		System.out.println("��θ� ������ ���� �̸� - " + file.getPath());
		System.out.println("������ ���� ��� - " + file.getAbsolutePath());
		System.out.println("������ ���� �ִ� ���丮 - " + file.getParent());
		System.out.println();
		
		System.out.println("user.dir - " + System.getProperty("user.dir"));
		
		
	}

}
