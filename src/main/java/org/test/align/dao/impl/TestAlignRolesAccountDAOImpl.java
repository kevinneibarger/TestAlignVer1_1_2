package org.test.align.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.test.align.bean.TestAlignRolesAccount;
import org.test.align.dao.TestAlignRolesAccountDAO;

@Repository
public class TestAlignRolesAccountDAOImpl implements TestAlignRolesAccountDAO {

	protected static Logger logger = Logger
			.getLogger("TestAlignRolesAccountDAOImpl");

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<TestAlignRolesAccount> getAllRolesAccounts() {
		return (List<TestAlignRolesAccount>) sessionFactory.getCurrentSession()
				.createQuery("from TestAlignRolesAccount").list();
	}

}
