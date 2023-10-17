package com.systex.customLibrary;

import java.util.Random;

public class MathUtils {
    public static void main(String[] args) {

    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int multi(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static  String generateCaptcha(){
        char charr[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for(int x =0; x<5;++x){
            sb.append(charr[r.nextInt(charr.length)]);
        }
        return  sb.toString();

    }


}
