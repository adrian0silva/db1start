package br.com.db1start.aula10;

public class MinhaPrimeiraClasse {
	public static void main(String[] args) {
		/*System.out.println("OLA MUNDO!");
		
		Integer numeroASerVerificado = 3;
		
		boolean eVerdade = numeroASerVerificado == 3;
		
		boolean eVerdadeNumeroImpar = numeroASerVerificado % 2 > 0;
		
		System.out.println(eVerdade);
		System.out.println(eVerdadeNumeroImpar);
	
		Integer numeroComValor = 50;
		Integer soma = numeroASerVerificado + numeroComValor;
		Integer subtracao = numeroASerVerificado - numeroComValor;
		Integer multiplicacao = numeroASerVerificado * numeroComValor;
		Integer divisao = numeroASerVerificado / numeroComValor;
		
		System.out.println(numeroASerVerificado+" + " +numeroComValor+ " = "+soma);
		System.out.println(numeroASerVerificado+" x " +numeroComValor+ " = "+multiplicacao);
		System.out.println(numeroASerVerificado+" - " +numeroComValor+ " = "+subtracao);
		System.out.println(numeroASerVerificado+" / " +numeroComValor+ " = "+divisao);*/
				
		Integer resultadoDaSoma = MinhaPrimeiraClasse.somar(1, 10);
		System.out.println(resultadoDaSoma);
		resultadoDaSoma = 4;
		imprimirValor(resultadoDaSoma);
		
		Integer resultadoDaMultiplicacao = multiplicar(1,10);
		imprimirValor(resultadoDaMultiplicacao);
		
		Integer resultadoDaSubtracao = subtrair(1,10);
		imprimirValor(resultadoDaSubtracao);
		
		Integer resultadoDaDivisao = divisao(1,10);
		imprimirValor(resultadoDaDivisao);
	}
	
	public static Integer somar(Integer numeroUm, Integer numeroDois) {
		return numeroUm + numeroDois;
	}
	
	public static Integer multiplicar(Integer primeiro,Integer segundo) {
		return primeiro * segundo;
	}
	
	public static Integer subtrair(Integer primeiro,Integer segundo) {
		return primeiro - segundo;
	}
	
	public static Integer divisao(Integer primeiro,Integer segundo) {
		return primeiro / segundo;
	}
	
	public static void imprimirValor(Integer valor) {
		System.out.println(valor);
	} 
}
