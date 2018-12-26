package orders;

import java.awt.Color;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class chart_performance extends JPanel {

	public chart_performance() 
	{
		DefaultCategoryDataset dcd=new DefaultCategoryDataset();
		dcd.setValue(70.80, "Marks","Sarthak");
		dcd.setValue(65.80, "Marks","DNCISD");
		dcd.setValue(32.67, "Marks","DV VKM");
		dcd.setValue(98.45, "Marks","DNVVINI");
		JFreeChart fc=ChartFactory.createBarChart("Student Record","Student Name","Student Marks",dcd,PlotOrientation.VERTICAL,true, true, false);
		CategoryPlot cp=fc.getCategoryPlot();
		cp.setRangeGridlinePaint(Color.BLACK);
		ChartPanel cpan=new ChartPanel(fc);
		removeAll();
		add(cpan);
		cpan.setLayout(null);
		updateUI();
	}

}
