import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import com.mysql.jdbc.Connection;

import javax.swing.JProgressBar;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Project extends JPanel {

	/**
	 * Create the panel.
	 */
	public Project(String name) {
		setBounds(0, 0, 1225, 614);
		setBackground(new Color(191, 192, 196));
		setLayout(null);
		
		JLabel label = new JLabel(""+name);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lato Heavy", Font.PLAIN, 35));
		label.setBounds(33, 11, 299, 59);
		add(label);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				add(new UpdateProjects(name));
				updateUI();
			}
		});
		btnUpdate.setBounds(1045, 11, 104, 33);
		add(btnUpdate);
		try {
			DefaultCategoryDataset dcd=new DefaultCategoryDataset();
			JProgressBar progressBar = new JProgressBar(0,100);
			JLabel lblNewLabel = new JLabel();
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
			String str="select * from update_proj where proj_name='"+name+"'";
			java.sql.PreparedStatement ps4=cn.prepareStatement(str);
			ResultSet rs=ps4.executeQuery();
			while(rs.next()){
				dcd.setValue(Integer.parseInt(rs.getString(1)), "Rupees","Jan");
				dcd.setValue(Integer.parseInt(rs.getString(2)), "Rupees","Feb");
				dcd.setValue(Integer.parseInt(rs.getString(3)), "Rupees","Mar");
				dcd.setValue(Integer.parseInt(rs.getString(4)), "Rupees","Apr");
				dcd.setValue(Integer.parseInt(rs.getString(5)), "Rupees","May");
				dcd.setValue(Integer.parseInt(rs.getString(6)), "Rupees","Jun");
				dcd.setValue(Integer.parseInt(rs.getString(7)), "Rupees","Jul");
				dcd.setValue(Integer.parseInt(rs.getString(8)), "Rupees","Aug");
				dcd.setValue(Integer.parseInt(rs.getString(9)), "Rupees","Sep");
				dcd.setValue(Integer.parseInt(rs.getString(10)), "Rupees","Oct");
				dcd.setValue(Integer.parseInt(rs.getString(11)), "Rupees","Nov");
				dcd.setValue(Integer.parseInt(rs.getString(12)), "Rupees","Dec");
				progressBar.setValue(Integer.parseInt(rs.getString(13)));
				lblNewLabel.setText("<html>Manager:"+rs.getString(14)+" <br>Description:"+rs.getString(15)+"</html>");
			}
			
			JFreeChart fc=ChartFactory.createLineChart("Project Record","Month","Budget Alloted",dcd,PlotOrientation.VERTICAL,true, true, false);
			CategoryPlot cp=fc.getCategoryPlot();
			cp.setRangeGridlinePaint(Color.BLACK);
			ChartPanel cpan=new ChartPanel(fc);
			cpan.setBounds(342, 103, 564, 297);
			add(cpan);
			progressBar.setBounds(59, 509, 503, 18);
			progressBar.setStringPainted(true);
			
			add(progressBar);
			
			lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setFont(new Font("Lato", Font.PLAIN, 13));
			lblNewLabel.setBounds(716, 446, 436, 106);
			add(lblNewLabel);
			Border border= BorderFactory.createLineBorder(Color.BLACK, 1);
			lblNewLabel.setBorder(border);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		JLabel lblProgressOfThe = new JLabel("Progress of the Project:");
		lblProgressOfThe.setForeground(Color.BLACK);
		lblProgressOfThe.setFont(new Font("Lato Heavy", Font.PLAIN, 11));
		lblProgressOfThe.setBounds(59, 473, 230, 25);
		add(lblProgressOfThe);
		
		JButton btnHaltProject = new JButton("Halt Project");
		btnHaltProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
					String query="update addproject set status='Halted' where proj_name='"+name+"'";
					java.sql.PreparedStatement delps=cn.prepareStatement(query);
					delps.executeUpdate();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnHaltProject.setBounds(1045, 55, 104, 33);
		add(btnHaltProject);
		
		
		
		updateUI();
	}
}
