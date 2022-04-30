package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = DB.getConnection();
		System.out.println("Connected to the database.");
		DB.closeConnection();
		System.out.println("Disconnected from the database..");
	}

}
