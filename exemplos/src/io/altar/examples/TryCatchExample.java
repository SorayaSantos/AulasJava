package io.altar.examples;

import java.util.Scanner;

public class TryCatchExample {
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		getNumero();
		
	}
	public static void getNumero(){
		System.out.println("Numero: ");
		try{
			int value = sc.nextInt();
			System.out.println("Value: "+ value);
			clearScanner();


		} catch (Exception e){
			System.out.println("Erro: "+e);
			clearScanner();
			getNumero();

		} finally {
			System.out.println("Atum"); //finally corre so quando sai, guarda os atum por causa de se chamar a propria funcao/recursao
		}
}
	public static void clearScanner(){
		sc.nextLine();
		//hasNext() vai para o seguinte, mas fica la, o next e que leva o token
	}
}