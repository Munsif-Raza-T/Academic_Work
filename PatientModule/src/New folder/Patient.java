import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Patient {
	String name;
	String number;
	String email;
	String address;
	String dateOfBirth;
	String gender;
	String password;
	static File patients = new File("src\\Patients.txt");
	
	public Patient(String name, String number, String email, String adress, String dateOfBirth, String gender,
			String password) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = adress;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.password = password;
	}
	
	public static String charToString(char[] c) {
		String result = "";
		for(int i=0; i<c.length; i++) {
			result += c;
		}
		return result;
	}
	
	public static char[] stringToChar(String s) {
		char[] c = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			c[i] = s.charAt(i);
		}
		return c;
	}
	
	public String ToString() {
		return name+"%"+number+"%"+email+"%"+address+"%"+dateOfBirth+"%"+gender+"%"+password;
	}
	
	public static Patient fromString(String info) {
		String[] data = info.split("%");
		return (new Patient(data[0], data[1], data[2], data[3], data[4], data[5], data[6]));
	}
	
	public void writeToDisk() {
		try {
			FileWriter writer = new FileWriter(patients, true);
			writer.append(System.lineSeparator()+this.ToString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Patient> searchInDisk(String name){
		ArrayList<Patient> list = new ArrayList<Patient>();
		try {
			Scanner reader = new Scanner(patients);
			String temp = "";
			while(reader.hasNextLine()){
				temp = reader.nextLine();
				if(temp.toLowerCase().startsWith(name.toLowerCase())) {
					list.add(Patient.fromString(temp));
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {

	}

}
