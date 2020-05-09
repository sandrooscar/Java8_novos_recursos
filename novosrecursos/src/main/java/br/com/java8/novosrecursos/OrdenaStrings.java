package br.com.java8.novosrecursos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
//		Collections.sort(palavras, new ComparadorPorTamanho());
		palavras.sort((String s1, String s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});
		palavras.sort((String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);
		palavras.forEach(s -> System.out.println(s));
	}
}

class ComparadorPorTamanho implements Comparator<String>{

	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}