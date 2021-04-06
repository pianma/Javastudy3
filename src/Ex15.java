import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Ex15 {
	public static Map<String, Integer> printFileLlist(File dir){
		//listFiles -> �� ��ü(dir)�� ���� �ִ� ���͸��� ������ ���
		File[]	files = dir.listFiles();
		
		
		//�� ��ü �� ���͸��� ��
		int dirNum = 0;
		//�� ��ü �� ������ ��
		int fileNum = 0;
		
		for(int i=0; i<files.length; i++) {
			File file = files[i];
			String filename = file.getName();
			
			if(file.isDirectory()) {
				filename = "[" + filename + "]";
				dirNum++;
			}else {
				fileNum++;
			}
			System.out.println(filename);
		}
		
		Map<String, Integer> count = new HashMap<>();
		count.put("fileNum" , fileNum);
		count.put("dirNum", dirNum);
		
		return count;
	}
	public static void main(String[] args) {
		File dir = new File("src\\");
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���͸� �Դϴ�.");
			//exit -> ���α׷����� / ���������� ������ �ƴ�..��������
			System.exit(0);
		}
		System.out.println(dir.getAbsolutePath()+ "���͸�");
		Map<String, Integer> count = printFileLlist(dir);
		
		System.out.println("�� " + count.get("fileNum") + "���� ����");
		System.out.println("�� " + count.get("dirNum") + "���� ���͸�");
	}
}
