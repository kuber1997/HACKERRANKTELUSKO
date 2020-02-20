package com.infogain.hackerrank;

import java.util.Scanner;

public class fibnocai 
{ 
    static long fib(long n) 
    { 
        long a = 0, b = 1, c; 
        if (n == 0) 
            return a; 
        for (long i = 2; i <= n; i++) 
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        return b; 
    } 
  
    public static void main (String args[]) 
    { 
        long n =1000000000; 
        System.out.println(fib(n)); 
    } 
} 

