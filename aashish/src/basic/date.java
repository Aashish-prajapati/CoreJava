package basic;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
public class date {
	public static void main(String[] args) {
	
		/*Date today=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy/mm/dd");
		String str=format.format(today);
		System.out.println(str);
		
		SimpleDateFormat format1=new SimpleDateFormat("dd/mm/yyyy");
		String str1=format1.format(today);
		System.out.println(str1);
		
		Date pDate=format.parse("15/08/1947");
		System.out.println(pDate);*/
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1987, 9, 24);
		SimpleDateFormat format=new SimpleDateFormat("yyyy/mm/dd");
		String str=format.format(b);
		System.out.println(str);

		Period period = Period.between(birthday, today);

		//Now access the values as below
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getYears());


		System.out.println(today);
		
	}
}
