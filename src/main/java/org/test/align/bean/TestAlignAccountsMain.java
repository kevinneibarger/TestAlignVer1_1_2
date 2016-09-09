/**
 * 
 */
package org.test.align.bean;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kevinscomp
 * 
 */

@Entity
@Table(name = "PRJ_ACCOUNTS_MAIN")
public class TestAlignAccountsMain implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ACCOUNT_ID")
	@GeneratedValue
	private Integer accountID;

	// Company ID is a foreign key, not sure how to do this yet....
	@Column(name = "COMPANY_ID")
	private Integer companyId;

	@Column(name = "FIRST_NM")
	private String firstName;

	@Column(name = "LAST_NM")
	private String lastName;

	@Column(name = "EMAIL_ADDR")
	private String emailAddress;

	@Column(name = "PASSWORD1")
	private String password1;

	@Column(name = "ACCT_STATUS")
	private String accountStatus;

	@Column(name = "CREATE_DATE")
	private Date createDate;

	@Column(name = "LAST_LOGIN_DATE")
	private Timestamp lastLoginDate;

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Timestamp getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String toString() {

		StringBuilder strbld = new StringBuilder();

		strbld.append("Account ID: " + this.accountID + "\n");
		strbld.append("Company ID: " + this.companyId);
		strbld.append("First Name: " + this.firstName + "\n");
		strbld.append("Last Name: " + this.lastName + "\n");
		strbld.append("Email Address: " + this.emailAddress + "\n");
		strbld.append("Password 1: " + this.password1 + "\n");
		strbld.append("Account Status: " + this.accountStatus + "\n");
		strbld.append("Create Date: " + this.createDate + "\n");
		strbld.append("Last Login Date: " + this.lastLoginDate + "\n");

		return strbld.toString();
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
}
