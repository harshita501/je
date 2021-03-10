package MyApp;

public class Registration {
	
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String address;
	
	public Registration(String firstname, String lastname, String email, String phone, String address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static void registerUser(Registration register) {
	
		System.out.println(register.firstname+" : "+register.lastname+" : "+register.email);
	}


}
