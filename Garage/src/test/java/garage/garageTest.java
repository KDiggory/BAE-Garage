package garage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bae.garage.Garage;
import com.bae.vehicles.Vehicles;
import com.bae.vehicles.horse.Carriage;
import com.bae.vehicles.horse.Cart;
import com.bae.vehicles.horse.HorseDrawn;
import com.bae.vehicles.pedal.Bike;
import com.bae.vehicles.pedal.ElectricBike;
import com.bae.vehicles.pedal.PedalPowered;
import com.bae.vehicles.pedal.Tricycle;
import com.bae.vehicles.pedal.Unicycle;
import com.bae.vehicles.tank.Sherman;
import com.bae.vehicles.tank.T34;
import com.bae.vehicles.tank.Tank;

public class garageTest {
	
	Garage garage = new Garage();
	ArrayList<Vehicles> garageList = new ArrayList<Vehicles>();
	ArrayList<HorseDrawn> horseGarage = new ArrayList<HorseDrawn>();
	ArrayList<Tank> tankGarage = new ArrayList<Tank>();
	ArrayList<PedalPowered> pedalGarage = new ArrayList<PedalPowered>();
	
	@Before
	public void setup() {
		garage.clearGarage();
		garageList.clear();
		tankGarage.clear();
		horseGarage.clear();
		pedalGarage.clear();
		garage.clearAllGarages();
		garage.clearGarage();
		garage.clearBikes();
		garage.clearHorses();
		garage.clearTanks();
	}
	

	
//	@Test
//	public void testConstructorT34() {
//		T34 t34 = new T34(27, 4, 76);
//		int weight = 27;
//		int numMen = 4;
//		int gunCal = 76;
//		assertEquals(weight,t34.getWeight());
//		assertEquals(numMen, t34.getNumMen());
//		assertEquals(gunCal, t34.getGunCal());
//		garage.clearAllGarages();
//		garage.clearGarage();
//	}
	
	@Test
	public void addVehicleTestTank() {
		ArrayList<Vehicles> garageList = new ArrayList<Vehicles>();
		ArrayList<Tank> tankGarage = new ArrayList<Tank>();
		Vehicles t34 = new T34(27, 4, 76);
		Garage garage = new Garage();
		int sizetankGarage = garage.tankSize();
		int sizeMainList = garage.size();
		assertEquals(1, sizetankGarage);
		assertEquals(1, sizeMainList );
	
		
	}
	
	@Test
	public void addVehicleTestBike() {
		ArrayList<Vehicles> garageList = new ArrayList<Vehicles>();
		ArrayList<PedalPowered> pedalGarage = new ArrayList<PedalPowered>();
		Garage garage = new Garage();
		Vehicles electric = new ElectricBike();
		int sizeBikeGarage = garage.bikeSize();
		int sizeMainList = garage.size();
		assertEquals(1, sizeBikeGarage);
		assertEquals(1, sizeMainList );
		
		
	}
	
	@Test
	public void addVehicleTestHorse() {
		ArrayList<Vehicles> garageList = new ArrayList<Vehicles>();
		ArrayList<HorseDrawn> horseGarage = new ArrayList<HorseDrawn>();
		Garage garage = new Garage();
		Vehicles carriage = new Carriage();
		int sizeHorseGarage = garage.horseSize();
		int sizeMainList = garage.size();
		assertEquals(1, sizeHorseGarage);
		assertEquals(1, sizeMainList );
		
		
	}
	
	@Test
	public void removeVehicleByTypeTest() {
		Garage garage = new Garage();
		Vehicles carriage = new Carriage();
		garage.removeVehicle(carriage);
		int sizeMainList = garage.size();
		assertEquals(0, sizeMainList );
		
	}
	
	@Test
	public void removeVehicleByIDTest() {
		Garage garage = new Garage();
		Vehicles carriage = new Carriage();
		garage.removeVehiclebyIndex(0);
		int sizeMainList = garage.size();
		assertEquals(0, sizeMainList );
	
	}
	
	@Test
	public void clearAllGaragesTest() {
		Garage garage = new Garage();
		Vehicles carriage = new Carriage();
		garage.clearAllGarages(); 
		int sizeMainList = garage.size();
		assertEquals(0, sizeMainList );
		
		}

	
	@Test
	public void clearHorseTest() {
	Garage garage = new Garage();
	Vehicles carriage = new Carriage();
	garage.clearHorses(); 
	int sizeList = garage.horseSize();
	assertEquals(0, sizeList );

	}
	@Test
	public void clearTankTest() {
	Garage garage = new Garage();
	Vehicles sherman = new Sherman();
	garage.clearTanks(); 
	int sizeList = garage.tankSize();
	assertEquals(0, sizeList );

	}
	@Test
	public void clearBikeTest() {
	Garage garage = new Garage();
	Vehicles bike = new Bike();
	garage.clearBikes(); 
	int sizeList = garage.bikeSize();
	assertEquals(0, sizeList );

	}
	
	@Test
	public void costSoFarTest() {
		int expected = 200;
		Vehicles bike = new Bike();
		garage.fix(bike);
		int cost = garage.costSoFar();
		assertEquals( expected, cost);
			
		}
	
	@Test
	public void fixBikeTest() {
		Vehicles bike = new Bike();
		int cost = (garage.costRepairSingleBike((PedalPowered) bike));
		int expected = 200;
		assertEquals(expected, cost);
	}
	
	@Test
	public void fixTankTest() {
		Vehicles sherman = new Sherman();
		int cost = (garage.costRepairSingleTank((Tank) sherman));
		int expected = 20000;
		assertEquals(expected, cost);
	}
	
	@Test
	public void fixHorseTest() {
		Vehicles carriage = new Carriage();
		int cost = (garage.costRepairSingleHorseDrawn((HorseDrawn) carriage));
		int expected = 1425;
		assertEquals(expected, cost);
	}
	
	@Test
	public void repairTanksTest() {
		Vehicles sherman = new Sherman();
		Vehicles T34 = new T34();
		int cost = garage.costRepairTanksAll();
		int expected = 120000;
		assertEquals(expected, cost);
	}
	
//	public void costRepairTanksAll() {
//		int total = 0;
//		for (Vehicles vehicle : tankGarage) {
//			total = total + ((Tank) vehicle).costOfRepair();
//		}
//		total = (int) (total * 2);
//		System.out.println("The cost to repair all tanks is: £" + total);
//
//	}
	
	}






