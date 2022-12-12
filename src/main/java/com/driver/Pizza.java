package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;

    private boolean cheese,topping,bag;
    private String bill;

    public Pizza(Boolean isVeg){
        this.cheese=false;
        this.topping=false;
        this.bag=false;
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
        }
        else{
            this.price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(cheese==false) {
            price += 80;
            cheese=true;
        }
    }

    public void addExtraToppings(){
        if(topping==false) {
            if (isVeg) price += 70;
            else price += 120;
            topping=true;
        }
    }

    public void addTakeaway(){
        if(bag==false) {
            price += 20;
            bag=true;
        }
    }

    public String getBill(){
        bill=String.valueOf(price);
        return this.bill;
    }
}
