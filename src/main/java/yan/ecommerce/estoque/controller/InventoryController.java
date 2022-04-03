package yan.ecommerce.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yan.ecommerce.estoque.model.Product;
import yan.ecommerce.estoque.repository.ProductRepository;

@RestController
@RequestMapping("/product")
@EnableAutoConfiguration
public class InventoryController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    String registerProduct (@RequestBody Product product){

        productRepository.save(product);
        return product.toString();
    }

}
