package LldPractice.Repository;

import LldPractice.Model.Product;

import java.util.ArrayList;

public class ProductRepository {
    ArrayList<Product> products = new ArrayList<>();

    public String addProduct(Product product){
        products.add(product);
        return "product added successfully";
    }

}
