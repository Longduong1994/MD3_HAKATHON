package ra.service;

import ra.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IService<Product,String> {
    List<Product> products;

    public ProductService(){
        products = new ArrayList<>();
    }
    public int getSize(){
        return products.size();
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        if (findById(product.getProductId()) == null) {
            products.add(product);
        }else {
            products.set(products.indexOf(findById(product.getProductId())),product);
        }

    }

    @Override
    public Product findById(String id) {
        for (Product product : products) {
            if(product.getProductId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        if(findById(id)==null) {
            System.out.println("Id không tồn tại!!!");
            return;
        }
        products.remove(findById(id));
    }
}
