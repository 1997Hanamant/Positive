package com.xworkz.pub;

public class CustomerPubRule implements Pub {

	@Override
	public boolean dressCode() {
		System.out.println("Dressode Calling");
		return true;
	}

	@Override
	public int age() {
		System.out.println("age is calling");
		return 21;
	}

	@Override
	public boolean validProof() {
		System.out.println("ValidProof is calling");
		return true;
	}

}
