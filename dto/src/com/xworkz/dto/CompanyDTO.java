package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CompanyDTO implements Serializable {
	private Integer slno;
	private String name;
	private String location;
	private Integer noOfEmployee;
	private String totalArea;
	private Double noOfFloor;
	private Double noOfRoomInFristFloor;
	private Double noOfRoomInSecondFloor;
	private Double noOfRoomInThirdFloor;
	private Double noOfRoomInFourFloor;
	private Double noOfRoomInFiveFloor;
	private Double noOfManger;
	private String CEOName;
	private String mainManagerName;
	private String secondaryManagerName;
	private String thirdManagerName;
	private String fourthManagerName;
	private Double noOfMainDoors;
	private Double noOfSeconaryDoors;
	private Double noOfWashRoomDoors;
	private Double noOfMainWindows;
	private Double noOfInnerWindows;
	private Double noOfSecondaryWindows;
	private Double noOfVentilators;
	private Double noOfSections;
	private Double noOfTables;
	private Double noOfChairs;
	private String tablesColors;
	private String chairColors;
	private Double noOfGentsEmployee;
	private Double noOfLadiesEmployee;
	private Double employeeSalary;
	private Double CEOSalary;
	private Double mangerSalary;
	private Double totalNoOfProjectCompleted;
	private Double totalNoOfProjectInCompleted;
	private Double totalNoOfProjectRunningCompleted;
	private Double totalNoOfProjectWithheld;
	private Double totalBugdetOnProject;
	private Double totalHolidays;
	private LocalDate startedDate;
	private Double totalWorkingHours;
	private Double totalTeaBreakHours;
	private Double totalLunchHours;
	private Double totalWeekWorkingHours;
	private Double totalMonthWorkingHours;

	public CompanyDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {
		return 12;
		// return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CompanyDTO) {
				CompanyDTO company = (CompanyDTO) obj;
				if (company.getName().equals(this.name) && company.getCEOName().equals(CEOName)) {
					System.out.println("Object are equals");
					return true;
				} else {
					System.out.println("Object are not equals");
				}
			}

		} else {
			System.out.println("Object is null");
		}
		return false;

	}

	public Integer getSlno() {
		return slno;
	}

	public void setSlno(Integer slno) {
		this.slno = slno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(Integer noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public String getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(String totalArea) {
		this.totalArea = totalArea;
	}

	public Double getNoOfFloor() {
		return noOfFloor;
	}

	public void setNoOfFloor(Double noOfFloor) {
		this.noOfFloor = noOfFloor;
	}

	public Double getNoOfRoomInFristFloor() {
		return noOfRoomInFristFloor;
	}

	public void setNoOfRoomInFristFloor(Double noOfRoomInFristFloor) {
		this.noOfRoomInFristFloor = noOfRoomInFristFloor;
	}

	public Double getNoOfRoomInSecondFloor() {
		return noOfRoomInSecondFloor;
	}

	public void setNoOfRoomInSecondFloor(Double noOfRoomInSecondFloor) {
		this.noOfRoomInSecondFloor = noOfRoomInSecondFloor;
	}

	public Double getNoOfRoomInThirdFloor() {
		return noOfRoomInThirdFloor;
	}

	public void setNoOfRoomInThirdFloor(Double noOfRoomInThirdFloor) {
		this.noOfRoomInThirdFloor = noOfRoomInThirdFloor;
	}

	public Double getNoOfRoomInFourFloor() {
		return noOfRoomInFourFloor;
	}

	public void setNoOfRoomInFourFloor(Double noOfRoomInFourFloor) {
		this.noOfRoomInFourFloor = noOfRoomInFourFloor;
	}

	public Double getNoOfRoomInFiveFloor() {
		return noOfRoomInFiveFloor;
	}

	public void setNoOfRoomInFiveFloor(Double noOfRoomInFiveFloor) {
		this.noOfRoomInFiveFloor = noOfRoomInFiveFloor;
	}

	public Double getNoOfManger() {
		return noOfManger;
	}

	public void setNoOfManger(Double noOfManger) {
		this.noOfManger = noOfManger;
	}

	public String getCEOName() {
		return CEOName;
	}

	public void setCEOName(String cEOName) {
		CEOName = cEOName;
	}

	public String getMainManagerName() {
		return mainManagerName;
	}

	public void setMainManagerName(String mainManagerName) {
		this.mainManagerName = mainManagerName;
	}

	public String getSecondaryManagerName() {
		return secondaryManagerName;
	}

	public void setSecondaryManagerName(String secondaryManagerName) {
		this.secondaryManagerName = secondaryManagerName;
	}

	public String getThirdManagerName() {
		return thirdManagerName;
	}

	public void setThirdManagerName(String thirdManagerName) {
		this.thirdManagerName = thirdManagerName;
	}

	public String getFourthManagerName() {
		return fourthManagerName;
	}

	public void setFourthManagerName(String fourthManagerName) {
		this.fourthManagerName = fourthManagerName;
	}

	public Double getNoOfMainDoors() {
		return noOfMainDoors;
	}

	public void setNoOfMainDoors(Double noOfMainDoors) {
		this.noOfMainDoors = noOfMainDoors;
	}

	public Double getNoOfSeconaryDoors() {
		return noOfSeconaryDoors;
	}

	public void setNoOfSeconaryDoors(Double noOfSeconaryDoors) {
		this.noOfSeconaryDoors = noOfSeconaryDoors;
	}

	public Double getNoOfWashRoomDoors() {
		return noOfWashRoomDoors;
	}

	public void setNoOfWashRoomDoors(Double noOfWashRoomDoors) {
		this.noOfWashRoomDoors = noOfWashRoomDoors;
	}

	public Double getNoOfMainWindows() {
		return noOfMainWindows;
	}

	public void setNoOfMainWindows(Double noOfMainWindows) {
		this.noOfMainWindows = noOfMainWindows;
	}

	public Double getNoOfInnerWindows() {
		return noOfInnerWindows;
	}

	public void setNoOfInnerWindows(Double noOfInnerWindows) {
		this.noOfInnerWindows = noOfInnerWindows;
	}

	public Double getNoOfSecondaryWindows() {
		return noOfSecondaryWindows;
	}

	public void setNoOfSecondaryWindows(Double noOfSecondaryWindows) {
		this.noOfSecondaryWindows = noOfSecondaryWindows;
	}

	public Double getNoOfVentilators() {
		return noOfVentilators;
	}

	public void setNoOfVentilators(Double noOfVentilators) {
		this.noOfVentilators = noOfVentilators;
	}

	public Double getNoOfSections() {
		return noOfSections;
	}

	public void setNoOfSections(Double noOfSections) {
		this.noOfSections = noOfSections;
	}

	public Double getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(Double noOfTables) {
		this.noOfTables = noOfTables;
	}

	public Double getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(Double noOfChairs) {
		this.noOfChairs = noOfChairs;
	}

	public String getTablesColors() {
		return tablesColors;
	}

	public void setTablesColors(String tablesColors) {
		this.tablesColors = tablesColors;
	}

	public String getChairColors() {
		return chairColors;
	}

	public void setChairColors(String chairColors) {
		this.chairColors = chairColors;
	}

	public Double getNoOfGentsEmployee() {
		return noOfGentsEmployee;
	}

	public void setNoOfGentsEmployee(Double noOfGentsEmployee) {
		this.noOfGentsEmployee = noOfGentsEmployee;
	}

	public Double getNoOfLadiesEmployee() {
		return noOfLadiesEmployee;
	}

	public void setNoOfLadiesEmployee(Double noOfLadiesEmployee) {
		this.noOfLadiesEmployee = noOfLadiesEmployee;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Double getCEOSalary() {
		return CEOSalary;
	}

	public void setCEOSalary(Double cEOSalary) {
		CEOSalary = cEOSalary;
	}

	public Double getMangerSalary() {
		return mangerSalary;
	}

	public void setMangerSalary(Double mangerSalary) {
		this.mangerSalary = mangerSalary;
	}

	public Double getTotalNoOfProjectCompleted() {
		return totalNoOfProjectCompleted;
	}

	public void setTotalNoOfProjectCompleted(Double totalNoOfProjectCompleted) {
		this.totalNoOfProjectCompleted = totalNoOfProjectCompleted;
	}

	public Double getTotalNoOfProjectInCompleted() {
		return totalNoOfProjectInCompleted;
	}

	public void setTotalNoOfProjectInCompleted(Double totalNoOfProjectInCompleted) {
		this.totalNoOfProjectInCompleted = totalNoOfProjectInCompleted;
	}

	public Double getTotalNoOfProjectRunningCompleted() {
		return totalNoOfProjectRunningCompleted;
	}

	public void setTotalNoOfProjectRunningCompleted(Double totalNoOfProjectRunningCompleted) {
		this.totalNoOfProjectRunningCompleted = totalNoOfProjectRunningCompleted;
	}

	public Double getTotalNoOfProjectWithheld() {
		return totalNoOfProjectWithheld;
	}

	public void setTotalNoOfProjectWithheld(Double totalNoOfProjectWithheld) {
		this.totalNoOfProjectWithheld = totalNoOfProjectWithheld;
	}

	public Double getTotalBugdetOnProject() {
		return totalBugdetOnProject;
	}

	public void setTotalBugdetOnProject(Double totalBugdetOnProject) {
		this.totalBugdetOnProject = totalBugdetOnProject;
	}

	public Double getTotalHolidays() {
		return totalHolidays;
	}

	public void setTotalHolidays(Double totalHolidays) {
		this.totalHolidays = totalHolidays;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	public Double getTotalWorkingHours() {
		return totalWorkingHours;
	}

	public void setTotalWorkingHours(Double totalWorkingHours) {
		this.totalWorkingHours = totalWorkingHours;
	}

	public Double getTotalTeaBreakHours() {
		return totalTeaBreakHours;
	}

	public void setTotalTeaBreakHours(Double totalTeaBreakHours) {
		this.totalTeaBreakHours = totalTeaBreakHours;
	}

	public Double getTotalLunchHours() {
		return totalLunchHours;
	}

	public void setTotalLunchHours(Double totalLunchHours) {
		this.totalLunchHours = totalLunchHours;
	}

	public Double getTotalWeekWorkingHours() {
		return totalWeekWorkingHours;
	}

	public void setTotalWeekWorkingHours(Double totalWeekWorkingHours) {
		this.totalWeekWorkingHours = totalWeekWorkingHours;
	}

	public Double getTotalMonthWorkingHours() {
		return totalMonthWorkingHours;
	}

	public void setTotalMonthWorkingHours(Double totalMonthWorkingHours) {
		this.totalMonthWorkingHours = totalMonthWorkingHours;
	}

}
