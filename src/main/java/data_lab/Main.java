package data_lab;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {


        LocalDateTime date = LocalDateTime.now();

        String str = DateUtils.dateToString(date);

        System.out.println(str);
        System.out.println(DateUtils.stringToDate(str));

    }
}
