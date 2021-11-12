package com.bae.vehicles.pedal;

public class ElectricBike extends PedalPowered {

	private String coolness;
	private int howOld;
	private int costNew;
	private int costOfRepair;
	private int numWheels;
	private String colour;
	private String type;

	public ElectricBike() {
		super();

	}

	public ElectricBike(String coolness, int howOld, String colour) {
		super();
		this.coolness = coolness;
		this.howOld = howOld;
		this.colour = colour;
	}
	
	@Override
	public String getType() {
		type = "bike";
		return type;
	}
	
	@Override
	public String getName() {
	String local1 = ": Electric Bike";
    StringBuilder local2 = new StringBuilder();
    return local2.append(local1).toString();
	}

	@Override
	public void hasEngine() {
		System.out.println("This has an engine and also uses pedal power! ");
		super.hasEngine();
	}

	@Override
	public void numWheels() {
		System.out.println("Usually 2 wheels!");
		super.numWheels();
	}

	public void batterySize() {
		System.out.println("Battery size is usually around 250W.");
	}

	public int costOfRepair() {
		return costOfRepair = 230;

	}

	public int costNew() {
		return costNew = 1000;

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

	@Override
	public String toString() {
		return "ElectricBike [coolness=" + coolness + ", howOld=" + howOld + ", costNew=" + costNew + ", costOfRepair="
				+ costOfRepair + ", numWheels=" + numWheels + ", colour=" + colour + "]";
	}

}
