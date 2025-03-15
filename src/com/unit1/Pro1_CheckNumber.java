package com.unit1;

import java.util.Scanner;

public class Pro1_CheckNumber {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner s= new Scanner(System.in);
        String name=s.nextLine();
        if (isNUmber(name)) {
            System.out.println("This is a Number ");
            System.out.println(name.getClass().getName());
        }
        else{
            System.out.println("This is String : "+name);
            System.out.println(name.getClass().getName());
        }
    }
    public static boolean isNUmber(String sn){
        if(sn==null || sn.isEmpty()){
            return false;
        }
        try{
            Integer.parseInt(sn);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
