import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextEditorPanel1 extends JPanel implements TextEditorView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenuBar menuBar;
	private JMenu file, edit, help;
	private JMenuItem open,save,close;
	private JTextArea text;
	private JScrollPane scrollPane;

	public TextEditorPanel1() {
		text = new JTextArea(20,50);
		text.setText("");
		text.setLineWrap(true);
		
		menuBar = new JMenuBar();
		
		scrollPane = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");

		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		close = new JMenuItem("Close");
		
		file.add(open);
		file.add(save);
		file.add(close);

		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);

		setLayout(new BorderLayout());

		JPanel northPanel = new JPanel();
		northPanel.setLayout(new FlowLayout());
		northPanel.add(menuBar);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(scrollPane);

		add(northPanel, BorderLayout.NORTH);
		add(centerPanel,BorderLayout.CENTER);
	}
	
	public void writeText(String text){
		this.text.setText(text);
	}
	
	public File selectFile(){
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(this);
		return fileChooser.getSelectedFile();
	}
	
	public void controller(ActionListener ctr) {
		open.setActionCommand(OPEN);
		open.addActionListener(ctr);
	}
}
