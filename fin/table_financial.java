package orders;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;

public class table_financial extends JPanel {
	JTable table;
	String[] columnNames = {"First Name", "Last Name", "Sport", "# of Years", "Vegetarian"};
	Object[][] data = {
		    {"Kathy", "Smith",
		     "Snowboarding", new Integer(5), new Boolean(false)},
		    {"John", "Doe",
		     "Rowing", new Integer(3), new Boolean(true)},
		    {"Sue", "Black",
		     "Knitting", new Integer(2), new Boolean(false)},
		    {"Jane", "White",
		     "Speed reading", new Integer(20), new Boolean(true)},
		    {"Joe", "Brown",
		     "Pool", new Integer(10), new Boolean(false)}
		};
	/**
	 * Create the panel.
	 */
	public table_financial() {
		setBounds(227, 52, 1147, 562);
		setBackground(new Color(191, 192, 196));
		setLayout(null);
		table = new JTable(data, columnNames);
		table.setBounds(10, 10, 745, 472);
		removeAll();
		add(table);
		updateUI();

	}

}
