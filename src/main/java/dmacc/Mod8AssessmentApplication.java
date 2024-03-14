package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Product;
import dmacc.beans.InventoryItem;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.InventoryRepository;

@SpringBootApplication
public class Mod8AssessmentApplication implements CommandLineRunner {

    @Autowired
    InventoryRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(Mod8AssessmentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        // Creating InventoryItems
        Product product1 = new Product("Product 1", "Description 1", 10.0);
        Product product2 = new Product("Product 2", "Description 2", 20.0);

        InventoryItem item1 = new InventoryItem(product1, 5);
        InventoryItem item2 = new InventoryItem(product2, 10);

        // Saving InventoryItems
        repo.save(item1);
        repo.save(item2);

        // Retrieving all InventoryItems from the repository
        List<InventoryItem> allInventoryItems = repo.findAll();
        for (InventoryItem item : allInventoryItems) {
            System.out.println(item.toString());
        }

        ((AbstractApplicationContext) appContext).close();
    }
}