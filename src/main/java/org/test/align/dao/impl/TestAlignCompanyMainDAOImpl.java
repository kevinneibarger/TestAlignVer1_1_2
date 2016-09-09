/**
 * 
 */
package org.test.align.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.test.align.bean.TestAlignAccountsMain;
import org.test.align.bean.TestAlignCompanyMain;
import org.test.align.dao.TestAlignCompanyMainDAO;

/**
 * @author kevinscomp
 * 
 */
@Repository
public class TestAlignCompanyMainDAOImpl implements TestAlignCompanyMainDAO {

	protected static Logger logger = Logger
			.getLogger("TestAlignCompanyMainDAO");

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<TestAlignCompanyMain> getAllCompanies() {

		return (List<TestAlignCompanyMain>) sessionFactory.getCurrentSession()
				.createQuery("from TestAlignCompanyMain").list();
	}

	@SuppressWarnings("unchecked")
	public boolean authenticateUser(String companyName, String emailAddr,
			String password) {

		Session session = sessionFactory.getCurrentSession();

		/*
		 * LOGS user in!
		 * 
		 * select a.ACCOUNT_ID, c. COMPANY_STATUS from prj_accounts_main a,
		 * prj_company_main c where a.COMPANY_ID = c.COMPANY_ID and a.PASSWORD1
		 * = $password and UPPER(a.EMAIL_ADDR) = UPPER($email) and
		 * UPPER(REPLACE(REPLACE(c.COMPANY_NAME , ' ' , '' ),',','')) =
		 * UPPER(REPLACE(REPLACE($companynm , ' ' , '' ),',',''))
		 */

		// Criteria loginQuery = session.createCriteria(
		// TestAlignAccountsMain.class).createAlias("prj_accounts_main", "a")
		// .add(Restrictions.eq("a.password1", password))
		// .add(Restrictions.eq("a.email_addr", new
		// String(emailAddr).toUpperCase()))
		// .createCriteria(TestAlignCompanyMain.class)
		// .add()

		Criteria subquery = session.createCriteria(TestAlignCompanyMain.class);
		subquery.add(Restrictions.eq("companyName", companyName));
		List<TestAlignCompanyMain> companyIds = (List<TestAlignCompanyMain>) subquery
				.list();
		Integer companyId = null;

		if (companyIds != null && companyIds.size() > 0) {
			companyId = companyIds.get(0).getCompanyID();
		}

		Criteria criteria = session.createCriteria(TestAlignAccountsMain.class);
		criteria.add(Restrictions.eq("emailAddr", emailAddr));
		criteria.add(Restrictions.eq("companyName", companyName));
		criteria.add(Restrictions.eq("companyId", companyId));

		List<TestAlignAccountsMain> accounts = (List<TestAlignAccountsMain>) criteria
				.list();

		if (accounts != null && accounts.size() > 0) {
			System.out.println("Authenticated User!!!");
			return true;
		} else {
			return false;
		}
	}
}
