package com.testframework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestImpl extends test {

    public TestImpl(){
        super();
        System.out.println("child cons");
    }
    public static void main(String ar[]){
        cons s = new cons();
    }
}
