/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author CHINMAY
 */
public class Order {
    
    ArrayList<OrderItem>orderItemList;
    public Order() {
        this.orderItemList = new ArrayList<OrderItem>();
        
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
     public void addNewOrderItem(Product product,double price, int quality){
      OrderItem orderItem = new OrderItem(product, price,quality);
      orderItemList.add(orderItem);
              
     }}
