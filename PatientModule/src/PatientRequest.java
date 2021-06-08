import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;

public class PatientRequest extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientRequest frame = new PatientRequest();
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
	public PatientRequest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(51, 102, 102), 5, true));
		scrollPane.setBounds(10, 160, 744, 242);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 102, 102), 3));
		table.setBackground(new Color(211, 211, 211));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Patient Name", "Doctor", "Location", "Contact", "E-mail", "Category", "Reason", "Accept", "Report"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("Go back");
		button.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new InsideLogin().setVisible(true);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		button.setBackground(SystemColor.scrollbar);
		button.setBounds(22, 424, 105, 29);
		contentPane.add(button);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 202, 285, -175);
		contentPane.add(tabbedPane);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("           View Booking Request...");
		formattedTextField.setForeground(Color.WHITE);
		formattedTextField.setFont(new Font("Times New Roman", Font.BOLD, 47));
		formattedTextField.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		formattedTextField.setBackground(new Color(0, 102, 102));
		formattedTextField.setBounds(20, 38, 751, 76);
		contentPane.add(formattedTextField);
	}
}
