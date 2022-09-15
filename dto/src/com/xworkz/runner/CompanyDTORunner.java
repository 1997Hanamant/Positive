package com.xworkz.runner;

import java.time.LocalDate;

import com.xworkz.dto.CompanyDTO;

public class CompanyDTORunner {

	public static void main(String[] args) {
		CompanyDTO dto=new CompanyDTO();
		dto.setSlno(1);
		dto.setName("Wipro");
		dto.setCEOName("Abhi");
		dto.setCEOSalary(2000000.00);
		dto.setChairColors("Black");
		dto.setEmployeeSalary(100000.00D);
		dto.setFourthManagerName("Shivu");
		dto.setLocation("Banglore");
		dto.setMainManagerName("ShivuKumar");
		dto.setMangerSalary(3000000.00D);
		dto.setNoOfChairs(20000.00D);
		dto.setNoOfEmployee(10000);
		dto.setNoOfFloor(4.00D);
		dto.setNoOfGentsEmployee(5000.00D);
		dto.setNoOfInnerWindows(50.00d);
		dto.setNoOfLadiesEmployee(5000.00d);
		dto.setNoOfMainDoors(40.00D);
		dto.setNoOfMainWindows(20.00D);
		dto.setNoOfManger(4.00D);
		dto.setNoOfRoomInFiveFloor(20.00D);
		dto.setNoOfRoomInFourFloor(20.00D);
		dto.setNoOfRoomInFristFloor(15.00D);
		dto.setNoOfRoomInSecondFloor(25.00D);
		dto.setNoOfRoomInThirdFloor(28.00);
		dto.setNoOfSeconaryDoors(35.00D);
		dto.setNoOfSecondaryWindows(20.00D);
		dto.setNoOfSections(20.00D);
		dto.setNoOfTables(100.00D);
		dto.setNoOfVentilators(30.00D);
		dto.setNoOfWashRoomDoors(10.00D);
		dto.setSecondaryManagerName("Basavaraj");
		dto.setStartedDate(LocalDate.now());
		dto.setTablesColors("Yellow");
		dto.setThirdManagerName("Nandna");
		dto.setTotalArea("100Acres");
		dto.setTotalBugdetOnProject(100.00D);
		dto.setTotalHolidays(30.00d);
		dto.setTotalLunchHours(1.00D);
		dto.setTotalMonthWorkingHours(1200.00D);
		dto.setTotalNoOfProjectCompleted(10.00D);
		dto.setTotalNoOfProjectInCompleted(2.00D);
		dto.setTotalNoOfProjectRunningCompleted(5.00D);
		dto.setTotalNoOfProjectWithheld(3.00D);
		dto.setTotalWorkingHours(15.00D);
		dto.setTotalWeekWorkingHours(40.00D);
		dto.setTotalWorkingHours(8.00D);

		CompanyDTO dto1=new CompanyDTO();
		dto1.setSlno(1);
		dto1.setName("Wipro");
		dto1.setCEOName("Abhi");
		dto1.setCEOSalary(2000000.00);
		dto1.setChairColors("Black");
		dto1.setEmployeeSalary(100000.00D);
		dto1.setFourthManagerName("Shivu");
		dto1.setLocation("Banglore");
		dto1.setMainManagerName("ShivuKumar");
		dto1.setMangerSalary(3000000.00D);
		dto1.setNoOfChairs(20000.00D);
		dto1.setNoOfEmployee(10000);
		dto1.setNoOfFloor(4.00D);
		dto1.setNoOfGentsEmployee(5000.00D);
		dto1.setNoOfInnerWindows(50.00d);
		dto1.setNoOfLadiesEmployee(5000.00d);
		dto1.setNoOfMainDoors(40.00D);
		dto1.setNoOfMainWindows(20.00D);
		dto1.setNoOfManger(4.00D);
		dto1.setNoOfRoomInFiveFloor(20.00D);
		dto1.setNoOfRoomInFourFloor(20.00D);
		dto1.setNoOfRoomInFristFloor(15.00D);
		dto1.setNoOfRoomInSecondFloor(25.00D);
		dto1.setNoOfRoomInThirdFloor(28.00);
		dto1.setNoOfSeconaryDoors(35.00D);
		dto1.setNoOfSecondaryWindows(20.00D);
		dto1.setNoOfSections(20.00D);
		dto1.setNoOfTables(100.00D);
		dto1.setNoOfVentilators(30.00D);
		dto1.setNoOfWashRoomDoors(10.00D);
		dto1.setSecondaryManagerName("Basavaraj");
		dto1.setStartedDate(LocalDate.now());
		dto1.setTablesColors("Yellow");
		dto1.setThirdManagerName("Nandna");
		dto1.setTotalArea("100Acres");
		dto1.setTotalBugdetOnProject(100.00D);
		dto1.setTotalHolidays(30.00d);
		dto1.setTotalLunchHours(1.00D);
		dto1.setTotalMonthWorkingHours(1200.00D);
		dto1.setTotalNoOfProjectCompleted(10.00D);
		dto1.setTotalNoOfProjectInCompleted(2.00D);
		dto1.setTotalNoOfProjectRunningCompleted(5.00D);
		dto1.setTotalNoOfProjectWithheld(3.00D);
		dto1.setTotalWorkingHours(15.00D);
		dto1.setTotalWeekWorkingHours(40.00D);
		dto1.setTotalWorkingHours(8.00D);

		System.out.println(dto.hashCode());
		System.out.println(dto1.hashCode());
		System.out.println(System.identityHashCode(dto));
		System.out.println(System.identityHashCode(dto1));
		if(dto.hashCode()==dto1.hashCode()) {
			Boolean b=dto.equals(dto1);
			System.out.println(b);
		}
		else {
			System.out.println("Hashcode is not equals");
		}
		
		
	}

}
