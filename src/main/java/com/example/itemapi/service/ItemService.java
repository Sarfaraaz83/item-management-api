package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import com.example.itemapi.repository.ItemRepository;
import org.springframework.stereotype.Service;

/**
 * Service layer containing business logic for items.
 */
@Service
public class ItemService {

    private final ItemRepository itemRepository;

    // Constructor injection (best practice)
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    /**
     * Adds a new item after validating input.
     */
    public Item addItem(Item item) {

        // Validation: name must exist
        if (item.getName() == null || item.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Item name is required");
        }

        // Validation: description must exist
        if (item.getDescription() == null || item.getDescription().trim().isEmpty()) {
            throw new IllegalArgumentException("Item description is required");
        }

        // If validation passes, save item
        return itemRepository.save(item);
    }

    /**
     * Retrieves an item by ID.
     */
    public Item getItemById(Long id) {
        Item item = itemRepository.findById(id);

        if (item == null) {
            throw new IllegalArgumentException("Item not found with id: " + id);
        }

        return item;
    }
}
