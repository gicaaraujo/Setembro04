package Setembro04;

public class Principal_Mercado {

	public static void main(String[] args) {
		
		for(Mercado mercado : Mercado.values() ) {
			System.out.println("******");
			System.out.println(mercado);
		}
}}