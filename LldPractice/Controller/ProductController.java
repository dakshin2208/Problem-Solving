package LldPractice.Controller;

import LldPractice.Model.Product;
import LldPractice.Service.ProductService;
import LldPractice.Service.ProductServiceImpl;

public class ProductController {
    ProductService productService;

    ProductController(){
        this.productService = new ProductServiceImpl();
    }

    public String addProduct(String name , String quantity , String description){
        Product product = new Product(name ,quantity , description);
        return productService.addProduct(product);
    }
}
