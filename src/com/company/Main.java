package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,1,1,3,5,7,9,11,13,15,17,19};
        int min = array[0];
        System.out.println("Min values in array:");
        for(int num : array){
            if(num<min){
                min=num;
            }
        }
        for (int j = 0; j< array.length; j++) {
            if (min == array[j])
                System.out.print(array[j] + ", ");
        }
    }
}
