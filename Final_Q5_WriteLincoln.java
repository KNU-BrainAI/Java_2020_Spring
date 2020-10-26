import java.io.*;
import java.util.*;

public class Final_Q5_WriteLincoln {
	public static void main(String[] args) throws Exception {

		File sourceFile = new File("Lincoln.txt");
		
		
		// Check if source file exists
		
		if (!sourceFile.exists()) {
			System.out.println("Source file " + sourceFile + " does not exist");
			System.exit(1);
		}

		// Create a Scanner for the file
		Scanner input = new Scanner(sourceFile);
		

		int wordCount = 0, lineCount = 0;
		while (input.hasNext()) {
			String oneLine = input.nextLine();
			lineCount++;
			wordCount += countWords(oneLine);
			System.out.println(input.hasNext());
		}

		input.close();

		System.out.println("File " + sourceFile + " has ");
		System.out.println(sourceFile.length() + " characters");
		System.out.println(wordCount + " words");
		System.out.println(lineCount + " lines");
		
		
		File newFile = new File("Q5_CountLincoln.txt");
		if(newFile.exists()) {
			System.out.println("newFile already exists");
			System.exit(2);
		}
		
		PrintWriter output = new PrintWriter(newFile);
		output.println(sourceFile.length());
		output.println(wordCount);
		output.println(lineCount);
		System.out.println("Writing file success");
		
		output.close();
		
	}

	private static int countWords(String s) {
		String[] words = s.split("[ \\t\\n\\r]");
		int count = 0;

		for (String word: words)
			if (word.length() > 0)
				count++;

		return count;
	}

	//  /** Alternative way */
	//  private static int countWords(String s) {
	//    Scanner input = new Scanner(s);
	//    int count = 0;
	//
	//    while (input.hasNext()) {
	//      input.next(); 
	//      count++;
	//    }
	//
	//    return count;
	//  }
}
