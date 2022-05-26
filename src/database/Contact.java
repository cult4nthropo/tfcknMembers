package database;

public class Contact {
	private int contactId;
	private String email;
	private String phone;
	private int adressID_FK;

	public int getContactId() {
		return contactId;
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

	public int getAdressID_FK() {
		return adressID_FK;
	}

	public void setAdressID_FK(int adressID_FK) {
		this.adressID_FK = adressID_FK;
	}
}
