package org.test.align.dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.test.align.bean.TestAlignAccountsMain;

@Transactional(propagation = Propagation.REQUIRED)
public interface TestAlignAccountMainDAO {
	public List<TestAlignAccountsMain> getAllData();

	public TestAlignAccountsMain getAccountById(Integer acctId);

	public boolean login(String companyName, String emailAddress,
			String password1);

	public boolean updateAccountLoginDate(Integer acctID);
}
