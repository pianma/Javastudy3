import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Ex15 {
	public static Map<String, Integer> printFileLlist(File dir){
		//listFiles -> 이 객체(dir)이 갖고 있는 디렉터리와 파일의 목록
		File[]	files = dir.listFiles();
		
		
		//이 객체 내 디렉터리의 수
		int dirNum = 0;
		//이 객체 내 파일의 수
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
			System.out.println("유효하지 않은 디렉터리 입니다.");
			//exit -> 프로그램종료 / 강제종료의 느낌은 아님..정상종료
			System.exit(0);
		}
		System.out.println(dir.getAbsolutePath()+ "디렉터리");
		Map<String, Integer> count = printFileLlist(dir);
		
		System.out.println("총 " + count.get("fileNum") + "개의 파일");
		System.out.println("총 " + count.get("dirNum") + "개의 디렉터리");
	}
}
