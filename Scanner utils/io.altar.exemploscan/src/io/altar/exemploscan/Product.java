package io.altar.exemploscan;

public class Product {
	int iva;
	int pvp;
	int discount;
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public float getPvp() {
		return pvp;
	}
	public void setPvp(int pvp) {
		this.pvp = pvp;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Product(int iva, int pvp, int discount) {
		super();
		this.iva = iva;
		this.pvp = pvp;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Product [iva=" + iva + ", pvp=" + pvp + ", discount=" + discount + "]";
	}

}
