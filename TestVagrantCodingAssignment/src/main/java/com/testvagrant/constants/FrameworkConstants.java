package com.testvagrant.constants;

public class FrameworkConstants {

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String JSONRESPONSE = RESOURCEPATH + "/jsonresponse/jsonresponse.json";

	private static final String EXTENTREPORTPATH = System.getProperty("user.dir")
			+ "/extent-test-output/TestVagrantAssignment.html";
	



	public static String getExtentreportpath() {
		return EXTENTREPORTPATH;
	}




	public static String getJsonresponse() {
		return JSONRESPONSE;
	}

}
