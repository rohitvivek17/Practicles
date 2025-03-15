package com.unit1;

public class Pro_4_StringExe {
    public static void main(String[] args) {
        String name="rohitvivek17@gmail.com";
        System.out.println("Length: "+name.length());
        System.out.println("User name: "+name.substring(0,name.indexOf('@')));
        System.out.println("Reverse String using Char At:  "+reverse(name));
        System.out.println("Revrse String Buffer: "+rev1(name));
        sep_email(name);
    }
    public static String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public static StringBuffer rev1(String s){
        StringBuffer s1=new StringBuffer(s).reverse();
        return s1;
    }
    public static void sep_email(String s){
        if(s.indexOf('@')>0){
            System.out.println("User Name: "+s.substring(0,s.indexOf('@'))+"\n " +
                    "Service Provider: "+s.substring(s.indexOf('@')+1,s.lastIndexOf('.'))+"\n" +
                    " Domain : "+s.substring(s.lastIndexOf('.')+1));
        }
        else {
            System.out.println("This is not a email id");
        }
    }
}
