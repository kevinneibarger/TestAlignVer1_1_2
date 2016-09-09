package org.test.align.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.test.align.bean.TestAlignAccountsMain;
import org.test.align.dao.TestAlignAccountMainDAO;
import org.test.align.util.TestAlignSQLUtility;

@Transactional
public class TestAlignAccountMainDAOImpl implements TestAlignAccountMainDAO {//extends HibernateDaoSupport implements TestAlignAccountMainDAO {

	protected static Logger logger = Logger
			.getLogger("TestAlignAccountMainDAOImpl");

	//private Timestamp updateLastLogin = new Timestamp(
	//		System.currentTimeMillis());

	@Autowired
	private SessionFactory sessionFactory;

	public List<TestAlignAccountsMain> getAllData() {
		//return getHibernateTemplate().loadAll(TestAlignAccountsMain.class);
		return null;
	}

	public TestAlignAccountsMain getAccountById(Integer acctId) {
		//return (TestAlignAccountsMain)getHibernateTemplate().get(TestAlignAccountsMain.class, acctId);
		 return null;
	}

	public boolean login(String companyName, String emailAddress,
			String password1) {
		// Get HSQL Query
		TestAlignSQLUtility util = TestAlignSQLUtility.getInstance(
				"org.test.align.util.testalignQueries", "authenticate_user");
		List<String> params = new ArrayList<String>();
		params.add(0, password1);
		params.add(1, emailAddress);
		params.add(2, companyName);

		return authenticateUser(util.buildQueryWithParams(params));
	}

	public boolean updateAccountLoginDate(Integer acctID) {
//		TestAlignAccountsMain updatedAccount = getAccountById(acctID);
//		updatedAccount.setLastLoginDate(this.updateLastLogin);
//		getHibernateTemplate().persist(updatedAccount);
//
//		return (updatedAccount != null
//				&& updatedAccount.getLastLoginDate() != null && updatedAccount
//				.getLastLoginDate().equals(this.updateLastLogin));
		return false;
	}

	/**
	 * This method will run the query built from the SQL properties file to
	 * authenticate the user
	 * 
	 * @param hsql
	 *            A String representing a SQL query to authenticate the user
	 * @return A boolean representing true if the user has been authenticated,
	 *         false otherwise.
	 */
	//@SuppressWarnings("unchecked")
	private boolean authenticateUser(String hsql) {

//		System.out.println(hsql);
//		List<Object> loginUser = getHibernateTemplate().find(hsql);
//		String companyStatus = null;
//		Integer accountID = null;
//
//		if (loginUser != null) {
//
//			Object[] fields = null;
//
//			for (int i = 0; i < loginUser.size(); i++) {
//				fields = (Object[]) loginUser.get(i);
//			}
//
//			System.out.println("FIELDs LEn " + fields.length);
//			System.out.println("FIELD 0 = " + fields[0]);
//			System.out.println("FIELD 1 = " + fields[1]);
//
//			if (fields[0] != null) {
//				accountID = (Integer) fields[0];
//			}
//
//			if (fields[1] != null) {
//				companyStatus = (String) fields[1];
//			}
//
//			if (companyStatus != null && accountID != null && accountID > 0) {
//				System.out.println("User is Authenticated!");
//				// return updateUserData(accountID);
//				return true;
//			}
//		}

		return false;
	}

	// @SuppressWarnings("unchecked")
	// public List<TestAlignAccountsMain> getAllAccounts() {
	//
	// // HibernateTemplate template = new HibernateTemplate();
	// // return template.loadAll(TestAlignAccountsMain.class);
	//
	// return getHibernateTemplate().loadAll(TestAlignAccountsMain.class);
	// // return (List<TestAlignAccountsMain>)
	// // sessionFactory.getCurrentSession()
	// // .createQuery("from TestAlignAccountsMain").list();
	// }
	//
	// public TestAlignAccountsMain getAccountById(Integer acctId) {
	// return getHibernateTemplate().get(TestAlignAccountsMain.class, acctId);
	// }
	//
	// @SuppressWarnings("unchecked")
	// public boolean login(String companyName, String emailAddress,
	// String password1) {
	//
	// // getHibernateTemplate().getSessionFactory().getCurrentSession()
	// // .beginTransaction();
	//
	// String authenticateUserSQL =
	// "SELECT acct.accountID, comp.companyStatus from TestAlignAccountsMain acct, TestAlignCompanyMain comp WHERE acct.companyId = "
	// + "comp.companyID AND acct.password1 = '"
	// + password1
	// + "' AND UPPER(acct.emailAddress) = '"
	// + emailAddress.toUpperCase()
	// + "' AND "
	// +
	//
	// " UPPER(REPLACE(REPLACE(comp.companyName, ' ',''),',','')) = UPPER(REPLACE(REPLACE('"
	// + companyName + "', ' ' ,''),',',''))";
	//
	// List loginQuery = getHibernateTemplate().find(authenticateUserSQL);
	//
	// TestAlignLoginBean loginBean = TestAlignLoginBean.getInstance();
	// // Should return 2 objects, 1st is an Integer and 2nd is status
	// if (loginQuery != null) {
	//
	// // System.out.println("Login: " + loginQuery);
	// Integer acctId = null;
	// String companyStatus = null;
	//
	// for (int i = 0; i < loginQuery.size(); i++) {
	// Object[] obj = (Object[]) loginQuery.get(i);
	// acctId = (Integer) obj[0];
	// companyStatus = (String) obj[1];
	// }
	//
	// loginBean.setAccountId(acctId);
	// loginBean.setCompanyStatus(companyStatus);
	//
	// // System.out.println("Account ID: " + acctId);
	// // System.out.println("Company Status: " + companyName);
	// // String resultSet = loginQuery.get(0);
	// // String resultSet2 = loginQuery.get(1);
	// // // String resultToString = resultSet.toString();
	// //
	// // System.out.println(resultSet);
	// // System.out.println(resultSet2);
	// // System.out.println(loginQuery.get(1).getClass());
	// // loginBean.setAccountId((Integer) loginQuery.get(0));
	// // loginBean.setCompanyStatus((String) loginQuery.get(1));
	// // for (Object obj : loginQuery) {
	// //
	// // if (obj instanceof Integer) {
	// // loginBean.setAccountId((Integer) obj);
	// // } else if (obj instanceof String) {
	// // loginBean.setCompanyStatus((String) obj);
	// // }
	// // }
	// }
	//
	// // Second Part - Update Accounts Main Table to set last login date
	// if (loginBean != null && loginBean.getAccountId() > 0) {
	// // Successful Login!!
	// TestAlignAccountsMain updateAccountsMain = getAccountById(loginBean
	// .getAccountId());
	// updateAccountsMain.setLastLoginDate(new Timestamp(System
	// .currentTimeMillis()));
	// updateAccountsMain.setAccountStatus(loginBean.getCompanyStatus());
	// updateUser(updateAccountsMain);
	//
	// // check to make sure table was updated
	// TestAlignAccountsMain checkUpdates = getAccountById(loginBean
	// .getAccountId());
	//
	// if (checkUpdates.getLastLoginDate() == new Timestamp(
	// System.currentTimeMillis())) {
	// return true;
	// } else {
	// return false;
	// }
	// }
	//
	// return false;
	// }
	//
	// private void updateUser(TestAlignAccountsMain accountUpdate) {
	//
	// // hibernate code start
	// SessionFactory sessionFactory = getHibernateTemplate()
	// .getSessionFactory();
	// // Session session = sessionFactory.getCurrentSession();
	// // session.beginTransaction();
	// HibernateTemplate template = new HibernateTemplate(sessionFactory);
	// template.saveOrUpdate(accountUpdate);
	// // template.persist(accountUpdate);
	// // session.saveOrUpdate(accountUpdate);
	// // session.getTransaction().commit();
	//
	// // hibernate code end
	// }
}
