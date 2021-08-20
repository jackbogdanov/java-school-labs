package data_lab;

import dk.brics.automaton.RegExp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateUtils {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd // HH:mm");


    public static String dateToString(LocalDateTime date) {
        return formatter.format(date);
    }

    public static LocalDateTime stringToDate(String str) {
        return LocalDateTime.parse(str, formatter);
    }
}
