package com.company;
public class Thread2 extends Thread
{
    public void run()
    {
        for(int i=1;i<11;i++){
            System.out.println("pass");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}