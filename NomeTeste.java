package br.com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class NomeTeste {

	@Test
	public void deveTransformarParaLetraMaiuscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMaiuscula("adriano da silva");
		System.out.println(valorTransformado);
		Assert.assertEquals("ADRIANO DA SILVA", valorTransformado);
	}
	
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoDoNome("ADRIANO");
		Assert.assertEquals(7, tamanhoDoNome);
	}
}
