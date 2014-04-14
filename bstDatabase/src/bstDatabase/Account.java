package bstDatabase;

public class Account {
	private int ssn;
	private String lname;
	private String fname;
	private long phone;
	private String email;
	private String address;
	private int zip;
	private String city;
	private String state;
	private String password;
	private int bmonth;
	private int bday;
	private int byear;
	private String department;
	private boolean isActive = true;

	public Account() {
		super();
	}

	public Account(int ssn, String lname, String fname, long phone,
			String email, String address, int zip, String city, String state,
			String password, int bmonth, int bday, int byear, String department) {
		super();
		this.ssn = ssn;
		this.lname = lname;
		this.fname = fname;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.password = password;
		this.bmonth = bmonth;
		this.bday = bday;
		this.byear = byear;
		this.department = department;
	}

	public Account(int ssn, String lname, String fname, long phone,
			String email, String address, int zip, String password, int bmonth,
			int bday, int byear, String department) {
		super();
		this.ssn = ssn;
		this.lname = lname;
		this.fname = fname;
		this.phone = phone;
		this.email = email;
		this.address = address;
		setZip(zip);
		this.password = password;
		this.bmonth = bmonth;
		this.bday = bday;
		this.byear = byear;
		this.department = department;
	}

	public Account(String accountData) {
		String[] data = accountData.split(",");
		ssn = Integer.parseInt(data[0]);
		lname = data[1];
		fname = data[2];
		phone = Long.parseLong(data[3]);
		email = data[4];
		address = data[5];
		zip = Integer.parseInt(data[6]);
		city = data[7];
		state = data[8];
		password = data[9];
		bmonth = Integer.parseInt(data[10]);
		bday = Integer.parseInt(data[11]);
		byear = Integer.parseInt(data[12]);
		department = data[13];

	}

	// Getters and Setters
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getLname() {
		int i;
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		String[] zipdata = Utilities.getZipInfo(zip);
		setCity(zipdata[0]);
		setState(zipdata[1]);
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBmonth() {
		return bmonth;
	}

	public void setBmonth(int bmonth) {
		this.bmonth = bmonth;
	}

	public int getBday() {
		return bday;
	}

	public void setBday(int bday) {
		this.bday = bday;
	}

	public int getByear() {
		return byear;
	}

	public void setByear(int byear) {
		this.byear = byear;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		String s="";
		if(ssn==0){
			return "There is no account for this SSN.";
		}
		if(!isActive){
			s+= "This account has been deactivated\n";
		}
		return s+"Account [ssn=" + ssn + ", lname=" + lname + ", fname=" + fname
				+ ", phone=" + phone + ", email=" + email + ", address="
				+ address + ", zip=" + zip + ", city=" + city + ", state="
				+ state + ", password=" + password + ", bmonth=" + bmonth
				+ ", bday=" + bday + ", byear=" + byear + ", department="
				+ department + ", isActive=" + isActive + "]";
	}

}
