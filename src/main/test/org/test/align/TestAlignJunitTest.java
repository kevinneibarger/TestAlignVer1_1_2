/**
 * 
 */
package org.test.align;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.test.align.bean.TestAlignAccountsMain;
import org.test.align.dao.TestAlignAccountMainDAO;

/**
 * @author kevinscomp
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-spring-context.xml")
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionManager")
public class TestAlignJunitTest {
	
	@Autowired
	private TestAlignAccountMainDAO testAlignDAO;

	@Test
	public void testGetAccountById() {

		TestAlignAccountsMain account = testAlignDAO
				.getAccountById(new Integer(10001));
		System.out.println("\n Test Align Accounts Main \n");
		System.out.println("\n " + account.getEmailAddress() + "\n");

		Assert.assertNotNull(account);
	}

	@Test
	public void testLogin() {

		String companyName = "Flamingo, Inc";
		String emailAddress = "testalign@email.com";
		String password1 = "p@ssword4";

		Object obj = testAlignDAO.login(companyName, emailAddress, password1);

	}

}
