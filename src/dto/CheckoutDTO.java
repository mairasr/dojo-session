package dto;

import java.util.Arrays;

public class CheckoutDTO {
	
	private double total;
	private int quantity;	
	private String[] skus;
	
	public CheckoutDTO(double total, int quantity, String[] skus) {
		super();
		this.total = total;
		this.quantity = quantity;
		this.skus = skus;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String[] getSkus() {
		return skus;
	}
	public void setSkus(String[] skus) {
		this.skus = skus;
	}
	
	@Override
	public String toString() {
		return String.format("CheckoutDTO [total=%s, quantity=%s, skus=%s]", total, quantity, Arrays.toString(skus));
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantity;
		result = prime * result + Arrays.hashCode(skus);
		long temp;
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckoutDTO other = (CheckoutDTO) obj;
		if (quantity != other.quantity)
			return false;
		if (!Arrays.equals(skus, other.skus))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}
	
}
