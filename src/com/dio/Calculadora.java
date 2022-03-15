package com.dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		float a, b; 
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		float soma = soma(a,b); 
		float subtracao = subtracao(a,b);
		float divisao = divisao(a,b);
		float multiplicacao = multiplicacao(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("sub " + subtracao);
		System.out.println("div " + divisao);
		System.out.println("mult " + multiplicacao);
		
	}

	public static float soma(float a, float b) {
		return a + b;	
	}
	
	public static float subtracao(float a, float b) {
		return a - b;	
	}
	
	public static float divisao(float a, float b) {
		return a / b;	
	}
	
	public static float multiplicacao(float a, float b) {
		return a * b;	
	}
	
}
