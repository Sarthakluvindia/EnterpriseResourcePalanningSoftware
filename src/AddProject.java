import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.mysql.jdbc.Connection;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.DriverManager;
import java.util.Arrays;


public class AddProject extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	int count = 250;
	int len;
	JLabel lblCharactersLeft;
	JButton btnAddProject;
	JLabel label;
	
	public AddProject() {
		setBounds(0, 0, 1225, 614);
		setBackground(new Color(191, 192, 196));
		setLayout(null);
		
		JLabel lblAddNewProject = new JLabel("Add New Project");
		lblAddNewProject.setForeground(Color.BLACK);
		lblAddNewProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewProject.setFont(new Font("Lato Heavy", Font.PLAIN, 35));
		lblAddNewProject.setBounds(500, 25, 333, 50);
		add(lblAddNewProject);
		
		JLabel lblNameTheProject = new JLabel("Name the Project:");
		lblNameTheProject.setForeground(Color.BLACK);
		lblNameTheProject.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblNameTheProject.setBounds(400, 125, 208, 27);
		add(lblNameTheProject);
		
		JLabel lblStartingDate = new JLabel("Starting Date:");
		lblStartingDate.setForeground(Color.BLACK);
		lblStartingDate.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblStartingDate.setBounds(400, 150, 208, 27);
		add(lblStartingDate);
		
		JLabel lblEndingDate = new JLabel("Ending Date:");
		lblEndingDate.setForeground(Color.BLACK);
		lblEndingDate.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblEndingDate.setBounds(400, 175, 208, 27);
		add(lblEndingDate);
		
		JLabel lblNameTheManager = new JLabel("Name the Manager:");
		lblNameTheManager.setForeground(Color.BLACK);
		lblNameTheManager.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblNameTheManager.setBounds(400, 200, 208, 27);
		add(lblNameTheManager);
		
		JLabel lblBudgetOfThe = new JLabel("Budget of the Project:");
		lblBudgetOfThe.setForeground(Color.BLACK);
		lblBudgetOfThe.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblBudgetOfThe.setBounds(400, 225, 208, 27);
		add(lblBudgetOfThe);
		
		JLabel lblTypeOfProject = new JLabel("Type of Project:");
		lblTypeOfProject.setForeground(Color.BLACK);
		lblTypeOfProject.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblTypeOfProject.setBounds(400, 250, 208, 27);
		add(lblTypeOfProject);
		
		JLabel lblStatusOfProject = new JLabel("Status of Project:");
		lblStatusOfProject.setForeground(Color.BLACK);
		lblStatusOfProject.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblStatusOfProject.setBounds(400, 275, 208, 27);
		add(lblStatusOfProject);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setForeground(Color.BLACK);
		lblDescription.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblDescription.setBounds(400, 300, 208, 27);
		add(lblDescription);
		
		textField = new JTextField();
		textField.setBounds(630, 129, 199, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(630, 154, 199, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(630, 179, 199, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(630, 204, 199, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(630, 229, 199, 20);
		add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Advertisement", "Banner/Hoardings", "NGO", "Charity", "Social Media"}));
		comboBox.setBounds(630, 254, 199, 20);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Live Project", "Completed", "Halted", "Deleted"}));
		comboBox_1.setBounds(630, 279, 199, 20);
		add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(630, 302, 199, 197);
		textArea.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				count--;
				label.setText(String.valueOf(count));
				if(count<0){
					btnAddProject.setEnabled(false);
				}
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		add(textArea);
		
		btnAddProject = new JButton("Add Project");
		btnAddProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
					String str="insert into addproject values(?,?,?,?,?,?,?,?)";
					java.sql.PreparedStatement ps=cn.prepareStatement(str);
					ps.setString(1,textField.getText());	
					ps.setString(2,textField_1.getText());
					ps.setString(3,textField_2.getText());
					ps.setString(4,textField_3.getText());
					ps.setString(5,textField_4.getText());
					ps.setString(6,comboBox.getSelectedItem().toString());
					ps.setString(7,comboBox_1.getSelectedItem().toString());
					ps.setString(8,textArea.getText());
					ps.executeUpdate();
					cn.close();
					textField.setText(" ");
					textField_1.setText(" ");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textArea.setText("");
					comboBox.setSelectedIndex(0);
					comboBox_1.setSelectedIndex(0);
				}
				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null, f.getMessage());
				}
			}
		});
		btnAddProject.setBounds(554, 510, 103, 27);
		add(btnAddProject);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(1117, 531, 73, 23);
		add(btnHome);
		
		JLabel lblbudgetLeft = new JLabel("(Budget left:-"+")");
		lblbudgetLeft.setFont(new Font("Lato", Font.PLAIN, 11));
		lblbudgetLeft.setForeground(Color.BLACK);
		lblbudgetLeft.setBounds(850, 232, 183, 14);
		add(lblbudgetLeft);
		
		lblCharactersLeft = new JLabel("Characters left: ");
		lblCharactersLeft.setForeground(Color.BLACK);
		lblCharactersLeft.setFont(new Font("Lato", Font.PLAIN, 11));
		lblCharactersLeft.setBounds(850, 485, 92, 14);
		add(lblCharactersLeft);
		
		label = new JLabel("250");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Lato", Font.PLAIN, 11));
		label.setBounds(932, 485, 46, 14);
		add(label);
		
	}
}
