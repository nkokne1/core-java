package com.Menu.Categories;

public class Beverages extends Category {

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void chooseItem() {

        System.out.println("The item choosen is : " + getName());

    }

    public void setName()
    {
        this.name = "Beverages";
    }
}
