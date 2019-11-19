package practise_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.*;

public class Exercise_one {
    public static void sum(int num1,int num2){
        int num3 = num1+num2;
        System.out.println(num3);
        WebDriver driver = new ChromeDriver();
    }

    public void multiplcationtable(int i){
        for(int j=1;j<=10;j++){
            System.out.println(j+"*"+i+"="+(i*j));
        }
    }
    public void swap(int a, int b){
        int c = b;
        b = a;
        a=c;
        System.out.println(a+" "+b);
        System.out.println(System.getProperty("java.version"));
    }
    public void sumofinteger(int i){
        int sum=0;
        int r = 0;
        int j = 0;
        while(i!=0) {
            r = i % 10;
            sum = sum + r;
            i = i / 10;
        }
        System.out.println(sum);
    }
    public void stringreverse(String s){
//        System.out.println(s.length());

        String[] s1 = new String[s.length()];
//        System.out.println(s.charAt(2));
        for(int i=0;i<s.length();i++){
            s1[i] = String.valueOf(s.charAt(i));
        }
        for(int i=(s1.length-1);i>=0;i--){
            System.out.print(s1[i]);
        }
        System.out.println();
    }
    public void palindrome(int num1){
        int r = 0;
        int sum = 0;
        int num = num1;
        while(num!=0){
            r = num%10;
            sum = sum * 10 + r;
            num = num/10;
        }
        if(num1==sum){
            System.out.println("Number is palindrome");
        }
        else
            System.out.println("Not a palindrome");
    }
    public void factorial(int n){
        int s = 1;
        for(int i=n;i>0;i--){
            s=s*i;
        }
        System.out.println(s);
    }
    public void armstrongnumber(int t){
        int r = 0;
        int s = 0;
        int n = t;
        while(n!=0){
            r = n % 10;
            s = s+(r*r*r);
            n=n/10;
        }
        if(s==t){
            System.out.println("Armstrong number");
        }else
            System.out.println("Not Armstrong Number");
    }
    public int palindromestring(String s){
        int i =0;
        int j = s.length() -1;
        while (i<j) {
            if (s.charAt(i++) == s.charAt(j--)) {
                continue;
            } else {
                System.out.println("String is not palindrome");
                return 0;
            }
        }
        if(i==j || i>j) {
                System.out.println("String is palindrome");
        }
        return 1;
    }
    public void findlargestnumber(int num[]){
        int size = num.length;
        int a=0;
        for(int i=0;i<size;i++){
            if(num[i]>a){
                a = num[i];
            }

        }
        System.out.println("largest number = "+a);

    }
    public void sort(int num[]){
        int size=num.length;
        int temp=0;
//        System.out.println(num);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(num[i]>num[j]){
                   temp = num[i];
                   num[i]=num[j];
                   num[j]=temp;
                }
            }
        }
        System.out.println(num);
        for (int s:num) {
            System.out.println(s);
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

    }

    public void countofstring(String s){
        String sar[] = s.split(" ");
        int count = 1;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(Map.Entry e: hm.entrySet()){

        }
        for(String word : sar){
            if(hm.containsKey(word)){
                hm.put(word, hm.get(word)+1);
            }else
                hm.put(word, 1);
            System.out.println();
        }
        System.out.println(hm);
        for(String word: hm.keySet()){
            if(hm.get(word)>1){
                System.out.println(word+" "+ hm.get(word));
            }
        }

    }
    public void stringreverse() {
        int r[] = {0, 1, 0, 1, 0, 1, 1, 0, 0};
        int temp = 0;
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
                if (r[i] < r[j]) {
                    temp = r[i];
                    r[i] = r[j];
                    r[j] = temp;
                }
            }
        }
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
        }
        System.out.println("-----------------------------------");
        Arrays.sort(r);
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
        }
    }

    public void stringrev(String a){
        String ar="";
        for(int i=a.length()-1;i>=0;i--){
            ar=ar+a.charAt(i);
        }
        System.out.println(ar);
    }

    public void secondLargestNumber(int ar[]){
        int temp=0;
        int temp2=0;
        for(int i=0;i<ar.length;i++){
            if(temp<ar[i]){
                temp = ar[i];
            }
        }
        System.out.println(temp);
        for(int i=0;i<ar.length;i++){
            if(temp2<ar[i] && temp>ar[i]){
                temp2=ar[i];
            }
        }
        System.out.println(temp2);
    }

    public void duplicateString(String a){
     String ar[] = a.split(" ");
     int counter =1;
     Map<String, Integer> hm = new HashMap<String,Integer>();
     for(String s: ar){
         if(hm.containsKey(s)){
             hm.put(s,hm.get(s)+1);
         }
         else
             hm.put(s,1);
     }
        System.out.println(hm);
    }

    public static void main(String args[]){
//        System.out.println("Hello");
//        sum(10,20);
        Exercise_one obj = new Exercise_one();
//        obj.multiplcationtable(3);
//        obj.swap(10,3);
//        obj.sumofinteger(222);
//        obj.stringreverse("hel dfgf.");
//        obj.palindrome(1);
//        obj.factorial(3);
//        obj.armstrongnumber(153);
//        obj.palindromestring("my g ym");
//        int ar[] = {1,100, 265, 398789, 6, 4,7888,8};
//        obj.findlargestnumber(ar);
//        obj.sort(ar);
//        obj.countofstring("java is java not java mafa java");
//        int a = 10;
//        int b=20;
//        String c = "test";
//        System.out.println(a+b+c+a+b+a+b+a+b);
//        System.out.println("asdj"+a+b+c+a+b+a+b+a+b);
//        String sd = " ";
//        System.out.println(Boolean.parseBoolean(sd));`
//          obj.stringreverse();
//          obj.duplicateString("java hi java hello");
//          obj.stringrev("ashok kumar");
          obj.secondLargestNumber(new int[]{1, 2, 15, 3, 7, 9});
    }
}
