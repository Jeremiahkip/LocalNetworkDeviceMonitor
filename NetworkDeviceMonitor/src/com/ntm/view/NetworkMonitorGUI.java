package com.ntm.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class NetworkMonitorGUI {
	private JFrame frame;
	private JList<String> list;

	/**
	 * Init Network Monitor GUI
	 */
	public NetworkMonitorGUI() {
		frame = new JFrame("Watch & Pray");
		frame.setLayout(new GridLayout(1, 2));

		JPanel panel = new JPanel();
		JLabel label = new JLabel("select"); // un-used?!
		String week[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		list = new JList<String>(week);
		list.setSelectedIndex(0);

		panel.add(list);

		frame.add(panel, 0, 0);
		frame.setSize(1024, 768);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); 
	}

}
