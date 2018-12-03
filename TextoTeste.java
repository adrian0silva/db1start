package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;
import java.lang.String;

public class TextoTeste {
	//1 - FUM que receba um texto e devolva ele em LETRAS MAIUSCULAS
	/*@Test
	public void deveTransformarParaLetraMaiuscula() {
		Texto txt = new Texto();
		String txtEmMaiusculo = txt.maiusculas("Adriano"); 
		System.out.println(txtEmMaiusculo);
		Assert.assertEquals("ADRIANO", txtEmMaiusculo);
	}
	//2 - FUM que receba um texto e devolva ele em LETRAS MINUSCULAS
	@Test
	public void deveTransformarParaLetraMinuscula() {
		Texto txt = new Texto();
		String txtEmMinusculo = txt.minusculas("Adriano"); 
		System.out.println(txtEmMinusculo);
		Assert.assertEquals("adriano", txtEmMinusculo);
	}*/
	//3 - FUM que receba DB1START e retorne a quantidade de letras que existe nesta palavra
	@Test
	public void quantidadeDeLetras() {
		Texto txt = new Texto();
		int quantidade = txt.quantidadeLetras(" DB1START ");
		System.out.println(quantidade);
		Assert.assertEquals(10, quantidade);
	}
	//4 - FUM que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe 
	@Test
	public void quantidadeDeLetrasComEspaco() {
		Texto txt = new Texto();
		int quantidade = txt.quantidadeLetrasComEspaco(" DB1START ");
		System.out.println(quantidade);
		Assert.assertEquals(8, quantidade);
	}
	//5 - FUM que retorne o item 4 com a mesma quantidade de letras do item 3.
	@Test
	public void retornarIgualAo() {
		Texto txt = new Texto();
		String texto = txt.retornarIgualExercicio(" DB1START ");
		System.out.println(texto);
		Assert.assertEquals("DB1START", texto);
	}
	//6 - FUM que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
	@Test
	public void retornaPrimeirasLetras() {
		Texto txt = new Texto();
		String texto = txt.retornarNome("ADRIANO");
		System.out.println(texto);
		Assert.assertEquals("ADRI", texto);
	}
	//7 - FUM que receba o seu nome completo e exiba a partir da terceira letras do seu nome
	@Test
	public void retornaNomeCompleto() {
		Texto txt = new Texto();
		String texto = txt.retornaNomeCompleto("ADRIANO");
		System.out.println(texto);
		Assert.assertEquals("IANO", texto);
	}
	//8 - FUM que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
	@Test
	public void retorarUltimasQuatroLetrasDoNome() {
		Texto txt = new Texto();
		String texto = txt.retornarQuatroUltimas("ADRIANO");
		System.out.println(texto);
		Assert.assertEquals("ANO", texto);
	}
	//9 - FUM que receba o seu nome completo e substitua o seu  primeiro nome por ALUNO/ALUNA
	@Test
	public void retornarAlunoOuAluna() {
		Texto txt = new Texto();
		String texto = txt.retornarAluno("Gabriel Noda");
		System.out.println(texto);
		Assert.assertEquals("ANO", texto);
	}
	//10 - FUM que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
	@Test
	public void retornarFrutas() {
		Texto txt = new Texto();
		String texto = txt.frutaSeparadamente("banana, maçã, melancia");
		System.out.println(texto);
		Assert.assertEquals("ANO", texto);
	}
}
