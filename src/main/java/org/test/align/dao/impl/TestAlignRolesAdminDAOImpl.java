package org.test.align.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.test.align.bean.TestAlignRolesAdmin;
import org.test.align.dao.TestAlignRolesAdminDAO;

@Repository
public class TestAlignRolesAdminDAOImpl implements TestAlignRolesAdminDAO {

	protected static Logger logger = Logger
			.getLogger("TestAlignRolesAdminDAOImpl");

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<TestAlignRolesAdmin> getAllAdminRoles() {
		return (List<TestAlignRolesAdmin>) sessionFactory.getCurrentSession()
				.createQuery("from TestAlignRolesAdmin").list();
	}

}
