package io.altar.exemploscan;

public class Testes {
	ScannerUtils scannerUtils = new ScannerUtils();

	public static void main(String[] args) {
		Testes testes = new Testes();
		testes.teste();
	}
	private void teste(){
		//int[] ivas = new int[] {6 ,13 ,23 };
		//int iva = scannerUtils.getValidIntFromScanner("mete o iva",ivas);
		//System.out.println("Result "+iva);
		//int pvp = scannerUtils.getIntFromScanner("mete o pvp");
		//System.out.println("Result "+pvp);
		//int discount = scannerUtils.getValidIntFromScanner("mete o discount",100);
		//System.out.println("Result "+discount);
		
		Product product = createProduct();
		System.out.println(product.toString());
		editProduct(product);
		System.out.println(product.toString());
	}
	private Product createProduct(){
		System.out.println("Criar Product");
		int[] ivas = new int[] {6 ,13 ,23 };
		int iva = scannerUtils.getValidIntFromScanner("mete o iva",ivas);
		int pvp = scannerUtils.getIntFromScanner("mete o pvp");
		int discount = scannerUtils.getValidIntFromScanner("mete o discount",100);
		Product product= new Product(iva,pvp,discount);
		return product;
		
	}
	private void editProduct(Product product){
		System.out.println("Editar Product");
		int[] ivas = new int[] {6 ,13 ,23 };
		int iva = scannerUtils.getValidIntFromScanner("Iva antigo "+ product.getIva(), ivas, true);
		product.setIva(iva);
		int pvp = scannerUtils.getIntFromScanner("Pvp antigo "+product.getPvp(),true);
		product.setPvp(pvp);
		if (pvp!=-1){
			product.setPvp(pvp);
		}
		//int discount = scannerUtils.getValidIntFromScanner("Discount "+product.getDiscount());
		product.setDiscount(discount);
	}
}
