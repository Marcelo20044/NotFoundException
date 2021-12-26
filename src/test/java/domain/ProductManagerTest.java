package domain;

import manager.ProductManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductManager manager = new ProductManager();

    Smartphone iPhone = new Smartphone(1, "iPhone", 80000, "Apple");
    Book harryPotter = new Book(2, "HarryPotter", 5000, "J.K. Rowling");
    Smartphone iPad = new Smartphone(4, "iPad", 80000, "Apple");


    @Test
    void shouldSearchBySmartphoneName() {

        manager.add(iPhone);
        Product[] expected = new Product[]{iPhone};
        Product[] actual = manager.searchBy("iPhone");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByBookName() {

        manager.add(harryPotter);
        Product[] expected = new Product[]{harryPotter};
        Product[] actual = manager.searchBy("HarryPotter");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByAuthor() {

        manager.add(harryPotter);
        Product[] expected = new Product[]{harryPotter};
        Product[] actual = manager.searchBy("Rowling");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByManufacturer() {

        manager.add(iPhone);
        Product[] expected = new Product[]{iPhone};
        Product[] actual = manager.searchBy("Apple");
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldSearchSeveralProducts() {

        manager.add(iPhone);
        manager.add(iPad);
        Product[] expected = new Product[]{iPhone, iPad};
        Product[] actual = manager.searchBy("Apple");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchNothing() {

        manager.add(iPhone);
        manager.add(iPad);
        Product[] expected = new Product[]{};
        Product[] actual = manager.searchBy("Xiaomi");
        assertArrayEquals(expected, actual);
    }

}