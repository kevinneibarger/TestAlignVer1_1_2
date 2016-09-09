/**
 * 
 */
package org.test.align;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import antlr.Version;

import com.mysql.jdbc.ResultSetMetaData;

/**
 * @author kevinscomp
 * 
 */
public class TestAlignDirectConnect {

	private static final String PRJ_COMPANY_MAIN_ALL = "select * from prj_company_main";
	private static final String PRJ_PROJECT_MAIN_ALL = "select * from prj_project_main";
	private static final String PRJ_ACCOUNTS_MAIN_ALL = "select * from prj_accounts_main";
	private static final String PRJ_ROLES_ADMIN_ALL = "select * from prj_roles_admin";
	private static final String PRJ_ROLES_ACCT_ALL = "select * from prj_roles_account";
	private static final String PRJ_ROLES_TYPE_ALL = "select * from prj_roles_types";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// String url = "jdbc:mysql://localhost:3306/testalign";
		// String user = "root";
		// String password = "";

		String url = "jdbc:mysql://204.93.216.11:3306/kneibarg_test_align_db";
		String user = "kneibarg_test";
		String password = "test2014";

		System.out.println("---------COMPANY MAIN---------------");
		displayRecords(url, user, password, PRJ_COMPANY_MAIN_ALL);
		System.out.println("------------------------------------");

		System.out.println("---------PROJECT MAIN---------------");
		displayRecords(url, user, password, PRJ_PROJECT_MAIN_ALL);
		System.out.println("------------------------------------");

		System.out.println("---------ACCOUNTS MAIN---------------");
		displayRecords(url, user, password, PRJ_ACCOUNTS_MAIN_ALL);
		System.out.println("------------------------------------");

		System.out.println("---------ROLES ADMIN---------------");
		displayRecords(url, user, password, PRJ_ROLES_ADMIN_ALL);
		System.out.println("------------------------------------");

		System.out.println("---------ROLES ACCT ---------------");
		displayRecords(url, user, password, PRJ_ROLES_ACCT_ALL);
		System.out.println("------------------------------------");

		System.out.println("---------ROLES TYPE ---------------");
		displayRecords(url, user, password, PRJ_ROLES_TYPE_ALL);
		System.out.println("------------------------------------");
	}

	private static void displayRecords(String url, String user,
			String password, String sqlStmt) {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery(sqlStmt);
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			int cols = rsmd.getColumnCount();

			while (rs.next()) {

				while (cols > 0) {
					System.out.println(rsmd.getColumnLabel(cols) + ":"
							+ rs.getString(cols));
					cols--;
				}
			}

		} catch (SQLException ex) {
			Logger lgr = Logger.getLogger(Version.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);

		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (SQLException ex) {
				Logger lgr = Logger.getLogger(Version.class.getName());
				lgr.log(Level.WARNING, ex.getMessage(), ex);
			}
		}
	}
}
