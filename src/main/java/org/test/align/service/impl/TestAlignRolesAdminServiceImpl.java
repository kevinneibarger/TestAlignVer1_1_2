/**
 * 
 */
package org.test.align.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.align.bean.TestAlignRolesAdmin;
import org.test.align.dao.TestAlignRolesAdminDAO;
import org.test.align.service.TestAlignRolesAdminService;

/**
 * @author kevinscomp
 * 
 */
@Service
public class TestAlignRolesAdminServiceImpl implements
		TestAlignRolesAdminService {

	protected static Logger logger = Logger
			.getLogger("TestAlignRolesAdminService");

	@Autowired
	private TestAlignRolesAdminDAO testAlignRolesAdminDAO;

	@Transactional
	public List<TestAlignRolesAdmin> getAllAdminRoles() {
		logger.debug("Retrieving all Roles");
		return testAlignRolesAdminDAO.getAllAdminRoles();
	}

	/** ADD and DELETE methods need to be added! **/
}
