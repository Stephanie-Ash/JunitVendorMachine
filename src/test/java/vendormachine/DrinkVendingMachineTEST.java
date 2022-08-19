package vendormachine;

import vendormachine.users.util.Wallet;
import vendormachine.vendors.DrinkVendingMachine;
import vendormachine.vendors.enums.BRANDS;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DrinkVendingMachineTEST {
	
	BRANDS brandName = BRANDS.EnergyMax;
	
	@Test
    public void testConstructor(){
		// Constructor 1
		DrinkVendingMachine testVendor = new DrinkVendingMachine();
		assertTrue(testVendor instanceof DrinkVendingMachine);
		
    	// Constructor 2
    	testVendor = new DrinkVendingMachine(20.00f, brandName );
    	assertTrue(testVendor instanceof DrinkVendingMachine);
    	
    }

}
