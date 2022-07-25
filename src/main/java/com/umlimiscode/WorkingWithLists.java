package com.umlimiscode;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
       List<String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );
     //  colorsUnmodifiable.add("pink"); Code wont run


        List<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("purple");
        colours.add("yellow");
        System.out.println(colours);
        System.out.println(colours.size());
        System.out.println(colours.contains("yellow"));
        System.out.println(colours.contains("pink"));

        for(String color : colours){
            System.out.println(color);
        }

        colours.forEach(System.out::println);

        for(int i = 0; i < colours.size(); i++){
            System.out.println(colours.get(i));
        }
    }
}
