package tasks;

import java.awt.*;
import javax.swing.*;

public class MyGridLayout {
	JFrame f;

	MyGridLayout() {
		f = new JFrame();

		JLabel b1 = new JLabel("Hello");
		JLabel b2 = new JLabel("Hello");
		JLabel b3 = new JLabel("Hello");
		JLabel b4 = new JLabel("Hello");
		JLabel b5 = new JLabel("Hello");
		JLabel b6 = new JLabel("Hello");
		JLabel b7 = new JLabel("Hello");
		JLabel b8 = new JLabel("Hello");
		JTextField b9 = new JTextField();

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		//f.add(b10);
		//f.add(b11);
		//f.add(b12);
		// () we shall have infinite columns in one row.
		// (0,1) we shall have infinite rows in one columns.
		// (x,y) we shall have x rows and y columns.
		// (rows,columns,vertical,horizontal)
		f.setLayout(new GridLayout(3,3,5,5));// creating grid layout of 3 row and 3 columns
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new MyGridLayout();
	}
}