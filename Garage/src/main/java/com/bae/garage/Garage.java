package com.bae.garage;

import java.util.ArrayList;

import com.bae.vehicles.Vehicles;
import com.bae.vehicles.horse.HorseDrawn;
import com.bae.vehicles.pedal.PedalPowered;
import com.bae.vehicles.tank.Tank;

public class Garage {

	private static ArrayList<Vehicles> garage = new ArrayList<Vehicles>();
	private static ArrayList<PedalPowered> pedalGarage = new ArrayList<PedalPowered>();
	private static ArrayList<Tank> tankGarage = new ArrayList<Tank>();
	private static ArrayList<HorseDrawn> horseGarage = new ArrayList<HorseDrawn>();
	int soFar;

	public static void addVehicle(Vehicles toAdd) {
		garage.add(toAdd);
		splitGarage(toAdd);
	}

	public void removeVehicle(Vehicles toRemove) {
		garage.remove(toRemove);
	}

	public void removeVehiclebyIndex(int indextoRemove) {
		garage.remove(indextoRemove);
	}

	public void clearAllGarages() {
		garage.clear();
		pedalGarage.clear();
		horseGarage.clear();
		tankGarage.clear();
	}
	
	public void clearTanks() {
		tankGarage.clear();
		
	}
	
	public void clearBikes() {
		pedalGarage.clear();
	}
	public void clearHorses() {
		horseGarage.clear();
	}
	
	public void clearGarage() {
		garage.clear();
		
	}

	public void showGarage() {
		System.out.println(garage.toString());
	}

	public static void removeByType(Vehicles vehicleType) {
		for (Vehicles vehicle : garage) {
		if (garage.contains(vehicleType) && (vehicleType instanceof PedalPowered)) {
			garage.remove(vehicle);
		} else if (garage.contains(vehicleType) && (vehicleType instanceof Tank)) {
			garage.remove(vehicle);
		} else if (garage.contains(vehicleType) && (vehicleType instanceof HorseDrawn)) {
			garage.remove(vehicle);
		}
		}
	}
	
	public static void splitGarage(Vehicles vehicleType) {
		if (garage.contains(vehicleType) && (vehicleType instanceof PedalPowered)) {
			pedalGarage.add((PedalPowered) vehicleType);
		} else if (garage.contains(vehicleType) && (vehicleType instanceof Tank)) {
			tankGarage.add((Tank) vehicleType);
		} else if (garage.contains(vehicleType) && (vehicleType instanceof HorseDrawn)) {
			horseGarage.add((HorseDrawn) vehicleType);
		}
	}

	public int fix(Vehicles vehicleToFix) {
		if (garage.contains(vehicleToFix) && (vehicleToFix instanceof PedalPowered)) {
			//costRepairSingleBike((PedalPowered) vehicleToFix);
			soFar = soFar + costRepairSingleBike((PedalPowered) vehicleToFix);
		} else if (garage.contains(vehicleToFix) && (vehicleToFix instanceof HorseDrawn)) {
			//costRepairSingleHorseDrawn((HorseDrawn) vehicleToFix);
			soFar = soFar+ costRepairSingleHorseDrawn((HorseDrawn) vehicleToFix);
		} else if (garage.contains(vehicleToFix) && (vehicleToFix instanceof Tank)) {
		//	costRepairSingleTank((Tank) vehicleToFix);
			soFar = soFar + costRepairSingleTank((Tank) vehicleToFix);
		} return soFar;
	}
	
	public void costSoFar() {
		System.out.println("The cost of all the vehicles you want repaired is: " + soFar);
		
	}

	public int costRepairSingleTank(Tank vehicleToFix) {
		int total = 0;
		total = vehicleToFix.costOfRepair();
		total = (int) (total * 2);
		System.out.println("The cost to repair this vehicle is: £" + total);
		return total;
	}

	public void costRepairTanksAll() {
		int total = 0;
		for (Vehicles vehicle : tankGarage) {
			total = total + ((Tank) vehicle).costOfRepair();
		}
		total = (int) (total * 2);
		System.out.println("The cost to repair all tanks is: £" + total);

	}

	public int costRepairSingleBike(PedalPowered vehicleToFix) {
		int total = 0;
		total = vehicleToFix.costOfRepair();
		total = (int) (total * 2);
		System.out.println("The cost to repair this vehicle is: £" + total);
		return total;

	}

	public void costRepairBikesAll() {
		int total = 0;
		for (Vehicles vehicle : pedalGarage) {
			total = total + ((PedalPowered) vehicle).costOfRepair();
		}
		total = (int) (total * 2);
		System.out.println("The cost to repair all bikes is: £" + total);

	}

	public int costRepairSingleHorseDrawn(HorseDrawn vehicleToFix) {
		int total = 0;
		total = vehicleToFix.costOfRepair();
		total = (int) (total * 1.5);
		System.out.println("The cost to repair this vehicle is: £" + total);
		return total;

	}

	public void costRepairHorseDrawnAll() {
		int total = 0;
		for (Vehicles vehicle : horseGarage) {
			total = total + ((HorseDrawn) vehicle).costOfRepair();
		}
		total = (int) (total * 1.5);
		System.out.println("The cost to repair all horse drawn vehicles is: £" + total);

	}

	public void costRepairTotal() {
		int total = 0;
		for (Vehicles vehicle : garage) {
			total = total + vehicle.costOfRepair();

		}
		total = (int) (total * 2 - 50);

		System.out.println("Your total repair costs, including a friendly discount... are £" + total);

	}

	public void costbuyNewTotal() {
		int total = 0;
		for (Vehicles vehicle : garage) {
			total = total + vehicle.costOfRepair();

		}
		total = (int) (total * 2 - 50);

		System.out.println("Your cost to buy everything new is: £" + total);

	}

	public void getGarage() {
		
		if (!garage.isEmpty()) {
			System.out.println("In this garage there are the following types of vehicles:");
		for (Vehicles vehicle : garage) {
			System.out.println(vehicle.getType() + vehicle.getName());
		} }else {
			System.out.println("This garage is empty");
		}
	
	}

	@Override
	public String toString() {
		return "Garage [garage=" + garage + ", pedalGarage=" + pedalGarage + ", tankGarage=" + tankGarage
				+ ", horseGarage=" + horseGarage + "]";
	}

	public void getPedalGarage() {
		if (!pedalGarage.isEmpty()) {
		System.out.println("In this garage there are the following types of vehicles:");
		for (Vehicles vehicle : pedalGarage) {
			System.out.println(vehicle.getType() + vehicle.getName());
		} }else {
			System.out.println("This garage is empty");
		}

	}

	public void getTankGarage() {
		if (!tankGarage.isEmpty()) {
		System.out.println("In this garage there are the following types of vehicles:");
		for (Vehicles vehicle : tankGarage) {
			System.out.println(vehicle.getType() + vehicle.getName());
		}}else {
			System.out.println("This garage is empty");
			}
	}

	public void getHorseGarage() {
		if (!horseGarage.isEmpty()) {
		System.out.println("In this garage there are the following types of vehicles:");
		for (Vehicles vehicle : horseGarage) {
			System.out.println(vehicle.getType() + vehicle.getName());
		} }else {
			System.out.println("This garage is empty");
		}
	}

}
