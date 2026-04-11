package LldPractice.Service;

import LldPractice.Model.Product;
import LldPractice.Repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository = new ProductRepository();


    @Override
    public String addProduct(Product product){
        return productRepository.addProduct(product);

    }
}
