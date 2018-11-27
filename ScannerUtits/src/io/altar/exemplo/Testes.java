package io.altar.exemplo;

public class Testes {
	private ScannerUtils scannerUtils = new ScannerUtils();
	private int[] ivas = new int[] {6,13,23};
	
	public static void main(String[] args) {
		Testes testes = new Testes();
		testes.teste();
	}
	
	private void teste() {
		Product product = createProduct();
		System.out.println(product.toString());
		editProduct(product);
		System.out.println(product.toString());
	}
	
	private Product createProduct() {
		System.out.println("Criar Product");
		int iva = scannerUtils.getValidIntFromScanner("Mete o iva", ivas);
		int pvp = scannerUtils.getIntFromScanner("Mete o pvp");
		int discount = scannerUtils.getValidIntFromScanner("Mete o discount", 100);
		Product product = new Product(iva, pvp, discount);
		return product;
	}
	
	private void editProduct(Product product) {
		System.out.println("Editar Produto");
		int iva = scannerUtils.getValidIntFromScanner("Iva antigo : " + product.getIva(), ivas , true);
		if (iva != -1) {
			product.setIva(iva);
		}
		int pvp = scannerUtils.getIntFromScanner("Pvp antigo : " + product.getPvp() , true);
		if (pvp != -1) {
			product.setPvp(pvp);
		}
		int discount = scannerUtils.getValidIntFromScanner("Discount antigo : " + product.getDiscount(), 100, true);
		if (discount != -1) {
			product.setDiscount(discount);
		}
	}
}
