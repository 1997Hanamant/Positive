package com.xworkz.primeministerdao.service;

import com.xworkz.primeministerdao.exception.InvalidPrimeMinisterException;
import com.xworkz.primeministerdao.exception.InvalidPrimeMinisterRunTimeException;

public interface PrimeMinisterService {
	boolean validateAndSave(String name) throws InvalidPrimeMinisterException;

}
