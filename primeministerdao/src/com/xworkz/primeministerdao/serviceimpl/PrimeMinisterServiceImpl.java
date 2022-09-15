package com.xworkz.primeministerdao.serviceimpl;

import com.xworkz.primeministerdao.dao.PrimeMinisterDAO;
import com.xworkz.primeministerdao.exception.InvalidPrimeMinisterException;
import com.xworkz.primeministerdao.service.PrimeMinisterService;

public class PrimeMinisterServiceImpl implements PrimeMinisterService {
	private PrimeMinisterDAO dao;
	
	public PrimeMinisterServiceImpl(PrimeMinisterDAO dao) {
		this.dao=dao;
	}

	@Override
	public boolean validateAndSave(String name) throws InvalidPrimeMinisterException {
		if(name!=null && name.length()>3 && name.length()<50) {
			if(!dao.checkName(name)) {
				System.out.println("Name is valid and save in dao");
				return this.dao.save(name);
				
			}
			else {
				System.err.println("Name is not valid and save in dao"); 
				throw new InvalidPrimeMinisterException("Invalid");
			}
		}
			else {
				System.out.println("Name is not incorrcet");
				throw new InvalidPrimeMinisterException("Incorrect");
			}
	}

}
