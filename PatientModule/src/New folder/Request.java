import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Request {
	Doctor doctor;
	Patient patient;
	String status;
	static File requests = new File("src\\Requests.txt");
	
	public Request(Doctor doctor, Patient patient, String status) {
		super();
		this.doctor = doctor;
		this.patient = patient;
		this.status = status;
	}
	
	public String ToString() {
		return doctor.ToString()+"#"+patient.ToString()+"#"+status;
	}
	
	public static Request fromString(String info) {
		String[] data = info.split("#");
		return (new Request(Doctor.fromString(data[0]), Patient.fromString(data[1]), data[2]));
	}
	
	public void writeToDisk() {
		try {
			FileWriter writer = new FileWriter(requests, true);
			writer.append(System.lineSeparator()+this.ToString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Request> searchRequestsToDoctor(String name){
		ArrayList<Request> list = new ArrayList<Request>();
		try {
			Scanner reader = new Scanner(requests);
			String temp = "";
			while(reader.hasNextLine()) {
				temp = reader.nextLine();
				if(temp.toLowerCase().startsWith(name.toLowerCase())){
					list.add(Request.fromString(temp));
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static ArrayList<Request> searchRequestsByPatient(String name){
		ArrayList<Request> list = new ArrayList<Request>();
		try {
			Scanner reader = new Scanner(requests);
			String temp = "";
			while(reader.hasNextLine()) {
				temp = reader.nextLine();
				String data[] = temp.split("#");
				if(data[1].toLowerCase().startsWith(name.toLowerCase())){
					list.add(Request.fromString(temp));
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void approveAndSave() {
		String filePath = "src\\Requests.txt";
		String fileContents = "";
		try {
			Scanner sc = new Scanner(new File(filePath));
			StringBuffer buffer = new StringBuffer();
			while (sc.hasNextLine()) {
				buffer.append(sc.nextLine()+System.lineSeparator());
			}
			fileContents = buffer.toString();
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String oldLine = this.ToString();
		String newLine = this.doctor.ToString()+"#"+this.patient.ToString()+"#"+"Approved";
		if(oldLine.equals(newLine)) {
			//do nothing
		}
		else {
			fileContents = fileContents.replaceAll(oldLine, newLine);
			FileWriter writer;
			try {
				writer = new FileWriter(filePath);
				writer.append(fileContents);
				writer.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Request rq = new Request(Doctor.fromString("Asjad%Physician%03452233232%Naushahro Feroze%asjade2233@email.com%asjad23%Male%8 to 12%3"), 
				Patient.fromString("Khalid%03365634534%khalid5634@email.com%Kandiaro%5-6-2001%Male%khalid"), "Pending");
		rq.writeToDisk();

	}

}
