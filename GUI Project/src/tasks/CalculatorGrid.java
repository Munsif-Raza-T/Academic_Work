package tasks;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

import java.awt.GridLayout;
import javax.swing.JButton;

public class CalculatorGrid {

	private JFrame frmCalculator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGrid window = new CalculatorGrid();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGrid() {
		initialize();
		try {  
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 
       
            MetalLookAndFeel.setCurrentTheme(new OceanTheme()); 
        } 
        catch (Exception e) { 
        }
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 254, 303);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 30);
		frmCalculator.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		textField = new JTextField();
		panel.add(textField, "name_4059777823574");
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 28, 236, 241);
		frmCalculator.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4,5,5));
		
		JButton btnNewButton_1 = new JButton("7");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("9");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("/");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("4");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("5");
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("6");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_9 = new JButton("*");
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("1");
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_12 = new JButton("2");
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_7 = new JButton("3");
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("-");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("0");
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton(".");
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		panel_1.add(btnNewButton_15);
	}

}
