/**
 * 
 */
package org.test.align.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.align.bean.TestAlignAccountsMain;
import org.test.align.dao.TestAlignAccountMainDAO;
import org.test.align.service.TestAlignAccountMainService;

/**
 * @author kevinscomp
 * 
 */

@Service
public class TestAlignAccountMainServiceImpl implements
		TestAlignAccountMainService {

	protected static Logger logger = Logger
			.getLogger("TestAlignAccountMainService");

	@Autowired
	private TestAlignAccountMainDAO testAlignAccountMain;

	@Transactional
	public List<TestAlignAccountsMain> getAllAccounts() {
		logger.debug("Retrieving all Accounts");
		return testAlignAccountMain.getAllData();
		// return null;
	}

	public boolean login(String companyName, String emailAddress,
			String password1) {

		return testAlignAccountMain.login(companyName, emailAddress, password1);
	}

	/** ADD and DELETE methods need to be added! **/
}
