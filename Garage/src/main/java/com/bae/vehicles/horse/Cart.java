package com.bae.vehicles.horse;

public class Cart extends HorseDrawn {

	private int costNew;
	private int costOfRepair;
	private int numWheels;
	private String colour;
	private int numHorses;
	private String type;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType() {
		type = "horse drawn";
		return type;
	}
	
	@Override
	public String getName() {
	String local1 = ": Cart";
    StringBuilder local2 = new StringBuilder();
    return local2.append(local1).toString();
	}

	public Cart(int numWheels, String colour, int numHorses) {
		super();
		this.numWheels = numWheels;
		this.colour = colour;
		this.numHorses = numHorses;
	}

	public int costOfRepair() {
		return costOfRepair = 500;

	}


	public int costNew() {
		return costNew = 3000;

	}

	@Override
	public String toString() {
		return "Cart [costNew=" + costNew + ", costOfRepair=" + costOfRepair
				+ ", numWheels=" + numWheels + ", colour=" + colour + ", numHorses=" + numHorses + "]";
	}

}
