package orders;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


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
import java.awt.FlowLayout;


public class fin extends JFrame {
		private JPanel contentPane;
		JPanel panel_2;
		JPanel panel_1 = new JPanel();
		JPanel panel = new JPanel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fin frame = new fin();
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
	public fin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,getToolkit().getScreenSize().width,getToolkit().getScreenSize().height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		/*JPanel panel = new JPanel();
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
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
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
		
		
		panel_1.setBackground(new Color(191, 192, 196));
		panel_1.setBounds(0, 129, 1374, 614);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setBounds(594, 446, 79, 38);
		panel_1.add(lblNewLabel_1);
		
		/*BufferedImage ledger = null;
	    try {
	        File file=new File("D:\\JAVA PROGRAM\\abc\\images\\ic_library_books_white_24dp.png");
	        ledger = ImageIO.read(file);
	    } catch (IOException ioex) {
	        System.err.println("load error: " + ioex.getMessage());
	    }
	    ImageIcon ledger_icon = new ImageIcon(ledger);*/
		
	
		
		/*BufferedImage loan = null;
	    try {
	        File file=new File("D:\\JAVA PROGRAM\\abc\\images\\ic_attach_money_white_24dp.png");
	        loan = ImageIO.read(file);
	    } catch (IOException ioex) {
	        System.err.println("load error: " + ioex.getMessage());
	    }
	    ImageIcon loan_icon = new ImageIcon(loan);*/
		
		JButton btnRiskAnalysis = new JButton("LOANS");
		//btnRiskAnalysis.setIcon(loan_icon);
		btnRiskAnalysis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				panel.add(new chart());
				panel.repaint();
				panel.validate();
				panel.updateUI();
			}
		});
		btnRiskAnalysis.setForeground(Color.WHITE);
		btnRiskAnalysis.setBackground(Color.BLACK);
		btnRiskAnalysis.setBounds(0, 49, 227, 50);
		panel_1.add(btnRiskAnalysis);
		
		/*BufferedImage finance = null;
	    try {
	        File file=new File("D:\\JAVA PROGRAM\\abc\\images\\ic_show_chart_white_24dp.png");
	        finance = ImageIO.read(file);
	    } catch (IOException ioex) {
	        System.err.println("load error: " + ioex.getMessage());
	    }
	    ImageIcon finance_icon = new ImageIcon(finance);*/
		
		JButton btnCompilance = new JButton("FINANCIAL STATEMENT ");
		//btnCompilance.setIcon(finance_icon);
		btnCompilance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				panel.add(new table_financial());
				panel.repaint();
				panel.validate();
				panel.updateUI();
			}
		});
		btnCompilance.setForeground(Color.WHITE);
		btnCompilance.setBackground(Color.BLACK);
		btnCompilance.setBounds(0, 98, 227, 56);
		panel_1.add(btnCompilance);
		
		
		panel.setBounds(228, 0, 1146, 614);
		panel_1.add(panel);
		
		JButton btnParticular = new JButton("PARTICULAR");
		btnParticular.setBounds(0, 0, 227, 50);
		btnParticular.setToolTipText("");
		btnParticular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.removeAll();
				panel_2.add(new table1());
				panel_2.repaint();
				panel_2.validate();
				panel_2.updateUI();
			}
		});
		panel.setLayout(null);
		btnParticular.setForeground(Color.WHITE);
		btnParticular.setBackground(Color.BLACK);
		panel.add(btnParticular);
		
		panel_2 = new JPanel();
		panel_2.setBounds(227, 52, 1147, 562);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnPurchases = new JButton("PURCHASES");
		btnPurchases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.removeAll();
				panel_2.add(new table2());
				panel_2.repaint();
				panel_2.validate();
				panel_2.updateUI();
			}
		});
		btnPurchases.setBounds(228, 0, 227, 50);
		btnPurchases.setToolTipText("");
		btnPurchases.setForeground(Color.WHITE);
		btnPurchases.setBackground(Color.BLACK);
		panel.add(btnPurchases);
		
		JButton btnDiscounts = new JButton("DISCOUNTS");
		btnDiscounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.removeAll();
				panel_2.add(new table3());
				panel_2.repaint();
				panel_2.validate();
				panel_2.updateUI();
			}
		});
		btnDiscounts.setBounds(454, 0, 227, 50);
		btnDiscounts.setToolTipText("");
		btnDiscounts.setForeground(Color.WHITE);
		btnDiscounts.setBackground(Color.BLACK);
		panel.add(btnDiscounts);
		
		JButton btnDrawings = new JButton("DRAWINGS");
		btnDrawings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.removeAll();
				panel_2.add(new table4());
				panel_2.repaint();
				panel_2.validate();
				panel_2.updateUI();
			}
		});
		btnDrawings.setBounds(682, 0, 227, 50);
		btnDrawings.setToolTipText("");
		btnDrawings.setForeground(Color.WHITE);
		btnDrawings.setBackground(Color.BLACK);
		panel.add(btnDrawings);
		
		JButton btnRent = new JButton("RENT");
		btnRent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.removeAll();
				panel_2.add(new table5());
				panel_2.repaint();
				panel_2.validate();
				panel_2.updateUI();
			}
		});
		btnRent.setBounds(907, 0, 227, 50);
		btnRent.setToolTipText("");
		btnRent.setForeground(Color.WHITE);
		btnRent.setBackground(Color.BLACK);
		panel.add(btnRent);
		
		JButton btnFinancialManagement = new JButton("LEDGER");
		//btnFinancialManagement.setIcon(ledger_icon);
		btnFinancialManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.add(panel);
				panel_1.updateUI();
			}
		});
		btnFinancialManagement.setBackground(Color.BLACK);
		btnFinancialManagement.setForeground(Color.WHITE);
		btnFinancialManagement.setBounds(0, 0, 227, 50);
		panel_1.add(btnFinancialManagement);
	}
}
