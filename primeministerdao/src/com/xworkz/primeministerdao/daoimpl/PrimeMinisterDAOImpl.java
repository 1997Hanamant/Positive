package com.xworkz.primeministerdao.daoimpl;

import com.xworkz.primeministerdao.dao.PrimeMinisterDAO;
import com.xworkz.primeministerdao.exception.InvalidPrimeMinisterRunTimeException;

public class PrimeMinisterDAOImpl implements PrimeMinisterDAO {
	private String[] data = new String[5];

	private int index;

	@Override
	public boolean save(String name) {
		if(this.index<this.data.length) {
			
		this.data[index] = name;
		System.out.println("name is saved"+" "+name+" " +this.index);
		this.index++;
		return true;
	}
		else {
			System.out.println("Name is not saved");
			throw new InvalidPrimeMinisterRunTimeException("Name is not saved pls check");
		}
	}
	@Override
	public boolean checkName(String name) {
		for(String ref:this.data) {
			if(ref!=null && ref.equals(name)) {
				System.out.println("Name is valid ");
				return true;
			}
			
		}
	
		return false;
	}

}
