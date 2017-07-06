package com.ahsanburney;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(factorial(3));
    }

    public static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
}
