package tasks;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatFrame {

	private JFrame frmChatFrame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatFrame window = new ChatFrame();
					window.frmChatFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChatFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChatFrame = new JFrame();
		frmChatFrame.setResizable(false);
		frmChatFrame.setTitle("Chat Frame");
		frmChatFrame.setBounds(100, 100, 500, 300);
		frmChatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChatFrame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 494, 22);
		frmChatFrame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("FILE");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save as");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 213, 494, 58);
		frmChatFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Text");
		lblNewLabel.setBounds(10, 14, 85, 26);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 11, 198, 33);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"\n"+textField_1.getText());
			}
		});
		btnNewButton.setBounds(304, 16, 81, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField.setText("");
			}
		});
		btnNewButton_1.setBounds(395, 16, 89, 23);
		panel.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(0, 23, 494, 191);
		frmChatFrame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
