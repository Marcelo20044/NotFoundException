package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    void shouldSearchBy() {

        ProductManager manager = new ProductManager();

        Smartphone iPhone = new Smartphone(1, "iPhone", 80000, "iPhone13", "Apple");
        manager.add(iPhone);
        Product[] expected = new Product[]{iPhone};
        Product[] actual = manager.searchBy("iPhone");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBy1() {

        ProductManager manager = new ProductManager();

        Book HarryPotter = new Book(2, "HarryPotter", 5000, "HarryPotter Goblet of Fire", "J.K. Rowling");
        manager.add(HarryPotter);
        Product[] expected = new Product[]{HarryPotter};
        Product[] actual = manager.searchBy("Rowling");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBy2() {

        ProductManager manager = new ProductManager();

        Smartphone iPhone = new Smartphone(1, "iPhone", 80000, "iPhone13", "Apple");
        manager.add(iPhone);
        Product[] expected = new Product[]{iPhone};
        Product[] actual = manager.searchBy( "Apple");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBy3() {

        ProductManager manager = new ProductManager();

        Book HarryPotter = new Book(2, "HarryPotter", 5000, "HarryPotter Goblet of Fire", "J.K. Rowling");
        manager.add(HarryPotter);
        Product[] expected = new Product[]{HarryPotter};
        Product[] actual = manager.searchBy("HarryPotter");
        assertArrayEquals(expected, actual);
    }
}