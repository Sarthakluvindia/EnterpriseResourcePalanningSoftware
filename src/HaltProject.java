import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import com.mysql.jdbc.Connection;


public class HaltProject extends JPanel {

	/**
	 * Create the panel.
	 */
	public HaltProject(String name) {
		setBounds(0, 0, 1225, 614);
		setBackground(new Color(191, 192, 196));
		setLayout(null);
		
		JLabel label = new JLabel(""+name);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lato Heavy", Font.PLAIN, 35));
		label.setBounds(33, 11, 299, 59);
		add(label);
		
		JButton btnHaltProject = new JButton("Start Project");
		btnHaltProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
					String query="update addproject set status='Live Project' where proj_name='"+name+"'";
					java.sql.PreparedStatement delps=cn.prepareStatement(query);
					delps.executeUpdate();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnHaltProject.setBounds(1045, 55, 128, 33);
		add(btnHaltProject);
		
try {
			
			JLabel lblNewLabel = new JLabel();
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
			String str="select * from addproject where proj_name='"+name+"'";
			java.sql.PreparedStatement ps4=cn.prepareStatement(str);
			ResultSet rs=ps4.executeQuery();
			while(rs.next()){
				
				lblNewLabel.setText("<html> Manager:"+rs.getString(4)+"<br> Start Date: "+rs.getString(2)+"<br> End Date: "+rs.getString(3)+"<br> Description: "+rs.getString(8)+"</html>");
			}
			
			lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setFont(new Font("Lato", Font.PLAIN, 13));
			lblNewLabel.setBounds(107, 440, 436, 106);
			add(lblNewLabel);
			Border border= BorderFactory.createLineBorder(Color.BLACK, 1);
			lblNewLabel.setBorder(border);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			DefaultPieDataset dpd=new DefaultPieDataset();
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
			String str="select * from update_proj where proj_name='"+name+"'";
			java.sql.PreparedStatement ps4=cn.prepareStatement(str);
			ResultSet rs=ps4.executeQuery();
			while(rs.next()){
				int progress=Integer.parseInt(rs.getString(13));
				dpd.setValue("Project Status", Double.parseDouble(rs.getString(13)));	
				dpd.setValue("Incomplete", 100-progress);
			}
			JFreeChart fc=ChartFactory.createPieChart("Project Record", dpd, true, true, false);
			ChartPanel cpan=new ChartPanel(fc);
			cpan.setBounds(342, 103, 564, 297);
			add(cpan);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		JButton btnDeleteProject = new JButton("Delete Project");
		btnDeleteProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
					String query="update addproject set status='Deleted' where proj_name='"+name+"'";
					java.sql.PreparedStatement delps=cn.prepareStatement(query);
					delps.executeUpdate();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnDeleteProject.setBounds(1045, 11, 128, 33);
		add(btnDeleteProject);
	}

}
