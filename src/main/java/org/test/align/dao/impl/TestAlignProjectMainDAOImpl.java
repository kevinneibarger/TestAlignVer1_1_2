package org.test.align.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.test.align.bean.TestAlignProjectMain;
import org.test.align.dao.TestAlignProjectMainDAO;

@Repository
public class TestAlignProjectMainDAOImpl implements TestAlignProjectMainDAO {

	protected static Logger logger = Logger
			.getLogger("TestAlignProjectMainDAOImpl");

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<TestAlignProjectMain> getAllProjects() {
		return (List<TestAlignProjectMain>) sessionFactory.getCurrentSession()
				.createQuery("from TestAlignProjectMain").list();
	}

}
