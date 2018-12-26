import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JPanel;

import com.mysql.jdbc.Connection;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UpdateProjects extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Create the panel.
	 */
	public UpdateProjects(String name) {
		setBounds(0, 0, 1225, 614);
		setBackground(new Color(191, 192, 196));
		setLayout(null);
		
		JLabel lblUpdateProject = new JLabel("Update Project");
		lblUpdateProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateProject.setFont(new Font("Lato Heavy", Font.PLAIN, 35));
		lblUpdateProject.setBounds(461, 32, 299, 58);
		add(lblUpdateProject);
		
		JLabel lblMonthwiseBudget = new JLabel("Monthwise Budget:");
		lblMonthwiseBudget.setForeground(Color.BLACK);
		lblMonthwiseBudget.setFont(new Font("Lato Heavy", Font.PLAIN, 13));
		lblMonthwiseBudget.setBounds(221, 91, 159, 31);
		add(lblMonthwiseBudget);
		
		JLabel lblJanuary = new JLabel("January:");
		lblJanuary.setForeground(Color.BLACK);
		lblJanuary.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblJanuary.setBounds(334, 133, 91, 21);
		add(lblJanuary);
		
		JLabel lblFebruary = new JLabel("February:");
		lblFebruary.setForeground(Color.BLACK);
		lblFebruary.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblFebruary.setBounds(334, 162, 91, 21);
		add(lblFebruary);
		
		JLabel lblMarch = new JLabel("March:");
		lblMarch.setForeground(Color.BLACK);
		lblMarch.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblMarch.setBounds(334, 194, 91, 21);
		add(lblMarch);
		
		JLabel lblApril = new JLabel("April:");
		lblApril.setForeground(Color.BLACK);
		lblApril.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblApril.setBounds(334, 226, 91, 21);
		add(lblApril);
		
		JLabel lblMay = new JLabel("May:");
		lblMay.setForeground(Color.BLACK);
		lblMay.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblMay.setBounds(334, 258, 91, 21);
		add(lblMay);
		
		JLabel lblJune = new JLabel("June:");
		lblJune.setForeground(Color.BLACK);
		lblJune.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblJune.setBounds(334, 290, 91, 21);
		add(lblJune);
		
		textField = new JTextField();
		textField.setBounds(435, 133, 129, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(435, 162, 129, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(435, 194, 129, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(435, 226, 129, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(435, 258, 129, 20);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(435, 290, 129, 20);
		add(textField_5);
		
		JLabel lblJuly = new JLabel("July:");
		lblJuly.setForeground(Color.BLACK);
		lblJuly.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblJuly.setBounds(645, 133, 91, 21);
		add(lblJuly);
		
		JLabel lblAugust = new JLabel("August:");
		lblAugust.setForeground(Color.BLACK);
		lblAugust.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblAugust.setBounds(645, 162, 91, 21);
		add(lblAugust);
		
		JLabel lblSeptember = new JLabel("September:");
		lblSeptember.setForeground(Color.BLACK);
		lblSeptember.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblSeptember.setBounds(645, 194, 91, 21);
		add(lblSeptember);
		
		JLabel lblOctober = new JLabel("October:");
		lblOctober.setForeground(Color.BLACK);
		lblOctober.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblOctober.setBounds(645, 226, 91, 21);
		add(lblOctober);
		
		JLabel lblNovember = new JLabel("November:");
		lblNovember.setForeground(Color.BLACK);
		lblNovember.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblNovember.setBounds(645, 258, 91, 21);
		add(lblNovember);
		
		JLabel lblDecember = new JLabel("December:");
		lblDecember.setForeground(Color.BLACK);
		lblDecember.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblDecember.setBounds(645, 290, 91, 21);
		add(lblDecember);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(746, 133, 129, 20);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(746, 162, 129, 20);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(746, 194, 129, 20);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(746, 226, 129, 20);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(746, 258, 129, 20);
		add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(746, 290, 129, 20);
		add(textField_11);
		
		JLabel lblProgress = new JLabel("Progress:");
		lblProgress.setForeground(Color.BLACK);
		lblProgress.setFont(new Font("Lato Heavy", Font.PLAIN, 13));
		lblProgress.setBounds(221, 337, 159, 31);
		add(lblProgress);
		
		JLabel lblEnterProgress = new JLabel("Enter Progress:");
		lblEnterProgress.setForeground(Color.BLACK);
		lblEnterProgress.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblEnterProgress.setBounds(334, 379, 91, 21);
		add(lblEnterProgress);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(435, 379, 129, 20);
		add(textField_12);
		
		JLabel label = new JLabel("General Description:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Lato Heavy", Font.PLAIN, 13));
		label.setBounds(645, 337, 159, 31);
		add(label);
		
		JLabel label_1 = new JLabel("Manager:");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		label_1.setBounds(758, 379, 91, 21);
		add(label_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(859, 379, 129, 20);
		add(textField_13);
		
		JLabel label_2 = new JLabel("Description:");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		label_2.setBounds(758, 411, 91, 21);
		add(label_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(859, 409, 129, 119);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		add(textArea);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
					String query="delete from update_proj where proj_name='"+name+"'";
					java.sql.PreparedStatement delps=cn.prepareStatement(query);
					delps.executeUpdate();
					String str="insert into update_proj values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					java.sql.PreparedStatement ps=cn.prepareStatement(str);
					ps.setString(1,textField.getText());	
					ps.setString(2,textField_1.getText());
					ps.setString(3,textField_2.getText());
					ps.setString(4,textField_3.getText());
					ps.setString(5,textField_4.getText());
					ps.setString(6,textField_5.getText());
					ps.setString(7,textField_6.getText());
					ps.setString(8,textField_7.getText());
					ps.setString(9,textField_8.getText());
					ps.setString(10,textField_9.getText());
					ps.setString(11,textField_10.getText());
					ps.setString(12,textField_11.getText());
					ps.setString(13,textField_12.getText());
					ps.setString(14,textField_13.getText());
					ps.setString(15,textArea.getText());
					ps.setString(16,name);
					ps.executeUpdate();
					cn.close();
				}
				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null, f.getMessage());
				}
			}
		});
		btnUpdate.setBounds(585, 516, 103, 31);
		add(btnUpdate);
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
			String str="select * from update_proj where proj_name='"+name+"'";
			java.sql.PreparedStatement ps4=cn.prepareStatement(str);
			ResultSet rs=ps4.executeQuery();
			while(rs.next()){
				textField.setText(rs.getString(1));
				textField_1.setText(rs.getString(2));
				textField_2.setText(rs.getString(3));
				textField_3.setText(rs.getString(4));
				textField_4.setText(rs.getString(5));
				textField_5.setText(rs.getString(6));
				textField_6.setText(rs.getString(7));
				textField_7.setText(rs.getString(8));
				textField_8.setText(rs.getString(9));
				textField_9.setText(rs.getString(10));
				textField_10.setText(rs.getString(11));
				textField_11.setText(rs.getString(12));
				textField_12.setText(rs.getString(13));
				textField_13.setText(rs.getString(14));
				textArea.setText(rs.getString(15));
			}
		}catch(Exception e){
			
		}
	}
}
