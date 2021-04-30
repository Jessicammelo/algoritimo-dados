package core;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static String readFile(String directory) throws Exception {
		File myObj = new File(directory);
		String html = "";
		if (myObj.exists()) {
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				html += myReader.nextLine();
			}
			myReader.close();
		} else {
			throw new Exception("Arquivo não encontrado!");
		}
		return html;
	}
	
}
