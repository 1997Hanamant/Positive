package com.xworkz.pub;

public class DownTownPub {
	private Pub pub;
	
	public DownTownPub(Pub pub) {
		this.pub=pub;
		
	}
 public boolean  checkRules() {
	System.out.println("checkRules are calling");
	int age = this.pub.age();
	boolean dressCode = this.pub.dressCode();
	boolean validProof = this.pub.validProof();
	if(age>18 && dressCode & validProof) {
		System.out.println("Rules are followed");
		
	}
	else {
		System.out.println("Rules are not followed");
	}
	return false;
	
}

}
