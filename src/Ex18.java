import java.io.File;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("===== [ ���� ] =====");
		System.out.println("��� : (���͸� �Ǵ� ������ ��� �Է�)");
		System.out.println("Ȯ���� : (ã�����ϴ� ������ Ȯ����)");
		System.out.println("���α׷� ���� -> exit �Է�");
		
		while(true) {
			System.out.println("��� : ");
			String path = scanf.next();
			
			System.out.println("Ȯ���� : ");
			String extension = scanf.next();
			
			if(path.equals("exit")){
				System.out.println("���α׷� ����");
				break;
			}
			File file = new File(path);
			File[] files = file.listFiles();
			
			int findCount = findFile(files, extension);
			System.out.println(file.getAbsolutePath() + "����" + extension + "Ȯ���ڸ� ���� ������" + findCount + "�� ã�ҽ��ϴ�.");
		
		}//end while
	}//end main
	public static int findFile(File[] files, String extension) {
		int findCount = 0;
		
		for(File f : files) {
			if(f.isFile()) {
				String filename = f.getName();
				
				int lastDotIndex = filename.lastIndexOf('.');
				String fileExtension = filename.substring(lastDotIndex+1);
				
				if(fileExtension.equals(extension)) {
					findCount++;
					System.out.println(f.getAbsolutePath());
				}
			}//end if
		}// end for
	return findCount;
	}
	
}
