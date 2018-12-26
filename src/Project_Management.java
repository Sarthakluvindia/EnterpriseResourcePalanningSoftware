import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import com.mysql.jdbc.Connection;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;


public class Project_Management extends JFrame {

	private JPanel contentPane;
	JPanel panel_2;
	JPanel panel_4;
	JButton addProject = new JButton("Add Project");
	JButton btnLive = new JButton("Live");
	JButton btnProj = new JButton("Completed");
	JButton button = new JButton("Deleted");
	JButton btnHalted = new JButton("Halted");
	JButton b=new JButton();
	JLabel label=new JLabel("Choose projects to be compared: ");
	JComboBox box=new JComboBox();
	JComboBox box1=new JComboBox();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project_Management frame = new Project_Management();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Project_Management() {
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
		JButton btnTeam = new JButton("Team");
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
			JButton btnSettings = new JButton("Projects");
			btnSettings.addActionListener(new ActionListener() {
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
					
					addProject.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							panel_4.removeAll();
							panel_4.add(new AddProject());
							panel_4.repaint();
							panel_4.validate();
							panel_4.updateUI();
						}
					});
					addProject.setIcon(proj_add);
					addProject.setBackground(Color.BLACK);
					addProject.setForeground(Color.WHITE);
					addProject.setBounds(0, 0, 140, 45);
					panel_2.add(addProject);
					
					BufferedImage live_projects = null;
				    try {
				        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\ic_surround_sound_white_24dp.png");
				        live_projects = ImageIO.read(file);
				    } catch (IOException ioex) {
				        System.err.println("load error: " + ioex.getMessage());
				    }
				    ImageIcon proj_live = new ImageIcon(live_projects);
					
					btnLive.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							panel_4.removeAll();
							panel_4.add(new LiveProjects());
							panel_4.repaint();
							panel_4.validate();
							panel_4.updateUI();
						}
					});
					btnLive.setIcon(proj_live);
					btnLive.setBackground(Color.BLACK);
					btnLive.setForeground(Color.WHITE);
					btnLive.setBounds(140, 0, 140, 45);
					panel_2.add(btnLive);
				
					
					BufferedImage completed_projects = null;
				    try {
				        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\done.png");
				        completed_projects = ImageIO.read(file);
				    } catch (IOException ioex) {
				        System.err.println("load error: " + ioex.getMessage());
				    }
				    ImageIcon proj_icon = new ImageIcon(completed_projects);
					
					btnProj.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							panel_4.removeAll();
							panel_4.add(new Completed_Proj());
							panel_4.repaint();
							panel_4.validate();
							panel_4.updateUI();
						}
					});
					btnProj.setIcon(proj_icon);
					btnProj.setBackground(Color.BLACK);
					btnProj.setForeground(Color.WHITE);
					btnProj.setBounds(280, 0, 140, 45);
					panel_2.add(btnProj);
					
					BufferedImage deleted_projects = null;
				    try {
				        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\ic_delete_white_24dp.png");
				        deleted_projects = ImageIO.read(file);
				    } catch (IOException ioex) {
				        System.err.println("load error: " + ioex.getMessage());
				    }
				    ImageIcon proj_deleted = new ImageIcon(deleted_projects);
					
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							panel_4.removeAll();
							panel_4.add(new Deleted_Proj());
							panel_4.repaint();
							panel_4.validate();
							panel_4.updateUI();
						}
					});
					button.setForeground(Color.WHITE);
					button.setIcon(proj_deleted);
					button.setBackground(Color.BLACK);
					button.setBounds(560,0, 140, 45);
					panel_2.add(button);
					
					BufferedImage halted_projects = null;
				    try {
				        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\ic_pan_tool_white_24dp.png");
				        halted_projects = ImageIO.read(file);
				    } catch (IOException ioex) {
				        System.err.println("load error: " + ioex.getMessage());
				    }
				    ImageIcon proj_halted = new ImageIcon(halted_projects);
					
					btnHalted.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							panel_4.removeAll();
							panel_4.add(new Halted_Proj());
							panel_4.repaint();
							panel_4.validate();
							panel_4.updateUI();
							
						}
					});
					btnHalted.setForeground(Color.WHITE);
					btnHalted.setIcon(proj_halted);
					btnHalted.setBackground(Color.BLACK);
					btnHalted.setBounds(420, 0, 140, 45);
					panel_2.add(btnHalted);
					
					panel_2.updateUI();
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
			
			JLabel lblProjectManagement = new JLabel("Project Management");
			lblProjectManagement.setHorizontalAlignment(SwingConstants.CENTER);
			lblProjectManagement.setForeground(Color.BLACK);
			lblProjectManagement.setFont(new Font("Lato Heavy", Font.PLAIN, 35));
			lblProjectManagement.setBounds(426, 11, 426, 59);
			panel_4.add(lblProjectManagement);
			
			JLabel lblNewLabel = new JLabel("<html>A project is temporary in that it has a defined beginning and end in time, and therefore defined scope and resources.<br><br> And a project is unique in that it is not a routine operation, but a specific set of operations designed to accomplish a singular goal. So a project team often includes people who don’t usually work together – sometimes from different organizations and across multiple geographies.<br><br> The development of software for an improved business process, the construction of a building or bridge, the relief effort after a natural disaster, the expansion of sales into a new geographic market — all are projects.<br><br>And all must be expertly managed to deliver the on-time, on-budget results, learning and integration that organizations need.<br><br>Project management, then, is the application of knowledge, skills, tools, and techniques to project activities to meet the project requirements.</html>");
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setFont(new Font("Lato Heavy", Font.PLAIN, 13));
			lblNewLabel.setBounds(514, 90, 642, 326);
			panel_4.add(lblNewLabel);
			
			BufferedImage projmgmt = null;
		    try {
		        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\project_management.jpg");
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
			JButton btnInvestments = new JButton("Analysis");
			btnInvestments.setIcon(analysis);
			btnInvestments.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panel_2.removeAll();
					panel_2.add(panel_4);
					panel_4.removeAll();
					
					label.setHorizontalAlignment(SwingConstants.CENTER);
					label.setFont(new Font("Lato Heavy", Font.PLAIN, 13));
					label.setBounds(25, 10, 299, 20);
					panel_2.add(label);
					
					DefaultComboBoxModel dcbm=new DefaultComboBoxModel();
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
						String str="select proj_name from addproject";
						java.sql.PreparedStatement ps4=cn.prepareStatement(str);
						ResultSet rs=ps4.executeQuery();
						while(rs.next()){
							dcbm.addElement(rs.getString(1));
						}
						box.setModel(dcbm);
						cn.close();
					} catch (Exception e) {
						// TODO: handle exception
					}
					box.setBounds(350, 10,200, 20);
					panel_2.add(box);
					
					DefaultComboBoxModel dcbm1=new DefaultComboBoxModel();
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
						String str="select proj_name from addproject";
						java.sql.PreparedStatement ps4=cn.prepareStatement(str);
						ResultSet rs=ps4.executeQuery();
						while(rs.next()){
							dcbm1.addElement(rs.getString(1));
						}
						box1.setModel(dcbm1);
						cn.close();
					} catch (Exception e) {
						// TODO: handle exception
					}
					box1.setBounds(650, 10,200, 20);
					panel_2.add(box1);
					b.setText("Compare");
					b.setBounds(1000,10,100,20);
					b.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							panel_4.removeAll();
							panel_4.add(new Analysis(box.getSelectedItem().toString(),box1.getSelectedItem().toString()));
							panel_4.repaint();
							panel_4.validate();
							panel_4.updateUI();
							
						}
					});
					panel_2.add(b);
					panel_2.updateUI();
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
