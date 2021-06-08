package Practice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class DoctorForm {

	private JFrame frmDoctorForm;
	private String name;
	private String password;
	private String gender;
	private String email;
	private String category;
	private String timing;
	private JTextField textFieldName;
	private JTextField textFieldPassword;
	private JTextField textFieldLocation;
	private JTextField textFieldEmail;
	private JTextField textFieldGender;
	private JTextField textFieldCategory;
	private JTextField textFieldAddress;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorForm window = new DoctorForm();
					window.frmDoctorForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DoctorForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDoctorForm = new JFrame();
		frmDoctorForm.setTitle("Doctor Form");
		frmDoctorForm.setBounds(100, 100, 644, 530);
		frmDoctorForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDoctorForm.getContentPane().setLayout(null);
		
		JLabel lblDoctorForm = new JLabel("Doctor Form");
		lblDoctorForm.setFont(new Font("Source Code Pro Black", Font.BOLD, 20));
		lblDoctorForm.setBounds(193, 11, 139, 30);
		frmDoctorForm.getContentPane().add(lblDoctorForm);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Source Code Pro Black", Font.BOLD, 16));
		lblName.setBounds(26, 50, 81, 30);
		frmDoctorForm.getContentPane().add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(147, 57, 254, 20);
		frmDoctorForm.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Source Code Pro Black", Font.BOLD, 16));
		lblPassword.setBounds(26, 101, 90, 30);
		frmDoctorForm.getContentPane().add(lblPassword);
		
		JLabel lblDOB = new JLabel("Date of birth:");
		lblDOB.setFont(new Font("Source Code Pro Black", Font.BOLD, 16));
		lblDOB.setBounds(26, 198, 148, 30);
		frmDoctorForm.getContentPane().add(lblDOB);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(147, 108, 254, 20);
		frmDoctorForm.getContentPane().add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		textFieldLocation = new JTextField();
		textFieldLocation.setText("");
		textFieldLocation.setBounds(184, 205, 217, 20);
		frmDoctorForm.getContentPane().add(textFieldLocation);
		textFieldLocation.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Source Code Pro Black", Font.BOLD, 16));
		lblEmail.setBounds(26, 156, 81, 17);
		frmDoctorForm.getContentPane().add(lblEmail);
		
		JLabel lblContact = new JLabel("Contact:");
		lblContact.setFont(new Font("Source Code Pro Black", Font.BOLD, 16));
		lblContact.setBounds(26, 310, 90, 17);
		frmDoctorForm.getContentPane().add(lblContact);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Source Code Pro Black", Font.BOLD, 16));
		lblGender.setBounds(26, 261, 81, 14);
		frmDoctorForm.getContentPane().add(lblGender);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(147, 156, 254, 20);
		frmDoctorForm.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldGender = new JTextField();
		textFieldGender.setText("");
		textFieldGender.setBounds(147, 258, 254, 20);
		frmDoctorForm.getContentPane().add(textFieldGender);
		textFieldGender.setColumns(10);
		
		textFieldCategory = new JTextField();
		textFieldCategory.setBounds(147, 307, 254, 20);
		frmDoctorForm.getContentPane().add(textFieldCategory);
		textFieldCategory.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Source Code Pro Black", Font.BOLD, 16));
		lblAddress.setBounds(26, 352, 81, 30);
		frmDoctorForm.getContentPane().add(lblAddress);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(147, 359, 254, 20);
		frmDoctorForm.getContentPane().add(textFieldAddress);
		textFieldAddress.setColumns(10);
		
		JLabel lblimg = new JLabel("");
		lblimg.setBounds(426, 131, 172, 167);
		frmDoctorForm.getContentPane().add(lblimg);
	}
}
