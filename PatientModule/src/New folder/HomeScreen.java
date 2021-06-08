import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
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
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLUE);
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 1061, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnAdmin.setBounds(422, 304, 202, 23);
		btnAdmin.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnAdmin.setBackground(SystemColor.scrollbar);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnDoctor = new JButton("Doctor");
		btnDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		btnDoctor.setBounds(33, 304, 185, 23);
		btnDoctor.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnDoctor.setBackground(SystemColor.scrollbar);
		frame.getContentPane().add(btnDoctor);
		
		JButton btnPatient = new JButton("Patient");
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnPatient.setBounds(796, 304, 192, 23);
		btnPatient.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnPatient.setBackground(SystemColor.scrollbar);
		frame.getContentPane().add(btnPatient);
		
		JFormattedTextField formattedTextFieldHeading = new JFormattedTextField();
		formattedTextFieldHeading.setBounds(10, 11, 1025, 45);
		formattedTextFieldHeading.setFont(new Font("Times New Roman", Font.BOLD, 47));
		formattedTextFieldHeading.setText("    Welcome to Doctor Appointment Application");
		formattedTextFieldHeading.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		formattedTextFieldHeading.setForeground(new Color(255, 255, 255));
		formattedTextFieldHeading.setBackground(new Color(0, 102, 102));
		frame.getContentPane().add(formattedTextFieldHeading);
		
		JLabel lblNewLabel = new JLabel("Developed by: Abdul Aziz, Munsif Raza, Farwah Shaikh, Muskan, Saba");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 412, 423, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblimg = new JLabel("");
		lblimg.setBounds(10, 63, 978, 204);
		frame.getContentPane().add(lblimg);
		
	}
}
