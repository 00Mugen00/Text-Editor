import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TextEditorDemo {
	public static void main(String[] args){   
		TextEditor textEditor = new TextEditor();
		TextEditorView textEditorView = new TextEditorPanel1();
		ActionListener textEditorCtr = new TextEditorCtr(textEditor,textEditorView);
		textEditorView.controller(textEditorCtr);
		JFrame window = new JFrame("Text Editor");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane((JPanel) textEditorView);		 
		window.pack();
		window.setVisible(true);
		
		ImageIcon img = new ImageIcon("icon.png");
		window.setIconImage(img.getImage());
	}
}
