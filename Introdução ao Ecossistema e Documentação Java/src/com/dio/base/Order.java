package com.dio.base;

/**
 * @author jaovctr
 * @version 1.3
 * @since 1.0
 */

public class Order {
    private final String code;
    private final int totalValue;
    private String[] items; 

    /**
     * 
     * Construtor
     * @param code código do pedido
     * @param totalValue valor do pedido
     * @param items itens do pedido
     */
    public Order(String code, int totalValue, String[] items){
        this.code=code;
        this.totalValue=totalValue;
        this.items=items;
    }

    @Override
    public String toString(){
        return "Order={code='" + code + "'}";

    }

    /**
     * Exemplos de condicionais
     */
    /**
     *  
     * @return Valor do pedido com o cálculo das taxas
     */
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

    /**
     * Exemplos de laço de repetição
     */

    /**
     * Imprime os itens da lista
    */ 
    
    public void printItemsWhile(){
        int i=0;
        while(i<items.length){
            System.out.println(items[i]);
            i++;
        }
    }

    public void printItemsDoWhile(){
        int i=0;
        do{
            System.out.println(items[i]);
            i++;
        }while(i<items.length);
    }

    public void printItemsFor(){
        for(int i=0;i<items.length;i++){
            System.out.println(items[i]);
        }
    }

    public void printItemsEnhancedFor(){
        for(String i: items){
            System.out.println(i);
        }
    }
}
