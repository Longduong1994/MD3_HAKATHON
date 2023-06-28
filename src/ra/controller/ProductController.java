package ra.controller;

import ra.model.Product;
import ra.service.ProductService;

import java.util.List;

public class ProductController {
    ProductService productService = new ProductService();

    public List<Product> getAll(){
        return productService.getAll();
    }
    public int getSize(){
        return productService.getSize();
    }
    public void save(Product product){
        productService.save(product);
    }
    public void delete(String id){
        productService.delete(id);
    }
    public Product findById(String id){
        return productService.findById(id);
    }
}
