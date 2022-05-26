package database;

public class Payment {
	/**
	 * TODO: Maybe the membership should be in an enum
	 */
	private double monthlyAmount;
	private int membership_FK;
	private boolean isPayed;

	public double getMonthlyAmount() {
		return monthlyAmount;
	}

	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}

	public int getMembership_FK() {
		return membership_FK;
	}

	public void setMembership_FK(int membership_FK) {
		this.membership_FK = membership_FK;
	}

	public boolean isPayed() {
		return isPayed;
	}

	public void setPayed(boolean isPayed) {
		this.isPayed = isPayed;
	}
}
