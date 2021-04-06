import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex16 {

	public static void main(String[] args) {
		String currentDir = System.getProperty("User.dir");
		File dir = new File(currentDir);
		
		File[] files = dir.listFiles();
		for(File f : files) {
			String name = f.getName();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
			// lastModified ->마지막수정날짜
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
