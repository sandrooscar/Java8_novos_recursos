package br.com.java8.novosrecursos;

public class ThreadsLambda {

	public static void main(String[] args) {
		new Thread(() ->System.out.println("Executando um runnable")).run();
	}

}
