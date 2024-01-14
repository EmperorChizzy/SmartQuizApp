package smartquizapp.questionType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.Duration;

@Data
@Entity
public class Draw {
    @Id
    private Long id;
    private byte[] image;
    private String question;
    private Long points;
    private Duration timeLimit;
}
