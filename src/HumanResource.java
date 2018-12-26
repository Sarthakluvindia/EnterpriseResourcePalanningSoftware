import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class HumanResource extends JFrame {

	private JPanel contentPane;
	JPanel panel_2;
	JPanel panel_4;
	JButton addProject = new JButton("Employee");
	JButton btnLive = new JButton("Employee");
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
					HumanResource frame = new HumanResource();
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
	public HumanResource() {
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
		JButton btnTeam = new JButton("Executives");
		btnTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.removeAll();
				panel_2.add(panel_4);
				panel_2.setLayout(null);
				BufferedImage add_projects = null;
			    try {
			        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\ic_add_circle_outline_white_24dp.png");
			        add_projects = ImageIO.read(file);
			    } catch (IOException ioex) {
			        System.err.println("load error: " + ioex.getMessage());
			    }
			    ImageIcon proj_add = new ImageIcon(add_projects);
				
				
				addProject.setIcon(proj_add);
				addProject.setBackground(Color.BLACK);
				addProject.setForeground(Color.WHITE);
				addProject.setBounds(0, 0, 140, 45);
				panel_2.add(addProject);
				BufferedImage live_projects = null;
			    try {
			        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\ic_remove_circle_outline_white_24dp.png");
			        live_projects = ImageIO.read(file);
			    } catch (IOException ioex) {
			        System.err.println("load error: " + ioex.getMessage());
			    }
			    ImageIcon proj_live = new ImageIcon(live_projects);
				
				btnLive.setIcon(proj_live);
				btnLive.setBackground(Color.BLACK);
				btnLive.setForeground(Color.WHITE);
				btnLive.setBounds(140, 0, 140, 45);
				panel_2.add(btnLive);
				panel_2.updateUI();
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
			JButton btnSettings = new JButton("Performance");
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
			
			JLabel lblProjectManagement = new JLabel("Human Resources");
			lblProjectManagement.setHorizontalAlignment(SwingConstants.CENTER);
			lblProjectManagement.setForeground(Color.BLACK);
			lblProjectManagement.setFont(new Font("Lato Heavy", Font.PLAIN, 35));
			lblProjectManagement.setBounds(426, 11, 426, 59);
			panel_4.add(lblProjectManagement);
			
			JLabel lblNewLabel = new JLabel("<html>Human resources is used to describe both the people who work for a company or organization and the department responsible for managing resources related to employees. The term human resources was first coined in the 1960s when the value of labor relations began to garner attention and when notions such as motivation, organizational behavior, and selection assessments began to take shape.<br><br>Human resource management is a contemporary, umbrella term used to describe the management and development of employees in an organization. Also called personnel or talent management (although these terms are a bit antiquated), human resource management involves overseeing all things related to managing an organization’s human capital.<br><br>The role of human resources professionals is to ensure that a company’s most important asset—its human capital—is being nurtured and supported through the creation and management of programs, policies, and procedures, and by fostering a positive work environment through effective employee-employer relations.<br><br>The concept behind human resource management is that employees who are subject to effective human resource management are able to more effectively and productively contribute to a company’s overall direction, thereby ensuring that company goals and objectives are accomplished.</html>");
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setFont(new Font("Lato Heavy", Font.PLAIN, 13));
			lblNewLabel.setBounds(514, 90, 642, 326);
			panel_4.add(lblNewLabel);
			
			BufferedImage projmgmt = null;
		    try {
		        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\Human_Resources.png");
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
			JButton btnInvestments = new JButton("Attendance");
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
