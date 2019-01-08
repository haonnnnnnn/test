package cn.com.webxml;

import java.util.List;

public class App {
	public static void main(String[] args) {
		MobileCodeWS ss = new MobileCodeWS();
		MobileCodeWSSoap soap = ss.getMobileCodeWSSoap();
		//String ret = soap.getMobileCodeInfo("15310320242", null);
		//System.out.println(ret);
		ArrayOfString aos = soap.getDatabaseInfo();
		List<String> list = aos.getString();
		for (String string : list) {
			System.out.println(string);
		}
	}
}
