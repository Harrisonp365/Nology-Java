package com.nology;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	Nvidia rtx3090 = new Nvidia(4000);
	AMDCard amd6800 = new AMDCard(1000);
	AMDCard amd6900 = new AMDCard(1799);

	Catalogue<Product> catalogue = new Catalogue<>();
	catalogue.add(new Nvidia(2000)); // add new item inline
	catalogue.add(rtx3090);
	catalogue.add(amd6800);
	catalogue.add(amd6900);

	System.out.println("Total price of products $" + catalogue.calculateTotal());
    }
}
