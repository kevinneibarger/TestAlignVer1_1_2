package org.test.align;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestAlignTestDataLoad {

	public static void main(String[] args) {
		String myDriver = "com.mysql.jdbc.Driver";
		String myUrl = "jdbc:mysql://localhost/testalign";
		Connection conn = null;

		// deleteAll(myDriver, myUrl, conn);
		// insertTestRecords1(myDriver, myUrl, conn);
		// insertTestRecords2(myDriver, myUrl, conn);
		// insertTestRecords3(myDriver, myUrl, conn);
		// insertTestRecords4(myDriver, myUrl, conn);
		insertTestRecords5(myDriver, myUrl, conn);
	}

	private static void insertTestRecords1(String myDriver, String myUrl,
			Connection conn) {

		try {
			// create a mysql database connection

			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "");

			String query1 = "INSERT INTO PRJ_PROJECT_MAIN (PROJECT_ID, PROJECT_NM, PROJECT_DESCR, RELEASE_NM, RELEASE_DESCR, TARGET_START_DATE, TARGET_CLOSE_DT, COMPANY_ID, LAST_ACTIVITY_DT) "
					+ "VALUES(1200, 'XYZ Company - Pilot', 'Pilot Project H123', 'Release 321', 'May 2015 Release Schedule', NOW(), NOW(), 1001, NOW())";

			String query2 = "INSERT INTO PRJ_PROJECT_MAIN (PROJECT_ID, PROJECT_NM, PROJECT_DESCR, RELEASE_NM, RELEASE_DESCR, TARGET_START_DATE, TARGET_CLOSE_DT, COMPANY_ID, LAST_ACTIVITY_DT) "
					+ "VALUES(1234, 'ABC Company - Statistics', 'Statistics Project Company Revenue', 'Release 2.3', 'April 2015 Release - Phase 2', NOW(),NOW(), 1002, NOW())";

			String query3 = "INSERT INTO PRJ_PROJECT_MAIN (PROJECT_ID, PROJECT_NM, PROJECT_DESCR, RELEASE_NM, RELEASE_DESCR, TARGET_START_DATE, TARGET_CLOSE_DT, COMPANY_ID, LAST_ACTIVITY_DT) "
					+ "VALUES(3421, 'EFG Company - Metrics', 'Metrics Project - May 2015', 'Release 5.6', 'June Fiscal Release 2.5', NOW(), NOW(), 1003, NOW())";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query1);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query2);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query3);
			preparedStmt.execute();

			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception! in insertTestRecords1");
			System.err.println(e.getMessage());
		}
	}

	private static void insertTestRecords2(String myDriver, String myUrl,
			Connection conn) {

		try {
			// create a mysql database connection

			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "");

			String query1 = "INSERT INTO PRJ_ACCOUNTS_MAIN (ACCOUNT_ID, COMPANY_ID, FIRST_NM, LAST_NM, EMAIL_ADDR, PASSWORD1, ACCT_STATUS, CREATE_DATE, LAST_LOGIN_DATE) "
					+ "VALUES(14334, 1001, 'Bill', 'Jones', 'billjones@xyzcomp.com', 'p@ssword2', 'A', NOW(), NOW())";

			String query2 = "INSERT INTO PRJ_ACCOUNTS_MAIN (COMPANY_ID, COMPANY_NAME, PRIM_CNTCT_NM, PRIM_CNTCT_EMAIL, PRIM_CNTCT_PHONE, TOTAL_USER_PURCHASE, TOTAL_ACTIVE_USER, COMPANY_STATUS) "
					+ "VALUES(14335, 1002, 'Stan', 'Smith', 'stansmith@xyzcomp.com', 'stansmith1234', 'A', NOW(), NOW())";

			String query3 = "INSERT INTO PRJ_ACCOUNTS_MAIN (COMPANY_ID, COMPANY_NAME, PRIM_CNTCT_NM, PRIM_CNTCT_EMAIL, PRIM_CNTCT_PHONE, TOTAL_USER_PURCHASE, TOTAL_ACTIVE_USER, COMPANY_STATUS) "
					+ "VALUES(14336, 1003, 'Sue',  'Smith', 'suesmith@xyzcomp.com', 'suesmith4567', 'A', NOW(), NOW())";

			String query4 = "INSERT INTO PRJ_ACCOUNTS_MAIN (COMPANY_ID, COMPANY_NAME, PRIM_CNTCT_NM, PRIM_CNTCT_EMAIL, PRIM_CNTCT_PHONE, TOTAL_USER_PURCHASE, TOTAL_ACTIVE_USER, COMPANY_STATUS) "
					+ "VALUES(14337, 1004, 'Till', 'Lindemann', 'tillindemann@xyzcomp.com', 'lindemann666', 'I', NOW(), NOW())";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query1);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query2);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query3);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query4);
			preparedStmt.execute();

			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception in insertTestRecords2!");
			System.err.println(e.getMessage());
		}
	}

	private static void insertTestRecords3(String myDriver, String myUrl,
			Connection conn) {

		try {
			// create a mysql database connection

			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "");

			String query1 = "INSERT INTO PRJ_ROLES_ADMIN (ROLE_ID, ACCOUNT_ID, COMPANY_ID)"
					+ "VALUES(12200, 14334, 1001)";

			String query2 = "INSERT INTO PRJ_ROLES_ADMIN (ROLE_ID, ACCOUNT_ID, COMPANY_ID)"
					+ "VALUES(12201, 14335, 1002)";

			String query3 = "INSERT INTO PRJ_ROLES_ADMIN (ROLE_ID, ACCOUNT_ID, COMPANY_ID)"
					+ "VALUES(12202, 14336, 1003)";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query1);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query2);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query3);
			preparedStmt.execute();

			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception in insertTestRecords3!");
			System.err.println(e.getMessage());
		}
	}

	private static void insertTestRecords4(String myDriver, String myUrl,
			Connection conn) {

		try {
			// create a mysql database connection

			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "");

			String query1 = "INSERT INTO PRJ_ROLES_ACCOUNT (ROLE_ID, PROJECT_ID, ACCOUNT_ID, ROLE_TYPE) "
					+ "VALUES(12200, 1200, 14334, 'Test Expert')";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query1);
			preparedStmt.execute();

			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception in insertTestRecords4!");
			System.err.println(e.getMessage());
		}
	}

	private static void insertTestRecords5(String myDriver, String myUrl,
			Connection conn) {

		try {
			// create a mysql database connection

			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "");

			// the mysql insert statement
			String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
					+ " values (?, ?, ?, ?, ?)";

			String query1 = "INSERT INTO PRJ_COMPANY_MAIN (COMPANY_ID, COMPANY_NAME, PRIM_CNTCT_NM, PRIM_CNTCT_EMAIL, PRIM_CNTCT_PHONE, TOTAL_USER_PURCHASE, TOTAL_ACTIVE_USER, COMPANY_STATUS) "
					+ "VALUES(1001, 'XYZ Company', 'Bill Jones', 'billjones@xyzcomp.com', '444-3434-3221', 25.00, 12, 'A')";

			String query2 = "INSERT INTO PRJ_COMPANY_MAIN (COMPANY_ID, COMPANY_NAME, PRIM_CNTCT_NM, PRIM_CNTCT_EMAIL, PRIM_CNTCT_PHONE, TOTAL_USER_PURCHASE, TOTAL_ACTIVE_USER, COMPANY_STATUS) "
					+ "VALUES(1002, 'ABC Company', 'Stan Smith', 'stansmith@xyzcomp.com', '444-3434-3221', 25.00, 5, 'A')";

			String query3 = "INSERT INTO PRJ_COMPANY_MAIN (COMPANY_ID, COMPANY_NAME, PRIM_CNTCT_NM, PRIM_CNTCT_EMAIL, PRIM_CNTCT_PHONE, TOTAL_USER_PURCHASE, TOTAL_ACTIVE_USER, COMPANY_STATUS) "
					+ "VALUES(1003, 'EFG Company', 'Sue Smith', 'suesmith@xyzcomp.com', '444-3434-3221', 25.00, 15, 'I')";

			String query4 = "INSERT INTO PRJ_COMPANY_MAIN (COMPANY_ID, COMPANY_NAME, PRIM_CNTCT_NM, PRIM_CNTCT_EMAIL, PRIM_CNTCT_PHONE, TOTAL_USER_PURCHASE, TOTAL_ACTIVE_USER, COMPANY_STATUS) "
					+ "VALUES(1004, 'Rammstien Company', 'Till Lindemann', 'tillindemann@xyzcomp.com', '444-3434-3221', 25.00, 100, 'A')";

			String query5 = "INSERT INTO PRJ_COMPANY_MAIN (COMPANY_ID, COMPANY_NAME, PRIM_CNTCT_NM, PRIM_CNTCT_EMAIL, PRIM_CNTCT_PHONE, TOTAL_USER_PURCHASE, TOTAL_ACTIVE_USER, COMPANY_STATUS) "
					+ "VALUES(1005, 'KISS Company', 'Gene Simmons', 'genesimmons@xyzcomp.com', '444-3434-3221', 25.00, 35, 'I')";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query1);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query2);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query3);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query4);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query5);
			preparedStmt.execute();

			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception insertTestRecords5!");
			System.err.println(e.getMessage());
		}
	}

	private static void deleteAll(String myDriver, String myUrl, Connection conn) {

		try {
			// create a mysql database connection

			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "");

			String query1 = "DELETE FROM PRJ_COMPANY_MAIN";
			String query2 = "DELETE FROM PRJ_PROJECT_MAIN";
			String query3 = "DELETE FROM PRJ_ACCOUNTS_MAIN";
			String query4 = "DELETE FROM PRJ_ROLES_ADMIN";
			String query5 = "DELETE FROM PRJ_ROLES_ACCOUNT";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query1);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query2);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query3);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query4);
			preparedStmt.execute();
			preparedStmt = conn.prepareStatement(query5);
			preparedStmt.execute();

			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception insertTestRecords5!");
			System.err.println(e.getMessage());
		}

	}
}
