// Copyright © 2010 - May 2014 Rise Vision Incorporated.
// Use of this software is governed by the GPLv3 license
// (reproduced in the LICENSE file).

package com.risevision.viewer.client.info;

import java.util.Date;

public class Global {
	public static final String VIEWER_VERSION = "1-06-033";
	
//	public static final String GADGET_SERVER_URL = "http://rvagadgets.appspot.com/";
	public static final String GADGET_SERVER_URL = "http://www-open-opensocial.googleusercontent.com/gadgets/ifr";
//	public static final String GADGET_SERVER_URL = "http://ec2-50-19-217-14.compute-1.amazonaws.com/shindig-server-2.5.0-beta1/gadgets/ifr";
	
	public static final String SERVER_URL = "https://rvacore-test.appspot.com";
//	public static final String SERVER_URL = "https://rvacore-test2.appspot.com";
//	public static final String SERVER_URL = "https://rvaserver2.appspot.com";
	
//	public static final String DATA_SERVER_URL = SERVER_URL + "/v1/viewer/{0}/{1}";
	public static final String DATA_SERVER_URL = SERVER_URL + "/v2/viewer/{0}/{1}";
	
//	public static final String CHANNEL_SERVER_URL = SERVER_URL + "/v1/viewer/display/";
	public static final String CHANNEL_SERVER_URL = SERVER_URL + "/v2/viewer/display/";
	
	public static final String RVA_APP_URL = "http://rdn-test.appspot.com";
//	public static final String RVA_APP_URL = "http://rvauser.appspot.com";
//	public static final String RVA_APP_URL = "http://rva.risevision.com";
	
	// test
	public static final String PREVIEW_TRACKER_ID = "UA-82239-27";
	// production
//	public static final String PREVIEW_TRACKER_ID = "UA-82239-28";

	// test
	public static final String DISPLAY_TRACKER_ID = "UA-82239-31";
	// production
//	public static final String DISPLAY_TRACKER_ID = "UA-82239-32";
	
	public static String VIEWER_UNIQUE_ID = Integer.toString((int) (Math.random() * 10000)) + "_" + new Date().getTime();
	
	public static String VIEWER_URL_IDENTIFIER = "uid=" + VIEWER_UNIQUE_ID + "&vv=" + VIEWER_VERSION;

}
