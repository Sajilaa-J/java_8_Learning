package java_8_versions_Learning.datetime;

import java.time.LocalDate;
import java.time.Period;

public class diffrence_btw_dates {
    public static void main(String[] args)
    {
        LocalDate date1 = LocalDate.of(2020, 5, 10);
        LocalDate date2 = LocalDate.of(2025, 9, 4);

        Period diff = Period.between(date1, date2);

        System.out.println("Difference: "
                + diff.getYears() + " years, "
                + diff.getMonths() + " months, "
                + diff.getDays() + " days");
    }
}
