import java.awt.Color;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;

import com.mysql.jdbc.Connection;


public class Analysis extends JPanel {

	/**
	 * Create the panel.
	 */
	public Analysis(String name1, String name2) {
		setBounds(0, 0, 1225, 614);
		setBackground(new Color(191, 192, 196));
		setLayout(null);
		
		try {
			DefaultCategoryDataset dcd=new DefaultCategoryDataset();
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=Sarthak@124");
			String str="select * from update_proj where proj_name='"+name1+"'";
			java.sql.PreparedStatement ps4=cn.prepareStatement(str);
			ResultSet rs=ps4.executeQuery();
			while(rs.next()){
				dcd.setValue(Integer.parseInt(rs.getString(1)), name1,"Jan");
				dcd.setValue(Integer.parseInt(rs.getString(2)), name1,"Feb");
				dcd.setValue(Integer.parseInt(rs.getString(3)), name1,"Mar");
				dcd.setValue(Integer.parseInt(rs.getString(4)), name1,"Apr");
				dcd.setValue(Integer.parseInt(rs.getString(5)), name1,"May");
				dcd.setValue(Integer.parseInt(rs.getString(6)), name1,"Jun");
				dcd.setValue(Integer.parseInt(rs.getString(7)), name1,"Jul");
				dcd.setValue(Integer.parseInt(rs.getString(8)), name1,"Aug");
				dcd.setValue(Integer.parseInt(rs.getString(9)), name1,"Sep");
				dcd.setValue(Integer.parseInt(rs.getString(10)), name1,"Oct");
				dcd.setValue(Integer.parseInt(rs.getString(11)), name1,"Nov");
				dcd.setValue(Integer.parseInt(rs.getString(12)), name1,"Dec");
			}
			String str1="select * from update_proj where proj_name='"+name2+"'";
			java.sql.PreparedStatement ps=cn.prepareStatement(str1);
			ResultSet rs1=ps.executeQuery();
			while(rs1.next()){
				dcd.setValue(Integer.parseInt(rs1.getString(1)), name2,"Jan");
				dcd.setValue(Integer.parseInt(rs1.getString(2)), name2,"Feb");
				dcd.setValue(Integer.parseInt(rs1.getString(3)), name2,"Mar");
				dcd.setValue(Integer.parseInt(rs1.getString(4)), name2,"Apr");
				dcd.setValue(Integer.parseInt(rs1.getString(5)), name2,"May");
				dcd.setValue(Integer.parseInt(rs1.getString(6)),name2,"Jun");
				dcd.setValue(Integer.parseInt(rs1.getString(7)), name2,"Jul");
				dcd.setValue(Integer.parseInt(rs1.getString(8)), name2,"Aug");
				dcd.setValue(Integer.parseInt(rs1.getString(9)), name2,"Sep");
				dcd.setValue(Integer.parseInt(rs1.getString(10)), name2,"Oct");
				dcd.setValue(Integer.parseInt(rs1.getString(11)), name2,"Nov");
				dcd.setValue(Integer.parseInt(rs1.getString(12)), name2,"Dec");
			}
			JFreeChart fc=ChartFactory.createLineChart("Project Record","Month","Budget Alloted",dcd,PlotOrientation.VERTICAL,true, true, false);
			CategoryPlot cp=fc.getCategoryPlot();
			cp.setRangeGridlinePaint(Color.BLACK);
			ChartPanel cpan=new ChartPanel(fc);
			cpan.setBounds(253, 63, 763, 382);
			add(cpan);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
