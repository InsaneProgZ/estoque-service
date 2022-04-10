package yan.ecommerce.estoque.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import yan.ecommerce.estoque.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class ProductRepository {
    @Autowired
    EntityTransaction transaction;
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Autowired
    EntityManager entityManager;




    public void save(Product product) {
        try {
            transaction.begin();

            entityManager.persist(product);

            entityManager.find(Product.class, product.getId());

            transaction.commit();

        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
//            entityManager.close();
//            entityManagerFactory.close();
        }
    }

    public Product findById(Integer id) {
        try {
            transaction.begin();

            return entityManager.find(Product.class, id);

        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }


}
