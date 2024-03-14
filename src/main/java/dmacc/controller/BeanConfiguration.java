package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Product;
import dmacc.beans.InventoryItem;

@Configuration
public class BeanConfiguration {

    @Bean
    public InventoryItem inventoryItem(Product product) {
        int quantity = 0; // Set the initial quantity to 0 or any other default value
        return new InventoryItem(product, quantity);
    }

    @Bean
    public Product product() {
        return new Product("Product Name", "Product Description", 0.0); // Default values for the product
    }
}
