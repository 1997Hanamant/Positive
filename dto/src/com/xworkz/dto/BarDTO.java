package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class BarDTO implements Serializable {
	private Integer slno;
	private String name;
	private String location;
	private String totalArea;
	private String ownerName;
	private String mangerName;
	private Double collectionPerDay;
	private Double collectionPerMonth;
	private Double noOfEmployee;
	private Double noOfWorkers;
	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updatedDate;
	private Double noOfFloors;
	private Double noOfRooms;
	private Double noOfChairs;
	private Double noOfTables;
	private String chairsColors;
	private String tableColors;
	private Double noOfPans;
	private Double noOfAC;
	private Double totalNoItems;
	private Double beerPrice;
	private Double lunchPrice;
	private String type;
	private Double noOfDoors;
	private Double noWindows;
	private Double noOfCounter;
	private LocalDate stratDate;
	private Double noOfColumns;
	private Double totalConstructionCost;
	private String typeOfDoor;
	private String typeofWindows;
	private String doorColor;
	private String windowColor;
	private String typeOfTables;
	private String typeOfChairs;
	private String dreescodeColor;
	private Double mangerSalary;
	private Double employeeSalary;
	private Double workerSalary;
	private Double avgCollectionPerHours;
	private Double totalOpeningHours;

	public BarDTO() {
		System.out.println("Default Constructor");
	}

	@Override
	public int hashCode() {
		return 360;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof BarDTO) {
				BarDTO bar = (BarDTO) obj;
				if (bar.doorColor.equals(this.doorColor) && bar.beerPrice == this.beerPrice) {
					System.out.println("Object are equals");
					return true;
				} else {
					System.out.println("Object are not equals");
				}
			}
		} else {
			System.out.println("Object are null");
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

	public String getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(String totalArea) {
		this.totalArea = totalArea;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getMangerName() {
		return mangerName;
	}

	public void setMangerName(String mangerName) {
		this.mangerName = mangerName;
	}

	public Double getCollectionPerDay() {
		return collectionPerDay;
	}

	public void setCollectionPerDay(Double collectionPerDay) {
		this.collectionPerDay = collectionPerDay;
	}

	public Double getCollectionPerMonth() {
		return collectionPerMonth;
	}

	public void setCollectionPerMonth(Double collectionPerMonth) {
		this.collectionPerMonth = collectionPerMonth;
	}

	public Double getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(Double noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public Double getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(Double noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Double getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(Double noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public Double getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(Double noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public Double getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(Double noOfChairs) {
		this.noOfChairs = noOfChairs;
	}

	public Double getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(Double noOfTables) {
		this.noOfTables = noOfTables;
	}

	public String getChairsColors() {
		return chairsColors;
	}

	public void setChairsColors(String chairsColors) {
		this.chairsColors = chairsColors;
	}

	public String getTableColors() {
		return tableColors;
	}

	public void setTableColors(String tableColors) {
		this.tableColors = tableColors;
	}

	public Double getNoOfPans() {
		return noOfPans;
	}

	public void setNoOfPans(Double noOfPans) {
		this.noOfPans = noOfPans;
	}

	public Double getNoOfAC() {
		return noOfAC;
	}

	public void setNoOfAC(Double noOfAC) {
		this.noOfAC = noOfAC;
	}

	public Double getTotalNoItems() {
		return totalNoItems;
	}

	public void setTotalNoItems(Double totalNoItems) {
		this.totalNoItems = totalNoItems;
	}

	public Double getBeerPrice() {
		return beerPrice;
	}

	public void setBeerPrice(Double beerPrice) {
		this.beerPrice = beerPrice;
	}

	public Double getLunchPrice() {
		return lunchPrice;
	}

	public void setLunchPrice(Double lunchPrice) {
		this.lunchPrice = lunchPrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(Double noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public Double getNoWindows() {
		return noWindows;
	}

	public void setNoWindows(Double noWindows) {
		this.noWindows = noWindows;
	}

	public Double getNoOfCounter() {
		return noOfCounter;
	}

	public void setNoOfCounter(Double noOfCounter) {
		this.noOfCounter = noOfCounter;
	}

	public LocalDate getStratDate() {
		return stratDate;
	}

	public void setStratDate(LocalDate stratDate) {
		this.stratDate = stratDate;
	}

	public Double getNoOfColumns() {
		return noOfColumns;
	}

	public void setNoOfColumns(Double noOfColumns) {
		this.noOfColumns = noOfColumns;
	}

	public Double getTotalConstructionCost() {
		return totalConstructionCost;
	}

	public void setTotalConstructionCost(Double totalConstructionCost) {
		this.totalConstructionCost = totalConstructionCost;
	}

	public String getTypeOfDoor() {
		return typeOfDoor;
	}

	public void setTypeOfDoor(String typeOfDoor) {
		this.typeOfDoor = typeOfDoor;
	}

	public String getTypeofWindows() {
		return typeofWindows;
	}

	public void setTypeofWindows(String typeofWindows) {
		this.typeofWindows = typeofWindows;
	}

	public String getDoorColor() {
		return doorColor;
	}

	public void setDoorColor(String doorColor) {
		this.doorColor = doorColor;
	}

	public String getWindowColor() {
		return windowColor;
	}

	public void setWindowColor(String windowColor) {
		this.windowColor = windowColor;
	}

	public String getTypeOfTables() {
		return typeOfTables;
	}

	public void setTypeOfTables(String typeOfTables) {
		this.typeOfTables = typeOfTables;
	}

	public String getTypeOfChairs() {
		return typeOfChairs;
	}

	public void setTypeOfChairs(String typeOfChairs) {
		this.typeOfChairs = typeOfChairs;
	}

	public String getDreescodeColor() {
		return dreescodeColor;
	}

	public void setDreescodeColor(String dreescodeColor) {
		this.dreescodeColor = dreescodeColor;
	}

	public Double getMangerSalary() {
		return mangerSalary;
	}

	public void setMangerSalary(Double mangerSalary) {
		this.mangerSalary = mangerSalary;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Double getWorkerSalary() {
		return workerSalary;
	}

	public void setWorkerSalary(Double workerSalary) {
		this.workerSalary = workerSalary;
	}

	public Double getAvgCollectionPerHours() {
		return avgCollectionPerHours;
	}

	public void setAvgCollectionPerHours(Double avgCollectionPerHours) {
		this.avgCollectionPerHours = avgCollectionPerHours;
	}

	public Double getTotalOpeningHours() {
		return totalOpeningHours;
	}

	public void setTotalOpeningHours(Double totalOpeningHours) {
		this.totalOpeningHours = totalOpeningHours;
	}

}
