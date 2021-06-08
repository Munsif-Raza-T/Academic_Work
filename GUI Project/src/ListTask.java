import java.awt.*;
import javax.swing.*;
public class ListTask {
	JFrame frame;
	JList list;
	JList list2;
	String [] listItems;
	String [] list2Items;
	JButton btn;
	public ListTask() {
		
		frame = new JFrame("List Task");
		frame.setSize(700,500);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		String [] listItems = {"Java","Python","GoLang","PHP","JavaSript","C++"};
		list2Items = new String[6];
		
		list = new JList(listItems);
		list.setBounds(20,50,250,250);
		list2 = new JList(list2Items);
		list2.setBounds(400,50,250,250);
		
		btn = new JButton("Show");
		btn.setBounds(290,150,100,50);
		
		frame.add(list);
		frame.add(btn);
		frame.add(list2);
		
	}
	public static void main(String[] args) {
		
		new ListTask();

	}

}
