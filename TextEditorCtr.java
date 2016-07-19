import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class TextEditorCtr implements ActionListener{	
	private TextEditor textEditor;
	private TextEditorView textEditorView;
	public TextEditorCtr(TextEditor textEditor,TextEditorView textEditorView){
		this.textEditor=textEditor;
		this.textEditorView=textEditorView;
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch(command){
		case "OPEN":
			File file = textEditorView.selectFile();
			String text = textEditor.readFile(file);
			textEditorView.writeText(text);
			break;
		}
	}
}
