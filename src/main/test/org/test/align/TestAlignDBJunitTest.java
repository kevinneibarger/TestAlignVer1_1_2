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
import org.test.align.dao.TestAlignAccountMainDAO;

/**
 * @author kevinscomp
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-spring-context.xml")
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionManager")
public class TestAlignDBJunitTest {

	@Autowired
	private TestAlignAccountMainDAO testDBDao;

	@Before
	public void setUp() throws Exception {
		// testDBDao = new TestDBDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLogin() {

		// Login the user
		boolean isloggedin = testDBDao.login("Flamingo, Inc",
				"testalign@email.com", "p@ssword5");
		Assert.assertTrue(isloggedin);

		// Update the last login date.. for some reason..
		boolean isUpdated = testDBDao.updateAccountLoginDate(10001);

		Assert.assertTrue(isUpdated);
	}
}
