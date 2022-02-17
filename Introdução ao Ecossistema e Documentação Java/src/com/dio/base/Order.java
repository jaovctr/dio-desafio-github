package com.dio.base;


public class Order {
    private final String code;
    private final int totalValue;

    public Order(String code, int totalValue){
        this.code=code;
        this.totalValue=totalValue;
    }

    @Override
    public String toString(){
        return "Order={code='" + code + "'}";

    }


    public double calculatefee(){
        if (this.totalValue >100 ){
            switch(this.totalValue){
                case 100:
                    return this.totalValue * 0.99;        
                case 200:
                    return this.totalValue * 1.99;
                default:
                    return this.totalValue;    
            }
        }else{
            return this.totalValue;
        }
    }
}
