package com.godwije.algos;

import java.util.HashSet;
import java.util.Set;

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
