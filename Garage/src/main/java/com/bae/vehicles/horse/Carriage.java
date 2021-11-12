package com.bae.vehicles.horse;



public class Carriage extends  HorseDrawn {


	private int costNew;
	private int costOfRepair;
	private int numWheels;
	private String colour;
	private int numHorses;
	private String type;
	
	

	public Carriage() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Carriage(int numWheels, String colour, int numHorses) {
		super();
		this.numWheels = numWheels;
		this.colour = colour;
		this.numHorses = numHorses;
	}

	@Override
	public String getType() {
		type = "horse drawn";
		return type;
	}
	
	@Override
	public String getName() {
	String local1 = ": Carriage";
    StringBuilder local2 = new StringBuilder();
    return local2.append(local1).toString();
	}

	public int costOfRepair() {
		return costOfRepair = 950;
		
	}

	

	public int costNew() {
		return costNew = 7000;
		
	}


	@Override
	public String toString() {
		return "Carriage [ costNew=" + costNew + ", costOfRepair=" + costOfRepair
				+ ", numWheels=" + numWheels + ", colour=" + colour + ", numHorses=" + numHorses + "]";
	}
	
}
