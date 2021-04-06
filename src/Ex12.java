import java.io.File;

public class Ex12 {

	public static void main(String[] args) {
		//상대경로
//		String path ="src\\";
		File dir = new File("src\\");
		String fileName = "Ex12.java";
		
		File file = new File(dir, fileName);
		
		//position -> .의 위치를 알려달라
		int position = fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일이름 - " + fileName);
		//substring -> 문자열을 잘라주는 메서드
		System.out.println("확장자를 제외한 파일 이름 - " + fileName.substring(0, position));
		System.out.println("확장자 - " + fileName.substring(position+1));
		System.out.println();
		
		System.out.println("경로를 포함한 파일 이름 - " + file.getPath());
		System.out.println("파일의 절대 경로 - " + file.getAbsolutePath());
		System.out.println("파일이 속해 있는 디렉토리 - " + file.getParent());
		System.out.println();
		
		System.out.println("user.dir - " + System.getProperty("user.dir"));
		
		
	}

}
