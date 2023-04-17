package spapet.Model;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Service")
@Data
public class Spaservice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Name is required")
    private String name;

    @NotNull(message = "appointmentTime is required")
    private Date appointmentTime;

    private Date finishServTime;

    @NotNull(message = "petType is required")
    private String petType;


}
