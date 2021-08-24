package lab8;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlackFridayService {

    public static void printBlackFridayPerYearSorted(int startYear, int endYear) {

        LocalDate startDate = LocalDate.of(startYear, 1, 13);
        LocalDate endDate = LocalDate.of(endYear + 1, 1, 1);

        Stream.iterate(startDate, localDate -> localDate.isBefore(endDate), localDate -> localDate.plusMonths(1))
                .filter(localDate -> localDate.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((y1, y2) -> (int) (y2.getValue() - y1.getValue()))
                .forEachOrdered(System.out::println);
    }

    public static void main(String[] args) {
        printBlackFridayPerYearSorted(1999, 2021);
    }
}