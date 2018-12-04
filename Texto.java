import java.util.ArrayList;
import java.util.List;

public class Texto {
	public String maiusculas(String txt) { 
		return txt.toUpperCase();
	}
	public String minusculas(String txt) { 
		return txt.toLowerCase();
	}
	public int quantidadeLetras(String txt) {
		return txt.length();
	}
	
	public int quantidadeLetrasComEspaco(String txt) {
		String txt2 = txt.trim();
		return txt2.length();
	}
	public String retornarIgualExercicio(String txt) {
		String txt2 = txt.trim();
		return txt2;
	}
	public String retornarNome(String nome) {
		return nome.substring(0,4);
	}
	public String retornaNomeCompleto(String nome) {
		return nome.substring(3, nome.length());
	}
	public String retornarQuatroUltimas(String nome) {
		return nome.substring(nome.length() - 4,nome.length());
	}
	
	public String retornarAluno(String nome) {
		String resto = "";
		int n = nome.indexOf(" ");
		resto = "aluno" + nome.substring(n, nome.length());
		return resto;
	}
	
	public String frutaSeparadamente(String fruta) {
		return fruta.replace(",", "");
	}
	public String textoVogais(String txt) {
		String vogais = "";
		for(int a = 0; a < txt.length();a++) {
			if(txt.charAt(a) == 'a' || txt.charAt(a) == 'e' || txt.charAt(a) == 'i' || txt.charAt(a) == 'o' ||txt.charAt(a) == 'u') {
				vogais += txt.charAt(a);
			}
		}
		return vogais;
	}
	public String inversaoDeString(String txt) {
		String invertido = "";
		for(int b = (txt.length() - 1);b > 0;b--) {
			invertido += txt.charAt(b);
		}
		return invertido;
	}
}

/*1 - FUM que receba um texto e devolva ele em LETRAS MAIUSCULAS
2 - FUM que receba um texto e devolva ele em LETRAS MINUSCULAS
3 - FUM que receba DB1START e retorne a quantidade de letras que existe nesta palavra
4 - FUM que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe 
5 - FUM que retorne o item 4 com a mesma quantidade de letras do item 3.
6 - FUM que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
7 - FUM que receba o seu nome completo e exiba a partir da terceira letras do seu nome
8 - FUM que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
9 - FUM que receba o seu nome completo e substitua o seu  primeiro nome por ALUNO/ALUNA
10 - FUM que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
11 - FUM que receba um texto e exiba quantas vogais tem no texto
12 - FUM que receba um texto e devolva ele invertido
*/