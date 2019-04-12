package Logic;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppGUI {
	private JButton nameButton;
	private JButton ageButton;
	private JButton emailButton;
	private JButton heightButton;
	private JButton subjectButton;
	private List<JComboBox<String>> boxes;
	private List<JTextField> fields;
	private AppLogic logic;
	
	public AppGUI () {
		JButton nameButton = new JButton();
		JButton ageButton = new JButton();
		JButton emailButton = new JButton();
		JButton heightButton = new JButton();
		JButton subjectButton = new JButton();
		List<JComboBox<String>> boxes = new ArrayList<JComboBox<String>>();
		List<JTextField> fields = new ArrayList<JTextField>();
		AppLogic logic = new AppLogic(5);
		JFrame mainFrame = new JFrame("Student Tracker");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setPreferredSize( new Dimension (800, 600) ); 
		java.net.URL url = ClassLoader.getSystemResource("");
		JPanel gridPanel = new JPanel();
		gridPanel.setPreferredSize( new Dimension (800,600) );
		gridPanel.setLayout(new GridLayout(6,5));
		for (int i = 0; i < logic.getRegister().size(); i+= 1) {
			fields.add( new JTextField(logic.getRegister().get(i).name));
			fields.add( new JTextField(logic.getRegister().get(i).age));
			fields.add( new JTextField(logic.getRegister().get(i).email));
			fields.add( new JTextField(logic.getRegister().get(i).height + ""));
			boxes.add(new JComboBox<String>(Student.subjects));
		}
		
		JButton name = new JButton("Name");
		JButton age = new JButton("Age(years)");
		JButton email = new JButton("Email Address");
		JButton height = new JButton("Height(m)");
		JButton subject = new JButton("Subject");
		
		gridPanel.add(name);
		gridPanel.add(age);
		gridPanel.add(email);
		gridPanel.add(height);
		gridPanel.add(subject);
		
		for (int i = 0; i < logic.getRegister().size(); i+= 1) {
			gridPanel.add(fields.get(i * 4));
			gridPanel.add(fields.get((i * 4) + 1));
			gridPanel.add(fields.get((i * 4) + 2));
			gridPanel.add(fields.get((i * 4) + 3));
			gridPanel.add(boxes.get(i));
		
		mainFrame.add(gridPanel);
		gridPanel.setVisible(true);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		mainFrame.setJMenuBar(menuBar);
		JMenuItem menuitem1 = new JMenuItem("Exit");
		menuitem1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {
		       System.exit(0);
		    }
		});
		
		JMenu menu2 = new JMenu("Options");
		menuBar.add(menu2);
		JMenuItem menuitem3 = new JMenuItem("Exit");
		menuitem1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {
		       System.exit(0);
		    }
		});
		  
		JMenuItem menuitem2 = new JMenuItem("Save to text format...");
		menuitem2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ev) {
		    	JTextArea printArea = new JTextArea();
		    	JFrame textFrame = new JFrame("Text-based Register");  
		    	for (int i = 0; i < logic.getRegister().size(); i+= 1) {
					printArea.add(fields.get(i * 4));
					printArea.add(fields.get((i * 4) + 1));
					printArea.add(fields.get((i * 4) + 2));
					printArea.add(fields.get((i * 4) + 3));
					printArea.add(boxes.get(i));
		    	}
		    	textFrame.setPreferredSize( new Dimension(800,600));
		    	textFrame.add(printArea);
		    	textFrame.pack();
		    	textFrame.setVisible(true);
		}  
		});
		menu.add(menuitem1);
		menu.add(menuitem2);
		
		mainFrame.pack();
		mainFrame.setVisible(true);
		}
     }
}