package com.example;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        // using 3rd variable(temp)

//        int no1 = 10, no2 = 20;
//        int temp = no1;
//        no1 = no2;
//        no2 = temp;
//
//        System.out.println("no1 : "+no1);
//        System.out.println("no2 : "+no2);

        // without using 3rd variable

        int no1 = 10, no2 = 20;

        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;

        System.out.println("No1: " + no1);
        System.out.println("No2: " + no2);

    }
}



