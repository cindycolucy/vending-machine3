import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	public VendingMachine vendingMachine = new VendingMachine();

	@Test
	public void ifCoinInsertedIsAQuarterIsValid() {
		assertTrue(vendingMachine.insertCoin("quarter"));
	}

	@Test
	public void ifCoinInsertedIsADimeIsValid() {
		assertTrue(vendingMachine.insertCoin("dime"));

	}

	@Test
	public void ifCoinInsertedIsNickelIsValid() {
		assertTrue(vendingMachine.insertCoin("nickel"));
	}

	@Test
	public void ifNoCoinIsEnteredDisplayInsertCoin() {
		assertEquals(vendingMachine.getDisplay(), "INSERT COIN");
	}

	@Test
	public void ifNickelIsInsertedDisplayFiveCents() {
		vendingMachine.insertCoin("nickel");
		assertEquals(vendingMachine.getDisplay(), "0.05");
	}
	@Test
	public void ifNickelAndDimeAreInsertedDisplayFifteenCents() {
		vendingMachine.insertCoin("nickel");
		vendingMachine.insertCoin("dime");
		assertEquals(vendingMachine.getDisplay(),"0.15");
	}
}
