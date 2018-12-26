package orders;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;


import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class hr extends JFrame {


 private JPanel contentPane;
 JPanel panel_2 = new JPanel();

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     hr frame = new hr();
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
 public hr() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
   myPicture = ImageIO.read(new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanner\\Busintelligence.jpg"));
  }
  catch(Exception e)
  {
   System.err.println(""+e.getMessage());
  }
  /*JLabel picLabel = new JLabel(new ImageIcon(myPicture));
  picLabel.setBounds(687, 0, 786, 121);
  panel.add(picLabel);
  BufferedImage myPicture1 = null;
  try{
   myPicture1 = ImageIO.read(new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanner\\copyright.jpg"));
  }
  catch(Exception e)
  {
   System.err.println(""+e.getMessage());
  }
  JLabel picLabel1 = new JLabel(new ImageIcon(myPicture1));
  picLabel1.setBounds(0, 0, 120, 82);
  panel.add(picLabel1);*/
  
  JPanel panel_1 = new JPanel();
  panel_1.setBackground(new Color(191, 192, 196));
  panel_1.setBounds(0, 134, 1374, 665);
  panel_1.setLayout(null);
  contentPane.add(panel_1);
 /** BufferedImage salary = null;
     try {
         File file=new File("D:\\JAVA PROGRAM\\se\\images\\ic_monetization_on_white_24dp.png");
         salary = ImageIO.read(file);
     } catch (IOException ioex) {
         System.err.println("load error: " + ioex.getMessage());
     }
     ImageIcon salary_icon = new ImageIcon(salary);
  */
  JButton btnSalaryStatement = new JButton("Salary");
  //btnSalaryStatement.setIcon(salary_icon);
  btnSalaryStatement.setBackground(Color.BLACK);
  btnSalaryStatement.setForeground(Color.WHITE);
  btnSalaryStatement.setBounds(0, 66, 158, 32);
  panel_1.add(btnSalaryStatement);
 /* BufferedImage team = null;
     try {
         File file=new File("D:\\JAVA PROGRAM\\se\\images\\ic_people_white_24dp.png");
         team = ImageIO.read(file);
     } catch (IOException ioex) {
         System.err.println("load error: " + ioex.getMessage());
     }
     ImageIcon team_icon = new ImageIcon(team);*/
  
  JButton btnViewEmployee = new JButton("View");
  //btnViewEmployee.setIcon(team_icon);
  btnViewEmployee.setBackground(Color.BLACK);
  btnViewEmployee.setForeground(Color.WHITE);
  btnViewEmployee.setBounds(0, 33, 158, 32);
  panel_1.add(btnViewEmployee);
  
  /*BufferedImage add_people = null;
     try {
         File file=new File("D:\\JAVA PROGRAM\\se\\images\\ic_person_add_white_24dp.png");
         add_people = ImageIO.read(file);
     } catch (IOException ioex) {
         System.err.println("load error: " + ioex.getMessage());
     }
     ImageIcon add_people_icon = new ImageIcon(add_people);*/
  
  JButton btnAddEmployee = new JButton("    Add");
 // btnAddEmployee.setIcon(add_people_icon);
  btnAddEmployee.setBackground(Color.BLACK);
  btnAddEmployee.setForeground(Color.WHITE);
  btnAddEmployee.setBounds(0, 0, 158, 32);
  panel_1.add(btnAddEmployee);
  
 /* BufferedImage performance = null;
     try {
         File file=new File("D:\\JAVA PROGRAM\\se\\images\\ic_assessment_white_24dp.png");
         performance = ImageIO.read(file);
     } catch (IOException ioex) {
         System.err.println("load error: " + ioex.getMessage());
     }
     ImageIcon performance_icon = new ImageIcon(performance);*/
     
  JButton btnViewPerformance_1 = new JButton("Performance");
  btnViewPerformance_1.addActionListener(new ActionListener() {
  	public void actionPerformed(ActionEvent arg0) {
  		panel_2.removeAll();
		panel_2.add(new chart_performance());
		panel_2.repaint();
		panel_2.validate();
		panel_2.updateUI();
  	}
  });
  //btnViewPerformance_1.setIcon(performance_icon);
  btnViewPerformance_1.setBackground(Color.BLACK);
  btnViewPerformance_1.setForeground(Color.WHITE);
  btnViewPerformance_1.setBounds(0, 97, 158, 32);
  panel_1.add(btnViewPerformance_1);
 /* BufferedImage attendance = null;
     try {
         File file=new File("D:\\JAVA PROGRAM\\se\\images\\ic_playlist_add_check_white_24dp.png");
         attendance = ImageIO.read(file);
     } catch (IOException ioex) {
         System.err.println("load error: " + ioex.getMessage());
     }
     ImageIcon attendance_icon = new ImageIcon(attendance);*/
  
  JButton btnAttendance = new JButton("Attendance");
  //btnAttendance.setIcon(attendance_icon);
  btnAttendance.setBackground(Color.BLACK);
  btnAttendance.setForeground(Color.WHITE);
  btnAttendance.setBounds(0, 129, 158, 32);
  panel_1.add(btnAttendance);
 /*BufferedImage remove = null;
     try {
         File file=new File("D:\\JAVA PROGRAM\\se\\images\\ic_cancel_white_24dp.png");
         remove = ImageIO.read(file);
     } catch (IOException ioex) {
         System.err.println("load error: " + ioex.getMessage());
     }
     ImageIcon remove_icon = new ImageIcon(remove);*/
   
  JButton btnRemoveEmployee_1 = new JButton("Remove");
  //  btnRemoveEmployee_1.setIcon(remove_icon);
  btnRemoveEmployee_1.setBackground(Color.BLACK);
  btnRemoveEmployee_1.setForeground(Color.WHITE);
  btnRemoveEmployee_1.setBounds(0, 160, 158, 32);
  panel_1.add(btnRemoveEmployee_1);
  
 
  panel_2.setBounds(158, 0, 1216, 665);
  panel_1.add(panel_2);
  panel_2.setLayout(null);
  
  JButton button = new JButton("    Add");
  button.setForeground(Color.WHITE);
  button.setBackground(Color.BLACK);
  button.setBounds(0, 0, 158, 32);
  panel_2.add(button);
  
  JButton button_1 = new JButton("    Add");
  button_1.setForeground(Color.WHITE);
  button_1.setBackground(Color.BLACK);
  button_1.setBounds(159, 0, 158, 32);
  panel_2.add(button_1);
 }
}



