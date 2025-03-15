package com.unit1;

import java.util.Scanner;

public class Pro_5_NumberTostring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter the number: ");
        String n=s.nextLine();
        String res=strTonum(n);
        System.out.println(res);
    }
    public static String strTonum(String s){
        String num="";
        for(int i=0;i<s.length();i++){
            switch ((s.charAt(i))){
                case '1':
                    num +="ONE ";
                    break;
                case '2':
                    num +="TWO ";
                    break;
                case '3':
                    num +="Three ";
                    break;
                case '4':
                    num +="FOUR ";
                    break;
                case '5':
                    num +="Five ";
                    break;
                default:
                    System.out.println("Number is invalid");
                    break;
            }
        }
        return num;
    }
}
