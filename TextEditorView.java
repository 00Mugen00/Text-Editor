import java.awt.event.ActionListener;
import java.io.File;

public interface TextEditorView {
	String OPEN = "OPEN";
	void controller(ActionListener ctr);
	File selectFile();
	void writeText(String text);
}
