package com.bae.vehicles.pedal;



public class Unicycle extends PedalPowered {

	private int costNew;
	private int costOfRepair;
	private int numWheels;
	private String colour;
	private String coolness;
	private int howOld;
	private String type;
	

	public Unicycle(int howOld, String colour, String coolness) {
		super();
		this.colour = colour;
		this.howOld = howOld;
		this.coolness = coolness;
	}

	public Unicycle() {
		super();
	
	}

	@Override
	public void numWheels() {
		System.out.println("Just one wheel");
		super.numWheels();
	}
	
	@Override
	public String getType() {
		type = "bike";
		return type;
	}
	
	@Override
	public String getName() {
	String local1 = ": Unicycle";
    StringBuilder local2 = new StringBuilder();
    return local2.append(local1).toString();
	}

	public int costOfRepair() {
		return costOfRepair = 50;
		
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

	public int costNew() {
		return costNew = 240;
		
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

	@Override
	public String toString() {
		return "Unicycle [costNew=" + costNew + ", costOfRepair=" + costOfRepair
				+ ", numWheels=" + numWheels + ", colour=" + colour + ", coolness=" + coolness + ", howOld=" + howOld
				+ "]";
	}
	
	

}
