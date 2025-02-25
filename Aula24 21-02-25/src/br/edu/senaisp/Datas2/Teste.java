package br.edu.senaisp.Datas2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Teste {

	public static void main(String[] args) {

		ZoneId fuso = ZoneId.of("Asia/Singapore");
		System.out.println(fuso.getId());

		// for (String string : ZoneId.getAvailableZoneIds()) {
		// System.out.println(string);
		// }

		LocalDateTime ldate = LocalDateTime.now(fuso);
		System.err.println(ldate);

		LocalDate d2 = LocalDate.now();
		LocalDateTime d3 = LocalDateTime.now();
		LocalTime t1 = LocalTime.now();

		System.err.println(d2);
		System.out.println(d3);
		System.out.println(t1);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.err.println(dtf.format(d2));

		LocalDate novaDate = LocalDate.parse("01/05/2025", dtf);
		System.err.println(novaDate);

		LocalDate dtInicial = LocalDate.of(2005, 3, 1);
		LocalDate dtFinal = (dtInicial.plusMonths(1)).minusDays(1);
		System.out.println("Dt Final " + dtFinal);
		System.err.println(dtFinal.getDayOfWeek());
		System.err.println(dtFinal.getDayOfYear());

		System.err.println("************************");
		LocalDate dtNasc = LocalDate.of(2005, 2, 24);
		System.out.println(dtNasc);
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		Period periodo = Period.between(dtNasc, hoje);
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());

		LocalDateTime hoje2 = LocalDateTime.now();
		LocalDateTime amanha = LocalDateTime.of(2025, 2, 25, 10, 50, 27);
		Duration duracao = Duration.between(hoje2, amanha);
		System.err.println(duracao.toDays());
		System.err.println(duracao.toHours());
		System.err.println(duracao.toMinutes());
		System.err.println(duracao.toSeconds());

		if (hoje.isAfter(dtNasc))
			System.out.println("Valido");
		else
			System.out.println("InValido");

		System.err.println("************************");

	}

}
