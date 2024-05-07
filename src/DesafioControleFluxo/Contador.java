package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int parametroUm = 0;
		int parametroDois = 0;
		System.out.println("Informe dois números inteiros para iterar. ");
		System.out.println();
		System.out.println("Informe o primeiro número inteiro: ");
		parametroUm = input.nextInt();
		System.out.println();
		System.out.println("Informe o segundo número inteiro: ");
		parametroDois = input.nextInt();
		System.out.println();
		
		try {
			contar(parametroUm, parametroDois);
			
		}catch (ParametrosInvalidosException e) {
			
			System.out.println("o segundo número deve ser maior que o primeiro.");
		}

	}// fim main
	
	static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();
		}else {
			for (int contagem = parametroUm; contagem <= parametroDois; contagem++  ) {
			
				System.out.println("Iteração " + contagem + ": " + contagem);
			}
		}
		
		
	} // fim contar

}// fim class
