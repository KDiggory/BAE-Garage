package com.bae.vehicles;

public class Vehicles implements Wheels {

	private int numWheels;
	private String type;
	private boolean hasEngine;

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

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	public void numWheels() {
		numWheels = 4;
	}

	public boolean gethasEngine() {
		hasEngine = true;
		return hasEngine;
	}

	public int costOfRepair() {

		return 0;
	}

	@Override
	public String toString() {
		return "Vehicles [numWheels=" + numWheels + ", type=" + type + "]";
	}

	public String getName() {
		return null;

	}
}
