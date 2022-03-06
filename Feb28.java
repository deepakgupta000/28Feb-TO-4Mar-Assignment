package com.date28To4Mar;


	import java.util.Scanner;

	public class Feb28<G> {
	    static int getSum(int n)
	    {
	        int sum = 0;
	        while (n != 0) {
	            sum = sum + n % 10;
	            n = n / 10;
	        }
	        return sum;
	    }

	    static int main(){
	        int num , count = 100 , rem , sum ;
	        while (count<=500){
	            num = count ;
	            sum = 0;

	            while (num){
	                rem = num % 10;
	                sum = sum + (rem*rem*rem);
	                num = num/10;
	            }
	            if(count == sum){
	                System.out.println("%d is a Armstrong number \n " + count);
	            }
	            count++;
	        }
	        return 0;
	    }


	    public static void main(String[] args) {
	       
	        //Take as input a fraction in the form a/b. Convert the same into lowest terms and print. (Lowest terms examples 3/12 = 1/4).
	        Scanner scan = new Scanner(System.in);
	        int numerator, denominator;
	        System.out.println("Enter numerator:- ");
	        numerator = scan.nextInt();
	        System.out.println("Enter denominator:- ");      // Input from user
	        denominator = scan.nextInt();

	        int a, b, lowest, t;
	        if (numerator > denominator) {
	            a = numerator;
	            b = denominator;
	        } else {
	            b = denominator;
	            a = numerator;
	        }
	        while (b != 0) {
	            t = b;
	            b = a % b;
	            a = t;
	        }
	        lowest = a;

	        System.out.println("In lowest form = " + numerator / lowest + "/" + denominator / lowest);


	        // // 2.Calculate the sum of digits of a number given by user. E.g.-
	        int n;
	        System.out.println("Enter number for sum - ");
	        n = scan.nextInt();
	        System.out.println(getSum(n));

	        //4.Write a program to print all prime number in between 1 to 100.

	        int K = 0, Y = 0, i = 1, j = 1;
	        System.out.println("The prime numbers are ");
	        while (Y < 25) {
	            j = 1;
	            K = 0;
	            while (j <= i) {
	                if (i % j == 0)
	                    K++;
	                j++;
	            }
	            if (K == 2) {
	                System.out.println(i);
	                Y++;
	            }
	            i++;
	        }

	        //5.Write a program to find prime factor of a number.
	        int x, z, v, p = 0;
	        System.out.println("enter the number ");
	        x = scan.nextInt();
	        System.out.println("Prime factor of " + x + "are: ");

	        for (z = 2; z <= x; z++) {
	            if (x % z == 0) {
	                for (v = 2; v < z; v++) {
	                    if (z % v == 0) {
	                        p++;
	                        break;
	                    }
	                }
	                if (p == 0) {
	                    System.out.println(z);
	                }
	            }
	        }
	        
	        /*6.Write a program in java to find the sum of the even and odd digits of the number which is given as input.*/
	        
	        int G, sumE = 0;
	        int sum0 = 0;
	        System.out.println("Enter the number of elements in array: ");
	        G = scan.nextInt();
	        int[] a1 = new int[G];
	        System.out.println("Enter the element of the array : ");
	        for (int R = 0; R < G; R++) {
	            a1[R] = scan.nextInt();
	        }
	        for (int R = 0; R < G; R++) {
	            if (a1[R] % 2 == 0) {

	                sumE = sum0 + a1[R];
	            } else {
	                sum0 = sum0 + a1[R];
	            }
	        }
	        System.out.println("Sum of even number is " + sumE);
	        System.out.println("Sum of odd number is " + sum0);
	    }
	}


