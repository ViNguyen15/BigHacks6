package BigHacks6;
/**
 * @author Vi Nguyen
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class TextReader {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		// text file
		File pseudoFile = new File("pseudo.txt");
		// Scanner read data from file
		Scanner pseudoReader = null;

		try {
			pseudoReader = new Scanner(pseudoFile);
			//System.out.println("It Works!");
			
		} catch (FileNotFoundException e) {
			System.out.println("No file is found- folder is empty");
		}
		
		while (pseudoReader != null && pseudoReader.hasNext()) {
			String sop = pseudoReader.next();
			if (sop.equalsIgnoreCase("print")){
				System.out.println("System.out.println(\"" + pseudoReader.nextLine() + "\");");
			}
		}
	}
}
