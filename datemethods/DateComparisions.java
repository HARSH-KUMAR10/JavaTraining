package date16022023.datemethods;

import java.util.Date;
import java.util.Scanner;

class DateManipulations extends CalendarPointer{
    DateManipulations(){
        super();
    }
    DateManipulations(int d,int m,int y){
        super(d,m,y);
    }
    String getDayOfWeek(){
        switch(getDatePointer().getDay()){
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        };
        return "Day not found";
    }
}

public class DateComparisions
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter dd/mm/yyyy (q to quit): ");
            String dateInput = sc.nextLine();
            if(dateInput.equals("q")){
                System.out.println("Thanks you");
                break;
            }
            String[] dateInputSplit = dateInput.split("/");
            if (dateInputSplit.length != 3)
            {
                System.out.println("Date should follow format dd/mm/yyyy");
                continue;
            }
            int year, month, date;
            date = Integer.parseInt(dateInputSplit[0]);
            month = Integer.parseInt(dateInputSplit[1]);
            year = Integer.parseInt(dateInputSplit[2]);
            DateManipulations dateManipulations = new DateManipulations(date, month-1, year-1900);
            System.out.println("On " + dateManipulations.getDatePointerString() + " it was " + dateManipulations.getDayOfWeek());
            System.out.println("==================================================================");
        }
    }

}
