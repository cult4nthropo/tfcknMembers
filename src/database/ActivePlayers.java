package database;

public class ActivePlayers {
	private int playerID;
	private int memberId_FK;

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public int getMemberId_FK() {
		return memberId_FK;
	}

	public void setMemberId_FK(int memberId_FK) {
		this.memberId_FK = memberId_FK;
	}
}
