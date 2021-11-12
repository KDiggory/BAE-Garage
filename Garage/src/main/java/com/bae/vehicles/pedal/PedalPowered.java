package com.bae.vehicles.pedal;

import com.bae.garage.Garage;
import com.bae.vehicles.Vehicles;

public class PedalPowered extends Vehicles{
	
	private int numWheels;
	private String type;
	private static boolean hasEngine;
	
	public PedalPowered() {
		super();
		Garage.addVehicle(this);
	}

	public void hasEngine() {
		
		System.out.println("This vehicle is powered by foot!");
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

	public static boolean isHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		PedalPowered.hasEngine = hasEngine;
	}

	public int costOfRepair() {
		return 0;		
	}

	public int costNew() {
		return 0;
	}

	@Override
	public String toString() {
		return "PedalPowered [numWheels=" + numWheels + ", type=" + type + "]";
	}
	
	

}
