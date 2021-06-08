import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class PatientForm {

	private JFrame framePatientForm;
	private JTextField textFieldName;
	private JTextField textFieldDOB;
	private JTextField textFieldEmail;
	private JTextField textFieldGender;
	private JTextField textFieldContact;
	private JTextField textFieldAddress;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	final int HEIGHT = screenSize.height-100;
	final int WIDTH = screenSize.width-50;
	private JPasswordField textFieldPassword;
	private JTextField tFUsername;
	private JPasswordField pFPassword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientForm window = new PatientForm();
					window.framePatientForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PatientForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framePatientForm = new JFrame();
		framePatientForm.setResizable(false);
		framePatientForm.getContentPane().setForeground(Color.BLUE);
		framePatientForm.getContentPane().setBackground(new Color(0, 128, 128));
		framePatientForm.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		framePatientForm.getContentPane().setBackground(Color.WHITE);
		framePatientForm.setTitle("Patient Form");
		framePatientForm.setBounds((screenSize.width-WIDTH)/2, (screenSize.height-HEIGHT)/2, WIDTH, HEIGHT);
		framePatientForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePatientForm.getContentPane().setLayout(null);
		
		JFormattedTextField formattedTextFieldHeading = new JFormattedTextField();
		formattedTextFieldHeading.setEditable(false);
		formattedTextFieldHeading.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldHeading.setFont(new Font("Times New Roman", Font.BOLD, 47));
		formattedTextFieldHeading.setText("Patient");
		formattedTextFieldHeading.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		formattedTextFieldHeading.setForeground(new Color(255, 255, 255));
		formattedTextFieldHeading.setBackground(new Color(0, 102, 102));
		formattedTextFieldHeading.setBounds(10, 11, 1524, 45);
		framePatientForm.getContentPane().add(formattedTextFieldHeading);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 1544, 771);
		framePatientForm.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewRegister = new JButton("Register");
		btnNewRegister.setBounds(213, 725, 127, 23);
		panel.add(btnNewRegister);
		btnNewRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Patient p = new Patient(textFieldName.getText(),textFieldContact.getText(),textFieldEmail.getText(),textFieldAddress.getText(),textFieldDOB.getText(),textFieldGender.getText(),textFieldPassword.getText());
				p.writeToDisk();
				JOptionPane.showMessageDialog(null, "Successfully Registered! ");
				framePatientForm.dispose();
				
			}
		});
		btnNewRegister.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewRegister.setBackground(SystemColor.scrollbar);
		btnNewRegister.setForeground(new Color(255, 255, 255));
		
		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(148, 658, 254, 23);
		panel.add(textFieldAddress);
		textFieldAddress.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(23, 661, 81, 20);
		panel.add(lblAddress);
		lblAddress.setFont(new Font("Arial", Font.BOLD, 16));
		
		textFieldContact = new JTextField();
		textFieldContact.setBounds(148, 575, 254, 23);
		panel.add(textFieldContact);
		textFieldContact.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact:");
		lblContact.setBounds(23, 578, 90, 20);
		panel.add(lblContact);
		lblContact.setFont(new Font("Arial", Font.BOLD, 16));
		
		textFieldGender = new JTextField();
		textFieldGender.setBounds(148, 491, 254, 23);
		panel.add(textFieldGender);
		textFieldGender.setText("");
		textFieldGender.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(23, 494, 81, 20);
		panel.add(lblGender);
		lblGender.setFont(new Font("Arial", Font.BOLD, 16));
		
		textFieldDOB = new JTextField();
		textFieldDOB.setBounds(148, 403, 254, 23);
		panel.add(textFieldDOB);
		textFieldDOB.setText("");
		textFieldDOB.setColumns(10);
		
		JLabel lblDOB = new JLabel("Date of birth:");
		lblDOB.setBounds(23, 406, 115, 20);
		panel.add(lblDOB);
		lblDOB.setFont(new Font("Arial", Font.BOLD, 16));
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(148, 320, 254, 23);
		panel.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(23, 332, 81, 20);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(23, 235, 90, 20);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Arial", Font.BOLD, 16));
		
		textFieldName = new JTextField();
		textFieldName.setBounds(148, 149, 254, 23);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(23, 152, 81, 20);
		panel.add(lblName);
		lblName.setFont(new Font("Arial", Font.BOLD, 16));
		
		textFieldPassword = new JPasswordField();
		textFieldPassword.setBounds(148, 235, 254, 23);
		panel.add(textFieldPassword);
		
		JPanel contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBounds(634, 56, 750, 692);
		panel.add(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblusername = new JLabel("User Name:");
		lblusername.setBounds(118, 320, 144, 25);
		lblusername.setFont(new Font("Arial", Font.BOLD, 16));
		contentPane.add(lblusername);
		
		tFUsername = new JTextField();
		tFUsername.setBounds(292, 320, 308, 25);
		contentPane.add(tFUsername);
		tFUsername.setColumns(10);
		
		JLabel lblpassword2 = new JLabel("Password:");
		lblpassword2.setBounds(118, 419, 144, 25);
		lblpassword2.setFont(new Font("Arial", Font.BOLD, 16));
		contentPane.add(lblpassword2);
		
		pFPassword = new JPasswordField();
		pFPassword.setBounds(292, 421, 308, 23);
		contentPane.add(pFPassword);
		
		JButton btnNewLogin = new JButton("Login");
		btnNewLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Patient> list = Patient.searchInDisk(tFUsername.getText());
				for(Patient p: list) {
					if(p.name.equalsIgnoreCase(tFUsername.getText())&&p.password.equalsIgnoreCase(pFPassword.getText())) {
						framePatientForm.dispose();
						PatientHome ph = new PatientHome(p);
						ph.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
					}
				}
			}
		});
		btnNewLogin.setBounds(413, 516, 89, 23);
		contentPane.add(btnNewLogin);
		btnNewLogin.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewLogin.setBackground(SystemColor.scrollbar);
		btnNewLogin.setForeground(new Color(255, 255, 255));
		
		JFormattedTextField formattedTextFieldLogin = new JFormattedTextField();
		formattedTextFieldLogin.setEditable(false);
		formattedTextFieldLogin.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldLogin.setFont(new Font("Times New Roman", Font.BOLD, 47));
		formattedTextFieldLogin.setText("Login");
		formattedTextFieldLogin.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		formattedTextFieldLogin.setForeground(new Color(255, 255, 255));
		formattedTextFieldLogin.setBackground(new Color(0, 102, 102));
		formattedTextFieldLogin.setBounds(118, 173, 482, 65);
		contentPane.add(formattedTextFieldLogin);
		
		JFormattedTextField formattedTextFieldSignUp = new JFormattedTextField();
		formattedTextFieldSignUp.setEditable(false);
		formattedTextFieldSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextFieldSignUp.setFont(new Font("Times New Roman", Font.BOLD, 44));
		formattedTextFieldSignUp.setText("Register");
		formattedTextFieldSignUp.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		formattedTextFieldSignUp.setForeground(new Color(255, 255, 255));
		formattedTextFieldSignUp.setBackground(new Color(0, 102, 102));
		formattedTextFieldSignUp.setBounds(23, 69, 379, 56);
		panel.add(formattedTextFieldSignUp);
		
	}
}
