package com.Menu.Specials;

public class skillets extends specials {

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
        this.name = "Skillets";
    }
}
