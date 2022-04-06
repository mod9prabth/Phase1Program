import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Operations {
		private String folderpath;

		public Operations(String folderpath) {
			super();
			this.folderpath = folderpath;
		}
		public void createFile(String name , char type) {
			File f = new File(folderpath + "/" + name);
			try {
				if(type == 'd' || type == 'D') {
					if(f.mkdir()) {
						System.out.println("Directory created suscessfully");
					}
					else {
						System.out.println("Directory already exists");
					}
				}
				else {	
					if(f.createNewFile()) {
						System.out.println("File created suscessfully");
					}
					else
						System.out.println("File already exists");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		public void deleteFile(String name) {
			File f = new File(folderpath + "/" + name);
			if(f.delete()) {
				System.out.println("Deleted successfully");
			}
			else {
				System.out.println("File/Dirctory not exists");
			}
		}
		public void searchFile(String name) {
			File f = new File(folderpath);
			File[] filenames = f.listFiles();
			ArrayList<String> s = new ArrayList<String>();
			for(File a : filenames) {
				s.add(a.getName());
			}
			if(s.contains(name)) {
				System.out.println("File found");
			}
			else {
				System.out.println("File not found");
			}
		}
}
