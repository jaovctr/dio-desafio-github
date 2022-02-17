package com.dio;

import com.dio.base.Order;

public class MyFirstProgram{
    public static void main(String[] args) {
        //Ordem padrão
        final Order order = new Order("code1234", 99);
        double total=order.calculatefee();
        System.out.println(order + "\n total:" + total );
        //Ordem com 100
        final Order order2 = new Order("code5678", 100);
        total=order2.calculatefee();
        System.out.println(order2 + "\n total:" + total ); 
        //Ordem com 200
        final Order order3 = new Order("code9012", 200);
        total=order3.calculatefee();
        System.out.println(order3 + "\n total:" + total );

    }
}