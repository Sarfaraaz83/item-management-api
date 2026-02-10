package com.example.itemapi.repository;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository layer that manages in-memory storage of items.
 */
@Repository
public class ItemRepository {

    // In-memory data store
    private final List<Item> items = new ArrayList<>();

    // Counter to generate unique IDs
    private long currentId = 1;

    /**
     * Saves a new item in memory.
     * Assigns a unique ID before saving.
     */
    public Item save(Item item) {
        item.setId(currentId);
        currentId++;
        items.add(item);
        return item;
    }

    /**
     * Finds an item by its ID.
     * Returns null if not found.
     */
    public Item findById(Long id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
