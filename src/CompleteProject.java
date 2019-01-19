import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.LegendGraphic;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import com.mysql.jdbc.Connection;


public class CompleteProject extends JPanel {

	/**
	 * Create the panel.
	 */
	public CompleteProject(String name) {
		
		setBounds(0, 0, 1225, 614);
		setBackground(new Color(191, 192, 196));
		setLayout(null);
		
		JLabel label = new JLabel(""+name);
		label.setForeground(Color.BLACK);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lato Heavy", Font.PLAIN, 35));
		label.setBounds(33, 11, 299, 59);
		add(label);
		
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
			//hello sarthak aditya here...
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
		DefaultPieDataset dpd=new DefaultPieDataset();
		dpd.setValue("Project Status", 100);
		JFreeChart fc=ChartFactory.createPieChart("Project Record", dpd, true, true, false);
		ChartPanel cpan=new ChartPanel(fc);
		cpan.setBounds(342, 103, 564, 297);
		add(cpan);
		
		
	}

}
