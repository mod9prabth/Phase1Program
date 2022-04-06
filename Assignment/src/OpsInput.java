import java.io.File;
import java.util.Scanner;

public class OpsInput {
	
	private int operations;
	private String username;

	public OpsInput(int operations,String username) {
		super();
		this.operations = operations;
		this.username = username;
	}

	public void FileOps(int operation , String username) {
		String path = "C:\\Final folder\\"+ username;
		boolean user = false ;
		File cf = new File(path);
		if(cf.mkdir()) {
			user = true;
			System.out.println("New root folder created");
		}
		switch(operation) {
		case 1:
			FileNames fnames = new FileNames(path);
			fnames.displayFileNames(path);
			break;
		case 2:
			Scanner n = new Scanner(System.in);
			Operations o = new Operations(path);
			System.out.println("Please enter the file operation to be performed");
			System.out.println("1:Create a file");
			System.out.println("2:Delete a file");
			System.out.println("3: Search a file");
			int second_input = n.nextInt();
			switch(second_input) {
			case 1 :
				char type;
				System.out.println("Want to create a directory or a file?");
				System.out.println("Please enter d to create Diretory or f to create file");
					 type = n.next().charAt(0);
					if(type == 'd' || type == 'f' || type == 'D' || type == 'F') {
						System.out.println("Please enter name ");
						String filename = n.next();
						o.createFile(filename, type);
						break;
					}
					else {
						System.out.println("Invalid charcter");
						System.exit(type);
					}
				break;
			case 2 :
				if(user) {
					System.out.println("New user");
					System.out.println("No files or folder to delete");
					System.out.println("Please create files to delete");
				}
				else {
					System.out.println("Please enter name of File/Folder that needs to be deleted ");
					String deletefile = n.next();
					o.deleteFile(deletefile);
				}
				break;
			case 3 :
				if(user) {
					System.out.println("New user");
					System.out.println("No files or folder to search");
					System.out.println("Please create files to search");
				}
				else {
					System.out.println("Please enter name of File/Folder that needs to be seached ");
					String searchfile = n.next();
					o.searchFile(searchfile);
				}
				

			}
			
		case 3 :
			System.exit(operation);
		}
	}
	

}
