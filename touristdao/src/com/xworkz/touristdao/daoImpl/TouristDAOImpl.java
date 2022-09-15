package com.xworkz.touristdao.daoImpl;

import com.xworkz.touristdao.dao.TouristDAO;

public class TouristDAOImpl implements TouristDAO {
	private String[] data=new String[5];
	private int index;

	@Override
	public boolean save(String name) {
		this.data[index]=name;
		this.index++;
		return true;
	}

	@Override
	public boolean checkName(String name) {
		for(String ref:this.data) {
			if(ref!=null && ref.equals(name)) {
				System.out.println("name is already present");
				return true;
			}
			else {
				System.out.println("name is not present");
				break;
			}
		}
		return false;
	}

}
