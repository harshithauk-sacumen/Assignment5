package com.company;
import java.io.*;

public class Age {
    static void findAge(int currentdate,int currentmonth,int currentyear,int birthdate,int birthmonth,int birthyear){
        int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(birthdate>currentdate){
            currentmonth=currentmonth-1;
            currentdate=currentdate+month[birthmonth-1];
        }
        if(birthdate>currentmonth){
            currentyear=currentyear-1;
            currentmonth=currentmonth+12;
        }
        // calculate date, month, year
        int calculated_date = currentdate - birthdate;
        int calculated_month = currentmonth - birthmonth;
        int calculated_year = currentyear - birthyear;

        // print the present age
        System.out.println("Present Age");
        System.out.println("Years: " + calculated_year + " Months: " + calculated_month + " Days: " + calculated_date);
    }
    public static void main(String[] args)
    {
        // present date
        int currentdate = 3;
        int currentmonth = 3;
        int currentyear = 2021;

        // birth dd// mm// yyyy
        int birthdate = 06;
        int birthmonth = 05;
        int birthyear = 1998;

        // function call to print age
        findAge(currentdate, currentmonth, currentyear, birthdate, birthmonth, birthyear);

    }
}
