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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Kevin Neibarger
 *
 */

@Entity
@Table(name = "PRJ_PROJECT_MAIN")
public class TestAlignProjectMain implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="PROJECT_ID")
    @GeneratedValue
    private Integer projectID;
	
    @Column(name="PROJECT_NM")
    private String projectName;
    
    @Column(name="PROJECT_DESCR")
    private String projectDesc;
    
    @Column(name="RELEASE_NM")
    private String releaseName;
    
    @Column(name="RELEASE_DESCR")
    private String releaseDesc;
    
    @Column(name="TARGET_START_DATE")
    private Date targetStartDate;
    
    @Column(name="TARGET_CLOSE_DT")
    private Date targetCloseDate;
    
	// Company ID is a foreign key, not sure how to do this yet....
	@OneToOne
	@JoinColumn(name = "COMPANY_ID")
	private TestAlignCompanyMain testAlignCompanyMain;
    
    @Column(name="LAST_ACTIVITY_DT")
    private Timestamp lastActivityDate;

	public Integer getProjectID() {
		return projectID;
	}

	public void setProjectID(Integer projectID) {
		this.projectID = projectID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDesc() {
		return projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	public String getReleaseName() {
		return releaseName;
	}

	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
	}

	public String getReleaseDesc() {
		return releaseDesc;
	}

	public void setReleaseDesc(String releaseDesc) {
		this.releaseDesc = releaseDesc;
	}

	public Date getTargetStartDate() {
		return targetStartDate;
	}

	public void setTargetStartDate(Date targetStartDate) {
		this.targetStartDate = targetStartDate;
	}

	public Date getTargetCloseDate() {
		return targetCloseDate;
	}

	public void setTargetCloseDate(Date targetCloseDate) {
		this.targetCloseDate = targetCloseDate;
	}

	public TestAlignCompanyMain getTestAlignCompanyMain() {
		return testAlignCompanyMain;
	}

	public void setTestAlignCompanyMain(TestAlignCompanyMain testAlignCompanyMain) {
		this.testAlignCompanyMain = testAlignCompanyMain;
	}

	public Timestamp getLastActivityDate() {
		return lastActivityDate;
	}

	public void setLastActivityDate(Timestamp lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public String toString() {
		
		StringBuilder strbld = new StringBuilder();
		
		
		strbld.append("Project ID: "+this.projectID);
		strbld.append("Project Name: "+this.projectName);
		strbld.append("Project Description: "+this.projectDesc);
		strbld.append("Release Name: "+this.releaseName+"\n");
		strbld.append("Release Description: "+this.releaseDesc+"\n");
		strbld.append("Target Start Date: "+this.targetStartDate.toString()+"\n");
		strbld.append("Target Close Date: "+this.targetCloseDate.toString()+"\n");
		strbld.append("Company ID: "+this.testAlignCompanyMain.getCompanyID()+"\n");
		strbld.append("Last Activity Date: "+this.lastActivityDate.toString()+"\n");
		
		return strbld.toString();
	}
}
