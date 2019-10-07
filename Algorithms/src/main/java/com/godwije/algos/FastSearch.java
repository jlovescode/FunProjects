package com.godwije.algos;

import java.util.HashSet;
import java.util.Set;

//For just one search this will not be that faster but for multiple searches this is faster
//It uses a set to store the strings for fast searching
public class FastSearch {
    // fast Search is faster
    private Set<String> set;
    public FastSearch(){
        set=new HashSet<>();
    }
    public void addString(String string){
        String[] sts = string.split("\\s");
        for(String st: sts) {
            set.add(st);
        }
    }

    public boolean findString(String target){
        return set.contains(target);
    }
}
