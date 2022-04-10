package yan.ecommerce.estoque.repository;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import yan.ecommerce.estoque.model.Product;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    Configuration configuration;

    @Autowired
    Session session;

public void save (Product product){

    session.beginTransaction();
    session.save(product);
    session.getTransaction().commit();
}

    public Product findById(Integer id) {
    return session.find(Product.class, id);
    }

    public List<Product> findByName(String name) {
    return session.createQuery("SELECT p FROM Product p WHERE name =:name", Product.class)
            .setParameter("name", name)
            .getResultList();
    }


}
