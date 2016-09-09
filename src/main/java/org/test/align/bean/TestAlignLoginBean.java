/**
 * 
 */
package org.test.align.bean;

import java.io.Serializable;

/**
 * @author kevinscomp
 *
 */
public class TestAlignLoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer accountId;
	private String companyStatus;

	private TestAlignLoginBean() {
	}

	public static TestAlignLoginBean getInstance() {
		return new TestAlignLoginBean();
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String toString() {
		StringBuilder bld = new StringBuilder();

		bld.append("Account ID: " + accountId + "\n");

		if (companyStatus != null) {
			bld.append("Company Status: " + companyStatus + "\n");
		}

		return bld.toString();
	}
}
