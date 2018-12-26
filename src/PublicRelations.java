import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.DriverManager;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.mysql.jdbc.Connection;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PublicRelations extends JFrame {

	private JPanel contentPane;
	private JTextArea txtrMrHPotter,textArea2,textArea3;
	private JTextField textField;
	private JTextField textField_1;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JButton btnSubmit;
    String email_regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$";
    int count=250;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PublicRelations frame = new PublicRelations();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PublicRelations() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(191, 192, 196));
		panel_1.setBounds(0, 129, 1374, 614);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\pr_page.png"));
		label.setBounds(401, 0, 949, 365);
		panel_1.add(label);
		
		JLabel lblAddress = new JLabel("ADDRESS:");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Lato Heavy", Font.PLAIN, 20));
		lblAddress.setBounds(560, 397, 199, 51);
		panel_1.add(lblAddress);
		
		JLabel lblEmailId = new JLabel("EMAIL ID:");
		lblEmailId.setForeground(Color.BLACK);
		lblEmailId.setFont(new Font("Lato Heavy", Font.PLAIN, 20));
		lblEmailId.setBounds(849, 397, 199, 51);
		panel_1.add(lblEmailId);
		
		JLabel lblContact = new JLabel("CONTACT:");
		lblContact.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblContact.setBounds(1605, 526, 199, 51);
		contentPane.add(lblContact);
		
		JLabel lblWebsite = new JLabel("WEBSITE:");
		lblWebsite.setForeground(Color.BLACK);
		lblWebsite.setFont(new Font("Lato Heavy", Font.PLAIN, 20));
		lblWebsite.setBounds(1114, 397, 199, 51);
		panel_1.add(lblWebsite);
		
		txtrMrHPotter=new JTextArea();
		txtrMrHPotter.setFont(new Font("Lato Medium", Font.PLAIN, 13));
		txtrMrHPotter.setText("Mr. H. Potter,\r\nThe Cupboard under the Stairs,\r\n4 Privet Drive,\r\nLittle Whinging,\r\nSurrey.");
		txtrMrHPotter.setEditable(false);
		txtrMrHPotter.setForeground(Color.BLACK);
		txtrMrHPotter.setAlignmentX(CENTER_ALIGNMENT);
		txtrMrHPotter.setBounds(533, 445, 187, 120);
		panel_1.add(txtrMrHPotter);
		
		textArea2=new JTextArea();
		textArea2.setForeground(Color.BLACK);
		textArea2.setFont(new Font("Lato Medium", Font.PLAIN, 13));
		textArea2.setText("busintell2018@gmail.com\r\nbizwiz_erp@yahoo.co.in\r\n");
		textArea2.setEditable(false);
		textArea2.setBounds(812, 445, 187, 120);
		panel_1.add(textArea2);
		
		textArea3=new JTextArea();
		textArea3.setForeground(Color.BLACK);
		textArea3.setFont(new Font("Lato Medium", Font.PLAIN, 13));
		textArea3.setText("BusIntelligence.org\r\nBizWiz.co.in");
		textArea3.setEditable(false);
		textArea3.setBounds(1078, 445, 187, 120);
		panel_1.add(textArea3);
		
		JLabel lblContactUs = new JLabel("COMPLAINTS:");
		lblContactUs.setForeground(Color.BLACK);
		lblContactUs.setFont(new Font("Lato Heavy", Font.PLAIN, 20));
		lblContactUs.setBounds(78, 21, 199, 51);
		panel_1.add(lblContactUs);
		
		JLabel lblEnterEmail = new JLabel("Enter Email Address:");
		lblEnterEmail.setBounds(25, 72, 127, 24);
		panel_1.add(lblEnterEmail);
		
		textField = new JTextField();
		textField.setBounds(162, 74, 229, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterMobile = new JLabel("Enter Mobile Number:");
		lblEnterMobile.setBounds(25, 120, 127, 24);
		panel_1.add(lblEnterMobile);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 122, 229, 20);
		panel_1.add(textField_1);
		
		JLabel lblEnterComplaint = new JLabel("Enter Complaint:");
		lblEnterComplaint.setBounds(25, 170, 127, 24);
		panel_1.add(lblEnterComplaint);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(162, 170, 229, 120);
		textArea.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				count--;
				label_3.setText(String.valueOf(count));
				if(count<0){
					btnSubmit.setEnabled(false);
				}
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		panel_1.add(textArea);
		
		btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textField.getText().toString().matches(email_regex)){
					label_1.setText("Please enter valid email ID");
				}
				
				else if(textField_1.getText().length()<10 || textField_1.getText().length()>10){
					label_2.setText("Please enter a valid mobile number");
				}
				
				else{
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
						String str="insert into pub_rel values(?,?,?)";
						java.sql.PreparedStatement ps=cn.prepareStatement(str);
						ps.setString(1,textField.getText());	
						ps.setString(2,textField_1.getText());
						ps.setString(3,textArea.getText());
						ps.executeUpdate();
						cn.close();
						textField.setText(" ");
						textField_1.setText(" ");
						textArea.setText("");
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
			}
		});
		btnSubmit.setBounds(116, 318, 89, 23);
		panel_1.add(btnSubmit);
		
		label_1= new JLabel(" ");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Lato", Font.PLAIN, 11));
		label_1.setBounds(162, 100, 229, 14);
		panel_1.add(label_1);
		
		label_2 = new JLabel(" ");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Lato", Font.PLAIN, 11));
		label_2.setBounds(162, 150, 229, 14);
		panel_1.add(label_2);
		
		JLabel lblCharactersLeft = new JLabel("Characters Left: ");
		lblCharactersLeft.setForeground(Color.BLACK);
		lblCharactersLeft.setFont(new Font("Lato", Font.PLAIN, 11));
		lblCharactersLeft.setBounds(257, 301, 97, 24);
		panel_1.add(lblCharactersLeft);
		
		label_3 = new JLabel("250");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Lato", Font.PLAIN, 11));
		label_3.setBounds(344, 301, 51, 24);
		panel_1.add(label_3);
	}
}
