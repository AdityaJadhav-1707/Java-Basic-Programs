package com.example;

public class ReverseNumber
{
	public static void main(String[] args)
	{
        int no = 1234;
        int revNo = 0;

        while (no != 0)
        {
            int rem = no % 10;
            revNo = revNo * 10 + rem;
            no = no / 10;
        }
        System.out.println("Reversed No is: " + revNo);

    }
}
