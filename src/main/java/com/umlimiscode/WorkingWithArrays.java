package com.umlimiscode;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colours = new String[5];
        colours[0] = "purple";
        colours[1] = "blue";


        System.out.println(Arrays.toString(colours));

        System.out.println(colours[0]);
        System.out.println(colours[1]);
        System.out.println(colours[2]);
        System.out.println(colours[3]);
        System.out.println(colours[4]);

        colours[2] = "yellow";

        System.out.println(Arrays.toString(colours));

        int[] numbers = {100,200};

        //Loop through arrays increment
        for( int i = 0 ; i< colours.length; i++){
            System.out.println(colours[i]);
        }
//decrement
        for(int i = colours.length -1; i >= 0; i-- ){
            System.out.println(colours[i]);
        }

        System.out.println(colours.length);

        //enhanced for loop
        for(String color: colours){
            System.out.println(color);
        }
        Arrays.stream(colours).forEach(System.out::println);//method reference using consumer @FunctionalInterface

    }
}
