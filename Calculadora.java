package br.com.db1.db1start;

public class Calculadora {
	public int somarNumeros(int num1,int num2) {
		return num1+num2;
	}
	public int subtrairNumeros(int num1,int num2) {
		return num1-num2; 
	}
	public int multipliqueNumeros(int num1,int num2) {
		return num1*num2; 
	}
	public int dividaNumeros(int num1,int num2) {
		return num1/num2; 
	}
	public String isPar(int num) {
		if(num % 2 == 0) {
			return "par";
		} else {
			return "impar";
		}
	}
	public int maiorNumero(int num1,int num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	public int numerosImpares(int num) {
		int quantidade = 0;
		for(int x = num;x < 100;x++) {
			if(x % 2 == 0) {
				quantidade++;
			}
			
		}
		return quantidade;
	}
}


/*
1 - FUM que some dois números
2 - FUM que subtraia dois números
3 - FUM que multiplique dois números 
4 - FUM que divida dois números
5 - FUM que diga se o número é par
6 - FUM que receba dois números e diga qual é o maior
7 - FUM que a partir de um valor inicial, mostre os números de ímpares até 100. */