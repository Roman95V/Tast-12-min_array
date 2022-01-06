package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,7,9,11,13,15,17,19};
        int min = array[0];
        for(int num : array){
            if(num<min){
                min=num;
            }
        }
        System.out.println("Min: " + min);
    }
}
