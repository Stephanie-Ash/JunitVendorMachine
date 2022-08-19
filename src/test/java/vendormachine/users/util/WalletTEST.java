package vendormachine.users.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WalletTEST {

Wallet testWallet;
	
	@BeforeEach
	public void init() {
		testWallet = new Wallet();
	}
	
	@Test
    public void testConstructor(){
    	// Constructor 1
    	assertTrue(testWallet instanceof Wallet);
    	
    	// Constructor 2
    	testWallet = new Wallet(20.00f);
    	assertTrue(testWallet instanceof Wallet);
    	
    	//Constructor 3
    	testWallet = new Wallet("Great Brand", 20.00f);
    	assertTrue(testWallet instanceof Wallet);
    }
    
    @Test
    public void testAddGetAllCredit() {
    	testWallet.addCredit(25.50f);
    	assertEquals(26.00f, testWallet.getAllCredit());
    }
    
    @Test
    public void testSetGetCredit() {
    	testWallet.setCredit(20.00f);
    	assertEquals(5.00f, testWallet.getCredit(5.00f));
    	assertEquals(15.00f, testWallet.getAllCredit());
    }
    
    @Test
    public void testGetNotEnoughCredit() {
    	assertEquals(0, testWallet.getCredit(20.00f));
    }
    
    @Test
    public void testSetGetBrand() {
    	testWallet.setBrand("Nice brand");
    	assertEquals("Nice brand", testWallet.getBrand("This is an error!"));
    }
    
    @Test
    public void testGetAllCreditDefault() {
    	assertEquals(0.5f, testWallet.getAllCredit());
    }
    
    @Test
    public void testGetBrandDefault() {
    	assertEquals("Generic", testWallet.getBrand("This is an error!"));
    }
}
