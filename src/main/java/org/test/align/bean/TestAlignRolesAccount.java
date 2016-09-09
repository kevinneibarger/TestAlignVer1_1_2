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
@Table(name = "PRJ_ROLES_ACCOUNT")
public class TestAlignRolesAccount implements Serializable {

	private static final long serialVersionUID = 1L;

	// Role id the ID in PRJ_ROLES_ACCOUNT table, this needs to change due to
	// ROLE_ID in PRJ_ROLES_ADMIN table
	@Id
	@Column(name = "ROLE_ID")
	@GeneratedValue
	private Integer roleAcctID;

	// This is the ROLE_ID in the PRJ_ROLES_ADMIN table
	@OneToOne
	@JoinColumn(name = "PROJECT_ID")
	private TestAlignProjectMain testAlignProjectMain;

	// Company ID is a foreign key, not sure how to do this yet....
	// Foreign Keys and indexes have not been defined yet
	@OneToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private TestAlignAccountsMain testAlignAccountsMain;

	@Column(name = "ROLE_TYPE")
	private String roleType;

	public Integer getRoleAcctID() {
		return roleAcctID;
	}

	public void setRoleAcctID(Integer roleAcctID) {
		this.roleAcctID = roleAcctID;
	}

	public String toString() {

		StringBuilder strbld = new StringBuilder();

		strbld.append("Role ID (PRJ_ROLES_ACCOUNT): " + this.roleAcctID + "\n");
		strbld.append("Project ID: " + this.testAlignProjectMain.getProjectID() + "\n");
		strbld.append("Account ID: " + this.testAlignAccountsMain.getAccountID()+ "\n");
		strbld.append("Role Type: " + this.roleType+ "\n");

		return strbld.toString();
	}

	public TestAlignProjectMain getTestAlignProjectMain() {
		return testAlignProjectMain;
	}

	public void setTestAlignProjectMain(TestAlignProjectMain testAlignProjectMain) {
		this.testAlignProjectMain = testAlignProjectMain;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public TestAlignAccountsMain getTestAlignAccountsMain() {
		return testAlignAccountsMain;
	}

	public void setTestAlignAccountsMain(TestAlignAccountsMain testAlignAccountsMain) {
		this.testAlignAccountsMain = testAlignAccountsMain;
	}
}
