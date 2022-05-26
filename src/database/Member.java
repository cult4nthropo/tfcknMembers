package database;

import java.util.Date;

public class Member {
	private int memberID;
	private String name;
	private String surname;
	private Date birthday;
	private String membershipType_FK;

	public int getMemberID() {
		return memberID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMembershipType_FK() {
		return membershipType_FK;
	}

	public void setMembershipType_FK(String membershipType_FK) {
		this.membershipType_FK = membershipType_FK;
	}
}
