import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;

import java.awt.Font;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;

public class LiveProjects extends JPanel {

	int sum;
	String[] names=null;

	public LiveProjects() {
		setBounds(0, 0, 1225, 614);
		setBackground(new Color(191, 192, 196));
		setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
		setLayout(new GridLayout(3,2,25,25));
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
			String str="select count(proj_name) from addproject where status='Live Project'";
			java.sql.PreparedStatement ps4=cn.prepareStatement(str);
			ResultSet rs=ps4.executeQuery();
			while(rs.next()){
				sum=rs.getInt(1);
			}
		} 
		catch (Exception e) {
			
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
			String str="select proj_name from addproject where status='Live Project'";
			java.sql.PreparedStatement ps4=cn.prepareStatement(str);
			ResultSet rs=ps4.executeQuery();
			while(rs.next())
			{
				String em=rs.getString(1);
				names=em.split("\n");
				JButton[] proj=new JButton[names.length];
				for(int i=0;i<names.length;i++)
				{
					proj[i]=new JButton();
					proj[i].setText(""+names[i]);
					String proj_name=names[i];
					proj[i].addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							removeAll();
							setLayout(null);
							add(new Project(proj_name));
							updateUI();
						}
					});
					proj[i].setBackground(Color.BLACK);
					proj[i].setFont(new Font("Lato Heavy", Font.PLAIN, 20));
					proj[i].setForeground(new Color(102, 205, 170));
					add(proj[i]);
				}
			}
		}
		catch (Exception e) {
			
		}
	}
}
