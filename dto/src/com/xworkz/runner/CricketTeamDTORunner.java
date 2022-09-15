package com.xworkz.runner;

import com.xworkz.dto.CricketTeamDTO;

public class CricketTeamDTORunner {

	public static void main(String[] args) {
		CricketTeamDTO dto=new CricketTeamDTO();
		dto.setCapatinName("MSD");
		dto.setAllRouderName1("Yuvraj");
		
		CricketTeamDTO dto1=new CricketTeamDTO();
		dto1.setCapatinName("KapilDev");
		dto1.setAllRouderName1("KapilDev");
		
		System.out.println(dto.hashCode());
		System.out.println(dto1.hashCode());
		
		System.out.println(System.identityHashCode(dto));
		System.out.println(System.identityHashCode(dto1));
		
		if(dto.hashCode()==dto1.hashCode()) {
			Boolean b=dto.equals(dto1);
			System.out.println(b);
		}
		else {
			System.out.println("HashCode is not equal");
		}
	}

}
