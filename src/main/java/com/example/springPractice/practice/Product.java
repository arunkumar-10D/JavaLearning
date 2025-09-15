package com.example.springPractice.practice;

public class Product {
    String name;
    double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public void showDetails() {
        System.out.println("Product: " + name + ", Price: " + price);
    }


    public double calculateTotal(int quantity) {
        return price * quantity;
    }

    public double calculateTotal(int quantity, double discount) {
        return (price * quantity) - discount;
    }
}

class Order extends Product {
    int orderId;


    public Order(int orderId, String name, double price) {
        super(name, price);
        this.orderId = orderId;
    }


    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Order ID: " + orderId);
    }
}

