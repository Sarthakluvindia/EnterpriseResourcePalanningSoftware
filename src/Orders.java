import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import com.mysql.jdbc.Connection;

public class Orders extends JFrame {
	JLabel lblNewLabel;
	private JPanel contentPane;
	JButton btnGirl,btnBoy_1;
	JPanel panel_1;
	JLabel lblShirt;
	JLabel lblNewLabel_1;
	JLabel lblimage,lbljeans,lblboy_image,lblgirl_image;
	JLabel lblbrand,lblcolor,lblprice,lblsize,lblquantity,lbltype;
	JLabel lblbrand1,lblcolor1,lblprice1,lblsize1,lblquantity1,lbltype1;
	JComboBox comboBox,comboBox1;
	JButton add,add1,wadd,wadd1,badd,badd1,gadd,gadd1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orders frame = new Orders();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Orders() {
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
		
		panel_1 = new JPanel(){
			@Override
			protected void paintComponent(Graphics arg0) {
				
				super.paintComponent(arg0);
				arg0.drawLine(745,70,745,596);
			}
		};
		panel_1.setBackground(new Color(191, 192, 196));
		panel_1.setBounds(0, 129, 1374, 614);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		BufferedImage team = null;
	    try {
	        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\man_icon.png");
	        team = ImageIO.read(file);
	    } catch (IOException ioex) {
	        System.err.println("load error: " + ioex.getMessage());
	    }
	    ImageIcon team_icon = new ImageIcon(team);
		JButton btnTeam = new JButton("Man");
		btnTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("Men's Collection");
				lblShirt.setText("Shirt");
				lblNewLabel_1.setText("Jeans");
				btnBoy_1.setVisible(false);
				btnGirl.setVisible(false);
				lblimage.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\man_shirt.jpg"));
				lbljeans.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\man_jeans.jpg"));
				lblsize.setText("SIZE: XS S M L XL");
				lblbrand.setText("BRAND: ALLEN SOLLY");
				lblcolor.setText("COLOR: BLUE");
				lbltype.setText("FABRIC TYPE: COTTON");
				lblquantity.setText("QUANTITY: ");
				lblprice.setText("PRICE: 2,299/-");
				panel_1.add(comboBox);
				lblsize1.setText("SIZE: 32 34 36 38 40");
				lblbrand1.setText("BRAND: PEPE JEANS");
				lblcolor1.setText("COLOR: BLACK");
				lbltype1.setText("FABRIC TYPE: POLYESTER");
				lblquantity1.setText("QUANTITY: ");
				lblprice1.setText("PRICE: 1,499/-");
				panel_1.add(comboBox1);
				add.setVisible(true);
				add1.setVisible(true);
				wadd.setVisible(false);
				wadd1.setVisible(false);
				badd.setVisible(false);
				gadd.setVisible(false);
				badd1.setVisible(false);
				gadd1.setVisible(false);
				lblboy_image.setIcon(null);
				lblgirl_image.setIcon(null);
			}
		});
		btnTeam.setIcon(team_icon);
		btnTeam.setBackground(Color.BLACK);
		btnTeam.setForeground(Color.WHITE);
		btnTeam.setBounds(0, 0, 142, 45);
		panel_1.add(btnTeam);
		
		BufferedImage woman = null;
	    try {
	        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\woman_icon.jpg.png");
	        woman= ImageIO.read(file);
	    } catch (IOException ioex) {
	        System.err.println("load error: " + ioex.getMessage());
	    }
	    ImageIcon woman_icon = new ImageIcon(woman);
	    JButton btnWoman = new JButton("Woman");
	    btnWoman.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		lblNewLabel.setText("Women's Collection");
	    		lblShirt.setText("Top");
				lblNewLabel_1.setText("Jeans");
	    		btnBoy_1.setVisible(false);
				btnGirl.setVisible(false);
				lblimage.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\woman_top.jpg"));
				lbljeans.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\woman_jeans.jpeg"));
				lblsize.setText("SIZE: XS S M L XL");
				lblbrand.setText("BRAND: VOONIK");
				lblcolor.setText("COLOR: BLACK");
				lbltype.setText("FABRIC TYPE: COTTON");
				lblquantity.setText("QUANTITY: ");
				lblprice.setText("PRICE: 1,299/-");
				panel_1.add(comboBox);
				lblsize1.setText("SIZE: 32 34 36 38 40");
				lblbrand1.setText("BRAND: LEE");
				lblcolor1.setText("COLOR: BLUE");
				lbltype1.setText("FABRIC TYPE: SYNTHETIC");
				lblquantity1.setText("QUANTITY: ");
				lblprice1.setText("PRICE: 1,599/-");
				panel_1.add(comboBox1);
				lblboy_image.setIcon(null);
				lblgirl_image.setIcon(null);
				add.setVisible(false);
				add1.setVisible(false);
				wadd.setVisible(false);
				wadd1.setVisible(true);
				badd.setVisible(true);
				gadd.setVisible(false);
				badd1.setVisible(false);
				gadd1.setVisible(false);
	    	}
	    });
		btnWoman.setBounds(0, 44, 142, 45);
		btnWoman.setBackground(Color.BLACK);
		btnWoman.setIcon(woman_icon);
		btnWoman.setForeground(Color.WHITE);
		panel_1.add(btnWoman);
		
		BufferedImage kids = null;
	    try {
	        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\kids_icon.png");
	        kids= ImageIO.read(file);
	    } catch (IOException ioex) {
	        System.err.println("load error: " + ioex.getMessage());
	    }
	    ImageIcon kids_icon = new ImageIcon(kids);
		JButton btnBoy = new JButton("Kids");
		btnBoy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("Kid's Collection");
				lblNewLabel_1.setText("Girl");
				lblShirt.setText("Boy");
				btnBoy_1.setVisible(true);
				btnGirl.setVisible(true);
				lblimage.setIcon(null);
				lbljeans.setIcon(null);
				lblsize.setText("");
				lblbrand.setText("");
				lblcolor.setText("");
				lbltype.setText("");
				lblquantity.setText("");
				lblprice.setText("");
				panel_1.add(comboBox).setVisible(false);
				lblsize1.setText("");
				lblbrand1.setText("");
				lblcolor1.setText("");
				lbltype1.setText("");
				lblquantity1.setText("");
				lblprice1.setText("");
				panel_1.add(comboBox1).setVisible(false);
				lblboy_image=new JLabel();
				lblboy_image.setBounds(200,100,450,500);
				lblboy_image.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\boy_model.jpg"));
				panel_1.add(lblboy_image);
				lblgirl_image=new JLabel();
				lblgirl_image.setBounds(850,100,450,500);
				lblgirl_image.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\girl_model.jpg"));
				panel_1.add(lblgirl_image);
				add.setVisible(false);
				add1.setVisible(false);
				wadd.setVisible(false);
				wadd1.setVisible(false);
				badd.setVisible(false);
				gadd.setVisible(false);
				badd1.setVisible(false);
				gadd1.setVisible(false);
			}
		});
		btnBoy.setForeground(Color.WHITE);
		btnBoy.setBackground(Color.BLACK);
		btnBoy.setIcon(kids_icon);
		btnBoy.setBounds(0, 88, 142, 45);
		panel_1.add(btnBoy);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 133, 142, 481);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		BufferedImage boy = null;
	    try {
	        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\male_icon.png");
	        boy= ImageIO.read(file);
	    } catch (IOException ioex) {
	        System.err.println("load error: " + ioex.getMessage());
	    }
	    ImageIcon boy_icon = new ImageIcon(boy);
		btnBoy_1 = new JButton("Boy");
		btnBoy_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("Boy's Collection");
				lblShirt.setText("Shirt");
				lblNewLabel_1.setText("Shorts");
				lblimage.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\boy_shirt.jpeg"));
				lbljeans.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\boy_shorts.jpg"));
				lblsize.setText("SIZE: XS S M L XL");
				lblbrand.setText("BRAND: RUFF");
				lblcolor.setText("COLOR: BLUE");
				lbltype.setText("FABRIC TYPE: COTTON");
				lblquantity.setText("QUANTITY: ");
				lblprice.setText("PRICE: 799/-");
				panel_1.add(comboBox);
				lblsize1.setText("SIZE: 32 34 36 38 40");
				lblbrand1.setText("BRAND: RUFF");
				lblcolor1.setText("COLOR: KHAKI");
				lbltype1.setText("FABRIC TYPE: COTTON");
				lblquantity1.setText("QUANTITY: ");
				lblprice1.setText("PRICE: 599/-");
				panel_1.add(comboBox1);
				lblboy_image.setIcon(null);
				lblgirl_image.setIcon(null);
				add.setVisible(false);
				add1.setVisible(false);
				wadd.setVisible(false);
				wadd1.setVisible(false);
				badd.setVisible(true);
				gadd.setVisible(false);
				badd1.setVisible(true);
				gadd1.setVisible(false);
			}
		});
		btnBoy_1.setForeground(Color.WHITE);
		btnBoy_1.setIcon(boy_icon);
		btnBoy_1.setVisible(false);
		btnBoy_1.setBackground(Color.BLACK);
		btnBoy_1.setBounds(0, 0, 142, 45);
		panel_2.add(btnBoy_1);
		
		BufferedImage girl = null;
	    try {
	        File file=new File("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\female_icon.png");
	        girl= ImageIO.read(file);
	    } catch (IOException ioex) {
	        System.err.println("load error: " + ioex.getMessage());
	    }
	    ImageIcon girl_icon = new ImageIcon(girl);
	    btnGirl = new JButton("Girl");
	    btnGirl.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		lblNewLabel.setText("Girl's Collection");
	    		lblShirt.setText("Top");
				lblNewLabel_1.setText("Skirt");
				lblimage.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\girl_top.jpg"));
				lbljeans.setIcon(new ImageIcon("D:\\JAVA PROGRAM\\EnterpriseResourcePlanning\\Images\\girl_skirt.jpg"));
				lblsize.setText("SIZE: XS S M L XL");
				lblbrand.setText("BRAND: RUFF");
				lblcolor.setText("COLOR: GREEN");
				lbltype.setText("FABRIC TYPE: COTTON");
				lblquantity.setText("QUANTITY: ");
				lblprice.setText("PRICE: 1,299/-");
				panel_1.add(comboBox);
				lblsize1.setText("SIZE: XS S M L XL");
				lblbrand1.setText("BRAND: ALLEN SOLLY");
				lblcolor1.setText("COLOR: PINK");
				lbltype1.setText("FABRIC TYPE: SYNTHETIC");
				lblquantity1.setText("QUANTITY: ");
				lblprice1.setText("PRICE: 2,599/-");
				panel_1.add(comboBox1);
				lblboy_image.setIcon(null);
				lblgirl_image.setIcon(null);
				add.setVisible(false);
				add1.setVisible(false);
				wadd.setVisible(false);
				wadd1.setVisible(false);
				badd.setVisible(false);
				gadd.setVisible(true);
				badd1.setVisible(false);
				gadd1.setVisible(true);
	    	}
	    });
		btnGirl.setIcon(girl_icon);
		btnGirl.setVisible(false);
		btnGirl.setForeground(Color.WHITE);
		btnGirl.setBackground(Color.BLACK);
		btnGirl.setBounds(0, 45, 142, 45);
		panel_2.add(btnGirl);
		
		lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Lato Heavy", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(580, 18, 350, 30);
		panel_1.add(lblNewLabel);
		
		lblShirt = new JLabel("");
		lblShirt.setForeground(Color.BLACK);
		lblShirt.setFont(new Font("Lato Heavy", Font.PLAIN, 24));
		lblShirt.setHorizontalAlignment(SwingConstants.CENTER);
		lblShirt.setBounds(385, 59, 114, 30);
		panel_1.add(lblShirt);
		
		 lblNewLabel_1= new JLabel("");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Lato Heavy", Font.PLAIN, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(1003, 59,114, 30);
		panel_1.add(lblNewLabel_1);
		
		lblimage=new JLabel();
		lblimage.setBounds(180,110, 200, 250);;
		panel_1.add(lblimage);
		
		lbljeans=new JLabel();
		lbljeans.setBounds(785,110, 200, 250);;
		panel_1.add(lbljeans);
		
		lblsize=new JLabel();
		lblsize.setBounds(405, 110, 152, 30);
		lblsize.setForeground(Color.BLACK);
		lblsize.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lblsize.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblsize);
		
		lblbrand=new JLabel();
		lblbrand.setBounds(405, 150, 200, 30);
		lblbrand.setForeground(Color.BLACK);
		lblbrand.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lblbrand.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblbrand);
		
		lblcolor=new JLabel();
		lblcolor.setBounds(405, 230, 152, 30);
		lblcolor.setForeground(Color.BLACK);
		lblcolor.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lblcolor.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblcolor);
	
		lblquantity=new JLabel();
		lblquantity.setBounds(405, 270, 152, 30);
		lblquantity.setForeground(Color.BLACK);
		lblquantity.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lblquantity.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblquantity);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(510, 275, 39, 22);
		
		lblprice=new JLabel();
		lblprice.setBounds(405, 310, 152, 30);
		lblprice.setForeground(Color.BLACK);
		lblprice.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lblprice.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblprice);
		
		lbltype=new JLabel();
		lbltype.setBounds(405, 190, 200, 30);
		lbltype.setForeground(Color.BLACK);
		lbltype.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lbltype.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lbltype);
		
		lblsize1=new JLabel();
		lblsize1.setBounds(1005, 110, 202, 30);
		lblsize1.setForeground(Color.BLACK);
		lblsize1.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lblsize1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblsize1);
		
		lblbrand1=new JLabel();
		lblbrand1.setBounds(1005, 150, 200, 30);
		lblbrand1.setForeground(Color.BLACK);
		lblbrand1.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lblbrand1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblbrand1);
		
		lblcolor1=new JLabel();
		lblcolor1.setBounds(1005, 230, 152, 30);
		lblcolor1.setForeground(Color.BLACK);
		lblcolor1.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lblcolor1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblcolor1);
	
		lblquantity1=new JLabel();
		lblquantity1.setBounds(1005, 270, 152, 30);
		lblquantity1.setForeground(Color.BLACK);
		lblquantity1.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lblquantity1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblquantity1);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox1.setBounds(1105, 275, 39, 22);
		
		lblprice1=new JLabel();
		lblprice1.setBounds(1005, 310, 152, 30);
		lblprice1.setForeground(Color.BLACK);
		lblprice1.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lblprice1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblprice1);
		
		lbltype1=new JLabel();
		lbltype1.setBounds(1005, 190, 300, 30);
		lbltype1.setForeground(Color.BLACK);
		lbltype1.setFont(new Font("Lato Heavy", Font.PLAIN, 17));
		lbltype1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lbltype1);
		
		add=new JButton("ADD TO CART");
		add.setBounds(385,365,115,30);
		add.setVisible(false);
		panel_1.add(add);
		
		add1=new JButton("ADD TO CART");
		add1.setBounds(1003,365,115,30);
		add1.setVisible(false);
		panel_1.add(add1);
		
		wadd=new JButton("ADD TO CART");
		wadd.setBounds(385,365,115,30);
		wadd.setVisible(false);
		panel_1.add(wadd);
		
		wadd1=new JButton("ADD TO CART");
		wadd1.setBounds(1003,365,115,30);
		wadd1.setVisible(false);
		panel_1.add(wadd1);
		
		badd=new JButton("ADD TO CART");
		badd.setBounds(385,365,115,30);
		badd.setVisible(false);
		panel_1.add(badd);
		
		badd1=new JButton("ADD TO CART");
		badd1.setBounds(1003,365,115,30);
		badd1.setVisible(false);
		panel_1.add(badd1);
		
		gadd=new JButton("ADD TO CART");
		gadd.setBounds(385,365,115,30);
		gadd.setVisible(false);
		panel_1.add(gadd);
		
		gadd1=new JButton("ADD TO CART");
		gadd1.setBounds(1003,365,115,30);
		gadd1.setVisible(false);
		panel_1.add(gadd1);
	}
}
