package yan.ecommerce.estoque.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yan.ecommerce.estoque.model.Product;

@Configuration
public class HibernateConfiguration {

//    @Bean
//    EntityManagerFactory entityManagerFactory (){
//        return Persistence.createEntityManagerFactory("fuiObrigadoAUsarHibernateNaoUtilizem");
//    }
//
//    @Bean
//    EntityManager entityManager (EntityManagerFactory entityManagerFactory){
//        return entityManagerFactory.createEntityManager();
//    }
//
//    @Bean
//    EntityTransaction entityTransaction (EntityManager entityManager){
//        return entityManager.getTransaction();
//    }

    @Bean
    org.hibernate.cfg.Configuration configuration () {
        return new org.hibernate.cfg.Configuration().configure("hibernate.xml").addAnnotatedClass(Product.class);
    }

    @Bean
    SessionFactory sessionFactory (org.hibernate.cfg.Configuration configuration){
        return configuration.buildSessionFactory();
    }

    @Bean
    Session session (SessionFactory sessionFactory){
        return  sessionFactory.openSession();
    }
}
