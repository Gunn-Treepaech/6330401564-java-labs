package treeechan.treepaech.test;

import treeechan.treepaech.lab10.PlayerFormV8;
import treeechan.treepaech.lab11.PlayerFormV9;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test01  {
    protected String string;
    public static void main(String[] args) {
        int i = 0;
        while (i <= 15){
            System.out.println((i % 2 == 0 ? "***" : "-----"));
            i++;
        }
    }

}
