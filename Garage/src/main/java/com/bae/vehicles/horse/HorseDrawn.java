package com.bae.vehicles.horse;

import com.bae.garage.Garage;
import com.bae.vehicles.Vehicles;

public class HorseDrawn extends Vehicles {
	
	private int numWheels;
	private String type;
	private  boolean hasEngine;
	
	public HorseDrawn() {
		super();
		Garage.addVehicle(this);
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

	public boolean isHasEngine() {
		return hasEngine;
	}

	public int costOfRepair() {
		return 0;		
	}


	public int costNew() {
		return 0;
	}

	@Override
	public String toString() {
		return "HorseDrawn [numWheels=" + numWheels + ", type=" + type + "]";
	}

}
