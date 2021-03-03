package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
    public class AgeCalculator{
        public static void main(String[] args)throws Exception{

            //read inputs
            Scanner sc=new Scanner(System.in);
            System.out.println("enter date of birth(DD-MM-YYYY)");
            String dob=sc.next();

            //convert String date value to  java.util.class object
            SimpleDateFormat sdf1=new SimpleDateFormat("dd-mm-yyyy");
            Date udob=sdf1.parse(dob);

            //get system date
            Date sysdate=new Date();

            //calcuate age
            long ms=System.currentTimeMillis()-udob.getTime();
            long age=(long)((long)ms/(1000.0*60*60*24*365));
            System.out.println("your current age is "+age);
        }
    }

