package com.company;

public class ReverseNumber {
    public static void main(String[] args){
        int num = 1236782;
        int reversNum=0;
        while ( num !=0){

            reversNum = reversNum * 10;
            reversNum = reversNum + num%10;
            num = num/10;
        }
        System.out.println("Reverse Number is "+reversNum);
    }
}


