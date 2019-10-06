package com.godwije.app;

import com.godwije.algos.BasicStringSearch;

public class Algorithms {
    public static void main(String[] args) {
        String test = "I am started a new project";
        BasicStringSearch sch = new BasicStringSearch();
        if(sch.findString(test, "project")){
            System.out.println("String was found");
        }
    }
}
