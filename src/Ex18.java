import java.io.File;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("===== [ 사용법 ] =====");
		System.out.println("경로 : (디렉터리 또는 파일의 경로 입력)");
		System.out.println("확장자 : (찾고자하는 파일의 확장자)");
		System.out.println("프로그램 종료 -> exit 입력");
		
		while(true) {
			System.out.println("경로 : ");
			String path = scanf.next();
			
			System.out.println("확장자 : ");
			String extension = scanf.next();
			
			if(path.equals("exit")){
				System.out.println("프로그램 종료");
				break;
			}
			File file = new File(path);
			File[] files = file.listFiles();
			
			int findCount = findFile(files, extension);
			System.out.println(file.getAbsolutePath() + "에서" + extension + "확장자를 가진 파일을" + findCount + "개 찾았습니다.");
		
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
