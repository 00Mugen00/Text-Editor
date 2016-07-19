import java.awt.event.ActionListener;
import java.io.File;

public interface TextEditorView {
	String OPEN = "OPEN";
	String SAVE = "SAVE";
	String CLOSE = "CLOSE";
	void controller(ActionListener ctr);
	File selectFile();
	void writeText(String text);
	String getText();
}
