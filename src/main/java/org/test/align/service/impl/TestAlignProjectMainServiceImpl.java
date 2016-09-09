/**
 * 
 */
package org.test.align.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.align.bean.TestAlignProjectMain;
import org.test.align.dao.TestAlignProjectMainDAO;
import org.test.align.service.TestAlignProjectMainService;

/**
 * @author kevinscomp
 * 
 */

@Service
public class TestAlignProjectMainServiceImpl implements
		TestAlignProjectMainService {

	protected static Logger logger = Logger
			.getLogger("TestAlignProjectMainService");

	@Autowired
	private TestAlignProjectMainDAO testAlignProjectDAO;

	/**
	 * Retrieves all Projects in TestAlign
	 * 
	 * @return a list of Projects
	 */
	@Transactional
	public List<TestAlignProjectMain> getAllProjects() {
		logger.debug("Retrieving all Projects");
		return testAlignProjectDAO.getAllProjects();
	}

	/** ADD and DELETE methods need to be added! **/
}
