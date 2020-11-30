package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a= new int[10];
        for (int i=0;i<10;i++)
            a[i]=10-i;
        int s=0;
        for (int i=0;i<10;i++)
            s+=a[i];
        int i=0;
        System.out.println(s);
        s=0;
        while (i<10){
            s+=a[i];
            i++;
        }
        i=0;
        System.out.println(s);
        s=0;
        do {
            s+=a[i];
            i++;
        }while (i<10);
        System.out.println(s);
    }
}
