package com.xworkz.primeministerdao.runner;

import com.xworkz.primeministerdao.dao.PrimeMinisterDAO;
import com.xworkz.primeministerdao.daoimpl.PrimeMinisterDAOImpl;
import com.xworkz.primeministerdao.exception.InvalidPrimeMinisterException;
import com.xworkz.primeministerdao.exception.InvalidPrimeMinisterRunTimeException;
import com.xworkz.primeministerdao.service.PrimeMinisterService;
import com.xworkz.primeministerdao.serviceimpl.PrimeMinisterServiceImpl;

public class PrimeMinisterRunner {

	public static void main(String[] args) {
		PrimeMinisterDAO ministerDAO=new PrimeMinisterDAOImpl();
		
		PrimeMinisterService ministerService=new PrimeMinisterServiceImpl(ministerDAO);
		
		try {
			ministerService.validateAndSave("Atal Bihari Vajpayee");
			ministerService.validateAndSave("H. D. Deve Gowda");
			ministerService.validateAndSave("Inder Kumar Gujral");
			ministerService.validateAndSave("Chandra Shekhar");
			ministerService.validateAndSave("Rajiv Gandhi");
			ministerService.validateAndSave("Rajiv Gandhi1");
		
		} catch (InvalidPrimeMinisterException e) {
			e.getMessage();
		}
		
		catch (InvalidPrimeMinisterRunTimeException e) {
			e.getMessage();
		}
		

	}

}
