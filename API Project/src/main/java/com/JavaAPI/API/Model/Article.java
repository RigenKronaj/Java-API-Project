package com.JavaAPI.API.Model;

/**
 * This is the article class; it describes the attributes of each article for sale</br>
 */
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

    
    /** 
     * @return Integer</br>
     * 
     * Returns the value of the ean attribute
     */
    public Integer getEan() {
        return ean;
    }

    
    /** 
     * @return String</br>
     * 
     * Returns the value of the name attribute
     */
    public String getName() {
        return name;
    }

    
    /** 
     * @return Integer</br>
     * 
     * Returns the value of the stock attribute
     */
    public Integer getStock() {
        return stock;
    }

    
    /** 
     * @return Integer</br>
     * 
     * Returns the value of the minimum stock attribute
     */
    public Integer getMinStock() {
        return minStock;
    }

    
    /** 
     * @return double</br>
     * 
     * Returns the value of the price attribute
     */
    public double getPrice() {
        return price;
    }

    
    /** 
     * @return String</br>
     * 
     * Returns the value of the date attribute
     */
    public String getDate() {
        return date;
    }

    
    /** 
     * @return boolean</br>
     * 
     * Returns the value of the order status attribute
     */
    public boolean getOrderStatus() {
        return orderStatus;
    }

    
    /** 
     * @param ean
     * </br>
     * Sets the value of the ean attribute
     */
    public void setEan(Integer ean) {
        this.ean = ean;
    }

    
    /** 
     * @param name
     * </br>
     * Sets the value of the name attribute
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /** 
     * @param stock
     * </br>
     * Sets the value of the stock attribute
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    
    /** 
     * @param minStock
     * </br>
     * Sets the value of the minimum stock attribute
     */
    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }

    
    /** 
     * @param price
     * </br>
     * Sets the value of the price attribute
     */
    public void setPrice(double price) {
        this.price = price;
    }

    
    /** 
     * @param date
     * </br>
     * Sets the value of the date attribute
     */
    public void setDate(String date) {
        this.date = date;
    }

    
    /** 
     * @param orderStatus
     * </br>
     * Sets the value of the order status attribute
     */
    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }
}
