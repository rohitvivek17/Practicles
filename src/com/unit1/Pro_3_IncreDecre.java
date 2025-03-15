package com.unit1;

import java.util.Scanner;

public class Pro_3_IncreDecre {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int a=s.nextInt();
        System.out.println("Post Increment: "+(a++));
        System.out.println(a);
        System.out.println("Pre Incremnet: "+(++a));
        System.out.println(a);
    }
}
