package com.bae.main;

import com.bae.garage.Garage;
import com.bae.vehicles.Vehicles;
import com.bae.vehicles.horse.Carriage;
import com.bae.vehicles.horse.Cart;
import com.bae.vehicles.pedal.Bike;
import com.bae.vehicles.pedal.ElectricBike;
import com.bae.vehicles.pedal.PedalPowered;
import com.bae.vehicles.pedal.Tricycle;
import com.bae.vehicles.pedal.Unicycle;
import com.bae.vehicles.tank.Sherman;
import com.bae.vehicles.tank.T34;

public class Runner {

	public static void main(String[] args) {

		Vehicles t34 = new T34(27, 4, 76);
		Vehicles sherman = new Sherman(30, 5, 76);
		Vehicles electric = new ElectricBike();
		Vehicles uni = new Unicycle();
		Vehicles trike = new Tricycle();
		Vehicles bike = new Bike();
		Vehicles carriage = new Carriage(6, "red", 6);
		Vehicles cart = new Cart(2, "blue", 1);
		Garage garage = new Garage();

		System.out.println(((Vehicles) t34).gethasEngine());
		sherman.numWheels();
		((ElectricBike) electric).batterySize();
		uni.numWheels();
		trike.numWheels();

		((Bike) bike).setColour("yellow");
		System.out.println(((Bike) bike).getColour());

		((T34) t34).setWeight(34);
		System.out.println(((T34) t34).getWeight());

		garage.getGarage();
		garage.getPedalGarage();
		garage.costRepairTanksAll();
		garage.costRepairBikesAll();
		garage.costRepairHorseDrawnAll();
		garage.costRepairTotal();
		garage.costRepairSingleBike((PedalPowered) bike);
		
		Garage.removeByType(bike);
		
		garage.fix(carriage);
		garage.fix(trike);
		garage.costSoFar();
		
		garage.getHorseGarage();
		garage.clearAllGarages();
		garage.getGarage();
		
		
	}

}
