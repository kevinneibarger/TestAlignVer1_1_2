/**
 * 
 */
package org.test.align.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.align.bean.TestAlignRolesAccount;
import org.test.align.dao.TestAlignRolesAccountDAO;
import org.test.align.service.TestAlignRolesAccountService;

/**
 * @author kevinscomp
 * 
 */
@Service
public class TestAlignRolesAccountServiceImpl implements
		TestAlignRolesAccountService {

	protected static Logger logger = Logger
			.getLogger("TestAlignRolesAccountService");

	@Autowired
	private TestAlignRolesAccountDAO testAlignRolesAcctDAO;

	@Transactional
	public List<TestAlignRolesAccount> getAllRoleAccts() {
		logger.debug("Retrieving all Roles");
		return testAlignRolesAcctDAO.getAllRolesAccounts();

	}

	/** ADD and DELETE methods need to be added! **/
}
