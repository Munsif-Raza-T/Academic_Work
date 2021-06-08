import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Calculator {

	public static void main(String[] args) {
		Calculatorframe obj = new Calculatorframe();

	}

}

class Calculatorframe extends JFrame{
	public Calculatorframe() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JLabel l = new JLabel("Result: ");
		JButton btn = new JButton("OK");
		add(t1);
		add(t2);
		add(btn);
		add(l);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				int value = num1 + num2;
				l.setText("Result: " + value);
			}
		});
	}
	
}
