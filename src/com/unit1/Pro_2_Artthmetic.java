package com.unit1;

import java.util.Scanner;

public class Pro_2_Artthmetic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Select ur Option: ");
        System.out.println("1-> area of circle");
        int value=s.nextInt();
        if(value==1){
            System.out.println("Area of Circle");
            System.out.println("Enter the radius value: ");
            int r=s.nextInt();
            areaOfCircle(r);
        }
    }
    public static void areaOfCircle(int r){
        System.out.println(2*3.14f*r*r);
    }
}
