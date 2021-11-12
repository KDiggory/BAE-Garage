package com.bae.vehicles.pedal;



public class Tricycle extends PedalPowered {
	
	private String coolness;
	private int howOld;
	private int costNew;
	private int costOfRepair;
	private int numWheels;
	private String colour;
	private String type;
	
	

	public Tricycle(String colour, String coolness, int howOld) {
		super();
		this.colour = colour;
		this.coolness = coolness;
		this.howOld = howOld;
	}

	public Tricycle() {
		super();
		
	}
	@Override
	public String getType() {
		type = "bike";
		return type;
	}

	@Override
	public String getName() {
	String local1 = ": Tricycle";
    StringBuilder local2 = new StringBuilder();
    return local2.append(local1).toString();
	}
	@Override
	public void numWheels() {
		System.out.println("Three wheels, definately more stable");
		super.numWheels();
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
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

	public int costOfRepair() {
		return costOfRepair = 100;
	}


	public int costNew() {
		return costNew = 600;
		
		
	}

	@Override
	public String toString() {
		return "Tricycle [coolness=" + coolness + ", howOld=" + howOld 
				+ ", costNew=" + costNew + ", costOfRepair=" + costOfRepair + ", numWheels=" + numWheels + ", colour="
				+ colour + "]";
	}
	
	

}
