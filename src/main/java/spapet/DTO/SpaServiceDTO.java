package spapet.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
public class SpaServiceDTO {
    private Long id;
    private String name;
    private String description;
    private Date appointmentTime;
    private Date finishServTime;


}
