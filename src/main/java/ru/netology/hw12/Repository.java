package ru.netology.hw12;

public class Repository {
    private Product[] products = new Product[0];

    public void addProduct(Product product) {
        Product[] temp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];

        }
        temp[temp.length - 1] = product;
        products = temp;
    }

    public void removeById(int id) {
        Product[] temp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                temp[index] = product;
                index += 1;
            }
        }
        products = temp;
    }

    public Product[] findAll() {
        return products;
    }
}
