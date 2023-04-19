package spapet.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "Category_Service")
@Data
public class Category_SpaService implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private SpaService service;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
