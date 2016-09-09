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
import javax.persistence.Table;

/**
 * @author kevinscomp
 * 
 */
@Entity
@Table(name = "PRJ_ROLES_ADMIN")
public class TestAlignRolesTypes implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ROLE_TYPE")
	@GeneratedValue
	private Integer roleType;

	@JoinColumn(name = "COMPANY_ID")
	private TestAlignCompanyMain testAlignCompanyMain;

	@Column(name = "ROLE_NM")
	private String roleName;

	@Column(name = "ROLE_DESC")
	private String roleDesc;

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String toString() {

		StringBuilder bld = new StringBuilder();

		bld.append("Role Type: " + this.roleType + "\n");
		bld.append("Company ID: " + this.testAlignCompanyMain.getCompanyID()
				+ "\n");
		bld.append("Role Name: " + this.roleName + "\n");
		bld.append("Role Description: " + this.roleDesc + "\n");

		return bld.toString();
	}

	public TestAlignCompanyMain getTestAlignCompanyMain() {
		return testAlignCompanyMain;
	}

	public void setTestAlignCompanyMain(
			TestAlignCompanyMain testAlignCompanyMain) {
		this.testAlignCompanyMain = testAlignCompanyMain;
	}
}
