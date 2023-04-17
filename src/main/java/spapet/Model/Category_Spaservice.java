package spapet.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "Category_Service")
@Data
public class Category_Spaservice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Spaservice spaService;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
