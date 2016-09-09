package org.test.align.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.test.align.bean.TestAlignAccountsMain;
import org.test.align.bean.TestAlignCompanyMain;
import org.test.align.bean.TestAlignProjectMain;
import org.test.align.bean.TestAlignRolesAccount;
import org.test.align.bean.TestAlignRolesAdmin;
import org.test.align.service.TestAlignAccountMainService;
import org.test.align.service.TestAlignCompanyMainService;
import org.test.align.service.TestAlignProjectMainService;
import org.test.align.service.TestAlignRolesAccountService;
import org.test.align.service.TestAlignRolesAdminService;

/**
 * Handles and retrieves person request
 */
@Controller
@RequestMapping("/testaligncontroller")
public class TestAlignController {

	protected static Logger logger = Logger.getLogger("controller");

	@Autowired
	private TestAlignCompanyMainService projectCompanyMainService;

	@Autowired
	private TestAlignAccountMainService projectCompanyAcctService;

	@Autowired
	private TestAlignProjectMainService projectProjectMainService;
	@Autowired
	private TestAlignRolesAdminService projectRolesAdminService;
	@Autowired
	private TestAlignRolesAccountService projectRolesAcctService;

	/**
	 * Handles and retrieves all Companies and show it in a JSP page
	 * 
	 * @return the name of the JSP page
	 */
	@RequestMapping(value = "/list_all_companies", method = RequestMethod.GET)
	public String getAllCompanies(Model model) {

		logger.debug("Received request to show all companies(30)");

		List<TestAlignCompanyMain> companies = projectCompanyMainService
				.getAllCompanies();

		if (companies == null || companies != null && companies.size() == 0) {
			model.addAttribute(
					"nodata",
					"A Database Connection could not be established or no data for Test Align Companies exist!");
		} else {
			model.addAttribute("companies", companies);
		}

		logger.debug("Attached Model to view: Number of rows returned: "
				+ companies.size());

		// This will resolve to /WEB-INF/jsp/companiespage.jsp
		return "companiespage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginUser(Model model, HttpServletRequest request) {

		/**
		 * Login the company/user with Company Name, Email and Password from
		 * HttpServletRequest
		 **/
		return "login";
	}

	@RequestMapping(value = "/projectLogin", method = RequestMethod.GET)
	public String chooseProject(Model model, HttpServletRequest request) {
		return "loginerror";
	}

	/**
	 * Handles and retrieves all Accounts and show it in a JSP page
	 * 
	 * @return the name of the JSP page
	 */
	@RequestMapping(value = "/list_all_accounts", method = RequestMethod.GET)
	public String getAllAccounts(Model model) {

		logger.debug("Received request to show all accounts");

		// Test Data until DB is setup.
		List<TestAlignAccountsMain> accounts = projectCompanyAcctService
				.getAllAccounts();

		if (accounts == null || accounts != null && accounts.size() == 0) {
			model.addAttribute(
					"nodata",
					"A Database Connection could not be established or no data for Test Align Accounts exist!");
		} else {
			model.addAttribute("accounts", accounts);
		}
		logger.debug("Attached Model to view");

		// This will resolve to /WEB-INF/jsp/companiespage.jsp
		return "accountspage";
	}

	/**
	 * Handles and retrieves all Companies and show it in a JSP page
	 * 
	 * @return the name of the JSP page
	 */
	@RequestMapping(value = "/list_all_projects", method = RequestMethod.GET)
	public String getAllProjects(Model model) {

		logger.debug("Received request to show all projects");

		// Test Data until DB is setup.
		List<TestAlignProjectMain> projects = projectProjectMainService
				.getAllProjects();

		if (projects == null || projects != null && projects.size() == 0) {
			model.addAttribute(
					"nodata",
					"A Database Connection could not be established or no data for Test Align Projects exist!");
		} else {
			model.addAttribute("projects", projects);
		}
		logger.debug("Attached Model to view");

		// This will resolve to /WEB-INF/jsp/companiespage.jsp
		return "projectspage";
	}

	/**
	 * Handles and retrieves all Companies and show it in a JSP page
	 * 
	 * @return the name of the JSP page
	 */
	@RequestMapping(value = "/list_all_roles", method = RequestMethod.GET)
	public String getAllRoles(Model model) {

		logger.debug("Received request to show all roles");

		// Test Data until DB is setup.
		List<TestAlignRolesAdmin> adminRoles = projectRolesAdminService
				.getAllAdminRoles();

		if (adminRoles == null || adminRoles != null && adminRoles.size() == 0) {
			model.addAttribute(
					"nodata",
					"A Database Connection could not be established or no data for Test Align Admin Roles exist!");
		} else {
			model.addAttribute("adminRoles", adminRoles);
		}

		logger.debug("Attached Model to view");

		// This will resolve to /WEB-INF/jsp/companiespage.jsp
		return "rolesadminpage";
	}

	/**
	 * Handles and retrieves all Companies and show it in a JSP page
	 * 
	 * @return the name of the JSP page
	 */
	@RequestMapping(value = "/list_all_roleaccts", method = RequestMethod.GET)
	public String getAllRoleAccts(Model model) {

		logger.debug("Received request to show all role accounts");

		// Test Data until DB is setup.
		List<TestAlignRolesAccount> roleAccts = projectRolesAcctService
				.getAllRoleAccts();

		if (roleAccts == null || roleAccts != null && roleAccts.size() == 0) {
			model.addAttribute(
					"nodata",
					"A Database Connection could not be established or no data for Test Align Role Accounts exist!");
		} else {
			model.addAttribute("roleAccts", roleAccts);
		}

		logger.debug("Attached Model to view: Role Records: "
				+ roleAccts.size());

		// This will resolve to /WEB-INF/jsp/companiespage.jsp
		return "rolesacctpage";
	}
}
