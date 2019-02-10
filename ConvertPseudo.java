/*
 * Author: [Gustavo Gomez]
 * Purpose: This is a UGA Hacks project that converts pseudocode into java code. 
 *	    It was created within 36 hours.  
 *
 */

import java.util.*; 
import java.io.*;

public class ConvertPseudo {
    public static void main(String[] args) throws IOException, FileNotFoundException, UnsupportedEncodingException {
	
	//create a new text file
	File file = new File("pseudo.txt");	
	//creating scanner to read pseudo text file and creating a new file. 
	Scanner pseudoReader = new Scanner(file);
 	String convertFileContent = null; 

	//reading the text file and printing text from file.
	while (pseudoReader != null && pseudoReader.hasNextLine()) {
	    String fileContent = pseudoReader.nextLine(); 
	    if (fileContent.equalsIgnoreCase("print")) {
	       convertFileContent = "System.out.println(\"" + pseudoReader.nextLine() + "\");";
	    }
	} 

	//create output file to display converted pseudocode 
	BufferedWriter writer = new BufferedWriter(new FileWriter("pseudoToCode.java"));
	writer.write(convertFileContent);
	writer.close();
    }
/*
    public String convertToCode(String str) {

	String[] pseudoKeyWords = { "print", "if", "else", "double", "int", "String", "boolean", "for", "while"};

	String conversion = null; 

	for (int i = 0; i < pseudoKeyWords.length; i++) {
  
	    if (pseudoKeyWords[i].equalsIgnoreCase("print")) {
		conversion = "System.out.println(\""+str+"\");";	  	
	    } 
	    else if (pseudoKeyWords[i].equalsIgnoreCase("int")) { 
		conversion = "int = "+str;
	   }
	}	

	return conversion;	
    }
*/

}
