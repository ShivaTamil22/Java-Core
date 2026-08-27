import java.util.Calendar;
import java.util.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Day4 {
    public static void main(String[] args) {

        // Date today = new Date();
        // System.out.println(today);

        // // // Localdate
        // LocalDate date = LocalDate.now();
        // System.out.println(date);
        // System.out.println(date.getDayOfMonth() + "th Day");
        // System.out.println("Month : "+date.getMonth());
        // System.out.println("Month : " +date.getMonthValue() );
        // System.out.println("Year :" +date.getYear());
        // System.out.println("Day : " + date.getDayOfWeek());
        // System.out.println("Add Days :" +date.plusDays(20));
        // System.out.println("minus Days :" +date.minusDays(20));
        // System.out.println("Add Months :" +date.plusMonths(2));
        // System.out.println("Minus Months :" +date.minusMonths(2));
        // System.out.println("Add Years :" +date.plusYears(2));
        // System.out.println("Minus years :" +date.minusYears(2));

        // LocalDate dob = LocalDate.of(2004, 11, 22);
        // System.out.println(dob);

        // LocalTime

        // LocalTime time = LocalTime.now();
        // System.out.println(time);
        // System.out.println("Hour : " + time.getHour());
        // System.out.println("Minute : " + time.getMinute());
        // System.out.println("Second : "+ time.getSecond());

        // System.out.println("Plus Hour : " + time.plusHours(2));
        // System.out.println("Plus Minute : " + time.plusMinutes(10));
        // System.out.println("Plus Second : "+ time.plusSeconds(10));

        // System.out.println("minus Hour : " + time.minusHours(2));
        // System.out.println("minus Minute : " + time.minusMinutes(10));
        // System.out.println("minus Second : "+ time.minusSeconds(10));

        // LocalDateTime

        // LocalDateTime today = LocalDateTime.now();
        // System.out.println(today);
        // System.out.println(today.getDayOfMonth());
        // System.out.println(today.getMonthValue());
        // System.out.println(today.getYear());
        // System.out.println(today.getHour()) ;
        // System.out.println(today.getMinute());
        // System.out.println(today.getSecond());

        // LocalDateTime date1= LocalDateTime.of(2004, 11, 22, 5 , 30 );
        // LocalDateTime date2 = LocalDateTime.of(2004,7,5,7,30);

        // System.out.println(date1.compareTo(date2));
        // System.out.println(date1.isAfter(date2));
        // System.out.println(date1.isEqual(date2));
        // System.out.println(date1.isBefore(date2));   

        // DateTimeFormatter

        // LocalDateTime today = LocalDateTime.now();

        // DateTimeFormatter form = DateTimeFormatter.ofPattern(" dd-MM-yyyy hh:mm:ss a");
        // System.out.println(today.format(form));
        // DateTimeFormatter form1 = DateTimeFormatter.ofPattern(" EEEE dd-MM-yyyy hh:mm:ss a");
        // System.out.println(today.format(form1));

        // Period 

        // LocalDate start = LocalDate.of(2004,11,22);
        // LocalDate end = LocalDate.now();
        // Period age   = Period.between(start,end);
        // System.out.println(age.getYears());
        
        // Duration
        // LocalTime T1 = LocalTime.of(2,30);
        // LocalTime T2 = LocalTime.of(12,30);
        // Duration time = Duration.between(T1,T2);
        // System.out.println(time.toHours());
        // System.out.println(time.toMinutes());

        // Calener
        // Calendar today = Calendar.getInstance();
        // System.out.println(today.get(Calendar.YEAR));
        // System.out.println(today.get(Calendar.MONTH));
        // System.out.println(today.get(Calendar.DAY_OF_MONTH));
        // System.out.println(today.get(Calendar.DAY_OF_WEEK));
        // System.out.println(today.get(Calendar.HOUR));
        // System.out.println(today.get(Calendar.MINUTE));

        Calendar today = Calendar.getInstance();
        // today.set(2004,11,22);
        // System.out.println(today.getTime());
        today.add(Calendar.DAY_OF_MONTH,10);
        System.out.println(today.getTime());



       




    }
}