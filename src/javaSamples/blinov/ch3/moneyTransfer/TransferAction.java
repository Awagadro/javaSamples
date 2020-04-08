package javaSamples.blinov.ch3.moneyTransfer;

public class TransferAction {
	private double transactionAmount;

	public TransferAction(double amount) {
		if (amount > 0) {
			this.transactionAmount = amount;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public boolean transferIntoAccount(Account from, Account to) {
		// определение остатка
		double demand = from.getAmount() - transactionAmount;
		if (demand >= 0) {
			from.setAmount(from.getAmount() - transactionAmount);
			to.addAmount(transactionAmount);
			return true;
		} else {
			return false;
		}
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

}
