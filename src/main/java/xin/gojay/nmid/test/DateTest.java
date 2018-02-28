package xin.gojay.nmid.test;

import java.sql.Timestamp;
import java.util.Date;

public class DateTest {
    private int YEAR;
    private int MONTH;
    private int DAY;
    private int HOUR;
    private int MINUTE;

    public DateTest(int year, int month, int day, int hour, int minute) {
        this.YEAR = year;
        this.MONTH = month;
        this.DAY = day;
        this.HOUR = hour;
        this.MINUTE = minute;
    }

    public static void main(String[] args) {
        DateTest dateTest = new DateTest(2018, 1, 30, 11, 01);
        String dateString = dateTest.YEAR + "-" + dateTest.MONTH + "-" + dateTest.DAY + " " + dateTest.HOUR + ":" + dateTest.MINUTE;
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println(date + "\n" + timestamp + "\n" + dateString);
    }
}