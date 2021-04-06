import java.io.File;

public class Ex14 {

	public static void main(String[] args) {
		File file = new File("src\\test\\");
		
		if(!file.exists() || !file.isDirectory()) {
			System.out.println("존재하지 않거나 디렉터리가 아닙니다.");
			
			System.out.println("최단 경로에 디렉터리를 생성합니다.");
			
			//mkdir -> make directory
			//우리가 지정한 마지막 디렉토리만 생성하는 메서드
			file.mkdir();
			//지정한 경로 내 존재하지 않는 디렉토리까지 다 생성을 해주는 메서드
			file.mkdirs();
		}else {
			System.out.println("존재합니다.");
		}

	}

}
