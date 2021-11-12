package tanks;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bae.garage.Garage;
import com.bae.vehicles.Vehicles;
import com.bae.vehicles.horse.Carriage;
import com.bae.vehicles.horse.Cart;
import com.bae.vehicles.pedal.Bike;
import com.bae.vehicles.pedal.ElectricBike;
import com.bae.vehicles.pedal.Tricycle;
import com.bae.vehicles.pedal.Unicycle;
import com.bae.vehicles.tank.Sherman;
import com.bae.vehicles.tank.T34;

public class T34Test {
	
//	@Before
//	public void setup() {
//		Vehicles sherman = new Sherman(30, 5, 76);
//		Vehicles electric = new ElectricBike();
//		Vehicles uni = new Unicycle();
//		Vehicles trike = new Tricycle();
//		Vehicles bike = new Bike();
//		Vehicles carriage = new Carriage(6, "red", 6);
//		Vehicles cart = new Cart(2, "blue", 1);
//		Garage garage = new Garage();		
//	}
	
	@Test
	public void testConstructorT34() {
		T34 t34 = new T34(27, 4, 76);
		int weight = 27;
		int numMen = 4;
		int gunCal = 76;
		assertEquals(weight,t34.getWeight());
		assertEquals(numMen, t34.getNumMen());
		assertEquals(gunCal, t34.getGunCal());
	}
	

}
