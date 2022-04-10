package yan.ecommerce.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import yan.ecommerce.estoque.model.Product;
import yan.ecommerce.estoque.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class InventoryController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void registerProduct (@RequestBody Product product){
        productService.registerProduct(product);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    List<Product> getProduct (@RequestHeader String name){
        return productService.getProduct(name);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Optional<Product> getProduct (@PathVariable Integer id){
        return Optional.ofNullable(productService.getProduct(id));
    }
}
