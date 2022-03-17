package com.JavaAPI.API.Model;

public class Article {
    private Integer ean;
    private String name;
    private Integer stock;
    private Integer minStock;
    private double price;
    private String date;
    private boolean orderStatus;

    public Article() {
    }

    public Article(Integer ean, String name, Integer stock, Integer minStock, double price, String date, boolean orderStatus) {
        this.ean = ean;
        this.name = name;
        this.stock = stock;
        this.minStock = minStock;
        this.price = price;
        this.date = date;
        this.orderStatus = orderStatus;
    }

    public Integer getEan() {
        return ean;
    }

    public String getName() {
        return name;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public boolean getOrderStatus() {
        return orderStatus;
    }

    public void setEan(Integer ean) {
        this.ean = ean;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }
}
