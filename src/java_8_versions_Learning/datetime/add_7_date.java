package java_8_versions_Learning.datetime;

import java.time.LocalDate;

public class add_7_date {
    public static void main(String[] args)
    {
        LocalDate date=LocalDate.now();
        LocalDate futureDate = date.plusDays(7);
        System.out.println(futureDate+"    "+ date);
    }
}
