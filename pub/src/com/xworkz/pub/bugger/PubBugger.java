package com.xworkz.pub.bugger;

import com.xworkz.pub.CustomerPubRule;
import com.xworkz.pub.DownTownPub;
import com.xworkz.pub.Pub;

public class PubBugger {

	public static void main(String[] args) {
		Pub pub=new CustomerPubRule();
		
		DownTownPub downTownPub=new DownTownPub(pub);
		downTownPub.checkRules();

	}

}
