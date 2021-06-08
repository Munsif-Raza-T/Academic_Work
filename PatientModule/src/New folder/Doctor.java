import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
	String name;
	String category;
	String phone;
	String location;
	String email;
	String password;
	String gender;
	String availabilitytime;
	int experience;
	static File doctors = new File("src\\Doctors.txt"); 
		
	public Doctor(String name, String category, String phone, String location, String email, String password,
			String gender, String availabilityTime, int experience) {
		super();
		this.name = name;
		this.category = category;
		this.phone = phone;
		this.location = location;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.availabilitytime = availabilityTime;
		this.experience = experience;
	}

	public static Doctor fromString(String info) {
		String[] data = info.split("%");
		return (new Doctor(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], Integer.parseInt(data[8])));
	}
	
	public String ToString() {
		return name+"%"+category+"%"+phone+"%"+location+"%"+email+"%"+password+"%"+gender+"%"+availabilitytime+"%"+experience;
	}
	
	public void writeToDisk() {
		try {
			FileWriter writer = new FileWriter(doctors, true);
			writer.append(System.lineSeparator()+this.ToString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Doctor> searchInDisk(String name){
		ArrayList<Doctor> list = new ArrayList<Doctor>();
		try {
			Scanner reader = new Scanner(doctors);
			String temp = "";
			while(reader.hasNextLine()) {
				temp = reader.nextLine();
				if(temp.toLowerCase().startsWith(name.toLowerCase())) {
					list.add(Doctor.fromString(temp));
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static ArrayList<Doctor> searchInDisk(String category, String location){
		ArrayList<Doctor> list = new ArrayList<Doctor>();
		try {
			Scanner reader = new Scanner(doctors);
			String data[]; String temp;
			while(reader.hasNextLine()) {
				temp = reader.nextLine();
				data = temp.split("%");
				if(data.length < 8) {
					continue;
				}
				else if(data[1].equalsIgnoreCase(category) && data[3].equalsIgnoreCase(location)) {
					list.add(Doctor.fromString(temp));
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return list;
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

	public static void main(String[] args) {

	}

}
