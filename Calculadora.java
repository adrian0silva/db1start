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
1 - FUM que some dois n�meros
2 - FUM que subtraia dois n�meros
3 - FUM que multiplique dois n�meros 
4 - FUM que divida dois n�meros
5 - FUM que diga se o n�mero � par
6 - FUM que receba dois n�meros e diga qual � o maior
7 - FUM que a partir de um valor inicial, mostre os n�meros de �mpares at� 100. */