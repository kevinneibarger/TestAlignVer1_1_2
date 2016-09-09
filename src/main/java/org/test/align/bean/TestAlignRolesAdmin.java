/**
 * 
 */
package org.test.align.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author kevinscomp
 *
 */

@Entity
@Table(name = "PRJ_ROLES_ADMIN")
public class TestAlignRolesAdmin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ROLE_ID")
	@GeneratedValue
	private Integer roleID;
	
	// Company ID is a foreign key, not sure how to do this yet....
	// Foreign Keys and indexes have not been defined yet
	@OneToOne
	@JoinColumn(name = "COMPANY_ID")
	private TestAlignCompanyMain testAlignCompanyMain;
	
	@OneToOne
	@JoinColumn(name="ACCOUNT_ID")
	private TestAlignAccountsMain testAlignAccountMain;

	public Integer getRoleID() {
		return roleID;
	}

	public void setRoleID(Integer roleID) {
		this.roleID = roleID;
	}
	
	public TestAlignCompanyMain getTestAlignCompanyMain() {
		return testAlignCompanyMain;
	}

	public void setTestAlignCompanyMain(TestAlignCompanyMain testAlignCompanyMain) {
		this.testAlignCompanyMain = testAlignCompanyMain;
	}

	public TestAlignAccountsMain getTestAlignAccountMain() {
		return testAlignAccountMain;
	}

	public void setTestAlignAccountMain(TestAlignAccountsMain testAlignAccountMain) {
		this.testAlignAccountMain = testAlignAccountMain;
	}

	public String toString() {
		
		StringBuilder strbld = new StringBuilder();

		strbld.append("Role ID: " + this.roleID + "\n");
		strbld.append("Account ID: " + this.testAlignAccountMain.getAccountID() + "\n");
		strbld.append("Company ID: " + this.testAlignCompanyMain.getCompanyID());

		return strbld.toString();
	}
	
}
