package TestDateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar  c = new GregorianCalendar();
//		c.set(2001, Calendar.FEBRUARY, 10, 12, 23, 34);
        c.set(2018,2,5);
		//		c.set(Calendar.YEAR, 2001);
//		c.set(Calendar.MONTH, 1);   //二月
//		c.set(Calendar.DATE, 10);
		
//		c.setTime(new Date());
		
		Date d = c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR)); 
		
		//测试日期计算
		c.add(Calendar.MONTH, 3);
		Date d2=c.getTime();
		DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
		String str=df.format(d2);
		System.out.println(str);
	}
}
