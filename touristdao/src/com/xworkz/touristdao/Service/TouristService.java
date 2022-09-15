package com.xworkz.touristdao.Service;

import com.xworkz.touristdao.exception.InvalidTouristException;

public interface TouristService  {
	boolean validateAndSave(String name) throws InvalidTouristException;

}
