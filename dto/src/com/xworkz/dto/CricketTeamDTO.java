package com.xworkz.dto;

import java.io.Serializable;

import com.xworkz.constant.CricketTeamColor;

public class CricketTeamDTO implements Serializable {
	private Integer slno;
	private String name;
	private CricketTeamColor color;
	private String capatinName;
	private String viceCaptianName;
	private String openingBatsman;
	private String oneDownBatsman;
	private String allRouderName1;
	private Double noOfAllRounder;
	private Double noOfSpinner;
	private Double noOfBatsman;
	private Double noOfBowler;
	private String allRounderName2;
	private Double captainNoOfMatchesPlayed;
	private String batColor;
	private Double batPrice;
	private String batSize;
	private String ballColor;
	private Double ballPrice;
	private String ballSize;
	private Double noOfBats;
	private Double noOfBalls;
	private Double noOfODIMatchesPlayed;
	private Double noOfT20MatchesPlayed;
	private Double noOfTestMatchesPlayed;
	private Double noOfAsiaCupPlayed;
	private Double noOfODIWorldCupPlayed;
	private Double noOfT20WorldCupPlayed;
	private Double noOfWorldTestChampionshipPlayed;
	private Double noOfODIWorldCupOwned;
	private Double noOfT20WorldCup;
	private Double noOfWorldTestChampionshipOwned;
	private Double noOfPlayers;
	private Double noOfCaptain;
	private Double noOfViceCaptain;
	private Double noOfStumps;
	private Double noOfUmpire;
	private Double noOfOnFelidUmpire;
	private Double noOfThirdUmpire;
	private Double fourthUmpire;
	private Double playersSalary;
	private Double captainSalary;
	private Double VicecaptainSalary;
	private Double umpireSalary;

	public CricketTeamDTO() {
		System.out.println("Default Constructor");
	}

	@Override
	public int hashCode() {
		return 220;
	}
@Override
public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof CricketTeamDTO) {
			CricketTeamDTO cricketTeam=(CricketTeamDTO)obj;
			if(cricketTeam.capatinName.equals(this.capatinName) && cricketTeam.allRouderName1.equals(this.allRouderName1));
			System.out.println("Object are equal");
			return true;
		}
		else {
			System.out.println("Object are not equals");
		}
	}
	else {
		System.out.println("object is null");
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

	public CricketTeamColor getColor() {
		return color;
	}

	public void setColor(CricketTeamColor color) {
		this.color = color;
	}

	public String getCapatinName() {
		return capatinName;
	}

	public void setCapatinName(String capatinName) {
		this.capatinName = capatinName;
	}

	public String getViceCaptianName() {
		return viceCaptianName;
	}

	public void setViceCaptianName(String viceCaptianName) {
		this.viceCaptianName = viceCaptianName;
	}

	public String getOpeningBatsman() {
		return openingBatsman;
	}

	public void setOpeningBatsman(String openingBatsman) {
		this.openingBatsman = openingBatsman;
	}

	public String getOneDownBatsman() {
		return oneDownBatsman;
	}

	public void setOneDownBatsman(String oneDownBatsman) {
		this.oneDownBatsman = oneDownBatsman;
	}

	public String getAllRouderName1() {
		return allRouderName1;
	}

	public void setAllRouderName1(String allRouderName1) {
		this.allRouderName1 = allRouderName1;
	}

	public Double getNoOfAllRounder() {
		return noOfAllRounder;
	}

	public void setNoOfAllRounder(Double noOfAllRounder) {
		this.noOfAllRounder = noOfAllRounder;
	}

	public Double getNoOfSpinner() {
		return noOfSpinner;
	}

	public void setNoOfSpinner(Double noOfSpinner) {
		this.noOfSpinner = noOfSpinner;
	}

	public Double getNoOfBatsman() {
		return noOfBatsman;
	}

	public void setNoOfBatsman(Double noOfBatsman) {
		this.noOfBatsman = noOfBatsman;
	}

	public Double getNoOfBowler() {
		return noOfBowler;
	}

	public void setNoOfBowler(Double noOfBowler) {
		this.noOfBowler = noOfBowler;
	}

	public String getAllRounderName2() {
		return allRounderName2;
	}

	public void setAllRounderName2(String allRounderName2) {
		this.allRounderName2 = allRounderName2;
	}

	public Double getCaptainNoOfMatchesPlayed() {
		return captainNoOfMatchesPlayed;
	}

	public void setCaptainNoOfMatchesPlayed(Double captainNoOfMatchesPlayed) {
		this.captainNoOfMatchesPlayed = captainNoOfMatchesPlayed;
	}

	public String getBatColor() {
		return batColor;
	}

	public void setBatColor(String batColor) {
		this.batColor = batColor;
	}

	public Double getBatPrice() {
		return batPrice;
	}

	public void setBatPrice(Double batPrice) {
		this.batPrice = batPrice;
	}

	public String getBatSize() {
		return batSize;
	}

	public void setBatSize(String batSize) {
		this.batSize = batSize;
	}

	public String getBallColor() {
		return ballColor;
	}

	public void setBallColor(String ballColor) {
		this.ballColor = ballColor;
	}

	public Double getBallPrice() {
		return ballPrice;
	}

	public void setBallPrice(Double ballPrice) {
		this.ballPrice = ballPrice;
	}

	public String getBallSize() {
		return ballSize;
	}

	public void setBallSize(String ballSize) {
		this.ballSize = ballSize;
	}

	public Double getNoOfBats() {
		return noOfBats;
	}

	public void setNoOfBats(Double noOfBats) {
		this.noOfBats = noOfBats;
	}

	public Double getNoOfBalls() {
		return noOfBalls;
	}

	public void setNoOfBalls(Double noOfBalls) {
		this.noOfBalls = noOfBalls;
	}

	public Double getNoOfODIMatchesPlayed() {
		return noOfODIMatchesPlayed;
	}

	public void setNoOfODIMatchesPlayed(Double noOfODIMatchesPlayed) {
		this.noOfODIMatchesPlayed = noOfODIMatchesPlayed;
	}

	public Double getNoOfT20MatchesPlayed() {
		return noOfT20MatchesPlayed;
	}

	public void setNoOfT20MatchesPlayed(Double noOfT20MatchesPlayed) {
		this.noOfT20MatchesPlayed = noOfT20MatchesPlayed;
	}

	public Double getNoOfTestMatchesPlayed() {
		return noOfTestMatchesPlayed;
	}

	public void setNoOfTestMatchesPlayed(Double noOfTestMatchesPlayed) {
		this.noOfTestMatchesPlayed = noOfTestMatchesPlayed;
	}

	public Double getNoOfAsiaCupPlayed() {
		return noOfAsiaCupPlayed;
	}

	public void setNoOfAsiaCupPlayed(Double noOfAsiaCupPlayed) {
		this.noOfAsiaCupPlayed = noOfAsiaCupPlayed;
	}

	public Double getNoOfODIWorldCupPlayed() {
		return noOfODIWorldCupPlayed;
	}

	public void setNoOfODIWorldCupPlayed(Double noOfODIWorldCupPlayed) {
		this.noOfODIWorldCupPlayed = noOfODIWorldCupPlayed;
	}

	public Double getNoOfT20WorldCupPlayed() {
		return noOfT20WorldCupPlayed;
	}

	public void setNoOfT20WorldCupPlayed(Double noOfT20WorldCupPlayed) {
		this.noOfT20WorldCupPlayed = noOfT20WorldCupPlayed;
	}

	public Double getNoOfWorldTestChampionshipPlayed() {
		return noOfWorldTestChampionshipPlayed;
	}

	public void setNoOfWorldTestChampionshipPlayed(Double noOfWorldTestChampionshipPlayed) {
		this.noOfWorldTestChampionshipPlayed = noOfWorldTestChampionshipPlayed;
	}

	public Double getNoOfODIWorldCupOwned() {
		return noOfODIWorldCupOwned;
	}

	public void setNoOfODIWorldCupOwned(Double noOfODIWorldCupOwned) {
		this.noOfODIWorldCupOwned = noOfODIWorldCupOwned;
	}

	public Double getNoOfT20WorldCup() {
		return noOfT20WorldCup;
	}

	public void setNoOfT20WorldCup(Double noOfT20WorldCup) {
		this.noOfT20WorldCup = noOfT20WorldCup;
	}

	public Double getNoOfWorldTestChampionshipOwned() {
		return noOfWorldTestChampionshipOwned;
	}

	public void setNoOfWorldTestChampionshipOwned(Double noOfWorldTestChampionshipOwned) {
		this.noOfWorldTestChampionshipOwned = noOfWorldTestChampionshipOwned;
	}

	public Double getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(Double noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public Double getNoOfCaptain() {
		return noOfCaptain;
	}

	public void setNoOfCaptain(Double noOfCaptain) {
		this.noOfCaptain = noOfCaptain;
	}

	public Double getNoOfViceCaptain() {
		return noOfViceCaptain;
	}

	public void setNoOfViceCaptain(Double noOfViceCaptain) {
		this.noOfViceCaptain = noOfViceCaptain;
	}

	public Double getNoOfStumps() {
		return noOfStumps;
	}

	public void setNoOfStumps(Double noOfStumps) {
		this.noOfStumps = noOfStumps;
	}

	public Double getNoOfUmpire() {
		return noOfUmpire;
	}

	public void setNoOfUmpire(Double noOfUmpire) {
		this.noOfUmpire = noOfUmpire;
	}

	public Double getNoOfOnFelidUmpire() {
		return noOfOnFelidUmpire;
	}

	public void setNoOfOnFelidUmpire(Double noOfOnFelidUmpire) {
		this.noOfOnFelidUmpire = noOfOnFelidUmpire;
	}

	public Double getNoOfThirdUmpire() {
		return noOfThirdUmpire;
	}

	public void setNoOfThirdUmpire(Double noOfThirdUmpire) {
		this.noOfThirdUmpire = noOfThirdUmpire;
	}

	public Double getFourthUmpire() {
		return fourthUmpire;
	}

	public void setFourthUmpire(Double fourthUmpire) {
		this.fourthUmpire = fourthUmpire;
	}

	public Double getPlayersSalary() {
		return playersSalary;
	}

	public void setPlayersSalary(Double playersSalary) {
		this.playersSalary = playersSalary;
	}

	public Double getCaptainSalary() {
		return captainSalary;
	}

	public void setCaptainSalary(Double captainSalary) {
		this.captainSalary = captainSalary;
	}

	public Double getVicecaptainSalary() {
		return VicecaptainSalary;
	}

	public void setVicecaptainSalary(Double vicecaptainSalary) {
		VicecaptainSalary = vicecaptainSalary;
	}

	public Double getUmpireSalary() {
		return umpireSalary;
	}

	public void setUmpireSalary(Double umpireSalary) {
		this.umpireSalary = umpireSalary;
	}

}
