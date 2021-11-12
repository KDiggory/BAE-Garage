package com.bae.vehicles.tank;

import com.bae.garage.Garage;
import com.bae.vehicles.Vehicles;

public class Tank extends Vehicles {
	
	private int numWheels;
	private String type;
	private boolean hasEngine;
	
	public Tank() {
		super();
		Garage.addVehicle(this);
	}
	
	public void country() {
		
	}
	
	public void weight() {
		
	}

	
	public int getNumWheels() {
		return numWheels;
	}


	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
 

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
	public int costOfRepair() {
		return 0;		
	}



	public int costNew() {
		return 0;
	}

}
