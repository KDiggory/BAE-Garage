package com.bae.vehicles.pedal;

public class Bike extends PedalPowered {

	private String coolness;
	private int howOld;
	private int costNew;
	private int costOfRepair;
	private int numWheels;
	private String colour;
	private String type;

	public Bike(String coolness, int howOld, String colour) {
		super();
		this.coolness = coolness;
		this.howOld = howOld;
		this.colour = colour;
	}

	public Bike() {
		super();

	}
	@Override
	public String getType() {
		type = "bike";
		return type;
	}
	
	@Override
	public String getName() {
	String local1 = ": Bike";
    StringBuilder local2 = new StringBuilder();
    return local2.append(local1).toString();
	}

	public void colour() {
		System.out.println("Red");
	}

	public int costOfRepair() {
		return costOfRepair = 100;

	}

	public int costNew() {
		return costNew = 500;

	}

	public String getCoolness() {
		return coolness;
	}

	public void setCoolness(String coolness) {
		this.coolness = coolness;
	}

	public int getHowOld() {
		return howOld;
	}

	public void setHowOld(int howOld) {
		this.howOld = howOld;
	}

	public int getCostNew() {
		return costNew;
	}

	public void setCostNew(int costNew) {
		this.costNew = costNew;
	}

	public int getCostOfRepair() {
		return costOfRepair;
	}

	public void setCostOfRepair(int costOfRepair) {
		this.costOfRepair = costOfRepair;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
