package com.xworkz.runner;

import com.xworkz.dao.PubDAO;
import com.xworkz.daoImpl.PubDAOIpml;
import com.xworkz.service.PubService;
import com.xworkz.servriceImpl.PubServiceImpl;

public class PubRunner {

	public static void main(String[] args) {
		PubDAO dao=new PubDAOIpml();
		dao.save("Saroja");
		dao.save("Prajwal");
		
		
		PubService pubService=new PubServiceImpl(dao);
		pubService.validateAndSave("Saroja");

	}

}
