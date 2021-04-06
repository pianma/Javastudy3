import java.io.File;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("===== [사용법] =====");
		System.out.println("경로 : (디렉터리 또는 파일의 경로 입력)");
		System.out.println("이름 : (삭제할 파일의 이름)");
		System.out.println("프로그램 종료 -> exit");
		
		while(true) {
			System.out.println("경로 : ");
			String path = scanf.next();
			
			System.out.println("이름 : ");
			String name = scanf.next();
			
			if(path.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			File file = new File(path);
			File[] files = file.listFiles();
			
			boolean isDelete = deleteFile(files,name);
			if(isDelete) {
				System.out.println(name + "을 삭제 했습니다.");
			}else {
				System.out.println(name + "을 삭제하지 못했습니다.");
			}
		}
	}//end main 
	public static boolean deleteFile(File[] files, String name) {
		boolean result = false;
		
		for(File f : files) {
			if(f.isFile()) {
				String filename = f.getName();
				
				if(filename.equals(name)) {
					result = f.delete();
				}//end if
			}//end if
		}//end for
		return result;
	}

}
