package com.company.model;

public class Shirt extends ClothingItem{
    public Shirt(ClothingSize size, double price, int quantity) {
        super(ClothingItem.SHIRT, size, price, quantity);
    }
    @Override
    public String getType() {
        return "Shirt";
    }
}
