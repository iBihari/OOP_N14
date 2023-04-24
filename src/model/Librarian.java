package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import view.View;


public class Librarian {
	private String userName;
	private String passWork;
	public String nameLibrarian;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWork() {
		return passWork;
	}
	public void setPassWork(String passWork) {
		this.passWork = passWork;
	}
	public String getNameLibrarian() {
		return nameLibrarian;
	}
	public void setNameLibrarian(String nameLibrarian) {
		this.nameLibrarian = nameLibrarian;
	}
	//constructor
	public Librarian() {}
	
	public Librarian(String userName, String passWork, String nameLibrarian) {
		super();
		this.userName = userName;
		this.passWork = passWork;
		this.nameLibrarian = nameLibrarian;
	}
	
	
	@Override
	public String toString() {
		return "Librarian [userName=" + userName + ", passWork=" + passWork + ", nameLibrarian=" + nameLibrarian + "]";
	}

	public void takeDataLibraian() {
		try {
	        BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\dodan\\\\eclipse-workspace\\\\LibraryManagement\\\\src\\\\alldata\\\\DataLibrarian.txt"));
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] tokens = line.split(",");
	            String userName = tokens[0];
	            String passWork = tokens[1];
	            String nameLibrarian = tokens[2];
	            Librarian librarian = new Librarian(userName,passWork,nameLibrarian);
	            Main.dataLibrarians.add(librarian);
	        }
	        br.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	// tìm đọc giả
	public void foundReaderNeedUpdate(int IdReader, View view, String nameUser) {
		boolean found = false;
	    for (Reader reader : Main.dataReader) {
	        if (reader.getIdUser() == IdReader) {
	        	found = true;
	        	view.updateReaderInLibrarian(nameUser);
	        }
	    }
	    if(!found) {
	    	view.interfaceUpdateReaderError(nameUser);
	    }
	    
	}

	// Thêm đọc giải
	public void addReader(int id, String userName, String passWork, String nameReader, int ageReader, String address, long phoneReader, long cmnd) {
		Reader reader = new Reader(); 
		Main.dataReader.clear();
		reader.takeDataReader();
		reader.setIdUser(id);

		reader.setUserName(userName);
 
		reader.setPassWork(passWork);

		reader.setNameReader(nameReader);

		reader.setAgeReader(ageReader);

		reader.setAddress(address);

		reader.setPhoneNumber(phoneReader);

		reader.setCmnd(cmnd);

		 // Thêm đọc giả vào danh sách đọc giả
	    Main.dataReader.add(reader);
	    
	    // Lưu danh sách đọc giả vào file
	    try {
	        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\dodan\\eclipse-workspace\\LibraryManagement\\src\\alldata\\DataReader.txt", true));
	        writer.write(reader.getIdUser() + "," + reader.getUserName() + "," + reader.getPassWork() + "," + reader.getNameReader() + "," + reader.getAgeReader() + "," + reader.getAddress() + "," + reader.getPhoneNumber() + "," + reader.getCmnd() + "\\n");
	        writer.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    System.out.println("Bạn đã thêm thành công !");
	}
	
	// xóa đọc giả 
	public void deleteReader(int keyDeleteReader, String nameUser,View view) {
		boolean founded = false;
	    for (Reader reader : Main.dataReader) {
	        if (reader.getIdUser() == keyDeleteReader) {
	            Main.dataReader.remove(reader);
	            System.out.println("Đã xóa đọc giả " + reader.getNameReader());
	            founded = true;
	            view.notificationDeleteSuccess(nameUser);
	            break;
	        }
	    }
	    if (!founded) {
	        System.out.println("Không tìm thấy đọc giả ");
		    view.notificattionDeleteFailReader(nameUser);
	    }
	    try {
	        PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Users\\dodan\\eclipse-workspace\\LibraryManagement\\src\\alldata\\DataReader.txt", false));
	        for (Reader reader : Main.dataReader) {
	            printWriter.println(reader.toString2());
	        }
	        printWriter.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
