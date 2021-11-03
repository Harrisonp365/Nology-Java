package com.nology;

import java.util.List;

//We are making sure that T is always a list
//These utils are similar to javaScript array utils
public class ListUtil<T extends List> {
    T list;

    public ListUtil(T list) {
        this.list = list;
    }

    public String join() {
        return join(",");
    }

    public String join(String seperator) {
        String output = "";
        for(int i = 0; i < list.size(); i++) {
            output += list.get(i).toString();
            if(i < list.size() - 1) {
                output += seperator;
            }
        }
        return output;
    }

}
