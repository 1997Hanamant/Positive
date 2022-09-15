package com.xworkz.touristdao.dao;

public interface TouristDAO {
	boolean save(String name);
	boolean checkName(String name);

}
