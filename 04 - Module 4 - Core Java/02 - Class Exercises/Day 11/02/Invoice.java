// Invoice class implementing the interface Payable
public class Invoice implements Payable {
	private String partId;
	private String partName;
	private int quantity;
	private double rate;
	
	public Invoice(String partId, String partName, int quantity, double rate) {
		this.partId = partId;
		this.partName = partName;
		this.quantity = quantity;
		this.rate = rate;
	}

	public String getPartId() {
		return partId;
	}
	public void setPartId(String partId) {
		this.partId = partId;
	}

	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Invoice [partId=" + partId + ", partName=" + partName 
				+ ", quantity=" + quantity + ", rate=" + rate + "]";
	}
	
	/*
	 * method required to carry out contract with interface Payable
	 * JVM will not compile unless you don't implement this method
	 */
	@Override
	public double getPaymentAmount() {
		return quantity * rate;
	}
}