import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;


public class Finance extends JFrame {

	private JPanel contentPane;
	JPanel panel_2;
	JPanel panel_4;
	JButton addProject = new JButton("Add Project");
	JButton btnLive = new JButton("Live");
	JButton btnProj = new JButton("Completed");
	JButton button = new JButton("Deleted");
	JButton btnHalted = new JButton("Halted");
	JButton b=new JButton();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
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
		
		BufferedImage team = null;
	    try {
	        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\team.png");
	        team = ImageIO.read(file);
	    } catch (IOException ioex) {
	        System.err.println("load error: " + ioex.getMessage());
	    }
	    ImageIcon team_icon = new ImageIcon(team);
		JButton btnTeam = new JButton("Ledger");
		btnTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnTeam.setIcon(team_icon);
		btnTeam.setBackground(Color.BLACK);
		btnTeam.setForeground(Color.WHITE);
		btnTeam.setBounds(0, 0, 140, 45);
		panel_1.add(btnTeam);
		
		 BufferedImage settings = null;
		    try {
		        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\settings.png");
		        settings = ImageIO.read(file);
		    } catch (IOException ioex) {
		        System.err.println("load error: " + ioex.getMessage());
		    }
		    ImageIcon icon = new ImageIcon(settings);
			JButton btnSettings = new JButton("Loans");
			btnSettings.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnSettings.setIcon(icon);
			btnSettings.setBackground(Color.BLACK);
			btnSettings.setForeground(Color.WHITE);
			btnSettings.setBounds(0, 45, 140, 45);
			panel_1.add(btnSettings);
		
			panel_2 = new JPanel();
			panel_2.setBounds(139, 0, 1225, 614);
			panel_2.setBackground(new Color(191, 192, 196));
			panel_1.add(panel_2);
			panel_2.setLayout(null);
			
			panel_4 = new JPanel();
			panel_4.setBounds(0, 45, 1225, 569);
			panel_4.setBackground(new Color(191, 192, 196));
			panel_2.add(panel_4);
			panel_4.setLayout(null);
			
			JLabel lblProjectManagement = new JLabel("Finance");
			lblProjectManagement.setHorizontalAlignment(SwingConstants.CENTER);
			lblProjectManagement.setForeground(Color.BLACK);
			lblProjectManagement.setFont(new Font("Lato Heavy", Font.PLAIN, 35));
			lblProjectManagement.setBounds(426, 11, 426, 59);
			panel_4.add(lblProjectManagement);
			
			JLabel lblNewLabel = new JLabel("<html>Finance describes the management, creation and study of money, banking, credit, investments, assets and liabilities that make up financial systems, as well as the study of those financial instruments. Some people prefer to divide finance into three distinct categories: public finance, corporate finance and personal finance. There is also the recently emerging area of social finance. Additionally, the study of behavioral finance aims to learn about the more 'human' side of a science considered by most to be highly mathematical.<br><br>Public finance includes tax systems, government expenditures, budget procedures, stabilization policy and instruments, debt issues and other government concerns. Corporate finance involves managing assets, liabilities, revenues and debt for a business. Personal finance defines all financial decisions and activities of an individual or household, including budgeting, insurance, mortgage planning, savings and retirement planning.<br><br>Finance is a broad term that describes two related activities: the study of how money is managed and the actual process of acquiring needed funds. It encompasses the oversight, creation and study of money, banking, credit, investments, assets and liabilities that make up financial systems.<br><br>Many of the basic concepts in finance come from micro and macroeconomic theories.  One of the most fundamental theories is the time value of money, which essentially states that a dollar today is worth more than a dollar in the future.</html>");
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setFont(new Font("Lato Heavy", Font.PLAIN, 13));
			lblNewLabel.setBounds(514, 90, 642, 326);
			panel_4.add(lblNewLabel);
			
			BufferedImage projmgmt = null;
		    try {
		        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\finance.jpg");
		        projmgmt = ImageIO.read(file);
		    } catch (IOException ioex) {
		        System.err.println("load error: " + ioex.getMessage());
		    }
		    ImageIcon proj_mgmt = new ImageIcon(projmgmt);
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(proj_mgmt);
			lblNewLabel_1.setBounds(35, 90, 426, 320);
			panel_4.add(lblNewLabel_1);
			
			BufferedImage ana = null;
		    try {
		        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\ic_insert_chart_white_24dp.png");
		        ana = ImageIO.read(file);
		    } catch (IOException ioex) {
		        System.err.println("load error: " + ioex.getMessage());
		    }
		    ImageIcon analysis = new ImageIcon(ana);
			JButton btnInvestments = new JButton("Statement");
			btnInvestments.setIcon(analysis);
			btnInvestments.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnInvestments.setForeground(Color.WHITE);
			btnInvestments.setBackground(Color.BLACK);
			btnInvestments.setBounds(0, 90, 140, 45);
			panel_1.add(btnInvestments);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(Color.BLACK);
			panel_3.setBounds(0, 135, 140, 479);
			panel_1.add(panel_3);
	}

}
