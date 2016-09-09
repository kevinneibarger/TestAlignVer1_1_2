/**
 * 
 */
package org.test.align.util;

/**
 * @author kevinscomp
 *
 */
public class TestAlignConstants {
    
	// PRJ_COMPANY_MAIN Table Column Constants
    public static final String PRJ_COMP_MAIN_COMPANY_ID = "COMPANY_ID";
    public static final String PRJ_COMP_MAIN_COMPANY_NAME = "COMPANY_NAME";
    public static final String PRJ_COMP_MAIN_PRIMARY_CONTACT_NAME = "PRIM_CNTCT_NM";
    public static final String PRJ_COMP_MAIN_PRIMARY_CONTACT_EMAIL = "PRIM_CNTCT_EMAIL";
    public static final String PRJ_COMP_MAIN_PRIMARY_CONTACT_PHONE = "PRIM_CNTCT_PHONE";
    public static final String PRJ_COMP_MAIN_TOTAL_ACTIVE_USER = "TOTAL_ACTIVE_USER";
    public static final String PRJ_COMP_MAIN_TOTAL_USER_PURCHASE = "TOTAL_USER_PURCHASE";
    public static final String PRJ_COMP_MAIN_COMPANY_STATUS = "COMPANY_STATUS";

    // PRJ_PROJECT_MAIN Table Column Constants
    public static final String PRJ_PROJ_MAIN_PROJECT_ID = "PROJECT_ID";
    public static final String PRJ_PROJ_MAIN_PROJECT_NAME = "PROJECT_NM";
    public static final String PRJ_PROJ_MAIN_PROJECT_DESC = "PROJECT_DESCR";
    public static final String PRJ_PROJ_MAIN_RELEASE_NAME = "RELEASE_NM";
    public static final String PRJ_PROJ_MAIN_RELEASE_DESC = "RELEASE_DESCR";
    public static final String PRJ_PROJ_MAIN_TARGET_START_DATE = "TARGET_START_DATE";
    public static final String PRJ_PROJ_MAIN_TARGET_CLOSE_DATE = "TARGET_CLOSE_DT";
    public static final String PRJ_PROJ_MAIN_COMPANY_ID = "COMPANY_ID"; // Foreign Key to PRJ_COMPANY_MAIN table
    public static final String PRJ_PROJ_MAIN_LAST_ACTIVITY_DATE = "LAST_ACTIVITY_DT";
    
    // PRJ_ACCOUNTS_MAIN Table Column Constants
    public static final String PRJ_ACCTS_MAIN_ACCOUNT_ID = "ACCOUNT_ID";
    public static final String PRJ_ACCTS_MAIN_COMPANY_ID = "COMPANY_ID"; // Foreign Key to PRJ_COMPANY_MAIN table
    public static final String PRJ_ACCTS_MAIN_FIRST_NAME = "FIRST_NM";
    public static final String PRJ_ACCTS_MAIN_LAST_NAME = "LAST_NM";
    public static final String PRJ_ACCTS_MAIN_EMAIL_ADDR = "EMAIL_ADDR";
    public static final String PRJ_ACCTS_MAIN_PASSWORD1 = "PASSWORD1";
    public static final String PRJ_ACCTS_MAIN_ACCT_STATUS = "ACCT_STATUS";
    public static final String PRJ_ACCTS_MAIN_CREATE_DATE = "CREATE_DATE";
    public static final String PRJ_ACCTS_MAIN_LAST_LOGIN_DATE = "LAST_LOGIN_DATE";
    
    // PRJ_ROLES_ADMIN Table Column Constants
    public static final String PRJ_ROLES_ADMIN_ROLE_ID = "ROLE_ID";
    public static final String PRJ_ROLES_ADMIN_ACCOUNT_ID = "ACCOUNT_ID";
    public static final String PRJ_ROLES_ADMIN_COMPANY_ID = "COMPANY_ID"; // Foreign Key to PRJ_COMPANY_MAIN table
    
    // PRJ_ROLES_ACCT Table Column Constants
    public static final String PRJ_ROLES_ACCT_ROLE_ID = "ROLE_ID";
    public static final String PRJ_ROLES_ACCT_PROJECT_ID = "PROJECT_ID";
    public static final String PRJ_ROLES_ACCT_ACCOUNT_ID = "ACCOUNT_ID"; // Foreign Key to PRJ_ROLES_ADMIN
    public static final String PRJ_ROLES_ACCT_ROLE_TYPE = "ROLE_TYPE";
}
