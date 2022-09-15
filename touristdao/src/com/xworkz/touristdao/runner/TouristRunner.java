package com.xworkz.touristdao.runner;

import com.xworkz.touristdao.Service.TouristService;
import com.xworkz.touristdao.ServiceImpl.TouristServiceImpl;
import com.xworkz.touristdao.dao.TouristDAO;
import com.xworkz.touristdao.daoImpl.TouristDAOImpl;
import com.xworkz.touristdao.exception.InvalidTouristException;

public class TouristRunner {

	public static void main(String[] args) {
		TouristDAO  touristDAO=new TouristDAOImpl();
		
		TouristService touristService=new TouristServiceImpl(touristDAO);
		
		try {
			touristService.validateAndSave("Hubli");
			touristService.validateAndSave("Bagalakot");
			
		} catch (InvalidTouristException e) {
			System.out.println(e.getMessage());
		}
	

	}

}
