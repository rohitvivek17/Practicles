package com.unit1;

import java.util.Scanner;

public class Pro_2_Artthmetic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Select ur Option: ");
        System.out.println("1-> area of circle | 2-> Quarditic Equation");
        int value=s.nextInt();
        if(value==1){
            System.out.println("Area of Circle \n Enter the radius value:");
            int r=s.nextInt();
            areaOfCircle(r);
        } else if (value==2) {
            System.out.println("Enter a,b,c values: ");
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            quardratic(a,b,c);
        }
    }
    public static void areaOfCircle(int r){
        System.out.println(2*3.14f*r*r);
    }

    public static void quardratic(int a,int b,int c) {
        if ((b * b - 4 * a * c) > 0) {
            double x1 = (-b + Math.sqrt((b * b - 4 * a * c))) / (2 * a);
            double x2 = (b + Math.sqrt((b * b - 4 * a * c))) / (2 * a);
            System.out.println("x1=" + x1 + " " + "x2=" + x2);
        }
        else{
            System.out.println("This Equation is invalid");
        }
    }
}
