import java.io.File;
import java.io.IOException;

public class Ex13 {
	public static void main(String[] args) {
		File file = new File("src\\test1 .java");
		
		//exist->파일 존재여부 확인 /존재 - true, 존재x - false
		//isFile -> 해당 객체가 갖고 있는 정보가 파일의 정보라면 true, 디렉토리의 정보라면 false
 		if(file.exists() == false || file.isFile() == false) {
			System.out.println("존재하지않거나 파일이 아닙니다.");
			
			System.out.println("해당 경로에 파일을 생성합니다.");
			
			try {
				boolean result = file.createNewFile();
				if(result) {
					System.out.println("파일을 생성했습니다.");
				}else {
					System.out.println("파일을 생성하지 못했습니다.");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}else {
			System.out.println("존재합니다.");
		}
	}
}
