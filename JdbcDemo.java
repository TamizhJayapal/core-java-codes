package com.example;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class JdbcExample {

	public static final String url = "jdbc:mysql://localhost:3306/university";

	public static final String userName = "root";

	public static final String password = "root@123";

	public static void main(String[] args) throws SQLException, IOException {

		try (Scanner scanner = new Scanner(System.in)) {

			while (true) {
				System.out.println("Select the operation");

				System.out.println("1. read data");

				System.out.println("2. insert data");

				System.out.println("3. update data");

				System.out.println("4. delete data");

				System.out.println("5. exit");

				System.out.println("________________________");
				System.out.println();

				int option = scanner.nextInt();

				int rollno;
				String name;

				switch (option) {

				case 1:
					batchUpdate();
					break;

				case 2:
					System.out.println("enter roll no");
					rollno = scanner.nextInt();
					System.out.println("enter name");
					name = scanner.next();

					insertRecord(rollno, name);
					break;

				case 3:
					System.out.println("enter rollno to update: ");
					rollno = scanner.nextInt();

					System.out.println("enter name to update: ");
					name = scanner.next();

					updateRecord(rollno, name);
					break;

				case 4:
					System.out.println("enter rollno to delete");

					rollno = scanner.nextInt();

					deleteRecord(rollno);
					break;

				case 5:
					System.out.println("program completed");
					System.exit(0);
					break;

				default:
					System.out.println("Invalid option");
					break;
				}

			}

		}
	}

//	public static void readRecord() throws SQLException {
//
//		String query = "select * from students";
//		Connection con = DriverManager.getConnection(url, userName, password);
//
//		Statement statement = con.createStatement();
//
//		ResultSet rs = statement.executeQuery(query);
//
//		while (rs.next()) {
//			System.out.println(rs.getInt(1) + " | " + rs.getString(2));
//		}
//		System.out.println();
//		con.close();
//	}
	
	//read record using stored procedure
	public static void readRecord() throws SQLException {

		Connection con = DriverManager.getConnection(url, userName, password);

		CallableStatement statement = con.prepareCall("{call getStudentDetails()}");

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2));
		}
		System.out.println();
		con.close();
	}
	
	//read record using stored procedure with input param
		public static void readRecordById(int id) throws SQLException {

			Connection con = DriverManager.getConnection(url, userName, password);

			CallableStatement statement = con.prepareCall("{call getStudentById(?)}");
			statement.setInt(1, id);
			
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " | " + rs.getString(2));
			}
			System.out.println();
			con.close();
		}
		
		//procedure with out param
		
		public static void getNameById(int id) throws SQLException {

			Connection con = DriverManager.getConnection(url, userName, password);

			CallableStatement statement = con.prepareCall("{call getNameById(?,?)}");
			statement.setInt(1, id);
			statement.registerOutParameter(2, Types.VARCHAR);
			
			statement.executeUpdate();
			
			

			System.out.println(statement.getString(2));
			
			System.out.println();
			con.close();
		}

//	public static void insertRecord(int rollno, String name) throws SQLException {
//
//		String query = "insert into students values(" + rollno + ",'" + name + "')";
//		Connection con = DriverManager.getConnection(url, userName, password);
//
//		Statement statement = con.createStatement();
//
//		int rows = statement.executeUpdate(query);
//
//		System.out.println("no of rows affected " + rows);
//		System.out.println();
//
//		con.close();
//	}
	
	// insert using prepare statement
	
	public static void insertRecord(int rollno, String name) throws SQLException {

		String query = "insert into students values(?,?)";

		Connection con = DriverManager.getConnection(url, userName, password);
		
		PreparedStatement statement = con.prepareStatement(query);
		
		statement.setInt(1, rollno);
		
		statement.setString(2, name);
		
		int rows = statement.executeUpdate();
		
		System.out.println("Number of rows affected: " + rows);	
		System.out.println();
		
		con.close();
	}

	public static void updateRecord(int rollno, String name) throws SQLException {

		String query = "update students set name='" + name + "' where rollno =" + rollno;
		Connection con = DriverManager.getConnection(url, userName, password);

		Statement statement = con.createStatement();

		int rows = statement.executeUpdate(query);

		System.out.println("no of rows affected " + rows);
		System.out.println();

		con.close();
	}

	public static void deleteRecord(int rollno) throws SQLException {
		String query = "delete from students where rollno =" + rollno;

		Connection con = DriverManager.getConnection(url, userName, password);

		Statement statement = con.createStatement();

		int rows = statement.executeUpdate(query);

		System.out.println("number of rows affected: " + rows);
		System.out.println();

		con.close();
	}
	
	// commit and auto commit
	
	public static void updateBulkRecord() throws SQLException {

		String query1 = "update students set deptartment='IT' where rollno = 1";
		String query2 = "update students set deptartment='IT' where rollno = 2";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		con.setAutoCommit(false);
		
		Statement statement = con.createStatement();

		int rows1 = statement.executeUpdate(query1);

		System.out.println("no of rows affected " + rows1);
		
		int rows2 = statement.executeUpdate(query2);

		System.out.println("no of rows affected " + rows2);
		
		if(rows1 >0 && rows2 >0)
			con.commit();
		
		
		System.out.println();

		con.close();
	}

	//rollback
	
	public static void batchUpdate() throws SQLException {
		String query1 = "update students set deptartment='CSE' where rollno = 1";
		String query2 = "update students set deptartment='CSE' where rollno = 2";
		String query3 = "update students set deptartment='CSE' where rollno = 6";
		String query4 = "update students set deptartment='CSE' where rollno = 9";
		
		
		Connection con = DriverManager.getConnection(url, userName, password);
		con.setAutoCommit(false);
		
		Statement statement = con.createStatement();
		statement.addBatch(query1);
		statement.addBatch(query2);
		statement.addBatch(query3);
		statement.addBatch(query4);
		
		int rows[] = statement.executeBatch();

		for(int i: rows){
			System.out.println("no of rows affected " + i);
			if(i>0)
				continue;
			else
				con.rollback();
		}
		con.commit();
		System.out.println();

		con.close();
	}
}
