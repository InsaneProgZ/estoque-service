package yan.ecommerce.estoque.configuration;

import org.hibernate.internal.SessionImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaMetamodelEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import yan.ecommerce.estoque.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Configuration
public class HibernateConfiguration {

    @Bean
    EntityManagerFactory entityManagerFactory (){
        return Persistence.createEntityManagerFactory("fuiObrigadoAUsarHibernateNaoUtilizem");
    }

    @Bean
    EntityManager entityManager (EntityManagerFactory entityManagerFactory){
        return entityManagerFactory.createEntityManager();
    }

    @Bean
    EntityTransaction entityTransaction (EntityManager entityManager){
        return entityManager.getTransaction();
    }
}
