package com.xworkz.daoImpl;

import com.xworkz.dao.PubDAO;

public class PubDAOIpml implements PubDAO{
	
	private String[] data=new String[10];
	private int index;

	@Override
	public boolean save(String name) {
		this.data[index]=name;
		System.out.println("name saved"+name+"index is "+this.index);
		this.index++;
		return false;
	}

	@Override
	public boolean checkName(String name) {
		for(String ref:this.data) {
			if(ref!=null && ref.equals(name)) {
				System.out.println("Name is present");
				return true;
			}
			else {
				System.out.println("Name is not present");
			}
		}
		return false;
	}

}
