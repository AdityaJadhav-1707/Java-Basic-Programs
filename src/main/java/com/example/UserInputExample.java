package com.example;

import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.next();

        System.out.print("Your Age is: ");
        int age = sc.nextInt();

        System.out.print("Your Fav Anime: ");
        String favAnime = sc.next();

        System.out.println("Your name is: " + name + "," +
                " your age is: " + age + ", your fav Anime is: " + favAnime);

        sc.close();

    }
}
