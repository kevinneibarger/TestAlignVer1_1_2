/**
 * 
 */
package org.test.align.dao;

import java.util.List;

import org.test.align.bean.TestAlignCompanyMain;

/**
 * @author kevinscomp
 * 
 */
public interface TestAlignCompanyMainDAO {

	public List<TestAlignCompanyMain> getAllCompanies();

	public boolean authenticateUser(String companyName, String emailAddr,
			String password);
}
