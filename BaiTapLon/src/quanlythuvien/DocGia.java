package quanlythuvien;

public class DocGia {
	public String userName;
	public String passWord;
	public String name;
	public String address;
	public int phoneNumber;
	public int cmnd;
	
	public DocGia(String userName, String passWord, String name, int phoneNumber) {
		this.userName = userName;
		this.passWord = passWord;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public DocGia(String userName, String passWord, String name, String address, int phoneNumber, int cmnd) {
		this.userName = userName;
		this.passWord = passWord;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.cmnd = cmnd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCmnd() {
		return cmnd;
	}

	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	
	// phan dang nhap
	void login(String userName, String passWord) {
		
	}
	
	
}
