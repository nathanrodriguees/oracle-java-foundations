package br.edu.senaisp.Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Date data = new Date();

		LocalDate dtNascimento = LocalDate.now();
		LocalDateTime dtEntrevista = LocalDateTime.now();

		System.out.println(data);
		System.out.println(dtNascimento);
		System.out.println(dtEntrevista);

		dtNascimento = LocalDate.of(2001, Month.SEPTEMBER, 03);
		System.err.println(dtNascimento);

	}
}
