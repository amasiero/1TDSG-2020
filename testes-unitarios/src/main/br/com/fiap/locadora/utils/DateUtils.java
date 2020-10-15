package main.br.com.fiap.locadora.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateUtils {

    public static LocalDate adicionaDias(LocalDate data, Integer dias) {
        return data.plusDays(dias);
    }

    public static LocalDate obterDataComDiferencaDias(Integer dias) {
        return adicionaDias(LocalDate.now(), dias);
    }

    public static LocalDate obterData(Integer dia, Integer mes, Integer ano) {
        return LocalDate.of(ano, mes, dia);
    }

    public static boolean ehMesmaData(LocalDate data1, LocalDate data2) {
        return data1.isEqual(data2);
    }

    public static boolean verificaDiaSemana(LocalDate data, DayOfWeek diaSemana) {
        return data.getDayOfWeek() == diaSemana;
    }
}
