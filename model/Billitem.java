package model;

import java.util.ArrayList;
import java.util.List;

public class BillItem {
    private List<Product> products;

    public BillItem() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}