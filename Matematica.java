
public class Matematica {
	public double menorValor(double val1,double val2) {
		if(val1 < val2) {
			return val1;
		} else {
			return val2;
		}
	}
	public double menorValorEntreTres(double val1,double val2,double val3) {
		if(val1 < val2) {
			if (val3 < val1) {
				return val3;
			} else {
				return val1;
			}
		} else if(val2 < val3) {
			return val2;
		} else {
			return val3;
		}
	}
	public double mediaEntreTresValores(double val1,double val2,double val3) {
		double media = (val1+val2+val3)/3;
		return media;
	}
	public double triangulo(double base,double altura) {
		double area = (base * altura) / 2;
		return area;
	}
}

/*
Exercício de Matematica (Double)
1 - FUM que exiba qual é o menor valor entre dois doubles
2 - FUM que exiba qual é o menor valor entre três doubles	
3 - FUM que exiba a média de três números
4 - FUM que calcule a área de um triangulo*/