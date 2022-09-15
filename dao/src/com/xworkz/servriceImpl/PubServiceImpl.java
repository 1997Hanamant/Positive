package com.xworkz.servriceImpl;

import com.xworkz.dao.PubDAO;
import com.xworkz.service.PubService;

public class PubServiceImpl implements PubService {
	private PubDAO dao;
	
	public PubServiceImpl(PubDAO dao) {
		this.dao=dao;
	}

	@Override
	public boolean validateAndSave(String name) {
		if(name!=null && name.length()>3 && name.length()<50) {
			if(this.dao.checkName(name))
			System.out.println("Name is valid and saved");
			return dao.save(name);
		}
		else {
			System.out.println("Name is not valid and not saved");
		}
		return false;
	}

}
