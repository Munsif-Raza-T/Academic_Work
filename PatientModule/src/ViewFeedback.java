import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class ViewFeedback extends JFrame {

	private JPanel contentPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFeedback frame = new ViewFeedback(new Doctor("Asif Raza","Surgen","03020085105","Gambat","asif@gmail.com","raza","Male","9 to 11",2));
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
	public ViewFeedback(Doctor d) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField frmtdtxtfldViewFeedback = new JFormattedTextField();
		frmtdtxtfldViewFeedback.setBounds(94, 33, 631, 78);
		frmtdtxtfldViewFeedback.setText("           View Feedback");
		frmtdtxtfldViewFeedback.setForeground(Color.WHITE);
		frmtdtxtfldViewFeedback.setFont(new Font("Times New Roman", Font.BOLD, 47));
		frmtdtxtfldViewFeedback.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		frmtdtxtfldViewFeedback.setBackground(new Color(0, 102, 102));
		contentPane.add(frmtdtxtfldViewFeedback);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(47, 79, 79), 3));
		scrollPane.setBounds(94, 156, 631, 156);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(47, 79, 79), 3));
		table_1.setBackground(new Color(192, 192, 192));
		table_1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Patient","Feedback"
	            }
	        ));
		scrollPane.setViewportView(table_1);
		DefaultTableModel model = (DefaultTableModel) table_1.getModel();
		File file = new File("src\\DoctorFeedback.txt");
		Scanner scan;
		String data[] = new String[3];
		try {
			scan = new Scanner(file);
			while(scan.hasNext()) {
				data=scan.nextLine().split("%");
				if(data[0].equalsIgnoreCase(d.name)) {
					String add[] = { data[1],data[2] };
					model.addRow(add);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		scrollPane.setViewportView(table_1);
	}

}
