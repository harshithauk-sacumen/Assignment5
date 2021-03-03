package com.company;
import java.io.*;
public class NullPointer {
    public static void main(String[] args){
        //Initializing String Variable with null value
        String ptr=null;
        String a="harshi";
        //Checking if ptr.equals null or works fine
        try{
            //this line of code throws NullPointerException because ptr is null
            if(a.equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e){
            System.out.print("NullPointerException Caught");
        }

    }
}
