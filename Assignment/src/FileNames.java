import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class FileNames {
	private String folderpath;
	ArrayList<String> s = new ArrayList<>();
	public FileNames(String folderpath) {
		super();
		this.folderpath = folderpath;
	}
	public void displayFileNames(String folderpath) {		
		File f = new File(folderpath);
		File[] files = f.listFiles();
		for(File f1 : files) {
			s.add(f1.getName());
		}
		Collections.sort(s , String.CASE_INSENSITIVE_ORDER);
		System.out.println("Below are the files that are present in directory");
		for(String filename : s) {
			System.out.println(filename);
		}
		
	}

}
