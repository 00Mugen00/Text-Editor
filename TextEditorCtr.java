import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class TextEditorCtr implements ActionListener{	
	private TextEditor textEditor;
	private TextEditorView textEditorView;
	private File file;
	public TextEditorCtr(TextEditor textEditor,TextEditorView textEditorView){
		this.textEditor=textEditor;
		this.textEditorView=textEditorView;
		this.file=null;
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch(command){
		case "OPEN":
			file = textEditorView.selectFile();
			String text = textEditor.readFile(file);
			textEditorView.writeText(text);
			break;
		case "SAVE":
			String text1 = textEditorView.getText();
			textEditor.writeFile(file, text1);
			break;
		case "CLOSE":
			textEditorView.writeText("");
			break;
		}
	}
}
