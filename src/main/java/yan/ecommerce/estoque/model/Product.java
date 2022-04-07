package yan.ecommerce.estoque.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    Integer id;

    @Column(name="name")
    String name;

    @Column(name = "amount")
    Long amount;

    public Product(String name, Long amount) {
        this.name = name;
        this.amount = amount;
    }

    public Product() {
    }

    public Product(Integer id, String name, Long amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
