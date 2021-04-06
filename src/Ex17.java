import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex17 {
	public static final char sortOptionList[] = {'t', 'T', 'l', 'L', 'n', 'N'};
	
	public static boolean isOrtOption(char sortOption) {
		for(char option : sortOptionList) {
			if(option == sortOption) {
				return true;
			}//end if
		}//end for
	}
	
	public static void sortFileList(File[] files, char option) {
		if(option == 't') {
			//�ð� �������� ����
			for(int i=0; i<files.length; i++) {
				for(int j=files.length-1; j>i; j--) {
					File forward = files[j-1];
					File backward = files[j];
					
					long forwardLastModified = forward.lastModified();
					long backwardLastModified = backward.lastModified();
					
					if(forwardLastModified > backwardLastModified) {
						File temp = files[j-1];
						files [j-1] = files[j];
						files [j] = temp;
					}
				}//end for j
			}//end for i
		}//end if
	}
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("===== [����] =====");
		System.out.println("��� : (���͸� �Ǵ� ������ ��� �Է�)");
		System.out.println("���� : (���� �ܾ�)");
		System.out.println("��t:�ð� �������� ����");
		System.out.println("��T:�ð� �������� ����");
		System.out.println("��l:ũ�� �������� ����");
		System.out.println("��L:ũ�� �������� ����");
		System.out.println("��n:�̸� �������� ����");
		System.out.println("��N:�̸� �������� ����");
		System.out.println("���α׷��� �����Ϸ��� ��ο� exit�� �Է��ϼ���.");
		
		
		while(true) {
			System.out.println("��� : ");
			String path = scanf.next();
			
			System.out.println("���� : ");
			char sort = scanf.next().charAt(0);
			
			if(path.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			File file = new File(path);
			File[]	 files = file.listFiles();
			
			System.out.println("������");
			for(File f : files) {
				String name = f.getName();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
				// lastModified ->������������¥
				String lastModified = sdf.format(new Date(f.lastModified()));
				String attribute = "DIR";
				long size = f.length();
				
				if(f.isFile()) {
					attribute = f.canRead() ? "R" : "  ";
					attribute = f.canWrite() ? "W" : "  ";
					attribute = f.isHidden() ? "H" : "  ";
				}
				
				System.out.printf("%s %3s %6s %s\n", lastModified, attribute, size, name);
			
			}//end for
			
			sortFileList(files, sort);
			for(File f : files) {
				String name = f.getName();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
				// lastModified ->������������¥
				String lastModified = sdf.format(new Date(f.lastModified()));
				String attribute = "DIR";
				long size = f.length();
				
				if(f.isFile()) {
					attribute = f.canRead() ? "R" : "  ";
					attribute = f.canWrite() ? "W" : "  ";
					attribute = f.isHidden() ? "H" : "  ";
				}
				
				System.out.printf("%s %3s %6s %s\n", lastModified, attribute, size, name);
			}
		}
	}
}
		
		
			


