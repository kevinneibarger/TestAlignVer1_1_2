package org.test.align.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kevin Neibarger
 * 
 */

@Entity
@Table(name = "PRJ_COMPANY_MAIN")
public class TestAlignCompanyMain implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COMPANY_ID")
	@GeneratedValue
	private Integer companyID;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "PRIM_CNTCT_EMAIL")
	private String primaryContactEmail;

	@Column(name = "PRIM_CNTCT_NM")
	private String primaryContactName;

	@Column(name = "PRIM_CNTCT_PHONE")
	private String primaryContactPhone;

	@Column(name = "TOTAL_USER_PURCHASE")
	private Double totalUserPurchase;

	@Column(name = "TOTAL_ACTIVE_USER")
	private int totalActiveUser;

	@Column(name = "COMPANY_STATUS")
	private String companyStatus;

	public Integer getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPrimaryContactEmail() {
		return primaryContactEmail;
	}

	public void setPrimaryContactEmail(String primaryContactEmail) {
		this.primaryContactEmail = primaryContactEmail;
	}

	public String getPrimaryContactName() {
		return primaryContactName;
	}

	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}

	public String getPrimaryContactPhone() {
		return primaryContactPhone;
	}

	public void setPrimaryContactPhone(String primaryContactPhone) {
		this.primaryContactPhone = primaryContactPhone;
	}

	public Double getTotalUserPurchase() {
		return totalUserPurchase;
	}

	public void setTotalUserPurchase(Double totalUserPurchase) {
		this.totalUserPurchase = totalUserPurchase;
	}

	public int getTotalActiveUser() {
		return totalActiveUser;
	}

	public void setTotalActiveUser(int totalActiveUser) {
		this.totalActiveUser = totalActiveUser;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String toString() {

		StringBuilder strbld = new StringBuilder();

		strbld.append("Company ID: " + this.companyID + "\n");
		strbld.append("Company Name: " + this.companyName);
		strbld.append("Primary Contact: " + this.primaryContactName + "\n");
		strbld.append("Primary Contact Email: " + this.primaryContactEmail
				+ "\n");
		strbld.append("Primary Contact Phone: " + this.primaryContactPhone
				+ "\n");
		strbld.append("Total User Purchase: " + this.totalUserPurchase + "\n");
		strbld.append("Total Active User: " + this.totalActiveUser + "\n");
		strbld.append("Company Status: " + this.companyName + "\n");

		return strbld.toString();
	}
}
