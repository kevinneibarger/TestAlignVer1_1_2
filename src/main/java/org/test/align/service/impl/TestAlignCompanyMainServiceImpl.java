package org.test.align.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.align.bean.TestAlignCompanyMain;
import org.test.align.dao.TestAlignCompanyMainDAO;
import org.test.align.service.TestAlignCompanyMainService;

/**
 * Service for generating and adding data for PRJ_COMPANY_MAIN SQL table
 * 
 */
@Service
public class TestAlignCompanyMainServiceImpl implements
		TestAlignCompanyMainService {

	protected static Logger logger = Logger
			.getLogger("TestAlignCompanyMainService");

	@Autowired
	private TestAlignCompanyMainDAO testAlignCompDAO;

	@Transactional
	public List<TestAlignCompanyMain> getAllCompanies() {
		return testAlignCompDAO.getAllCompanies();
	}

	public boolean authenticateUser(String companyName, String emailAddr,
			String password) {
		return testAlignCompDAO.authenticateUser(companyName, emailAddr,
				password);
	}

	/** ADD and DELETE methods need to be added! **/
}
