import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComboBoxUI;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JToolBar;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import com.mysql.jdbc.Connection;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FrontEnd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontEnd frame = new FrontEnd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrontEnd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,getToolkit().getScreenSize().width,getToolkit().getScreenSize().height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 1374, 132);
		contentPane.add(panel);
		panel.setLayout(null);
		BufferedImage myPicture = null;
		try{
			myPicture = ImageIO.read(new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\Busintelligence.jpg"));
		}
		catch(Exception e)
		{
			System.err.println(""+e.getMessage());
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setBounds(687, 0, 786, 121);
		panel.add(picLabel);
		BufferedImage myPicture1 = null;
		try{
			myPicture1 = ImageIO.read(new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\copyright.jpg"));
		}
		catch(Exception e)
		{
			System.err.println(""+e.getMessage());
		}
		JLabel picLabel1 = new JLabel(new ImageIcon(myPicture1));
		picLabel1.setBounds(0, 0, 120, 82);
		panel.add(picLabel1);
		
		JPanel panel_1 = new JPanel(){
			@Override
			protected void paintComponent(Graphics arg0) {
				
				super.paintComponent(arg0);
				arg0.drawLine(687,20,687,576);
			}
		};
		panel_1.setBackground(new Color(191, 192, 196));
		panel_1.setBounds(0, 129, 1374, 614);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		JLabel lblBusintelligence = new JLabel("BusIntelligence");
		lblBusintelligence.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusintelligence.setForeground(Color.BLACK);
		lblBusintelligence.setFont(new Font("Lato Heavy", lblBusintelligence.getFont().getStyle(), 35));
		lblBusintelligence.setBounds(181, 51, 325, 60);
		panel_1.add(lblBusintelligence);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Lato Heavy", lblLogin.getFont().getStyle(), 35));
		lblLogin.setBounds(855, 51, 325, 60);
		panel_1.add(lblLogin);
		
		JLabel lblChooseYourDepartment = new JLabel("Choose Your Department :");
		lblChooseYourDepartment.setForeground(Color.BLACK);
		lblChooseYourDepartment.setFont(new Font("Lato Heavy", lblChooseYourDepartment.getFont().getStyle(), 14));
		lblChooseYourDepartment.setBounds(734, 160, 209, 23);
		panel_1.add(lblChooseYourDepartment);
		
		JLabel lblEnterYourUsername = new JLabel("Enter Your Email ID :");
		lblEnterYourUsername.setForeground(Color.BLACK);
		lblEnterYourUsername.setFont(new Font("Lato Heavy", lblChooseYourDepartment.getFont().getStyle(), 14));
		lblEnterYourUsername.setBounds(734, 210, 209, 23);
		panel_1.add(lblEnterYourUsername);
		
		JLabel lblEnterYourPassword = new JLabel("Enter Your Password :");
		lblEnterYourPassword.setForeground(Color.BLACK);
		lblEnterYourPassword.setFont(new Font("Lato Heavy", lblChooseYourDepartment.getFont().getStyle(), 14));
		lblEnterYourPassword.setBounds(734, 260, 209, 23);
		panel_1.add(lblEnterYourPassword);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Finance", "Accounting", "Human Resources", "Public Relations", "Production", "Sales", "Project Management"}));
		comboBox.setBounds(949, 160, 247, 20);
		panel_1.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		textField.setBounds(949, 210, 247, 20);
		panel_1.add(textField);
		
		JLabel lblNewLabel = new JLabel("* Login only for the members provided with the BuIntelligence username and password by their company.");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Lato Heavy", Font.PLAIN, 9));
		lblNewLabel.setBounds(700, 547, 487, 14);
		panel_1.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		passwordField.setBounds(949, 260, 247, 20);
		panel_1.add(passwordField);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Signup si=new Signup();
				si.setVisible(true);
			}
		});
		button.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    button.setText("<HTML><P color=\"#000\">If you don't have an account click <FONT color=\"#000099\"><U>Sign up</U></FONT>"
	        + " to create an account.</P></HTML>");
	    button.setHorizontalAlignment(SwingConstants.LEFT);
	    button.setBorderPainted(false);
	    button.setOpaque(false);
	    button.setBackground(Color.WHITE);
	    button.setBounds(831, 360, 376, 30);
	    panel_1.add(button);
	    
	    JLabel lblNewLabel_1 = new JLabel("BusIntelligence is a Business-Intelligence software which provides the user with Desicion-");
	    lblNewLabel_1.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    lblNewLabel_1.setForeground(Color.BLACK);
	    lblNewLabel_1.setBounds(78, 132, 511, 20);
	    panel_1.add(lblNewLabel_1);
	    
	    JLabel lblSupportAndManagement = new JLabel("Support and Management Information Systems. The software organise and analyze data");
	    lblSupportAndManagement.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    lblSupportAndManagement.setForeground(Color.BLACK);
	    lblSupportAndManagement.setBounds(78, 150, 511, 20);
	    panel_1.add(lblSupportAndManagement);
	    
	    JLabel label = new JLabel("entered of the following departments and gives an optimum output :");
	    label.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    label.setForeground(Color.BLACK);
	    label.setBounds(78, 168, 511, 20);
	    panel_1.add(label);
	    
	    JLabel lblNewLabel_2 = new JLabel("1.  Finance");
	    lblNewLabel_2.setForeground(Color.BLACK);
	    lblNewLabel_2.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    lblNewLabel_2.setBounds(290, 214, 171, 17);
	    panel_1.add(lblNewLabel_2);
	    
	    JLabel lblAccounting = new JLabel("2.  Accounting");
	    lblAccounting.setForeground(Color.BLACK);
	    lblAccounting.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    lblAccounting.setBounds(290, 234, 171, 17);
	    panel_1.add(lblAccounting);
		
	    JLabel lblHR = new JLabel("3.  Public Relations");
	    lblHR.setForeground(Color.BLACK);
	    lblHR.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    lblHR.setBounds(290, 254, 171, 17);
	    panel_1.add(lblHR);
	    
	    JLabel lblCustomerCare = new JLabel("4.  Human Resources");
	    lblCustomerCare.setForeground(Color.BLACK);
	    lblCustomerCare.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    lblCustomerCare.setBounds(290, 274, 171, 17);
	    panel_1.add(lblCustomerCare);
	    
	    JLabel lblProduction = new JLabel("5.  Production");
	    lblProduction.setForeground(Color.BLACK);
	    lblProduction.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    lblProduction.setBounds(290, 294, 171, 17);
	    panel_1.add(lblProduction);
	    
	    JLabel lblSales = new JLabel("6.  Sales");
	    lblSales.setForeground(Color.BLACK);
	    lblSales.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    lblSales.setBounds(290, 314, 171, 17);
	    panel_1.add(lblSales);
	    
	    JLabel lblPM = new JLabel("7.  Project Management");
	    lblPM.setForeground(Color.BLACK);
	    lblPM.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    lblPM.setBounds(290, 334, 171, 17);
	    panel_1.add(lblPM);
	    
	    JLabel label_1 = new JLabel("BusIntelligence provides the firm with optimum solution by analysing the data from the ");
	    label_1.setForeground(Color.BLACK);
	    label_1.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    label_1.setBounds(78, 382, 511, 20);
	    panel_1.add(label_1);
	    
	    JLabel label_2 = new JLabel("Transcation Process System, Supply Chain Management and Customer Relation Management.  ");
	    label_2.setForeground(Color.BLACK);
	    label_2.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    label_2.setBounds(78, 400, 511, 20);
	    panel_1.add(label_2);
	    
	    JLabel label_3 = new JLabel("The © status of the software is with the 4 developers i.e Sarthak Agarwal, Diksha Bagaria,");
	    label_3.setForeground(Color.BLACK);
	    label_3.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    label_3.setBounds(78, 418, 511, 20);
	    panel_1.add(label_3);
	    
	    JLabel label_4 = new JLabel("Anisha Arora and Aditya Atreya.");
	    label_4.setForeground(Color.BLACK);
	    label_4.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    label_4.setBounds(78, 436, 511, 20);
	    panel_1.add(label_4);
	    
	    JButton btnLogin = new JButton("Login");
	    btnLogin.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		try {
	    			String password=new String(passwordField.getPassword());
	    			Class.forName("com.mysql.jdbc.Driver");
	    			Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
	    			String str="select * from signup where email='"+textField.getText().toString()+"'";
	    			java.sql.PreparedStatement ps4=cn.prepareStatement(str);
	    			ResultSet rs=ps4.executeQuery();
	    			while(rs.next()){
	    				if(password.equals(rs.getString(4))){
	    					if(comboBox.getSelectedItem().toString().equals("Project Management")){
	    						Project_Management pm=new Project_Management();
	    						pm.setVisible(true);
	    					}
	    					else if(comboBox.getSelectedItem().toString().equals("Public Relations")){
	    						PublicRelations pr=new PublicRelations();
	    						pr.setVisible(true);
	    					}
	    					else if(comboBox.getSelectedItem().toString().equals("Finance")){
	    						Finance f=new Finance();
	    						f.setVisible(true);
	    					}
	    					else if(comboBox.getSelectedItem().toString().equals("Accounting")){
	    						
	    					}
	    					else if(comboBox.getSelectedItem().toString().equals("Human Resources")){
	    						HumanResource hr=new HumanResource();
	    						hr.setVisible(true);
	    					}
	    					else if(comboBox.getSelectedItem().toString().equals("Sales")){
	    						
	    					}
	    					else if(comboBox.getSelectedItem().toString().equals("Production")){
		    					Orders o=new Orders();
		    					o.setVisible(true);
	    					}
	    				}
	    				else{
	    					JOptionPane.showMessageDialog(null,"Please check your email or password!!!");
	    				}
	    			}
				} catch (Exception e) {
					// TODO: handle exception
				}
	    	}
	    });
	    btnLogin.setForeground(new Color(102, 205, 170));
	    btnLogin.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
	    btnLogin.setBackground(Color.BLACK);
	    btnLogin.setBounds(960, 303, 126, 38);
	    panel_1.add(btnLogin);
	}
}
