import java.util.Scanner;

public class Assignement_Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Please enter the UserName");
		String username = n.next();
		System.out.println("Please enter the operation to performed");
		System.out.println("1:To get list of all fileNames");
		System.out.println("2:Add or delete or search a file");
		System.out.println("3:Exit application");
		int i = 0;
		try {
			 i = n.nextInt();
			if ( i ==0 || i > 3 ) {
				System.out.println("Not a valid Operation");
				System.exit(i);
			}
		}
		catch(Exception e) {
			System.out.println("Not a valid operation");
			System.exit(i);
		}

		OpsInput f = new OpsInput(i,username);
		f.FileOps(i,username);
			
		
	}

}
