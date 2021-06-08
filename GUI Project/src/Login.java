import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Login implements ActionListener{

// ************ create components  *********************//
JFrame loginwindow=new JFrame("Login Window");
JTextField username=new JTextField();
JPasswordField password=new JPasswordField();
JLabel userlbl=new JLabel("User Name");
JLabel passlbl=new JLabel("Password ");
JButton loginbtn =new JButton("Log in");
JButton resetbtn=new JButton("Reset");
JButton exitbtn=new JButton("Exit");

Login(){
// ********* set properities of the form *****************//
loginwindow.setSize(500,300);
loginwindow.setVisible(true);
loginwindow.setDefaultCloseOperation(loginwindow.EXIT_ON_CLOSE);
loginwindow.setLayout(null);
// ********* set positions of components on the form  **********//
userlbl.setBounds(50,70,100,20);
username.setBounds(120,70,200,25);
passlbl.setBounds(50,120,100,25);
password.setBounds(120,120,200,25);
loginbtn.setBounds(50,170,70,30);
resetbtn.setBounds(150,170,70,30);
exitbtn.setBounds(250,170,70,30);
// *********** add components to form    *********************//
loginwindow.add(userlbl);
loginwindow.add(username);
loginwindow.add(passlbl);
loginwindow.add(password);
loginwindow.add(loginbtn);
loginwindow.add(resetbtn);
loginwindow.add(exitbtn);
// ********* Register Components to make them able to perform/ listen events ******// 
loginbtn.addActionListener(this);
resetbtn.addActionListener(this);
exitbtn.addActionListener(this);
	}
// ********** override following method to perform the events   **************  //

public void actionPerformed(ActionEvent click){


if (loginbtn==click.getSource())
{

/* getPasswaord() returns array of charactors, se we need to recieve it in a char type 
and then convert that array of chars into String as equals() can compare in form of 
Strings
*/
char [] pwd=password.getPassword();
String pstring=new String(pwd);
String ustring=username.getText();
String myusername="Software";
String mypassword="F16SW";
if(ustring.equals(myusername) && pstring.equals(mypassword))
JOptionPane.showMessageDialog(null," Welcome....!");
else
JOptionPane.showMessageDialog(null," Invlid User name or password....!");

}
else if(resetbtn==click.getSource()){
username.setText("");
password.setText("");

}
else
System.exit(0);

						}



		
	public static void main(String[] args) {
		Login log = new Login();
	
}}