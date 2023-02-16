package date16022023.datemethods;

import java.util.Date;

class CalendarPointer
{
    private Date datePointer = null;

    CalendarPointer()
    {
        datePointer = new Date();
    }

    CalendarPointer(long timeSinceEpoch)
    {
        datePointer = new Date(timeSinceEpoch);
    }

    CalendarPointer(int date, int month, int year)
    {
        datePointer = new Date(year, month, date);
    }

    Date getDatePointer()
    {
        return datePointer;
    }

    String getDatePointerString()
    {
        return datePointer.toString();
    }
}

public class DateConstructors
{
    public static void main(String[] args)
    {
        CalendarPointer calendarPointer = new CalendarPointer();

        CalendarPointer calendarPointer1 = new CalendarPointer(17, 1, 123);

        CalendarPointer calendarPointer2 = new CalendarPointer(1918168295837l);

        System.out.println("Current Date Pointer : " + calendarPointer.getDatePointerString());

        System.out.println("Custom Date with (yyyy,mm,dd) : " + calendarPointer1.getDatePointerString());

        System.out.println("Custom Date with (epoch time) : " + calendarPointer2.getDatePointerString());

        Date datePointer = calendarPointer1.getDatePointer();

        System.out.println(datePointer);
    }

}
