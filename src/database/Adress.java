package database;

public class Adress {
	private int adressID;
	private String street;
	private String housenumber;
	private String zip;
	private String city;
	private String country;
	private int memberID_FK;

	public int getAdressId() {
		return adressID;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMemberID_FK() {
		return memberID_FK;
	}

	public void setMemberID_FK(int memberID_FK) {
		this.memberID_FK = memberID_FK;
	}
}
