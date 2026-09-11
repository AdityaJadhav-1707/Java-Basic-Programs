package com.example;

public class PalindromeNo
{
    public static void main(String[] args)
    {
        int no = 12321;
        int temp = no;
        int revNo = 0;

        while (temp != 0)
        {
            int rem = temp % 10;
            revNo = revNo * 10  + rem;
            temp = temp / 10;
        }
        if (no == revNo)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
