package Recursion;

import java.util.Scanner;

public class revdigit {

    static int sum =0;
    private static void rev1(int n){
        if(n==0)
            return ;
        int rev = n%10;
        sum = sum *10 + rev;
        rev1(n/10);
    }

    private static int rev2(int n){
        int digit = (int) Math.log10(n) + 1;// count Number of zeroes
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if(n % 10 == n)
            return n;
        int rem = n%10;
        return rem * (int)Math.pow(10,digit-1) + helper(n/10, digit-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n =sc.nextInt();
        rev1(n);
        System.out.println("By rev1");
        System.out.println(sum);


        System.out.println("By rev2");
        System.out.println(rev2(n));
    }
}
