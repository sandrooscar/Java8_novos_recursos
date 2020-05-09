package br.com.java8.novosrecursos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasToquio = LocalDate.of(2021, Month.JUNE, 5);
		
		Period periodo = Period.between(hoje, olimpiadasToquio);
		System.out.println(periodo.getDays());
		
		LocalDate proximasOlimpiadas = olimpiadasToquio.plusYears(4);
		
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
		
		LocalTime hora = LocalTime.of(15,  30);
		System.out.println(hora);
		
	}

}
