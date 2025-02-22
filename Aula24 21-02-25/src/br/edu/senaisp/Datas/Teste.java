package br.edu.senaisp.Datas;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Teste {

	public static void main(String[] args) {

//		Date d1 = new Date();
//		LocalDate d2 = LocalDate.now();
//		LocalDateTime d3 = LocalDateTime.now();

//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(d3);

//		Locale loc = Locale.CANADA_FRENCH;

//		----------------------------------------------------------------
//		Locale.setDefault(new Locale("us", "EN"));
//		Locale loc = new Locale("pt", "BR");
//		DateFormat df = DateFormat.getDateInstance(0, loc);
//		System.out.println(df.format(d1));

//		----------------------------------------------------------------
//		NumberFormat nf = NumberFormat.getInstance();
//		System.out.println(nf.format(150000.25));

//		----------------------------------------------------------------
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//		SimpleDateFormat sdf = new SimpleDateFormat("MMM");
//		System.err.println("SIMPLE:" + sdf.format(d1));

//		Date dd;
//		try {
//			dd = sdf.parse("01/05/2025 21:22");
//		} catch (ParseException e) {
//			System.out.println("UIUIUI");
//		}

//		----------------------------------------------------------------
//		LocalDate d2 = LocalDate.now();
//		LocalDateTime d3 = LocalDateTime.now();
//		LocalTime t1 = LocalTime.now();
//		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//		System.out.println(dtf.format(d2));
		
//		LocalDate novaData = LocalDate.parse("01.05.2025", dtf);
//		System.out.println(novaData);
		
//		LocalDate dtNasc = LocalDate.of(2005, 2, 25);
//		System.out.println(dtNasc);
		
		LocalDate dtInicial = LocalDate.of(2005, 3, 1);
		LocalDate dtFinal = dtInicial.plusMonths(1).minusDays(1);
		System.out.println(dtFinal);
	}
}
