package com.bae.vehicles.tank;



public class T34 extends Tank {
	
	private int weight;
	private int numMen;
	private int gunCal;
	private int costNew;
	private int costOfRepair;
	private String type;
	
	public T34(int weight, int numMen, int gunCal) {
		super();
		this.weight = weight;
		this.numMen = numMen;
		this.gunCal = gunCal;
		
	}

	public T34() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void country() {
		String country = "Soviet Union";
		System.out.println("This tank is from: " + country);
	}
	
	@Override
	public void weight() {
		int weight = this.weight;
		System.out.println("This tank weighs: " + weight + " tons");
	}
	
	@Override
	public String getName() {
	String local1 = ": T34";
    StringBuilder local2 = new StringBuilder();
    return local2.append(local1).toString();
	} 
	public int costOfRepair() {
		costOfRepair = 50000 ;
		return costOfRepair;
		
	}

	

	@Override
	public int getNumWheels() {
		return super.getNumWheels();
	}

	@Override
	public void setNumWheels(int numWheels) {
		super.setNumWheels(numWheels);
	}

	@Override
	public String getType() {
		type = "tank";
		return type;
	}


	public int costNew() {
		costNew = 25000000;
		return costNew;
		
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

	@Override
	public String toString() {
		return "T34 [weight=" + weight + ", numMen=" + numMen + ", gunCal=" + gunCal 
		 + ", costNew=" + costNew + ", costOfRepair=" + costOfRepair + "]";
	}
	
	
}
