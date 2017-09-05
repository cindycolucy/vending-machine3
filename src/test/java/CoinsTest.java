import static org.junit.Assert.*;

import org.junit.Test;

public class CoinsTest {

	public Coins underTest = new Coins();
	public VendingMachine vendingMachine = new VendingMachine();

	@Test
	public void ifCoinInsertedIsANickelIsValid() {
		assertTrue(underTest.isNickel("nickel"));
	}

	@Test
	public void ifCoinInsertedIsADimeIsValid() {
		assertTrue(underTest.isDime("dime"));
	}

	@Test
	public void ifCoinInsertedIsAQuarterisValid() {
		assertTrue(underTest.isQuarter("quarter"));
	}

	@Test
	public void ifCoinInsertedIsNotAQuarterIsInvalid() {
		assertFalse(underTest.isQuarter("dime"));
	}

	@Test
	public void ifCoinInsertedIsNotADimeIsInvalid() {
		assertFalse(underTest.isDime("taco"));
	}

	@Test
	public void ifCoinInsertedIsNotANickelIsInvalid() {
		assertFalse(underTest.isNickel("bubble gum"));
	}

}
