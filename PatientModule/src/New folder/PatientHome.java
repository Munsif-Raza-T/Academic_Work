import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;

import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.*;

public class PatientHome extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientHome frame = new PatientHome(new Patient("Munsif","03022986979","munsif19sw55@gmail.com","Gambat","08/12/2001","Male","mlf2803"));
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
	public PatientHome(Patient p) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 863, 481);
		contentPane.add(tabbedPane);
		//Image img = new ImageIcon(this.getClass().getResource("dr.png")).getImage();
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		tabbedPane.addTab("Search", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(32, 9, 783, 76);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE WELL, BE WELL");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel.setBounds(159, 11, 650, 59);
		panel_4.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(436, 9, 1, 1);
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(0, 102, 102));
		panel_1.add(panel_5);
		
		JLabel lblYouAreWarmly = new JLabel("\"You are warmly welcome in our leading light of HealthCare\"");
		lblYouAreWarmly.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblYouAreWarmly.setForeground(Color.WHITE);
		lblYouAreWarmly.setBounds(190, 90, 595, 29);
		panel_1.add(lblYouAreWarmly);
		
		JLabel lblSearchForThe = new JLabel("Search for the appropriate doctor to consult:");
		lblSearchForThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		lblSearchForThe.setBounds(368, 130, 464, 36);
		panel_1.add(lblSearchForThe);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(368, 215, 400, 27);
		panel_1.add(textField);
		
		JLabel label_1 = new JLabel("Enter category");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBackground(new Color(0, 128, 128));
		label_1.setBounds(368, 276, 216, 20);
		panel_1.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(368, 307, 400, 27);
		panel_1.add(textField_1);
		
		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PatientSearch ps = new PatientSearch(p,textField.getText(),textField_1.getText());
				ps.setVisible(true);
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(513, 386, 96, 27);
		panel_1.add(button);
		
		JLabel label = new JLabel("Enter Location");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBackground(new Color(0, 128, 128));
		label.setBounds(368, 178, 290, 26);
		panel_1.add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(32, 145, 296, 297);
		panel_1.add(label_2);
	//	Image img1 = new ImageIcon(this.getClass().getResource("stethoscope-icon.png")).getImage();
		//label_2.setIcon(new ImageIcon(img1));
		
	

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		tabbedPane.addTab("Status", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBounds(121, 155, 641, 240);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Doctor","Category","Location","Status"
	            }
	        ));
		scrollPane.setViewportView(table);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		ArrayList<Request> list = Request.searchRequestsByPatient(p.name);
		for(Request r: list) {
			Doctor d = r.doctor;
			Patient pat = r.patient;
			String data[]= {d.name,d.category,d.location,r.status };
			if(pat.name.equalsIgnoreCase(p.name))model.addRow(data);
		}
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBackground(new Color(0, 102, 102));
		panel_6.setBounds(80, 50, 702, 60);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Check the status of your appointments");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel_2.setBounds(57, 11, 681, 38);
		panel_6.add(lblNewLabel_2);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"See you next time..");
				dispose();
				PatientForm pf = new PatientForm();
				
			}
		});
		btnLogout.setBounds(402, 479, 89, 23);
		contentPane.add(btnLogout);
		
	}
}
