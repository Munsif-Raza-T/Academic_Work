import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class PatientFeedback extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFeedback;
	static File file = new File("src\\DoctorFeedback.txt");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientFeedback frame = new PatientFeedback();
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
	public PatientFeedback(Doctor d, Patient p) {
		setTitle("Feedback");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 468);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldFeedback = new JTextField();
		textFieldFeedback.setBounds(10, 122, 558, 205);
		contentPane.add(textFieldFeedback);
		textFieldFeedback.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setBounds(233, 357, 123, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = d.name+"%"+p.name+"%"+textFieldFeedback.getText();
				try {
					FileWriter writer = new FileWriter(file,true);
					writer.append(System.lineSeparator()+data);
					JOptionPane.showMessageDialog(null, "Feedback Sent!");
					writer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBackground(SystemColor.scrollbar);
		contentPane.add(btnNewButton);
		
		final JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setEditable(false);
		formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField.setFont(new Font("Times New Roman", Font.BOLD, 47));
		formattedTextField.setText("Feedback");
		formattedTextField.setBorder(new CompoundBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 139, 139)), new LineBorder(new Color(47, 79, 79), 2, true)));
		formattedTextField.setForeground(new Color(255, 255, 255));
		formattedTextField.setBackground(new Color(0, 102, 102));
		formattedTextField.setBounds(10, 28, 558, 66);
		contentPane.add(formattedTextField);
		
		
		
	
	}
}
