package com.testframework;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        String a = "hi helo how are u was.";
        String ar[] = a.split(" ");
        if(ar[ar.length-1].contains(".")){
            String arr = ar[ar.length-1].substring(3);
            ar[ar.length-1] = arr+ar[ar.length-1].substring(0,3);
            System.out.println(ar[ar.length-1]);
        }
        String ex ="";
        for(int i=ar.length-1;i>=0;i--){
            System.out.print(ar[i]+" ");
        }

    }
}
