package com.company;
import java.io.BufferedReader;
import java.io.FileReader;

public class CountWordFile {
    public static void main(String[] args) throws Exception{
        String line;
        int count=0;

        //Opens a file in read mode
        FileReader file=new FileReader("data.txt");
        BufferedReader br=new BufferedReader(file);

        //gets each line till end of file is reached
        while ((line = br.readLine()) != null){

            String words[]=line.split(""); //splits each line into words
            count=count+words.length;           //counts each word
        }

        System.out.println("NUmber of Words Present in given file:"+count);
        br.close();

    }
}
