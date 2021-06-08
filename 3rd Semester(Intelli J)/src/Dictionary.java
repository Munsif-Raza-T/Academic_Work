import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Hashtable;
import java.util.Scanner;

public class Dictionary {
    private  File file;
    private Scanner reader;
    private FileWriter writer;
    private  Hashtable dictionary;
    private JFrame frame;

    public Dictionary() throws IOException {
        file = new File("E:\\3rd Semester(Intelli J)\\src\\dictionary.txt");
        reader = new Scanner(file);
        writer = new FileWriter(file,true);
        dictionary  = new Hashtable(100);
        readDictionary();
        frame = new JFrame("Dictionary");
        initialize();
    }

    private void initialize(){
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    public  void writeDictionary(Object word, Object def) throws IOException {
        writer.append(System.lineSeparator()+word+"-"+def);
        writer.close();
    }

    private  void readDictionary(){
        Object[] temp = new Object[2];
        int index = 0;
        while (reader.hasNextLine()){
            temp = reader.nextLine().split("-");
            if(temp[0] != null)
            dictionary.put(temp[0].toString().toLowerCase(),temp[1]);
        }
    }

    public Object searchWord(Object word){
        if(dictionary.get(word.toString().toLowerCase()) == null)
            return "Word doesn't Exists!";
        else
            return dictionary.get(word.toString().toLowerCase());
    }
    public static void main(String[] args) throws IOException {
        Dictionary myDictionary = new Dictionary();
       /* myDictionary.writeDictionary("Munsif","Name of person");
        myDictionary.writeDictionary("Hello","It is greeting");
        myDictionary.writeDictionary("Banana","Name of fruit");
        myDictionary.writeDictionary("Tomato","Name of vegetable");
        myDictionary.writeDictionary("Lion","Name of animal");
        myDictionary.writeDictionary("Blue","Name of color");*/
        System.out.println(myDictionary.searchWord("Hello"));
    }
}
