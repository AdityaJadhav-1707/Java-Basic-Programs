package com.example;

public class CheckPrimeNo
{
	public static void main(String[] args)
	{
		int no = 69;
		 if (no <= 1)
		 {
			 System.out.println("Not Prime No");
			 return;
		 }
		 boolean isPrime = true;
		 for (int i = 2; i < no; i++)
		 {
			 if (no % i == 0)
			 {
				 isPrime = false;
				 break;
			 }

		 }
		 if (isPrime)
		 {
			 System.out.println(no +" is Prime No");
		 }
		 else
		 {
			 System.out.println(no+" is Not Prime No");
		 }

    }
}
