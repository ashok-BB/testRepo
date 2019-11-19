package com.testframework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class cons {
    public static void main(String[] args) {
        int r[] = {0,1,0,1,0,1,1,0,0};
        int temp=0;
        for(int i=0;i<r.length;i++) {
            for (int j = 0; j < r.length; j++) {
                if (r[i] < r[j]) {
                    temp = r[i];
                    r[i] = r[j];
                    r[j] = temp;
                }
            }
        }
        for(int i=0;i<r.length;i++) {
                System.out.print(r[i]);
        }
        System.out.println("-----------------------------------");
        Arrays.sort(r);
        for(int i=0;i<r.length;i++) {
            System.out.print(r[i]);
        }
    }

}
