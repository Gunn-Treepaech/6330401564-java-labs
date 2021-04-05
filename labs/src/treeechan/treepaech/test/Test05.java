package treeechan.treepaech.test;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Test05 {
    protected static JList<String> listDay = new JList<String>();


    public static void main(String[] args) {
        listDay.getSelectedValue();
        ArrayList<String> testDay = new ArrayList<String>(0);
        testDay.add("1");
        testDay.add("2");
        String day = findDay(6, 12,2001);
        System.out.println(day);
        System.out.println(Arrays.toString(testDay.toArray()));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
    }
    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        return dayOfWeek.toString();
    }
}
