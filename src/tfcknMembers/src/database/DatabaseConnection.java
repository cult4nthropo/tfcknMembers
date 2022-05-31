package tfcknMembers.src.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private String path;
	private String username;
	private String password;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getConnection() {
		Connection c = null;
		try {
			c = DriverManager.getConnection("jdbc:hsqldb:file" + this.path, this.username, this.password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return c;
	}

}
