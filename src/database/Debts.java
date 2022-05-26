package database;

public class Debts {
	private int debtID;
	private double debtAmount;
	private int memberID_FK;

	public int getDebtID() {
		return debtID;
	}

	public double getDebtAmount() {
		return debtAmount;
	}

	public void setDebtAmount(double debtAmount) {
		this.debtAmount = debtAmount;
	}

	public int getMemberID_FK() {
		return memberID_FK;
	}

	public void setMemberID_FK(int memberID_FK) {
		this.memberID_FK = memberID_FK;
	}
}
