import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.DriverManager;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import com.mysql.jdbc.Connection;


public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	JButton btnSignUp;
	char[] pass;
	String str;
	char[] repass;
	String email_regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Signup() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0,0,getToolkit().getScreenSize().width,getToolkit().getScreenSize().height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(191, 192, 196));
		panel_1.setBounds(0, 129, 1374, 614);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Lato Heavy", Font.PLAIN, 30));
		lblNewLabel.setBounds(624, 26, 179, 59);
		panel_1.add(lblNewLabel);
		
		JLabel lblEnterYourFirst = new JLabel("Enter Your First Name :");
		lblEnterYourFirst.setForeground(Color.BLACK);
		lblEnterYourFirst.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblEnterYourFirst.setBounds(450, 110, 170, 20);
		panel_1.add(lblEnterYourFirst);
		
		JLabel label = new JLabel("Enter Your Last Name :");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		label.setBounds(450, 160, 170, 20);
		panel_1.add(label);
		
		JLabel labelemail = new JLabel("Enter Your Email Address :");
		labelemail.setForeground(Color.BLACK);
		labelemail.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		labelemail.setBounds(450, 210, 170, 20);
		panel_1.add(labelemail);
		
		JLabel labelpass = new JLabel("Enter Your Password :");
		labelpass.setForeground(Color.BLACK);
		labelpass.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		labelpass.setBounds(450, 260, 170, 20);
		panel_1.add(labelpass);
		
		JLabel labelrepass = new JLabel("Re-Enter Your Password :");
		labelrepass.setForeground(Color.BLACK);
		labelrepass.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		labelrepass.setBounds(450, 310, 170, 20);
		panel_1.add(labelrepass);
		
		JLabel labelphone = new JLabel("Enter Your Mobile Number :");
		labelphone.setForeground(Color.BLACK);
		labelphone.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		labelphone.setBounds(450, 360, 170, 20);
		panel_1.add(labelphone);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("  I Agree to the Terms and Conditions.");
		chckbxNewCheckBox.setForeground(Color.BLACK);
		chckbxNewCheckBox.setBackground(new Color(191, 192, 196));
		chckbxNewCheckBox.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(537, 405, 316, 23);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox.isSelected()){
					btnSignUp.setEnabled(true);
				}
				else if(!chckbxNewCheckBox.isSelected()){
					btnSignUp.setEnabled(false);
				}
			}
		});
		panel_1.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		Border border= BorderFactory.createLineBorder(Color.BLACK, 1);
		lblNewLabel_1.setBorder(border);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Lato Heavy", Font.PLAIN, 20));
		captcha captcha = new captcha();
		str= captcha.generateCaptcha();
		lblNewLabel_1.setText(str);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(594, 446, 79, 38);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblCaptcha = new JLabel("Captcha :");
		lblCaptcha.setForeground(Color.BLACK);
		lblCaptcha.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblCaptcha.setBounds(450, 462, 120, 14);
		panel_1.add(lblCaptcha);
		
		JLabel lblEnterCaptcha = new JLabel("Enter Captcha :");
		lblEnterCaptcha.setForeground(Color.BLACK);
		lblEnterCaptcha.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		lblEnterCaptcha.setBounds(450, 508, 170, 14);
		panel_1.add(lblEnterCaptcha);
		
		textField = new JTextField();
		textField.setBounds(670, 111, 195, 20);
		panel_1.add(textField);
		
		textField.setColumns(10);
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(670, 161, 195, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(670, 211, 195, 20);
		panel_1.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(670, 360, 195, 20);
		panel_1.add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(594, 506, 195, 20);
		panel_1.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(670, 261, 195, 20);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(670, 311, 195, 20);
		panel_1.add(passwordField_1);
		
		btnSignUp= new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pass=passwordField.getPassword();
				repass=passwordField_1.getPassword();
				String password=new String(pass);
				if(textField.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Please enter your First Name");
				}
				else if(textField_1.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter your Last Name");
				}
				else if(textField_2.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter your Email Address");
				}
				else if(textField_4.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter your Mobile Number");
				}
				else if(!textField_2.getText().toString().matches(email_regex)){
					JOptionPane.showMessageDialog(null, "Please enter a valid Email Address");
				}
				else if(textField_4.getText().length()<10 || textField_4.getText().length()>10){
					JOptionPane.showMessageDialog(null, "Please enter a valid Mobile Number");
				}
				else if(!Arrays.equals(pass, repass)){
					JOptionPane.showMessageDialog(null,"Please Check Your Password");
					passwordField.setText("");
					passwordField_1.setText("");
				}
				else if(!str.trim().equals(textField_3.getText().toString().trim())){
					System.out.println(lblCaptcha.getText().toString().trim());
					System.out.println(textField_3.getText().toString().trim());
					JOptionPane.showMessageDialog(null,"Please enter the correct captcha");
					textField_3.setText("");
				}
				else{
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
						String str="insert into signup values(?,?,?,?,?)";
						java.sql.PreparedStatement ps=cn.prepareStatement(str);
						ps.setString(1,textField.getText());	
						ps.setString(2,textField_1.getText());
						ps.setString(3,textField_2.getText());
						ps.setString(4,password);
						ps.setString(5,textField_4.getText());
						ps.executeUpdate();
						cn.close();
						FrontEnd fn=new FrontEnd();
						fn.setVisible(true);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		});
		btnSignUp.setEnabled(false);
		btnSignUp.setBackground(Color.BLACK);
		btnSignUp.setForeground(new Color(102, 205, 170));
		btnSignUp.setFont(new Font("Lato Heavy", Font.PLAIN, 12));
		btnSignUp.setBounds(624, 537, 126, 38);
		panel_1.add(btnSignUp);
	}
}
