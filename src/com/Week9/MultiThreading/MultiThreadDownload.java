package com.Week9.MultiThreading;

public class MultiThreadDownload {
    public static void main(String[] args) {
        Download file1 =new Download("file1");
        Download file2 =new Download("file2");
        Download file3 =new Download("file3");

        file1.start();
        file2.start();
        file3.start();
    }
}

class Download extends Thread{
    String fileName;
    Download(String fileName){
        this.fileName=fileName;
    }

    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(fileName + " downloading "+ (i*20)+"%");
                Thread.sleep(1000);


            }
            System.out.println(fileName + " downloading completed");
        }catch(Exception e){
            System.out.println("Error Downloading");
        }
    }
}