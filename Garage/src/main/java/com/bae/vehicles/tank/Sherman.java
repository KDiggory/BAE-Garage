package com.bae.vehicles.tank;

public class Sherman extends Tank {

	private int weight;
	private int numMen;
	private int gunCal;
	private int costNew;
	private int costRepair;
	private String type;

	public Sherman(int weight, int numMen, int gunCal) {
		super();
		this.weight = weight;
		this.numMen = numMen;
		this.gunCal = gunCal;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getNumMen() {
		return numMen;
	}

	public void setNumMen(int numMen) {
		this.numMen = numMen;
	}

	public int getGunCal() {
		return gunCal;
	}

	public void setGunCal(int gunCal) {
		this.gunCal = gunCal;
	}

	public Sherman() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
	String local1 = ": Sherman";
    StringBuilder local2 = new StringBuilder();
    return local2.append(local1).toString();
	} 
	@Override
	public void country() {
		String country = "United States";
		System.out.println("This tank is from: " + country);
	}

	@Override
	public void weight() {
		int weight = this.weight;
		System.out.println("This tank weighs: " + weight + " tons");
	}
	
	@Override
	public String getType() {
		type = "tank";
		return type;
	}

	public int costOfRepair() {
		costRepair = 10000;
		return costRepair;

	}

	public int costNew() {
		costNew = 1000000;
		return costNew;

	}

	@Override
	public String toString() {
		return "Sherman [weight=" + weight + ", numMen=" + numMen + ", gunCal=" + gunCal + ", costNew=" + costNew
				+ ", costRepair=" + costRepair + "]";
	}

}
