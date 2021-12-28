package domain;

import manager.ProductManager;
import org.junit.jupiter.api.Test;
import repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository repo = new ProductRepository();

    Smartphone iPhone = new Smartphone(1, "iPhone", 80000, "Apple");
    Book harryPotter = new Book(2, "HarryPotter", 5000, "J.K. Rowling");
    Smartphone iPad = new Smartphone(4, "iPad", 80000, "Apple");


    @Test
    void shouldRemoveById() {
        repo.save(iPhone);
        repo.save(iPad);
        repo.save(harryPotter);

        repo.removeById(4);
        Product[] expected = new Product[]{iPhone, harryPotter};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldThrowRightException(){
        repo.save(iPhone);
        repo.save(iPad);
        repo.save(harryPotter);

       assertThrows(NotFoundException.class, () -> {
          repo.removeById(5);
       });
    }

}

