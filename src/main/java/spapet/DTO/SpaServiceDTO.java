package spapet.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SpaServiceDTO {
    private Long id;
    private String name;
    private String description;
    private Date appointmentTime;
    private Date finishServTime;

    private double price;
}
