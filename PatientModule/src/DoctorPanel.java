import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFormattedTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DoctorPanel extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table;
	private JTable table_2;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	final int HEIGHT = screenSize.height-100;
	final int WIDTH = screenSize.width-50;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorPanel frame = new DoctorPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DoctorPanel(Doctor d) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((screenSize.width-WIDTH)/2, (screenSize.height-HEIGHT)/2, WIDTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 878, 510);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		tabbedPane.addTab("View Feedback", null, panel_1, null);
		panel_1.setLayout(null);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(100, 23, 646, 65);
		formattedTextField_1.setText("           View Feedback");
		formattedTextField_1.setForeground(Color.WHITE);
		formattedTextField_1.setFont(new Font("Times New Roman", Font.BOLD, 47));
		formattedTextField_1.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		formattedTextField_1.setBackground(new Color(0, 102, 102));
		panel_1.add(formattedTextField_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 134, 712, 272);
		panel_1.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Patient", "Feedback"
			}
		));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"See you next time..");
				dispose();
				homelogin panel = new homelogin();
				panel.setVisible(true);
			}
		});
		btnLogout.setBounds(373, 436, 89, 23);
		panel_1.add(btnLogout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		tabbedPane.addTab("Patients Request", null, panel, null);
		panel.setLayout(null);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(68, 27, 751, 76);
		formattedTextField.setText("           View Booking Request...");
		formattedTextField.setForeground(Color.WHITE);
		formattedTextField.setFont(new Font("Times New Roman", Font.BOLD, 47));
		formattedTextField.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		formattedTextField.setBackground(new Color(0, 102, 102));
		panel.add(formattedTextField);
		
		table = new JTable();
		table.setBounds(86, 255, 91, -87);
		panel.add(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(44, 154, 775, 247);
		panel.add(scrollPane_1);
		
		table_2 = new JTable();
		scrollPane_1.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"S.no", "Patient Name", "Phone no", "Email", "Status"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(132);
		table_1.getColumnModel().getColumn(0).setMinWidth(23);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(157);
	}
}
