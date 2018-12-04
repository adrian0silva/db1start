
import org.junit.Assert;
import org.junit.Test;

public class MatematicaTeste {
	//1 - FUM que exiba qual � o menor valor entre dois doubles
	@Test
	public void deveRetornarMaiorValor() {
		Matematica mat = new Matematica();
		double d = mat.menorValor(12.0, 8.0);
		System.out.println(d);
		Assert.assertEquals(8.0, d,0.0);
	}
	//2 - FUM que exiba qual � o menor valor entre tr�s doubles	
	@Test
	public void deveRetornarMenorValor() {
		Matematica mat = new Matematica();
		double d = mat.menorValorEntreTres(10.0, 80.0,2.0);
		System.out.println(d);
		Assert.assertEquals(2.0, d,0.0);
	}
	//3 - FUM que exiba a m�dia de tr�s n�meros
	@Test
	public void deveRetornarMedia() {
		Matematica mat = new Matematica();
		double d = mat.mediaEntreTresValores(10.0, 80.0,30.0);
		System.out.println(d);
		Assert.assertEquals(40, d,0.0);
	}
	//4 - FUM que calcule a �rea de um triangulo
	@Test
	public void deveRetornarAreaDeUmTriangulo() {
		Matematica mat = new Matematica();
		double d = mat.triangulo(20.0, 10.0);
		System.out.println(d);
		Assert.assertEquals(100, d,0.0);
	}
}
