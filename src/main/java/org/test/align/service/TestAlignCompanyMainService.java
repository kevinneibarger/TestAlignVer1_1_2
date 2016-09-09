/**
 * 
 */
package org.test.align.service;

import java.util.List;

import org.test.align.bean.TestAlignCompanyMain;

/**
 * @author kevinscomp
 * 
 */
public interface TestAlignCompanyMainService {

	public List<TestAlignCompanyMain> getAllCompanies();

	public boolean authenticateUser(String companyName, String emailAddr,
			String password);
}
