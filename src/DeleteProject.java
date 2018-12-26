import java.awt.Color;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import com.mysql.jdbc.Connection;


public class DeleteProject extends JPanel {

	/**
	 * Create the panel.
	 */
	public DeleteProject(String name) {
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
			
			lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setFont(new Font("Lato", Font.PLAIN, 13));
			lblNewLabel.setBounds(113, 140, 923, 257);
			add(lblNewLabel);
			Border border= BorderFactory.createLineBorder(Color.BLACK, 1);
			lblNewLabel.setBorder(border);
			
			JLabel lblThisProjectIs = new JLabel("This project is deleted.");
			lblThisProjectIs.setFont(new Font("Lato Heavy", Font.PLAIN, 16));
			lblThisProjectIs.setBounds(200, 79, 382, 33);
			add(lblThisProjectIs);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
