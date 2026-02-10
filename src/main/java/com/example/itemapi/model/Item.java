package com.example.itemapi.model;

/**
 * Represents a single item in the system.
 * This could be a product, movie, or any catalog entity.
 */
public class Item {

    private Long id;
    private String name;
    private String description;
    private double price;

    // Required for JSON deserialization
    public Item() {
    }

    // Used when creating a new item (ID generated later)
    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Used internally when returning stored items
    public Item(Long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
