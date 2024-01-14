package smartquizapp.questionType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

import java.time.Duration;

@Data
@Entity
//Questions involving drawings
public class OpenEndedQuestion {

    @Id
    @GeneratedValue(generator = "descriptive")
    @SequenceGenerator(name = "descriptive", allocationSize = 1, initialValue = 50000)
   private Long id;
    private String question;
   private String answer;
    private Duration timeLimit;
   private Long points;
    private String subject;
}