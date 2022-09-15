package com.xworkz.touristdao.ServiceImpl;

import com.xworkz.touristdao.Service.TouristService;
import com.xworkz.touristdao.dao.TouristDAO;
import com.xworkz.touristdao.exception.InvalidTouristException;

public class TouristServiceImpl implements  TouristService {
	private TouristDAO dao;
	
	
	public TouristServiceImpl(TouristDAO dao) {
		this.dao=dao;
	}

	@Override
	public boolean validateAndSave(String name) throws InvalidTouristException {
		if(name!=null && name.length()>3 && name.length()<50) {
			if(!this.dao.checkName(name)) {	
			System.out.println("Name is valid"+" "+name);
			}
			else {
				System.err.println("Name is not valid");
				throw new InvalidTouristException("Invalid");
			}
		}
			else {
				System.err.println("Name is incorrcet");
				throw new InvalidTouristException("Incorrect");
				
			}
	
		return dao.save(name);
	}

	
	}
