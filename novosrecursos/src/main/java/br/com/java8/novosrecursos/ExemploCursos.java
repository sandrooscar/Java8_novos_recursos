package br.com.java8.novosrecursos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {
	private String nome;
	private int alunos;
	public Curso(String nome, int alunos) {
		super();
		this.nome = nome;
		this.alunos = alunos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAlunos() {
		return alunos;
	}
	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}
	
	
}

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.forEach(System.out::println);
		
		cursos.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.filter( c -> c.getAlunos() >= 100)
			.map(c -> c.getAlunos())
			.forEach(totalAlunos -> System.out.println(totalAlunos));
		//ou
		cursos.stream()
			.filter( c -> c.getAlunos() >= 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		//somando os alunos
		int total = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();
		System.out.println(total);	
		
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
	}

}
