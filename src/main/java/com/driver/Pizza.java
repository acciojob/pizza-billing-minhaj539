package com.driver;

public class Pizza {

    private int price,chPrice,tpPrice,bagPrice;
    private Boolean isVeg;

    private boolean cheese,topping,bag;
    private String bill;

    public Pizza(Boolean isVeg){
        this.cheese=false;
        this.topping=false;
        this.bag=false;
        this.isVeg = isVeg;
        this.chPrice=80;
        this.bagPrice=20;
        if(this.isVeg){
            this.price=300;
            this.tpPrice=70;
        }
        else{
            this.price=400;
            this.tpPrice=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(this.cheese==false) {
            this.price += this.chPrice;
            this.cheese=true;
        }
    }

    public void addExtraToppings(){
        if(this.topping==false) {
            if (isVeg) this.price += tpPrice;
            else this.price += tpPrice;
            this.topping=true;
        }
    }

    public void addTakeaway(){
        if(this.bag==false) {
            this.price += bagPrice;
            this.bag=true;
        }
    }

    public String getBill(){
      if(this.cheese==true){
          this.bill=this.bill+"Extra Cheese Added: "+this.chPrice+"\n";
      }
      if(this.topping==true){
          this.bill=this.bill+"Extra Toppings Added: "+this.tpPrice+"\n";
      }
      if(this.bag==true){
          this.bill=this.bill+"Paperbag Added: "+this.bagPrice+"\n";
      }
          this.bill=this.bill+ "Total Price: "+this.price+"\n";
        return this.bill;
    }
}
