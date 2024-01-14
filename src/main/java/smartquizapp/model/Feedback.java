package smartquizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Feedback {
    @Id
    private Long id;
    private String response;
    private Long score;
    private Long userId;

}
