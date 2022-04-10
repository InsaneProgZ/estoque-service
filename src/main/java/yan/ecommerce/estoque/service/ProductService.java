package yan.ecommerce.estoque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yan.ecommerce.estoque.model.Product;
import yan.ecommerce.estoque.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void registerProduct (Product product){
        productRepository.save(product);
    }

    public List<Product> getProduct (String name){
        return productRepository.findByName(name);
    }

    public Product getProduct (Integer id) {
        return productRepository.findById(id);
    }
}
