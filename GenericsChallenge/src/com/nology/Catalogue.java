package com.nology;
import java.util.ArrayList;

public class Catalogue <T extends Product> {
    ArrayList<T> collection;

    public Catalogue() { this.collection = new ArrayList<T>(); }
    public void add(T products) { collection.add(products); }

    public double calculateTotal() {
        double total = 0;
        for(int i = 0; i < collection.size(); i++) {
            if(collection.get(i) instanceof Nvidia)
                total += collection.get(i).calcRTXTax();
             else
                total += collection.get(i).calculateTax();
        }
        return total;
    }
}