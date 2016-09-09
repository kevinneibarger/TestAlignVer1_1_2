package org.test.align.service;

import java.util.List;

import org.test.align.bean.TestAlignAccountsMain;

public interface TestAlignAccountMainService {

	public List<TestAlignAccountsMain> getAllAccounts();

	public boolean login(String companyName, String emailAddress,
			String password1);
}
