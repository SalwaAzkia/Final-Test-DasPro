package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class DateFormatter {
    public static String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        return "Date: " + formatter.format(date) + "  " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}