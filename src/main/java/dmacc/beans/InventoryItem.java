package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;

@Entity
public class InventoryItem {
	@Id
	@GeneratedValue
	private long id;
	@Autowired
    private Product product;
    private int quantity;

    public InventoryItem() {
        // Default constructor
    }

    public InventoryItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "product=" + product +", quantity=" + quantity +"}";
    }
}