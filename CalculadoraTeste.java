package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;



public class CalculadoraTeste {
	// 1 - FUM que some dois números
	@Test
	public void deveSomarDoisNumeros() {
		Calculadora calc = new Calculadora();
		int somaDosNumeros = calc.somarNumeros(2, 6);
		System.out.println(somaDosNumeros);
		Assert.assertEquals(8, somaDosNumeros);
	}
	//2 - FUM que subtraia dois números
	@Test
	public void deveSubtrairDoisNumeros() {
		Calculadora calc = new Calculadora();
		int subtrairNumeros = calc.subtrairNumeros(2, 6);
		System.out.println(subtrairNumeros);
		Assert.assertEquals(-4, subtrairNumeros);
	}
	//3 - FUM que multiplique dois números 
	@Test
	public void deveMultiplicarDoisNumeros() {
		Calculadora calc = new Calculadora();
		int multiplicarNumeros = calc.multipliqueNumeros(2, 6);
		System.out.println(multiplicarNumeros);
		Assert.assertEquals(12, multiplicarNumeros);
	}
	//4 - FUM que divida dois números
	@Test
	public void deveDividirDoisNumeros() {
		Calculadora calc = new Calculadora();
		int dividirNumeros = calc.dividaNumeros(2, 6);
		System.out.println(dividirNumeros);
		Assert.assertEquals(0, dividirNumeros);
	}
	//5 - FUM que diga se o número é par
	@Test
	public void deveRetornarParOuImpar() {
		Calculadora calc = new Calculadora();
		String parOuImpar = calc.isPar(8);
		System.out.println(parOuImpar);
		Assert.assertEquals("par", parOuImpar);
	}
	//6 - FUM que receba dois números e diga qual é o maior
	@Test
	public void deveRetornarMaiorNumero() {
		Calculadora calc = new Calculadora();
		int maior = calc.maiorNumero(5, 16);
		System.out.println(maior);
		Assert.assertEquals(16, maior);
	}
	//7 - FUM que a partir de um valor inicial, mostre os números de ímpares até 100. 
	@Test
	public void deveRetornarQuantidadeDeImpares() {
		Calculadora calc = new Calculadora();
		int quantidadeDeImpares = calc.numerosImpares(60);
		System.out.println("quantidade de impares "+quantidadeDeImpares);
		Assert.assertEquals(20, quantidadeDeImpares);
	}
}
