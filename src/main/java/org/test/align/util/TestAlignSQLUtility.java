package org.test.align.util;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;

public class TestAlignSQLUtility implements Serializable {

	private static final long serialVersionUID = 1L;
	private ResourceBundle testdb_queries_props;
	private String key;

	private TestAlignSQLUtility(String propFileKey, String key) {
		this.testdb_queries_props = ResourceBundle.getBundle(propFileKey);
		this.key = key;
	}

	public static TestAlignSQLUtility getInstance(String propFileKey, String key) {
		return new TestAlignSQLUtility(propFileKey, key);
	}

	public String buildQueryWithParams(List<String> params) {

		StringBuilder test_align_query = new StringBuilder();
		String test_query = null;

		if (key != null) {
			// Get the base UI
			test_query = (String) this.testdb_queries_props.getString(this.key);

			// Build Params into the Base URI
			if (params != null && params.size() > 0) {
				test_align_query.append(buildSQLQueryStringWithParams(params,
						test_query));
			} else {
				test_align_query.append(test_query);
			}
		}

		return test_align_query.toString();
	}

	private String buildSQLQueryStringWithParams(List<String> params,
			String baseQuery) {

		int count = 1;

		for (String parm : params) {
			String temp = baseQuery.replace("[PARAM" + count + "]", parm);
			baseQuery = temp;
			temp = null;
			count++;
		}

		return baseQuery;
	}
}
