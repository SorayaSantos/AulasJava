package io.altar.HelloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Veiculo veiculo1 = new Veiculo(3, 0, "Piaggio", false);
		System.out.println("Rodas "+ veiculo1.getRodas());
		veiculo1.setRodas(2);
		veiculo1.setMarca("Yamaha");
		
		System.out.println("Rodas "+ veiculo1.getRodas()+ " Marca " + veiculo1.getMarca());
		
		System.out.println("Digite o ano para saber se e bissexto ");

		Scanner sc = new Scanner(System.in);
		int ano = sc.nextInt();
		System.out.println("O ano "+ano+" e bissexto: " + isBissexto(ano));
		sc.close();
		
		//System.out.println("E bissexto 2018: " + isBissexto(2018));
		
	}
	
//	private static boolean isBissexto(int ano) {
//			/**/
//			if (((ano%4==0)&&(ano%100!=0))||(ano%400==0)){
//				return true;
//			}
//			else { return false;}
//	}
	
	private static boolean isBissexto(int ano) {
		/**/
		if (((ano%4==0)&&(ano%100!=0))||(ano%400==0)){
			return true;
		}
		else { return false;}
	}
}
