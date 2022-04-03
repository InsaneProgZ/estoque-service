package yan.ecommerce.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yan.ecommerce.estoque.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
