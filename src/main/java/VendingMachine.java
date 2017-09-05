
public class VendingMachine {

	private double totalAmount;

	private Coins coins = new Coins();

	public boolean insertCoin(String coin) {
		boolean isValid = false;
		if (coins.isQuarter(coin)) {
			totalAmount += 0.25;
			isValid = true;
		}
		if (coins.isDime(coin)) {
			totalAmount += 0.10;
			isValid = true;
		}
		if (coins.isNickel(coin)) {
			totalAmount += 0.05;
			isValid = true;
		}

		return isValid;
	}

	public String getDisplay() {
		if (totalAmount > 0) {
			return String.format("%1$.2f", totalAmount);
		}

		return "INSERT COIN";

	}
}
