package tasks;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.JCheckBox;

public class GUITask {

	private JFrame frame;
	private JTextField txtEnter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITask window = new GUITask();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUITask() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 525, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtEnter = new JTextField();
		txtEnter.setText(" Enter your name here");
		txtEnter.setBounds(10, 11, 136, 22);
		frame.getContentPane().add(txtEnter);
		txtEnter.setColumns(10);
		
		JButton btnNewButton = new JButton("Click me!");
		btnNewButton.setBounds(156, 10, 91, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("This is label");
		lblNewLabel.setBounds(269, 11, 91, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Red", "Green", "Blue"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(10, 67, 77, 22);
		frame.getContentPane().add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Alpha");
		rdbtnNewRadioButton.setBounds(116, 133, 65, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Beta");
		rdbtnNewRadioButton_1.setBounds(201, 133, 71, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Charlie");
		rdbtnNewRadioButton_2.setBounds(295, 133, 77, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("One");
		chckbxNewCheckBox.setBounds(116, 67, 65, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Two");
		chckbxNewCheckBox_1.setBounds(201, 67, 71, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Three");
		chckbxNewCheckBox_2.setBounds(295, 67, 65, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		String items[] = {"Mercury", "Venus", "Mars", "Earth", "Jupiter", "Saturn", "Uranus", "Neptune"};
		JList list = new JList(items);
		
		list.setSelectedIndex(0);
		list.setValueIsAdjusting(true);
		list.setBounds(397, 11, 102, 21);
		frame.getContentPane().add(list);
	}
}
