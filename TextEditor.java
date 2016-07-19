import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextEditor {
	public String readFile(File file){
		String text = "";
		try(Scanner sc = new Scanner(file)){
			while(sc.hasNextLine()){
				text+=sc.nextLine();
				text+="\n";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return text;
	}
}
