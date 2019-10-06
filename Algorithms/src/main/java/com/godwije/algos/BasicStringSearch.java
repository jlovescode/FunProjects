package com.godwije.algos;

public class BasicStringSearch {
    public Boolean findString(String largeString, String target){
        String[] sts = largeString.split("\\s");
        for(String st: sts) {
            if(st.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
