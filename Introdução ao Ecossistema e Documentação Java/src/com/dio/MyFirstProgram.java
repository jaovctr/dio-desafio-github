package com.dio;

import com.dio.base.Order;

/**
 * @author jaovctr
 * @version 1.3
 * @since 1.0
 * @see Order
 */

public class MyFirstProgram{
    public static void main(String[] args) {
        //Ordem padrão
        String[] items = {"Mouse", "Teclado"};
        final Order order = new Order("code1234", 99, items);
        double total=order.calculatefee();
        System.out.println(order + "\ntotal:" + total );
        order.printItemsWhile();
        System.out.println("\n");

        //Ordem com 100
        String[] items2 = {"Mouse", "Teclado", "Monitor"};
        final Order order2 = new Order("code5678", 100, items2);
        total=order2.calculatefee();
        System.out.println(order2 + "\n total:" + total );
        order2.printItemsDoWhile();
        System.out.println("\n");

        //Ordem com 200
        String[] items3 = {"Mouse", "Teclado", "Monitor", "Desktop"};
        final Order order3 = new Order("code9012", 200, items3);
        total=order3.calculatefee();
        System.out.println(order3 + "\n total:" + total );
        order3.printItemsFor();
        System.out.println("\n");
        order3.printItemsEnhancedFor();

        

    }
}