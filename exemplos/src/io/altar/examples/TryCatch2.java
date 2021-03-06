package io.altar.examples;

public class TryCatch2 {

	public static void main(String[] args) {
		try{
		switch (args[0]){
		case "DEV":
			runDEV();
			break;
		case "PROD":
			runPROD();
			break;
		case "TEST":
			runTEST();
			break;
			
			default:
				System.out.println("Erro: 'DEV' 'PROD' 'TEST'");
				break;
			}
		}catch(Exception e){
			runTEST();
		}
	}

	private static void runDEV() {
		System.out.println("Config DEV");
		
	}

	private static void runPROD() {
		System.out.println("Config PROD");
		
	}

	private static void runTEST() {
		System.out.println("Config TEST");
		
	}

}
//run configurations, arguments apply run
//se nao tiver argumentos vai para teste em vez de producao
//se eu quiser varios argumentos tenho que por espaco