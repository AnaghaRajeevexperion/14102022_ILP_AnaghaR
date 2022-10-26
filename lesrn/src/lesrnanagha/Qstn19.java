package lesrnanagha;

import java.time.LocalDate;
import java.time.Period;

public class Qstn19
{
	static void findDifference(LocalDate start_date,LocalDate end_date)
 {

     Period diff = Period.between(start_date,end_date);
     System.out.print( "Difference "+ "between two dates is: ");

     System.out.printf( "%d years, %d months" + " and %d days ", diff.getYears(), diff.getMonths(), diff.getDays());
 }


 public static void main(String[] args)
 {
     
     LocalDate start_date
         = LocalDate.of(2018, 07, 16);

     LocalDate end_date
         = LocalDate.of(2020, 06, 10);

     findDifference(start_date,end_date);
 
	}

}
