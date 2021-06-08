
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class PatientSearch extends JFrame {

	private JPanel contentPane;
	private File file = new File("src\\Doctors.txt");
	private String [] name = new String[8];
	private JTable tableDoctors;
	private JTable table;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	final int HEIGHT = screenSize.height-100;
	final int WIDTH = screenSize.width-50;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientSearch frame = new PatientSearch(new Patient("Munsif","03022986979","munsif19sw55@gmail.com","Gambat","08/12/2001","Male","mlf2803"),"Gambat","Physician");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public  PatientSearch(Patient p, String location, String category) {
		setTitle("Search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((screenSize.width-WIDTH)/2, (screenSize.height-HEIGHT)/2, WIDTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField txtfieldName= new JFormattedTextField();
		txtfieldName.setEditable(false);
		txtfieldName.setHorizontalAlignment(SwingConstants.CENTER);
		txtfieldName.setFont(new Font("Times New Roman", Font.BOLD, 37));
		txtfieldName.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		txtfieldName.setForeground(new Color(255, 255, 255));
		txtfieldName.setBackground(new Color(0, 102, 102));
		txtfieldName.setText("Doctor Name");
		txtfieldName.setBounds(10, 11, 263, 39);
		//panel.add(txtfieldName);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLUE);
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(313, 69, 283, 457);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(Color.BLUE);
		scrollPane.setBounds(20, 67, 285, 459);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(tableDoctors);
		table = new JTable();
		table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Doctor"
	            }
	        ));
		scrollPane.setViewportView(table);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		ArrayList<Doctor> list = Doctor.searchInDisk(category, location);
		for(Doctor d1: list) {
			String add[] = { d1.name };
		model.addRow(add);
		}
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 61, 263, 143);
		//panel.add(textPane);
		
		ListSelectionModel m = table.getSelectionModel();
		m.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int selectedRow = m.getMinSelectionIndex();
				ArrayList<Doctor> list1 = Doctor.searchInDisk(category, location);
				for(Doctor d: list1) {
					if(d.name.equals((String) table.getValueAt(selectedRow, 0)) && d.category.equals(category) && d.location.contentEquals(location)) {
						txtfieldName.setText((String) table.getValueAt(selectedRow, 0));
						textPane.setText("Category: "+d.category+"\nPhone Number: "+d.phone+"\nLocation: "+d.location+"\nE-mail: "+d.email+"\nGender: "+d.gender+"\nTiming: "+d.availabilitytime+"\nExprience: "+d.experience);
						break;
					}
				}
				
			}
		});
			
		
		JFormattedTextField formattedTextFieldDoctors = new JFormattedTextField();
		formattedTextFieldDoctors.setEditable(false);
		formattedTextFieldDoctors.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldDoctors.setBounds(10, 11, 586, 45);
		formattedTextFieldDoctors.setFont(new Font("Times New Roman", Font.BOLD, 47));
		formattedTextFieldDoctors.setText("Available Doctors");
		formattedTextFieldDoctors.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		formattedTextFieldDoctors.setForeground(new Color(255, 255, 255));
		formattedTextFieldDoctors.setBackground(new Color(0, 102, 102));
		contentPane.add(formattedTextFieldDoctors);
		
		JButton btnFeedBack = new JButton("Feedback");
		btnFeedBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = m.getMinSelectionIndex();
				ArrayList<Doctor> list3 = Doctor.searchInDisk((String) table.getValueAt(selectedRow, 0));
				PatientFeedback feedback = new PatientFeedback(list3.get(0),p);
				feedback.setVisible(true);
			}
		});
		btnFeedBack.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnFeedBack.setBounds(158, 216, 90, 23);
		btnFeedBack.setBackground(SystemColor.scrollbar);
		btnFeedBack.setBounds(10, 269, 115, 23);
		panel.add(btnFeedBack);
		btnFeedBack.setVisible(true);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = m.getMinSelectionIndex();
				ArrayList<Doctor> list2 = Doctor.searchInDisk((String) table.getValueAt(selectedRow, 0));
				Request req = new Request(list2.get(0),p,"Pending");
				req.writeToDisk();
				JOptionPane.showMessageDialog(null, "Request Sent!");
				
			
		}});
		btnBook.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnBook.setBounds(35, 210, 90, 23);
		btnBook.setBackground(SystemColor.scrollbar);
		btnBook.setBounds(10, 210, 115, 23);
		panel.add(btnBook);
		
		
		
		panel.add(textPane);
		panel.add(txtfieldName);
		
}

	public PatientSearch() {
		// TODO Auto-generated constructor stub
	}	
}
