package smartquizapp.questionType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.Duration;

@Data
@Entity
public class FillBlankQuestion {
    @Id
    private Long id;
    private Long points;
    private String question;
    private Duration timeLimit;
}
