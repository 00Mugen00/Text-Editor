import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEditor {
	public String readFile(File file){
		String text = "";
		if(file!=null){
			try(Scanner sc = new Scanner(file)){
				while(sc.hasNextLine()){
					text+=sc.nextLine();
					text+="\n";
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return text;
	}
	public void writeFile(File file,String text){
		if(file!=null){
			try {
				FileWriter fileWriter = new FileWriter(file,false);
				fileWriter.write(text);
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
