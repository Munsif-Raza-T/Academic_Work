import java.awt.*; 
import javax.swing.*; 
import java.io.*; 
import java.awt.event.*; 
import javax.swing.plaf.metal.*; 
import javax.swing.text.*; 
class editor extends JFrame implements ActionListener { 
    // Text component 
    JTextArea t; 
  
    // Frame 
    JFrame f; 
  
    // Constructor 
    editor() 
    { 
        // Create a frame 
        f = new JFrame("My Text Editor"); 
  
        try { 
            // Set metl look and feel 
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 
        	//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
  
            // Set theme to ocean 
            MetalLookAndFeel.setCurrentTheme(new OceanTheme()); 
        } 
        catch (Exception e) { 
        } 
  
        // Text component 
        t = new JTextArea(); 
  
        // Create a menubar 
        JMenuBar mb = new JMenuBar(); 
  
        // Create amenu for menu 
        JMenu m1 = new JMenu("File"); 
  
        // Create menu items 
        JMenuItem mi1 = new JMenuItem("New"); 
        JMenuItem mi2 = new JMenuItem("Open"); 
        JMenuItem mi3 = new JMenuItem("Save"); 
        JMenuItem mi9 = new JMenuItem("Print"); 
  
        // Add action listener 
        mi1.addActionListener(this); 
        mi2.addActionListener(this); 
        mi3.addActionListener(this); 
        mi9.addActionListener(this); 
  
        m1.add(mi1); 
        m1.add(mi2); 
        m1.add(mi3); 
        m1.add(mi9); 
  
        // Create amenu for menu 
        JMenu m2 = new JMenu("Edit"); 
  
        // Create menu items 
        JMenuItem mi4 = new JMenuItem("Cut"); 
        JMenuItem mi5 = new JMenuItem("Copy"); 
        JMenuItem mi6 = new JMenuItem("Paste"); 
  
        // Add action listener 
        mi4.addActionListener(this); 
        mi5.addActionListener(this); 
        mi6.addActionListener(this); 
  
        m2.add(mi4); 
        m2.add(mi5); 
        m2.add(mi6); 
        
        JMenu ma = new JMenu("About");
        JMenuItem about = new JMenuItem("Developer!");
        about.addActionListener(this);
        ma.add(about);
        
        JMenu m3 = new JMenu("Help?");
        JMenuItem mi10 = new JMenuItem("How to Save?");
        JMenuItem mi11 = new JMenuItem("How to Copy?");
        JMenuItem mi12 = new JMenuItem("How to Close?");
        
        mi10.addActionListener(this);
        mi11.addActionListener(this);
        mi12.addActionListener(this);
        
        m3.add(mi10);
        m3.add(mi11);
        m3.add(mi12);
        
        
  
        JMenuItem mc = new JMenuItem("Close"); 
        
        mc.addActionListener(this); 
  
        mb.add(m1); 
        mb.add(m2); 
        mb.add(ma);
        mb.add(m3);
        mb.add(mc); 
        f.setJMenuBar(mb); 
        f.add(t); 
        f.setSize(1000, 700); 
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
  
    // If a button is pressed 
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
  
        if (s.equals("Cut")) { 
            t.cut(); 
        } 
        else if (s.equals("Copy")) { 
            t.copy(); 
        } 
        else if (s.equals("Paste")) { 
            t.paste(); 
        } 
        else if (s.equals("Save")) { 
            // Create an object of JFileChooser class 
            JFileChooser j = new JFileChooser("f:"); 
  
            // Invoke the showsSaveDialog function to show the save dialog 
            int r = j.showSaveDialog(null); 
  
            if (r == JFileChooser.APPROVE_OPTION) { 
  
                // Set the label to the path of the selected directory 
                File fi = new File(j.getSelectedFile().getAbsolutePath()); 
  
                try { 
                    // Create a file writer 
                    FileWriter wr = new FileWriter(fi, false); 
  
                    // Create buffered writer to write 
                    BufferedWriter w = new BufferedWriter(wr); 
  
                    // Write 
                    w.write(t.getText()); 
  
                    w.flush(); 
                    w.close(); 
                } 
                catch (Exception evt) { 
                    JOptionPane.showMessageDialog(f, evt.getMessage()); 
                } 
            } 
            // If the user cancelled the operation 
            else
                JOptionPane.showMessageDialog(f, "The user cancelled the operation"); 
        } 
        else if (s.equals("Print")) { 
            try { 
                // print the file 
                t.print(); 
            } 
            catch (Exception evt) { 
                JOptionPane.showMessageDialog(f, evt.getMessage()); 
            } 
        } 
        else if (s.equals("Open")) { 
            // Create an object of JFileChooser class 
            JFileChooser j = new JFileChooser("f:"); 
  
            // Invoke the showsOpenDialog function to show the save dialog 
            int r = j.showOpenDialog(null); 
  
            // If the user selects a file 
            if (r == JFileChooser.APPROVE_OPTION) { 
                // Set the label to the path of the selected directory 
                File fi = new File(j.getSelectedFile().getAbsolutePath()); 
  
                try { 
                    // String 
                    String s1 = "", sl = ""; 
  
                    // File reader 
                    FileReader fr = new FileReader(fi); 
  
                    // Buffered reader 
                    BufferedReader br = new BufferedReader(fr); 
  
                    // Initilize sl 
                    sl = br.readLine(); 
  
                    // Take the input from the file 
                    while ((s1 = br.readLine()) != null) { 
                        sl = sl + "\n" + s1; 
                    } 
  
                    // Set the text 
                    t.setText(sl); 
                } 
                catch (Exception evt) { 
                    JOptionPane.showMessageDialog(f, evt.getMessage()); 
                } 
            } 
            // If the user cancelled the operation 
            else
                JOptionPane.showMessageDialog(f, "The user cancelled the operation"); 
        } 
        else if (s.equals("New")) { 
            t.setText(""); 
        } 
        else if (s.equals("Close")) { 
            System.exit(0);
        } 
        else if(s.equals("Developer!")) {
        	JOptionPane.showMessageDialog(f,"Developed by: Munsif Raza Thebo\n"
        			+ "Roll number: 19SW55\n"
        			+ "Department: Software Engineering\n"
        			+ "Submitted to: Sir Sajjad Ali Memon");
        }
        else if(s.equals("How to Save?")) {
        	JOptionPane.showMessageDialog(f,"Go to File menu, select Save menu item,\n"
        			+ " choose the path and give the name to file and Save!");
        }
        else if(s.equals("How to Copy?")) {
        	JOptionPane.showMessageDialog(f,"Select the data that you want to copy\n"
        			+ "Go to Edit menu and click Copy item there.");
        }
        else if(s.equals("How to Close?")) {
        	JOptionPane.showMessageDialog(f,"Click on the close, which is on Menu bar!\n"
        			+ "or click on the red cross button on the right upper corner.");
        }
        
    } 
  
    // Main class 
    public static void main(String args[]) 
    { 
        editor e = new editor(); 
    } 
} 